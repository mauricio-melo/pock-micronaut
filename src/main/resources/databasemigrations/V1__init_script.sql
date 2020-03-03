CREATE TABLE car (
   idt_car                          BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
   name                             VARCHAR(255) NOT NULL,
   engine                           VARCHAR(255) NOT NULL,
   city                             VARCHAR(255) NOT NULL,
   license_plate                    VARCHAR(255) NOT NULL,
   color                            VARCHAR(255) NOT NULL,
   processed_queue                  BIT NOT NULL
);