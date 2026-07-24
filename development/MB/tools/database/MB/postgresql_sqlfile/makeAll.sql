\encoding UTF-8

\i ./makeLayout_mb.sql

\i ./makeLayout_mb_en_US.sql

delete from FCT_DBVERSION where PRODUCT_ID = 'MB';

insert into FCT_DBVERSION values ('MB','mcframe 7 Business-common','MB','7.0.3', 30);

\i ./make5MB_MENU.sql

\i ./make5MB_MSG.sql

\i ./make5MB.sql

\i ./makeAll_PJ.sql

