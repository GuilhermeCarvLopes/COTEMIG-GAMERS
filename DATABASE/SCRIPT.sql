-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`CATEGORIA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CATEGORIA` (
  `idCATEGORIA` INT NOT NULL AUTO_INCREMENT,
  `NOME` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCATEGORIA`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`EMPRESA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`EMPRESA` (
  `idEMPRESA` INT ZEROFILL NOT NULL,
  `NOMEFANTASIA` VARCHAR(125) NOT NULL,
  `RAZAOSOCIAL` VARCHAR(125) NOT NULL,
  `CNPJ` VARCHAR(45) NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `TELEFONE` VARCHAR(45) NOT NULL,
  `SENHA` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEMPRESA`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PRODUTO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PRODUTO` (
  `idPRODUTO` INT NOT NULL AUTO_INCREMENT,
  `NOME` VARCHAR(100) NOT NULL,
  `DESCRICAO` TEXT NOT NULL,
  `FOTO` VARCHAR(45) NOT NULL,
  `idEMPRESA` INT ZEROFILL NOT NULL,
  PRIMARY KEY (`idPRODUTO`),
  INDEX `fk_PRODUTO_EMPRESA1_idx` (`idEMPRESA` ASC) VISIBLE,
  CONSTRAINT `fk_PRODUTO_EMPRESA1`
    FOREIGN KEY (`idEMPRESA`)
    REFERENCES `mydb`.`EMPRESA` (`idEMPRESA`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PRODUTO_TEM_CATEGORIA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PRODUTO_TEM_CATEGORIA` (
  `idCATEGORIA` INT NOT NULL,
  `idPRODUTO` INT NOT NULL,
  PRIMARY KEY (`idCATEGORIA`, `idPRODUTO`),
  INDEX `fk_CATEGORIA_has_PRODUTO_PRODUTO1_idx` (`idPRODUTO` ASC) VISIBLE,
  INDEX `fk_CATEGORIA_has_PRODUTO_CATEGORIA_idx` (`idCATEGORIA` ASC) VISIBLE,
  CONSTRAINT `fk_CATEGORIA_has_PRODUTO_CATEGORIA`
    FOREIGN KEY (`idCATEGORIA`)
    REFERENCES `mydb`.`CATEGORIA` (`idCATEGORIA`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CATEGORIA_has_PRODUTO_PRODUTO1`
    FOREIGN KEY (`idPRODUTO`)
    REFERENCES `mydb`.`PRODUTO` (`idPRODUTO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`USUARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`USUARIO` (
  `idUSUARIO` INT NOT NULL AUTO_INCREMENT,
  `NOME` VARCHAR(45) NOT NULL,
  `DATANASCIMENTO` VARCHAR(45) NOT NULL,
  `USERNAME` VARCHAR(45) NOT NULL,
  `CPF` VARCHAR(45) NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `SENHA` VARCHAR(45) NOT NULL,
  `TELEFONE` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUSUARIO`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TRANSACAO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TRANSACAO` (
  `idTRANSACAO` INT NOT NULL AUTO_INCREMENT,
  `VALOR` DOUBLE NOT NULL,
  `DATAPAGAMENTO` DATE NOT NULL,
  `idPRODUTO` INT NOT NULL,
  `idUSUARIO` INT NOT NULL,
  PRIMARY KEY (`idTRANSACAO`),
  INDEX `fk_TRANSACAO_PRODUTO1_idx` (`idPRODUTO` ASC) VISIBLE,
  INDEX `fk_TRANSACAO_USUARIO1_idx` (`idUSUARIO` ASC) VISIBLE,
  CONSTRAINT `fk_TRANSACAO_PRODUTO1`
    FOREIGN KEY (`idPRODUTO`)
    REFERENCES `mydb`.`PRODUTO` (`idPRODUTO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_TRANSACAO_USUARIO1`
    FOREIGN KEY (`idUSUARIO`)
    REFERENCES `mydb`.`USUARIO` (`idUSUARIO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`BIBLIOTECA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`BIBLIOTECA` (
  `idBIBLIOTECA` INT NOT NULL AUTO_INCREMENT,
  `idUSUARIO` INT NOT NULL,
  PRIMARY KEY (`idBIBLIOTECA`),
  INDEX `fk_BIBLIOTECA_USUARIO1_idx` (`idUSUARIO` ASC) VISIBLE,
  CONSTRAINT `fk_BIBLIOTECA_USUARIO1`
    FOREIGN KEY (`idUSUARIO`)
    REFERENCES `mydb`.`USUARIO` (`idUSUARIO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`BIBLIOTECA_TEM_PRODUTO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`BIBLIOTECA_TEM_PRODUTO` (
  `idPRODUTO` INT NOT NULL,
  `idBIBLIOTECA` INT NOT NULL,
  PRIMARY KEY (`idPRODUTO`, `idBIBLIOTECA`),
  INDEX `fk_PRODUTO_has_BIBLIOTECA_BIBLIOTECA1_idx` (`idBIBLIOTECA` ASC) VISIBLE,
  INDEX `fk_PRODUTO_has_BIBLIOTECA_PRODUTO1_idx` (`idPRODUTO` ASC) VISIBLE,
  CONSTRAINT `fk_PRODUTO_has_BIBLIOTECA_PRODUTO1`
    FOREIGN KEY (`idPRODUTO`)
    REFERENCES `mydb`.`PRODUTO` (`idPRODUTO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUTO_has_BIBLIOTECA_BIBLIOTECA1`
    FOREIGN KEY (`idBIBLIOTECA`)
    REFERENCES `mydb`.`BIBLIOTECA` (`idBIBLIOTECA`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
