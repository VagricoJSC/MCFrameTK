SET DEFINE OFF
SET ESCCHAR @

@".\makeLayout_mb.sql"

@".\makeLayout_mb_en_US.sql"

delete from FCT_DBVERSION where PRODUCT_ID = 'MB';

insert into FCT_DBVERSION values ('MB','mcframe 7 Business-common','MB','7.0.3', 30);

@".\make5MB_MENU.sql"

@".\make5MB_MSG.sql"

@".\make5MB.sql"

@".\makeAll_PJ.sql"

SET DEFINE ON
