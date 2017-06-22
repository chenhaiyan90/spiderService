/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.6.29-log : Database -
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE `cct_spider` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE `cct_spider`;

 CREATE TABLE `cct_spider`.`article` (
                      `id` int(11) NOT NULL AUTO_INCREMENT,
                      `md5_url` VARCHAR (34) NOT NULL COMMENT '文章url 的md5值(32位)',
                      `title` varchar(64) DEFAULT NULL COMMENT '文章标题',
                      `url` varchar(64) DEFAULT NULL COMMENT '文章url',
                      `page_urls` text  DEFAULT NULL COMMENT '分页url链接',
                      `origin_url` varchar(64) DEFAULT NULL COMMENT '文章来源url',
                      `origin_name` varchar(20) DEFAULT NULL COMMENT '来源名称',
                      `abstracts` varchar(32) DEFAULT NULL COMMENT '文章摘要',
                      `keywords` varchar(32) DEFAULT NULL COMMENT '文章关键字',
                      `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                      `change_time` datetime DEFAULT NULL COMMENT '修改时间',
                      `type` varchar(12) DEFAULT NULL COMMENT '文章分类',
                      `group` varchar(12) DEFAULT NULL COMMENT '文章分组',
                      `status` varchar(12) DEFAULT NULL COMMENT '状态',
                      `status_changeTime` datetime DEFAULT NULL COMMENT '状态修改时间',
                      PRIMARY KEY (`id`),
                      KEY `idx_md5_url` (`md5_url`),
                      KEY `idx_type` (`type`),
                      KEY `idx_group` (`group`),
                      KEY `idx_status` (`status`),
                      KEY `idx_create_time` (`create_time`)
                    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;
 CREATE TABLE `cct_spider`.`article_info` (
                      `id` int(11) NOT NULL AUTO_INCREMENT,
                      `md5_url` VARCHAR (34) NOT NULL COMMENT '文章url 的md5值(32位)',
                      `content` mediumtext COMMENT '文章内容',
                      `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                      PRIMARY KEY (`id`),
                      KEY `idx_md5_url` (`md5_url`)
                    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;