
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('1', 'PS4');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('2', 'XBOX One');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('3', 'Switch');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('4', 'iTunes');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('5', 'Mobile');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('6', '3DS');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('7', 'PS3');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('8', 'WiiU');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('9', 'PC');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('10', 'Wii');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('11', 'NES');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('12', 'XBOX');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('13', 'N64');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('14', 'PS2');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('15', 'SNES');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('16', 'PS1');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('17', 'Genesis');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('18', 'Dreamcast');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('19', 'Gamecube');
INSERT IGNORE INTO `notes_app`.`platform` (`id`, `name`) VALUES ('0', 'Please Select One');

INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('1', 'Apple');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('2', 'Autos');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('3', 'Bags & Luggage');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('4', 'Books & Magazines');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('5', 'Children');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('6', 'Clothing & Accessories');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('7', 'Computers');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('8', 'Education');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('9', 'Entertainment');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('10', 'Finance');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('11', 'Flowers & Gifts');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('12', 'Freebies');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('13', 'Grocery');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('14', 'Health & Beauty');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('15', 'Home & Home Improvement');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('16', 'Movies');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('17', 'Occasions');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('18', 'Office');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('19', 'Other');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('20', 'Pets');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('21', 'Phones');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('22', 'Restaurants');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('23', 'Services');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('24', 'Shoes');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('25', 'Sporting Goods');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('26', 'Tech & Electronics');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('27', 'Travel & Vacations');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('28', 'TV');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('29', 'Video Games');
INSERT IGNORE INTO `notes_app`.`category` (`id`, `name`) VALUES ('30', 'Classifieds');

INSERT IGNORE INTO `notes_app`.`game` (`id`, `description`, `link`, `price`, `title`, `platform_id`, `create_date`) VALUES ('1', 'at Best Buy', 'http://bestbuy.com', '29.99', 'Spyro Reignited Trilogy', '3', '2019-03-11 5:05:18');
INSERT IGNORE INTO `notes_app`.`game` (`id`, `description`, `link`, `price`, `title`, `platform_id`, `create_date`) VALUES ('2', 'at Gamestop', 'http://gamestop.com', '9.97', 'No Mans Sky', '7', '2019-04-19 14:00:18');
INSERT IGNORE INTO `notes_app`.`game` (`id`, `description`, `link`, `price`, `title`, `platform_id`, `create_date`) VALUES ('3', 'at Target', 'http://gamestop.com', '49.97', 'Legend of Zelda', '12', '2019-03-22 12:00:18');
INSERT IGNORE INTO `notes_app`.`game` (`id`, `description`, `link`, `price`, `title`, `platform_id`, `create_date`) VALUES ('4', 'at Childs World', 'http://gamestop.com', '24.99', 'Clu Clu Land', '13', '2019-03-03 12:00:18');
INSERT IGNORE INTO `notes_app`.`game` (`id`, `description`, `link`, `price`, `title`, `platform_id`, `create_date`) VALUES ('5', 'at Walmart', 'http://walmart.com', '19.99', 'Lolos Adventures', '4', '2018-07-28 12:00:18');
INSERT IGNORE INTO `notes_app`.`game` (`id`, `description`, `link`, `price`, `title`, `platform_id`, `create_date`) VALUES ('6', 'at GameStop normally $19.99', 'http://Gamestop.com', '9.99', 'Last of Us Special Edition', '1', '2019-02-11 12:00:18');
INSERT IGNORE INTO `notes_app`.`game` (`id`, `description`, `link`, `price`, `title`, `platform_id`, `create_date`) VALUES ('7', 'half off at Gamestop', 'http://Gamestop.com', '19.99', 'Tetris Effect', '5', '2019-03-11 12:00:18');



