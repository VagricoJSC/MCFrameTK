package mcframe.serverMB.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "勘定科目マスタ受信ＩＦ // Account master import IF"DBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>data_lno</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ行ＮＯ</td>
 *  	<td>Data row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データＮＯ</td>
 *  	<td>Data No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>exe_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＰＧ実行状況区分</td>
 *  	<td>PG execution status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_crud_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>データ更新区分</td>
 *  	<td>Data update type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムデータＮＯ</td>
 *  	<td>External system data No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_data_lno</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムデータ行ＮＯ</td>
 *  	<td>External system data row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_make_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>送信元レコード作成日時</td>
 *  	<td>Creation date and time of source record</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取込対象ＦＬＧ</td>
 *  	<td>To import flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>勘定科目ＣＤ</td>
 *  	<td>Account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>勘定科目名</td>
 *  	<td>Account name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目名_ロケール１</td>
 *  	<td>Account name_locale 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目名_ロケール２</td>
 *  	<td>Account name_locale 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目名_ロケール３</td>
 *  	<td>Account name_locale 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_nm2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目略名</td>
 *  	<td>Account abbreviation name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_nm2_lcl1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目略名_ロケール１</td>
 *  	<td>Account abbreviation name_locale 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_nm2_lcl2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目略名_ロケール２</td>
 *  	<td>Account abbreviation name_locale 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_nm2_lcl3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目略名_ロケール３</td>
 *  	<td>Account abbreviation name_locale 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸借区分</td>
 *  	<td>Debit and credit type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>補助科目使用ＦＬＧ</td>
 *  	<td>Subsidiary account used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>勘定科目区分</td>
 *  	<td>Account type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計税ＣＤ</td>
 *  	<td>Accounting tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_tax_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計税区分</td>
 *  	<td>Accounting tax type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>foreign_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外貨ＦＬＧ</td>
 *  	<td>Foreign currency flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sum0_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計０使用ＦＬＧ</td>
 *  	<td>Aggregated 0 used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sum1_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計１使用ＦＬＧ</td>
 *  	<td>Aggregated 1 used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sum2_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計２使用ＦＬＧ</td>
 *  	<td>Aggregated 2 used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sum3_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計３使用ＦＬＧ</td>
 *  	<td>Aggregated 3 used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sum4_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計４使用ＦＬＧ</td>
 *  	<td>Aggregated 4 used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sum5_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計５使用ＦＬＧ</td>
 *  	<td>Aggregated 5 used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>project_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>プロジェクト使用ＦＬＧ</td>
 *  	<td>Project used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先使用ＦＬＧ</td>
 *  	<td>BP used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者使用ＦＬＧ</td>
 *  	<td>PIC used flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_ac_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>口座使用ＦＬＧ</td>
 *  	<td>Bank account used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_typ</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＡＰ科目区分</td>
 *  	<td>AP type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_typ</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＡＲ科目区分</td>
 *  	<td>AR type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_typ1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分１</td>
 *  	<td>Account spare type 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_typ2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分２</td>
 *  	<td>Account spare type 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_typ3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分３</td>
 *  	<td>Account spare type 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_typ4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分４</td>
 *  	<td>Account spare type 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_typ5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>科目予備区分５</td>
 *  	<td>Account spare type 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１</td>
 *  	<td>IF spare CHAR column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２</td>
 *  	<td>IF spare CHAR column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目３</td>
 *  	<td>IF spare CHAR column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目４</td>
 *  	<td>IF spare CHAR column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目５</td>
 *  	<td>IF spare CHAR column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目６</td>
 *  	<td>IF spare CHAR column 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目７</td>
 *  	<td>IF spare CHAR column 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目８</td>
 *  	<td>IF spare CHAR column 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目９</td>
 *  	<td>IF spare CHAR column 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１０</td>
 *  	<td>IF spare CHAR column 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１１</td>
 *  	<td>IF spare CHAR column 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１２</td>
 *  	<td>IF spare CHAR column 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１３</td>
 *  	<td>IF spare CHAR column 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１４</td>
 *  	<td>IF spare CHAR column 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１５</td>
 *  	<td>IF spare CHAR column 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１６</td>
 *  	<td>IF spare CHAR column 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１７</td>
 *  	<td>IF spare CHAR column 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１８</td>
 *  	<td>IF spare CHAR column 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目１９</td>
 *  	<td>IF spare CHAR column 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２０</td>
 *  	<td>IF spare CHAR column 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２１</td>
 *  	<td>IF spare CHAR column 21</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２２</td>
 *  	<td>IF spare CHAR column 22</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２３</td>
 *  	<td>IF spare CHAR column 23</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２４</td>
 *  	<td>IF spare CHAR column 24</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２５</td>
 *  	<td>IF spare CHAR column 25</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２６</td>
 *  	<td>IF spare CHAR column 26</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２７</td>
 *  	<td>IF spare CHAR column 27</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２８</td>
 *  	<td>IF spare CHAR column 28</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目２９</td>
 *  	<td>IF spare CHAR column 29</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＣＨＡＲ項目３０</td>
 *  	<td>IF spare CHAR column 30</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目１</td>
 *  	<td>IF spare NUM column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目２</td>
 *  	<td>IF spare NUM column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目３</td>
 *  	<td>IF spare NUM column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目４</td>
 *  	<td>IF spare NUM column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＮＵＭ項目５</td>
 *  	<td>IF spare NUM column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目１</td>
 *  	<td>IF spare DATE column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目２</td>
 *  	<td>IF spare DATE column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目３</td>
 *  	<td>IF spare DATE column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目４</td>
 *  	<td>IF spare DATE column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ予備ＤＡＴＥ項目５</td>
 *  	<td>IF spare DATE column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログＮＯ</td>
 *  	<td>Log No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>log_sub_key1</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー１</td>
 *  	<td>Log sub key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>log_sub_key2</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー２</td>
 *  	<td>Log sub key 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_srv_req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新リクエストＮＯ</td>
 *  	<td>Update request No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sdrv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td>SDRV.SDRV_STS_TYP</td>
 *  	<td>送受信状況区分</td>
 *  	<td>Exporting and importing status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計税名</td>
 *  	<td>Accounting tax name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBT_ACCOUNT_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MBT_ACCOUNT_IF";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	private static final MCPermColumnInfo _data_lno = createColumnInfo("data_lno");
	public final MCNumberPermColumn data_lno = createNumberColumn(_data_lno);
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public static final String $data_no = "data_no";
	private static final MCPermColumnInfo _data_no = createColumnInfo("data_no");
	public final MCNumberPermColumn data_no = createNumberColumn(_data_no);
	
	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public static final String $exe_sts_typ = "exe_sts_typ";
	private static final MCPermColumnInfo _exe_sts_typ = createColumnInfo("exe_sts_typ");
	public final MCStringPermColumn exe_sts_typ = createStringColumn(_exe_sts_typ);
	
	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	private static final MCPermColumnInfo _data_crud_typ = createColumnInfo("data_crud_typ");
	public final MCStringPermColumn data_crud_typ = createStringColumn(_data_crud_typ);
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public static final String $ext_data_no = "ext_data_no";
	private static final MCPermColumnInfo _ext_data_no = createColumnInfo("ext_data_no");
	public final MCNumberPermColumn ext_data_no = createNumberColumn(_ext_data_no);
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public static final String $ext_data_lno = "ext_data_lno";
	private static final MCPermColumnInfo _ext_data_lno = createColumnInfo("ext_data_lno");
	public final MCNumberPermColumn ext_data_lno = createNumberColumn(_ext_data_lno);
	
	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	private static final MCPermColumnInfo _data_make_dt = createColumnInfo("data_make_dt");
	public final MCDatePermColumn data_make_dt = createDateColumn(_data_make_dt);
	
	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public static final String $imp_flg = "imp_flg";
	private static final MCPermColumnInfo _imp_flg = createColumnInfo("imp_flg");
	public final MCBooleanPermColumn imp_flg = createBooleanColumn(_imp_flg);
	
	/**
	 * 勘定科目ＣＤ. Account cd..<p>
	 *
	 */
	public static final String $ac_cd = "ac_cd";
	private static final MCPermColumnInfo _ac_cd = createColumnInfo("ac_cd");
	public final MCStringPermColumn ac_cd = createStringColumn(_ac_cd);
	
	/**
	 * 勘定科目名. Account name.<p>
	 *
	 */
	public static final String $ac_nm = "ac_nm";
	private static final MCPermColumnInfo _ac_nm = createColumnInfo("ac_nm");
	public final MCStringPermColumn ac_nm = createStringColumn(_ac_nm);
	
	/**
	 * 勘定科目名_ロケール１. Account name_locale 1.<p>
	 *
	 */
	public static final String $ac_nm_lcl1 = "ac_nm_lcl1";
	private static final MCPermColumnInfo _ac_nm_lcl1 = createColumnInfo("ac_nm_lcl1");
	public final MCStringPermColumn ac_nm_lcl1 = createStringColumn(_ac_nm_lcl1);
	
	/**
	 * 勘定科目名_ロケール２. Account name_locale 2.<p>
	 *
	 */
	public static final String $ac_nm_lcl2 = "ac_nm_lcl2";
	private static final MCPermColumnInfo _ac_nm_lcl2 = createColumnInfo("ac_nm_lcl2");
	public final MCStringPermColumn ac_nm_lcl2 = createStringColumn(_ac_nm_lcl2);
	
	/**
	 * 勘定科目名_ロケール３. Account name_locale 3.<p>
	 *
	 */
	public static final String $ac_nm_lcl3 = "ac_nm_lcl3";
	private static final MCPermColumnInfo _ac_nm_lcl3 = createColumnInfo("ac_nm_lcl3");
	public final MCStringPermColumn ac_nm_lcl3 = createStringColumn(_ac_nm_lcl3);
	
	/**
	 * 勘定科目略名. Account abbreviation name.<p>
	 *
	 */
	public static final String $ac_nm2 = "ac_nm2";
	private static final MCPermColumnInfo _ac_nm2 = createColumnInfo("ac_nm2");
	public final MCStringPermColumn ac_nm2 = createStringColumn(_ac_nm2);
	
	/**
	 * 勘定科目略名_ロケール１. Account abbreviation name_locale 1.<p>
	 *
	 */
	public static final String $ac_nm2_lcl1 = "ac_nm2_lcl1";
	private static final MCPermColumnInfo _ac_nm2_lcl1 = createColumnInfo("ac_nm2_lcl1");
	public final MCStringPermColumn ac_nm2_lcl1 = createStringColumn(_ac_nm2_lcl1);
	
	/**
	 * 勘定科目略名_ロケール２. Account abbreviation name_locale 2.<p>
	 *
	 */
	public static final String $ac_nm2_lcl2 = "ac_nm2_lcl2";
	private static final MCPermColumnInfo _ac_nm2_lcl2 = createColumnInfo("ac_nm2_lcl2");
	public final MCStringPermColumn ac_nm2_lcl2 = createStringColumn(_ac_nm2_lcl2);
	
	/**
	 * 勘定科目略名_ロケール３. Account abbreviation name_locale 3.<p>
	 *
	 */
	public static final String $ac_nm2_lcl3 = "ac_nm2_lcl3";
	private static final MCPermColumnInfo _ac_nm2_lcl3 = createColumnInfo("ac_nm2_lcl3");
	public final MCStringPermColumn ac_nm2_lcl3 = createStringColumn(_ac_nm2_lcl3);
	
	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public static final String $dc_typ = "dc_typ";
	private static final MCPermColumnInfo _dc_typ = createColumnInfo("dc_typ");
	public final MCStringPermColumn dc_typ = createStringColumn(_dc_typ);
	
	/**
	 * 補助科目使用ＦＬＧ. Subsidiary account used flg..<p>
	 *
	 */
	public static final String $sub_flg = "sub_flg";
	private static final MCPermColumnInfo _sub_flg = createColumnInfo("sub_flg");
	public final MCBooleanPermColumn sub_flg = createBooleanColumn(_sub_flg);
	
	/**
	 * 勘定科目区分. Account type.<p>
	 *
	 */
	public static final String $ac_typ = "ac_typ";
	private static final MCPermColumnInfo _ac_typ = createColumnInfo("ac_typ");
	public final MCStringPermColumn ac_typ = createStringColumn(_ac_typ);
	
	/**
	 * 会計税ＣＤ. Accounting tax cd..<p>
	 *
	 */
	public static final String $ac_tax_cd = "ac_tax_cd";
	private static final MCPermColumnInfo _ac_tax_cd = createColumnInfo("ac_tax_cd");
	public final MCStringPermColumn ac_tax_cd = createStringColumn(_ac_tax_cd);
	
	/**
	 * 会計税区分. Accounting tax type.<p>
	 *
	 */
	public static final String $ac_tax_typ = "ac_tax_typ";
	private static final MCPermColumnInfo _ac_tax_typ = createColumnInfo("ac_tax_typ");
	public final MCStringPermColumn ac_tax_typ = createStringColumn(_ac_tax_typ);
	
	/**
	 * 外貨ＦＬＧ. Foreign currency flg..<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	private static final MCPermColumnInfo _foreign_flg = createColumnInfo("foreign_flg");
	public final MCBooleanPermColumn foreign_flg = createBooleanColumn(_foreign_flg);
	
	/**
	 * 集計０使用ＦＬＧ. Aggregated 0 used flg..<p>
	 *
	 */
	public static final String $sum0_flg = "sum0_flg";
	private static final MCPermColumnInfo _sum0_flg = createColumnInfo("sum0_flg");
	public final MCBooleanPermColumn sum0_flg = createBooleanColumn(_sum0_flg);
	
	/**
	 * 集計１使用ＦＬＧ. Aggregated 1 used flg..<p>
	 *
	 */
	public static final String $sum1_flg = "sum1_flg";
	private static final MCPermColumnInfo _sum1_flg = createColumnInfo("sum1_flg");
	public final MCBooleanPermColumn sum1_flg = createBooleanColumn(_sum1_flg);
	
	/**
	 * 集計２使用ＦＬＧ. Aggregated 2 used flg..<p>
	 *
	 */
	public static final String $sum2_flg = "sum2_flg";
	private static final MCPermColumnInfo _sum2_flg = createColumnInfo("sum2_flg");
	public final MCBooleanPermColumn sum2_flg = createBooleanColumn(_sum2_flg);
	
	/**
	 * 集計３使用ＦＬＧ. Aggregated 3 used flg..<p>
	 *
	 */
	public static final String $sum3_flg = "sum3_flg";
	private static final MCPermColumnInfo _sum3_flg = createColumnInfo("sum3_flg");
	public final MCBooleanPermColumn sum3_flg = createBooleanColumn(_sum3_flg);
	
	/**
	 * 集計４使用ＦＬＧ. Aggregated 4 used flg..<p>
	 *
	 */
	public static final String $sum4_flg = "sum4_flg";
	private static final MCPermColumnInfo _sum4_flg = createColumnInfo("sum4_flg");
	public final MCBooleanPermColumn sum4_flg = createBooleanColumn(_sum4_flg);
	
	/**
	 * 集計５使用ＦＬＧ. Aggregated 5 used flg..<p>
	 *
	 */
	public static final String $sum5_flg = "sum5_flg";
	private static final MCPermColumnInfo _sum5_flg = createColumnInfo("sum5_flg");
	public final MCBooleanPermColumn sum5_flg = createBooleanColumn(_sum5_flg);
	
	/**
	 * プロジェクト使用ＦＬＧ. Project used flg..<p>
	 *
	 */
	public static final String $project_flg = "project_flg";
	private static final MCPermColumnInfo _project_flg = createColumnInfo("project_flg");
	public final MCBooleanPermColumn project_flg = createBooleanColumn(_project_flg);
	
	/**
	 * 取引先使用ＦＬＧ. BP used flg..<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	private static final MCPermColumnInfo _bp_flg = createColumnInfo("bp_flg");
	public final MCBooleanPermColumn bp_flg = createBooleanColumn(_bp_flg);
	
	/**
	 * 担当者使用ＦＬＧ. PIC used flg..<p>
	 *
	 */
	public static final String $usr_flg = "usr_flg";
	private static final MCPermColumnInfo _usr_flg = createColumnInfo("usr_flg");
	public final MCBooleanPermColumn usr_flg = createBooleanColumn(_usr_flg);
	
	/**
	 * 口座使用ＦＬＧ. Bank account used flg..<p>
	 *
	 */
	public static final String $bank_ac_flg = "bank_ac_flg";
	private static final MCPermColumnInfo _bank_ac_flg = createColumnInfo("bank_ac_flg");
	public final MCBooleanPermColumn bank_ac_flg = createBooleanColumn(_bank_ac_flg);
	
	/**
	 * ＡＰ科目区分. AP type.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	private static final MCPermColumnInfo _ap_typ = createColumnInfo("ap_typ");
	public final MCStringPermColumn ap_typ = createStringColumn(_ap_typ);
	
	/**
	 * ＡＲ科目区分. AR type.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	private static final MCPermColumnInfo _ar_typ = createColumnInfo("ar_typ");
	public final MCStringPermColumn ar_typ = createStringColumn(_ar_typ);
	
	/**
	 * 科目予備区分１. Account spare type 1.<p>
	 *
	 */
	public static final String $ac_typ1 = "ac_typ1";
	private static final MCPermColumnInfo _ac_typ1 = createColumnInfo("ac_typ1");
	public final MCStringPermColumn ac_typ1 = createStringColumn(_ac_typ1);
	
	/**
	 * 科目予備区分２. Account spare type 2.<p>
	 *
	 */
	public static final String $ac_typ2 = "ac_typ2";
	private static final MCPermColumnInfo _ac_typ2 = createColumnInfo("ac_typ2");
	public final MCStringPermColumn ac_typ2 = createStringColumn(_ac_typ2);
	
	/**
	 * 科目予備区分３. Account spare type 3.<p>
	 *
	 */
	public static final String $ac_typ3 = "ac_typ3";
	private static final MCPermColumnInfo _ac_typ3 = createColumnInfo("ac_typ3");
	public final MCStringPermColumn ac_typ3 = createStringColumn(_ac_typ3);
	
	/**
	 * 科目予備区分４. Account spare type 4.<p>
	 *
	 */
	public static final String $ac_typ4 = "ac_typ4";
	private static final MCPermColumnInfo _ac_typ4 = createColumnInfo("ac_typ4");
	public final MCStringPermColumn ac_typ4 = createStringColumn(_ac_typ4);
	
	/**
	 * 科目予備区分５. Account spare type 5.<p>
	 *
	 */
	public static final String $ac_typ5 = "ac_typ5";
	private static final MCPermColumnInfo _ac_typ5 = createColumnInfo("ac_typ5");
	public final MCStringPermColumn ac_typ5 = createStringColumn(_ac_typ5);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public static final String $if_sub_char1 = "if_sub_char1";
	private static final MCPermColumnInfo _if_sub_char1 = createColumnInfo("if_sub_char1");
	public final MCStringPermColumn if_sub_char1 = createStringColumn(_if_sub_char1);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public static final String $if_sub_char2 = "if_sub_char2";
	private static final MCPermColumnInfo _if_sub_char2 = createColumnInfo("if_sub_char2");
	public final MCStringPermColumn if_sub_char2 = createStringColumn(_if_sub_char2);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public static final String $if_sub_char3 = "if_sub_char3";
	private static final MCPermColumnInfo _if_sub_char3 = createColumnInfo("if_sub_char3");
	public final MCStringPermColumn if_sub_char3 = createStringColumn(_if_sub_char3);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public static final String $if_sub_char4 = "if_sub_char4";
	private static final MCPermColumnInfo _if_sub_char4 = createColumnInfo("if_sub_char4");
	public final MCStringPermColumn if_sub_char4 = createStringColumn(_if_sub_char4);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public static final String $if_sub_char5 = "if_sub_char5";
	private static final MCPermColumnInfo _if_sub_char5 = createColumnInfo("if_sub_char5");
	public final MCStringPermColumn if_sub_char5 = createStringColumn(_if_sub_char5);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public static final String $if_sub_char6 = "if_sub_char6";
	private static final MCPermColumnInfo _if_sub_char6 = createColumnInfo("if_sub_char6");
	public final MCStringPermColumn if_sub_char6 = createStringColumn(_if_sub_char6);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public static final String $if_sub_char7 = "if_sub_char7";
	private static final MCPermColumnInfo _if_sub_char7 = createColumnInfo("if_sub_char7");
	public final MCStringPermColumn if_sub_char7 = createStringColumn(_if_sub_char7);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public static final String $if_sub_char8 = "if_sub_char8";
	private static final MCPermColumnInfo _if_sub_char8 = createColumnInfo("if_sub_char8");
	public final MCStringPermColumn if_sub_char8 = createStringColumn(_if_sub_char8);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public static final String $if_sub_char9 = "if_sub_char9";
	private static final MCPermColumnInfo _if_sub_char9 = createColumnInfo("if_sub_char9");
	public final MCStringPermColumn if_sub_char9 = createStringColumn(_if_sub_char9);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public static final String $if_sub_char10 = "if_sub_char10";
	private static final MCPermColumnInfo _if_sub_char10 = createColumnInfo("if_sub_char10");
	public final MCStringPermColumn if_sub_char10 = createStringColumn(_if_sub_char10);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public static final String $if_sub_char11 = "if_sub_char11";
	private static final MCPermColumnInfo _if_sub_char11 = createColumnInfo("if_sub_char11");
	public final MCStringPermColumn if_sub_char11 = createStringColumn(_if_sub_char11);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public static final String $if_sub_char12 = "if_sub_char12";
	private static final MCPermColumnInfo _if_sub_char12 = createColumnInfo("if_sub_char12");
	public final MCStringPermColumn if_sub_char12 = createStringColumn(_if_sub_char12);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public static final String $if_sub_char13 = "if_sub_char13";
	private static final MCPermColumnInfo _if_sub_char13 = createColumnInfo("if_sub_char13");
	public final MCStringPermColumn if_sub_char13 = createStringColumn(_if_sub_char13);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public static final String $if_sub_char14 = "if_sub_char14";
	private static final MCPermColumnInfo _if_sub_char14 = createColumnInfo("if_sub_char14");
	public final MCStringPermColumn if_sub_char14 = createStringColumn(_if_sub_char14);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public static final String $if_sub_char15 = "if_sub_char15";
	private static final MCPermColumnInfo _if_sub_char15 = createColumnInfo("if_sub_char15");
	public final MCStringPermColumn if_sub_char15 = createStringColumn(_if_sub_char15);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public static final String $if_sub_char16 = "if_sub_char16";
	private static final MCPermColumnInfo _if_sub_char16 = createColumnInfo("if_sub_char16");
	public final MCStringPermColumn if_sub_char16 = createStringColumn(_if_sub_char16);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public static final String $if_sub_char17 = "if_sub_char17";
	private static final MCPermColumnInfo _if_sub_char17 = createColumnInfo("if_sub_char17");
	public final MCStringPermColumn if_sub_char17 = createStringColumn(_if_sub_char17);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public static final String $if_sub_char18 = "if_sub_char18";
	private static final MCPermColumnInfo _if_sub_char18 = createColumnInfo("if_sub_char18");
	public final MCStringPermColumn if_sub_char18 = createStringColumn(_if_sub_char18);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public static final String $if_sub_char19 = "if_sub_char19";
	private static final MCPermColumnInfo _if_sub_char19 = createColumnInfo("if_sub_char19");
	public final MCStringPermColumn if_sub_char19 = createStringColumn(_if_sub_char19);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public static final String $if_sub_char20 = "if_sub_char20";
	private static final MCPermColumnInfo _if_sub_char20 = createColumnInfo("if_sub_char20");
	public final MCStringPermColumn if_sub_char20 = createStringColumn(_if_sub_char20);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public static final String $if_sub_char21 = "if_sub_char21";
	private static final MCPermColumnInfo _if_sub_char21 = createColumnInfo("if_sub_char21");
	public final MCStringPermColumn if_sub_char21 = createStringColumn(_if_sub_char21);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public static final String $if_sub_char22 = "if_sub_char22";
	private static final MCPermColumnInfo _if_sub_char22 = createColumnInfo("if_sub_char22");
	public final MCStringPermColumn if_sub_char22 = createStringColumn(_if_sub_char22);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public static final String $if_sub_char23 = "if_sub_char23";
	private static final MCPermColumnInfo _if_sub_char23 = createColumnInfo("if_sub_char23");
	public final MCStringPermColumn if_sub_char23 = createStringColumn(_if_sub_char23);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public static final String $if_sub_char24 = "if_sub_char24";
	private static final MCPermColumnInfo _if_sub_char24 = createColumnInfo("if_sub_char24");
	public final MCStringPermColumn if_sub_char24 = createStringColumn(_if_sub_char24);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public static final String $if_sub_char25 = "if_sub_char25";
	private static final MCPermColumnInfo _if_sub_char25 = createColumnInfo("if_sub_char25");
	public final MCStringPermColumn if_sub_char25 = createStringColumn(_if_sub_char25);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public static final String $if_sub_char26 = "if_sub_char26";
	private static final MCPermColumnInfo _if_sub_char26 = createColumnInfo("if_sub_char26");
	public final MCStringPermColumn if_sub_char26 = createStringColumn(_if_sub_char26);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public static final String $if_sub_char27 = "if_sub_char27";
	private static final MCPermColumnInfo _if_sub_char27 = createColumnInfo("if_sub_char27");
	public final MCStringPermColumn if_sub_char27 = createStringColumn(_if_sub_char27);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public static final String $if_sub_char28 = "if_sub_char28";
	private static final MCPermColumnInfo _if_sub_char28 = createColumnInfo("if_sub_char28");
	public final MCStringPermColumn if_sub_char28 = createStringColumn(_if_sub_char28);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public static final String $if_sub_char29 = "if_sub_char29";
	private static final MCPermColumnInfo _if_sub_char29 = createColumnInfo("if_sub_char29");
	public final MCStringPermColumn if_sub_char29 = createStringColumn(_if_sub_char29);
	
	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public static final String $if_sub_char30 = "if_sub_char30";
	private static final MCPermColumnInfo _if_sub_char30 = createColumnInfo("if_sub_char30");
	public final MCStringPermColumn if_sub_char30 = createStringColumn(_if_sub_char30);
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public static final String $if_sub_num1 = "if_sub_num1";
	private static final MCPermColumnInfo _if_sub_num1 = createColumnInfo("if_sub_num1");
	public final MCNumberPermColumn if_sub_num1 = createNumberColumn(_if_sub_num1);
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public static final String $if_sub_num2 = "if_sub_num2";
	private static final MCPermColumnInfo _if_sub_num2 = createColumnInfo("if_sub_num2");
	public final MCNumberPermColumn if_sub_num2 = createNumberColumn(_if_sub_num2);
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public static final String $if_sub_num3 = "if_sub_num3";
	private static final MCPermColumnInfo _if_sub_num3 = createColumnInfo("if_sub_num3");
	public final MCNumberPermColumn if_sub_num3 = createNumberColumn(_if_sub_num3);
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public static final String $if_sub_num4 = "if_sub_num4";
	private static final MCPermColumnInfo _if_sub_num4 = createColumnInfo("if_sub_num4");
	public final MCNumberPermColumn if_sub_num4 = createNumberColumn(_if_sub_num4);
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public static final String $if_sub_num5 = "if_sub_num5";
	private static final MCPermColumnInfo _if_sub_num5 = createColumnInfo("if_sub_num5");
	public final MCNumberPermColumn if_sub_num5 = createNumberColumn(_if_sub_num5);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public static final String $if_sub_dt1 = "if_sub_dt1";
	private static final MCPermColumnInfo _if_sub_dt1 = createColumnInfo("if_sub_dt1");
	public final MCDatePermColumn if_sub_dt1 = createDateColumn(_if_sub_dt1);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public static final String $if_sub_dt2 = "if_sub_dt2";
	private static final MCPermColumnInfo _if_sub_dt2 = createColumnInfo("if_sub_dt2");
	public final MCDatePermColumn if_sub_dt2 = createDateColumn(_if_sub_dt2);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public static final String $if_sub_dt3 = "if_sub_dt3";
	private static final MCPermColumnInfo _if_sub_dt3 = createColumnInfo("if_sub_dt3");
	public final MCDatePermColumn if_sub_dt3 = createDateColumn(_if_sub_dt3);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public static final String $if_sub_dt4 = "if_sub_dt4";
	private static final MCPermColumnInfo _if_sub_dt4 = createColumnInfo("if_sub_dt4");
	public final MCDatePermColumn if_sub_dt4 = createDateColumn(_if_sub_dt4);
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public static final String $if_sub_dt5 = "if_sub_dt5";
	private static final MCPermColumnInfo _if_sub_dt5 = createColumnInfo("if_sub_dt5");
	public final MCDatePermColumn if_sub_dt5 = createDateColumn(_if_sub_dt5);
	
	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	private static final MCPermColumnInfo _batch_log_no = createColumnInfo("batch_log_no");
	public final MCStringPermColumn batch_log_no = createStringColumn(_batch_log_no);
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public static final String $log_sub_key1 = "log_sub_key1";
	private static final MCPermColumnInfo _log_sub_key1 = createColumnInfo("log_sub_key1");
	public final MCNumberPermColumn log_sub_key1 = createNumberColumn(_log_sub_key1);
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public static final String $log_sub_key2 = "log_sub_key2";
	private static final MCPermColumnInfo _log_sub_key2 = createColumnInfo("log_sub_key2");
	public final MCNumberPermColumn log_sub_key2 = createNumberColumn(_log_sub_key2);
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	private static final MCPermColumnInfo _ins_usr_id = createColumnInfo("ins_usr_id");
	public final MCStringPermColumn ins_usr_id = createStringColumn(_ins_usr_id);
	
	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	private static final MCPermColumnInfo _ins_usr_nm = createColumnInfo("ins_usr_nm");
	public final MCStringPermColumn ins_usr_nm = createStringColumn(_ins_usr_nm);
	
	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	private static final MCPermColumnInfo _ins_ts = createColumnInfo("ins_ts");
	public final MCTimestampPermColumn ins_ts = createTimestampColumn(_ins_ts);
	
	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	private static final MCPermColumnInfo _ins_func_id = createColumnInfo("ins_func_id");
	public final MCStringPermColumn ins_func_id = createStringColumn(_ins_func_id);
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	private static final MCPermColumnInfo _upd_cntr = createColumnInfo("upd_cntr");
	public final MCNumberPermColumn upd_cntr = createNumberColumn(_upd_cntr);
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	private static final MCPermColumnInfo _upd_usr_id = createColumnInfo("upd_usr_id");
	public final MCStringPermColumn upd_usr_id = createStringColumn(_upd_usr_id);
	
	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	private static final MCPermColumnInfo _upd_usr_nm = createColumnInfo("upd_usr_nm");
	public final MCStringPermColumn upd_usr_nm = createStringColumn(_upd_usr_nm);
	
	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	private static final MCPermColumnInfo _upd_ts = createColumnInfo("upd_ts");
	public final MCTimestampPermColumn upd_ts = createTimestampColumn(_upd_ts);
	
	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	private static final MCPermColumnInfo _upd_func_id = createColumnInfo("upd_func_id");
	public final MCStringPermColumn upd_func_id = createStringColumn(_upd_func_id);
	
	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	private static final MCPermColumnInfo _upd_srv_req_no = createColumnInfo("upd_srv_req_no");
	public final MCStringPermColumn upd_srv_req_no = createStringColumn(_upd_srv_req_no);
	
	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public static final String $sdrv_sts_typ = "sdrv_sts_typ";
	
	/**
	 * 会計税名. Accounting tax name.<p>
	 *
	 */
	public static final String $ac_tax_nm = "ac_tax_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_data_no_META = createCommonMeta($ext_data_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta ext_data_lno_META = createCommonMeta($ext_data_lno, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_LNO);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta imp_flg_META = createCommonMeta($imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm_lcl1_META = createCommonMeta($ac_nm_lcl1, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm_lcl2_META = createCommonMeta($ac_nm_lcl2, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm_lcl3_META = createCommonMeta($ac_nm_lcl3, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm2_META = createCommonMeta($ac_nm2, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta ac_nm2_lcl1_META = createCommonMeta($ac_nm2_lcl1, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta ac_nm2_lcl2_META = createCommonMeta($ac_nm2_lcl2, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta ac_nm2_lcl3_META = createCommonMeta($ac_nm2_lcl3, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta dc_typ_META = createCommonMeta($dc_typ, mcframe.commonMA.meta.MA_META.DC_TYP);
	public static final MCMeta sub_flg_META = createCommonMeta($sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_typ_META = createCommonMeta($ac_typ, mcframe.commonMA.meta.MA_META.AC_CD_TYP);
	public static final MCMeta ac_tax_cd_META = createCommonMeta($ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta ac_tax_typ_META = createCommonMeta($ac_tax_typ, mcframe.commonMA.meta.MA_META.AC_TAX_TYP);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum0_flg_META = createCommonMeta($sum0_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum1_flg_META = createCommonMeta($sum1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum2_flg_META = createCommonMeta($sum2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum3_flg_META = createCommonMeta($sum3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum4_flg_META = createCommonMeta($sum4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum5_flg_META = createCommonMeta($sum5_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta project_flg_META = createCommonMeta($project_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_flg_META = createCommonMeta($usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_ac_flg_META = createCommonMeta($bank_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ1_META = createCommonMeta($ac_typ1, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ2_META = createCommonMeta($ac_typ2, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ3_META = createCommonMeta($ac_typ3, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ4_META = createCommonMeta($ac_typ4, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ5_META = createCommonMeta($ac_typ5, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta if_sub_char1_META = createCommonMeta($if_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta if_sub_char2_META = createCommonMeta($if_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta if_sub_char3_META = createCommonMeta($if_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta if_sub_char4_META = createCommonMeta($if_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta if_sub_char5_META = createCommonMeta($if_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta if_sub_char6_META = createCommonMeta($if_sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta if_sub_char7_META = createCommonMeta($if_sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta if_sub_char8_META = createCommonMeta($if_sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta if_sub_char9_META = createCommonMeta($if_sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta if_sub_char10_META = createCommonMeta($if_sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta if_sub_char11_META = createCommonMeta($if_sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta if_sub_char12_META = createCommonMeta($if_sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta if_sub_char13_META = createCommonMeta($if_sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta if_sub_char14_META = createCommonMeta($if_sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta if_sub_char15_META = createCommonMeta($if_sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta if_sub_char16_META = createCommonMeta($if_sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta if_sub_char17_META = createCommonMeta($if_sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta if_sub_char18_META = createCommonMeta($if_sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta if_sub_char19_META = createCommonMeta($if_sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta if_sub_char20_META = createCommonMeta($if_sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta if_sub_char21_META = createCommonMeta($if_sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta if_sub_char22_META = createCommonMeta($if_sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta if_sub_char23_META = createCommonMeta($if_sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta if_sub_char24_META = createCommonMeta($if_sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta if_sub_char25_META = createCommonMeta($if_sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta if_sub_char26_META = createCommonMeta($if_sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta if_sub_char27_META = createCommonMeta($if_sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta if_sub_char28_META = createCommonMeta($if_sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta if_sub_char29_META = createCommonMeta($if_sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta if_sub_char30_META = createCommonMeta($if_sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta if_sub_num1_META = createCommonMeta($if_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta if_sub_num2_META = createCommonMeta($if_sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta if_sub_num3_META = createCommonMeta($if_sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta if_sub_num4_META = createCommonMeta($if_sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta if_sub_num5_META = createCommonMeta($if_sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta if_sub_dt1_META = createCommonMeta($if_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt2_META = createCommonMeta($if_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt3_META = createCommonMeta($if_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt4_META = createCommonMeta($if_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt5_META = createCommonMeta($if_sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta sdrv_sts_typ_META = createCommonMeta($sdrv_sts_typ, mcframe.commonMA.meta.MA_META.SDRV_STS_TYP);
	public static final MCMeta ac_tax_nm_META = createCommonMeta($ac_tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $SDRV = "SDRV";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MBVT_PFT_SDRV_IF",
				$SDRV,
				new String[][]{
						{"data_no", "data_no"}
				},
				() -> {
					return mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R.create("SDRV");
				},
				(alias) -> {
					MBT_ACCOUNT_IF_R own = MBT_ACCOUNT_IF_R.create(alias);
					mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R ref = mcframe.serverMB.dbc.MBVT_PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MBT_ACCOUNT_IF_R> constMetas = new ConstMetaList<MBT_ACCOUNT_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			exe_sts_typ_META,
			data_crud_typ_META,
			ext_sys_cd_META,
			ext_data_no_META,
			ext_data_lno_META,
			data_make_dt_META,
			imp_flg_META,
			ac_cd_META,
			ac_nm_META,
			ac_nm_lcl1_META,
			ac_nm_lcl2_META,
			ac_nm_lcl3_META,
			ac_nm2_META,
			ac_nm2_lcl1_META,
			ac_nm2_lcl2_META,
			ac_nm2_lcl3_META,
			dc_typ_META,
			sub_flg_META,
			ac_typ_META,
			ac_tax_cd_META,
			ac_tax_typ_META,
			foreign_flg_META,
			sum0_flg_META,
			sum1_flg_META,
			sum2_flg_META,
			sum3_flg_META,
			sum4_flg_META,
			sum5_flg_META,
			project_flg_META,
			bp_flg_META,
			usr_flg_META,
			bank_ac_flg_META,
			ap_typ_META,
			ar_typ_META,
			ac_typ1_META,
			ac_typ2_META,
			ac_typ3_META,
			ac_typ4_META,
			ac_typ5_META,
			memo1_META,
			memo2_META,
			memo3_META,
			if_sub_char1_META,
			if_sub_char2_META,
			if_sub_char3_META,
			if_sub_char4_META,
			if_sub_char5_META,
			if_sub_char6_META,
			if_sub_char7_META,
			if_sub_char8_META,
			if_sub_char9_META,
			if_sub_char10_META,
			if_sub_char11_META,
			if_sub_char12_META,
			if_sub_char13_META,
			if_sub_char14_META,
			if_sub_char15_META,
			if_sub_char16_META,
			if_sub_char17_META,
			if_sub_char18_META,
			if_sub_char19_META,
			if_sub_char20_META,
			if_sub_char21_META,
			if_sub_char22_META,
			if_sub_char23_META,
			if_sub_char24_META,
			if_sub_char25_META,
			if_sub_char26_META,
			if_sub_char27_META,
			if_sub_char28_META,
			if_sub_char29_META,
			if_sub_char30_META,
			if_sub_num1_META,
			if_sub_num2_META,
			if_sub_num3_META,
			if_sub_num4_META,
			if_sub_num5_META,
			if_sub_dt1_META,
			if_sub_dt2_META,
			if_sub_dt3_META,
			if_sub_dt4_META,
			if_sub_dt5_META,
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_srv_req_no_META,
			sdrv_sts_typ_META,
			ac_tax_nm_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);
	

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * コンストラクタです。
	 */
	protected MBT_ACCOUNT_IF_R(ConstMetaList<? extends MBT_ACCOUNT_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBT_ACCOUNT_IF_R(ConstMetaList<? extends MBT_ACCOUNT_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$data_lno,
				"data_lno",
				data_lno,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$data_no,
				"data_no",
				data_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$exe_sts_typ,
				"exe_sts_typ",
				exe_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$data_crud_typ,
				"data_crud_typ",
				data_crud_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ext_sys_cd,
				"ext_sys_cd",
				ext_sys_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ext_data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$ext_data_no,
				"ext_data_no",
				ext_data_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ext_data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$ext_data_lno,
				"ext_data_lno",
				ext_data_lno,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$data_make_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_ACCOUNT_IF_R.$data_make_dt,
				"data_make_dt",
				data_make_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$imp_flg,
				"imp_flg",
				imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_cd,
				"ac_cd",
				ac_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_nm,
				"ac_nm",
				ac_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_nm_lcl1,
				"ac_nm_lcl1",
				ac_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_nm_lcl2,
				"ac_nm_lcl2",
				ac_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_nm_lcl3,
				"ac_nm_lcl3",
				ac_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_nm2,
				"ac_nm2",
				ac_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_nm2_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_nm2_lcl1,
				"ac_nm2_lcl1",
				ac_nm2_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_nm2_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_nm2_lcl2,
				"ac_nm2_lcl2",
				ac_nm2_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_nm2_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_nm2_lcl3,
				"ac_nm2_lcl3",
				ac_nm2_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$dc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$dc_typ,
				"dc_typ",
				dc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$sub_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$sub_flg,
				"sub_flg",
				sub_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_typ,
				"ac_typ",
				ac_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_tax_cd,
				"ac_tax_cd",
				ac_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_tax_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_tax_typ,
				"ac_tax_typ",
				ac_tax_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$foreign_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$foreign_flg,
				"foreign_flg",
				foreign_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$sum0_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$sum0_flg,
				"sum0_flg",
				sum0_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$sum1_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$sum1_flg,
				"sum1_flg",
				sum1_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$sum2_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$sum2_flg,
				"sum2_flg",
				sum2_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$sum3_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$sum3_flg,
				"sum3_flg",
				sum3_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$sum4_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$sum4_flg,
				"sum4_flg",
				sum4_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$sum5_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$sum5_flg,
				"sum5_flg",
				sum5_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$project_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$project_flg,
				"project_flg",
				project_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$bp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$bp_flg,
				"bp_flg",
				bp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$usr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$usr_flg,
				"usr_flg",
				usr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$bank_ac_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MBT_ACCOUNT_IF_R.$bank_ac_flg,
				"bank_ac_flg",
				bank_ac_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ap_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ap_typ,
				"ap_typ",
				ap_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ar_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ar_typ,
				"ar_typ",
				ar_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_typ1,
				"ac_typ1",
				ac_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_typ2,
				"ac_typ2",
				ac_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_typ3,
				"ac_typ3",
				ac_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_typ4,
				"ac_typ4",
				ac_typ4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_typ5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_typ5,
				"ac_typ5",
				ac_typ5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char1,
				"if_sub_char1",
				if_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char2,
				"if_sub_char2",
				if_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char3,
				"if_sub_char3",
				if_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char4,
				"if_sub_char4",
				if_sub_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char5,
				"if_sub_char5",
				if_sub_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char6,
				"if_sub_char6",
				if_sub_char6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char7,
				"if_sub_char7",
				if_sub_char7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char8,
				"if_sub_char8",
				if_sub_char8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char9,
				"if_sub_char9",
				if_sub_char9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char10,
				"if_sub_char10",
				if_sub_char10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char11,
				"if_sub_char11",
				if_sub_char11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char12,
				"if_sub_char12",
				if_sub_char12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char13,
				"if_sub_char13",
				if_sub_char13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char14,
				"if_sub_char14",
				if_sub_char14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char15,
				"if_sub_char15",
				if_sub_char15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char16,
				"if_sub_char16",
				if_sub_char16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char17,
				"if_sub_char17",
				if_sub_char17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char18,
				"if_sub_char18",
				if_sub_char18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char19,
				"if_sub_char19",
				if_sub_char19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char20,
				"if_sub_char20",
				if_sub_char20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char21,
				"if_sub_char21",
				if_sub_char21,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char22,
				"if_sub_char22",
				if_sub_char22,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char23,
				"if_sub_char23",
				if_sub_char23,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char24,
				"if_sub_char24",
				if_sub_char24,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char25,
				"if_sub_char25",
				if_sub_char25,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char26,
				"if_sub_char26",
				if_sub_char26,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char27,
				"if_sub_char27",
				if_sub_char27,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char28,
				"if_sub_char28",
				if_sub_char28,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char29,
				"if_sub_char29",
				if_sub_char29,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$if_sub_char30,
				"if_sub_char30",
				if_sub_char30,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$if_sub_num1,
				"if_sub_num1",
				if_sub_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$if_sub_num2,
				"if_sub_num2",
				if_sub_num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$if_sub_num3,
				"if_sub_num3",
				if_sub_num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$if_sub_num4,
				"if_sub_num4",
				if_sub_num4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$if_sub_num5,
				"if_sub_num5",
				if_sub_num5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_ACCOUNT_IF_R.$if_sub_dt1,
				"if_sub_dt1",
				if_sub_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_ACCOUNT_IF_R.$if_sub_dt2,
				"if_sub_dt2",
				if_sub_dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_ACCOUNT_IF_R.$if_sub_dt3,
				"if_sub_dt3",
				if_sub_dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_ACCOUNT_IF_R.$if_sub_dt4,
				"if_sub_dt4",
				if_sub_dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$if_sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBT_ACCOUNT_IF_R.$if_sub_dt5,
				"if_sub_dt5",
				if_sub_dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$batch_log_no,
				"batch_log_no",
				batch_log_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$log_sub_key1,
				"log_sub_key1",
				log_sub_key1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$log_sub_key2,
				"log_sub_key2",
				log_sub_key2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_ACCOUNT_IF_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBT_ACCOUNT_IF_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MBT_ACCOUNT_IF_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$sdrv_sts_typ,
				"sdrv_sts_typ",
				null,
				false,
				true,
				false,
				false,
				true,
				"SDRV.SDRV_STS_TYP"
			)
		);
		COLUMN_MAP.put(
			MBT_ACCOUNT_IF_R.$ac_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBT_ACCOUNT_IF_R.$ac_tax_nm,
				"ac_tax_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_ACCOUNT_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBT_ACCOUNT_IF_R create(String alias) {
		MBT_ACCOUNT_IF_R row = new MBT_ACCOUNT_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBT_ACCOUNT_IF_R createByName(T proto) {
		MBT_ACCOUNT_IF_R row = MBT_ACCOUNT_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_ACCOUNT_IF_R clone() {
		return (MBT_ACCOUNT_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_ACCOUNT_IF_R createInstance() {
		return (MBT_ACCOUNT_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBT_ACCOUNT_IF_R getValues(String... names) {
		return (MBT_ACCOUNT_IF_R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MBW_ACCOUNT_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MBW_ACCOUNT_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MBW_ACCOUNT_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MBW_ACCOUNT_IF_KEY_R.TABLE_NAME);
	 }

	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 1, $data_no);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public String exe_sts_typ() {
		return getConstString(offset + 2, $exe_sts_typ);
	}

	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		setConstString(offset + 2, $exe_sts_typ, value);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 4, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 4, $ext_sys_cd, value);
	}

	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return getConstNumber(offset + 5, $ext_data_no);
	}

	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(int value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(long value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(float value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(double value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return getConstNumber(offset + 6, $ext_data_lno);
	}

	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(int value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(long value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(float value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(double value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 7, $data_make_dt);
	}

	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 7, $data_make_dt, value);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public boolean imp_flg() {
		return getConstBoolean(offset + 8, $imp_flg);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public void imp_flg(boolean value) {
		setConstBoolean(offset + 8, $imp_flg, value);
	}

	/**
	 * 勘定科目ＣＤ. Account cd..<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 9, $ac_cd);
	}

	/**
	 * 勘定科目ＣＤ. Account cd..<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 9, $ac_cd, value);
	}

	/**
	 * 勘定科目名. Account name.<p>
	 *
	 */
	public String ac_nm() {
		return getConstString(offset + 10, $ac_nm);
	}

	/**
	 * 勘定科目名. Account name.<p>
	 *
	 */
	public void ac_nm(String value) {
		setConstString(offset + 10, $ac_nm, value);
	}

	/**
	 * 勘定科目名_ロケール１. Account name_locale 1.<p>
	 *
	 */
	public String ac_nm_lcl1() {
		return getConstString(offset + 11, $ac_nm_lcl1);
	}

	/**
	 * 勘定科目名_ロケール１. Account name_locale 1.<p>
	 *
	 */
	public void ac_nm_lcl1(String value) {
		setConstString(offset + 11, $ac_nm_lcl1, value);
	}

	/**
	 * 勘定科目名_ロケール２. Account name_locale 2.<p>
	 *
	 */
	public String ac_nm_lcl2() {
		return getConstString(offset + 12, $ac_nm_lcl2);
	}

	/**
	 * 勘定科目名_ロケール２. Account name_locale 2.<p>
	 *
	 */
	public void ac_nm_lcl2(String value) {
		setConstString(offset + 12, $ac_nm_lcl2, value);
	}

	/**
	 * 勘定科目名_ロケール３. Account name_locale 3.<p>
	 *
	 */
	public String ac_nm_lcl3() {
		return getConstString(offset + 13, $ac_nm_lcl3);
	}

	/**
	 * 勘定科目名_ロケール３. Account name_locale 3.<p>
	 *
	 */
	public void ac_nm_lcl3(String value) {
		setConstString(offset + 13, $ac_nm_lcl3, value);
	}

	/**
	 * 勘定科目略名. Account abbreviation name.<p>
	 *
	 */
	public String ac_nm2() {
		return getConstString(offset + 14, $ac_nm2);
	}

	/**
	 * 勘定科目略名. Account abbreviation name.<p>
	 *
	 */
	public void ac_nm2(String value) {
		setConstString(offset + 14, $ac_nm2, value);
	}

	/**
	 * 勘定科目略名_ロケール１. Account abbreviation name_locale 1.<p>
	 *
	 */
	public String ac_nm2_lcl1() {
		return getConstString(offset + 15, $ac_nm2_lcl1);
	}

	/**
	 * 勘定科目略名_ロケール１. Account abbreviation name_locale 1.<p>
	 *
	 */
	public void ac_nm2_lcl1(String value) {
		setConstString(offset + 15, $ac_nm2_lcl1, value);
	}

	/**
	 * 勘定科目略名_ロケール２. Account abbreviation name_locale 2.<p>
	 *
	 */
	public String ac_nm2_lcl2() {
		return getConstString(offset + 16, $ac_nm2_lcl2);
	}

	/**
	 * 勘定科目略名_ロケール２. Account abbreviation name_locale 2.<p>
	 *
	 */
	public void ac_nm2_lcl2(String value) {
		setConstString(offset + 16, $ac_nm2_lcl2, value);
	}

	/**
	 * 勘定科目略名_ロケール３. Account abbreviation name_locale 3.<p>
	 *
	 */
	public String ac_nm2_lcl3() {
		return getConstString(offset + 17, $ac_nm2_lcl3);
	}

	/**
	 * 勘定科目略名_ロケール３. Account abbreviation name_locale 3.<p>
	 *
	 */
	public void ac_nm2_lcl3(String value) {
		setConstString(offset + 17, $ac_nm2_lcl3, value);
	}

	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public String dc_typ() {
		return getConstString(offset + 18, $dc_typ);
	}

	/**
	 * 貸借区分. Debit and credit type.<p>
	 *
	 */
	public void dc_typ(String value) {
		setConstString(offset + 18, $dc_typ, value);
	}

	/**
	 * 補助科目使用ＦＬＧ. Subsidiary account used flg..<p>
	 *
	 */
	public boolean sub_flg() {
		return getConstBoolean(offset + 19, $sub_flg);
	}

	/**
	 * 補助科目使用ＦＬＧ. Subsidiary account used flg..<p>
	 *
	 */
	public void sub_flg(boolean value) {
		setConstBoolean(offset + 19, $sub_flg, value);
	}

	/**
	 * 勘定科目区分. Account type.<p>
	 *
	 */
	public String ac_typ() {
		return getConstString(offset + 20, $ac_typ);
	}

	/**
	 * 勘定科目区分. Account type.<p>
	 *
	 */
	public void ac_typ(String value) {
		setConstString(offset + 20, $ac_typ, value);
	}

	/**
	 * 会計税ＣＤ. Accounting tax cd..<p>
	 *
	 */
	public String ac_tax_cd() {
		return getConstString(offset + 21, $ac_tax_cd);
	}

	/**
	 * 会計税ＣＤ. Accounting tax cd..<p>
	 *
	 */
	public void ac_tax_cd(String value) {
		setConstString(offset + 21, $ac_tax_cd, value);
	}

	/**
	 * 会計税区分. Accounting tax type.<p>
	 *
	 */
	public String ac_tax_typ() {
		return getConstString(offset + 22, $ac_tax_typ);
	}

	/**
	 * 会計税区分. Accounting tax type.<p>
	 *
	 */
	public void ac_tax_typ(String value) {
		setConstString(offset + 22, $ac_tax_typ, value);
	}

	/**
	 * 外貨ＦＬＧ. Foreign currency flg..<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 23, $foreign_flg);
	}

	/**
	 * 外貨ＦＬＧ. Foreign currency flg..<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 23, $foreign_flg, value);
	}

	/**
	 * 集計０使用ＦＬＧ. Aggregated 0 used flg..<p>
	 *
	 */
	public boolean sum0_flg() {
		return getConstBoolean(offset + 24, $sum0_flg);
	}

	/**
	 * 集計０使用ＦＬＧ. Aggregated 0 used flg..<p>
	 *
	 */
	public void sum0_flg(boolean value) {
		setConstBoolean(offset + 24, $sum0_flg, value);
	}

	/**
	 * 集計１使用ＦＬＧ. Aggregated 1 used flg..<p>
	 *
	 */
	public boolean sum1_flg() {
		return getConstBoolean(offset + 25, $sum1_flg);
	}

	/**
	 * 集計１使用ＦＬＧ. Aggregated 1 used flg..<p>
	 *
	 */
	public void sum1_flg(boolean value) {
		setConstBoolean(offset + 25, $sum1_flg, value);
	}

	/**
	 * 集計２使用ＦＬＧ. Aggregated 2 used flg..<p>
	 *
	 */
	public boolean sum2_flg() {
		return getConstBoolean(offset + 26, $sum2_flg);
	}

	/**
	 * 集計２使用ＦＬＧ. Aggregated 2 used flg..<p>
	 *
	 */
	public void sum2_flg(boolean value) {
		setConstBoolean(offset + 26, $sum2_flg, value);
	}

	/**
	 * 集計３使用ＦＬＧ. Aggregated 3 used flg..<p>
	 *
	 */
	public boolean sum3_flg() {
		return getConstBoolean(offset + 27, $sum3_flg);
	}

	/**
	 * 集計３使用ＦＬＧ. Aggregated 3 used flg..<p>
	 *
	 */
	public void sum3_flg(boolean value) {
		setConstBoolean(offset + 27, $sum3_flg, value);
	}

	/**
	 * 集計４使用ＦＬＧ. Aggregated 4 used flg..<p>
	 *
	 */
	public boolean sum4_flg() {
		return getConstBoolean(offset + 28, $sum4_flg);
	}

	/**
	 * 集計４使用ＦＬＧ. Aggregated 4 used flg..<p>
	 *
	 */
	public void sum4_flg(boolean value) {
		setConstBoolean(offset + 28, $sum4_flg, value);
	}

	/**
	 * 集計５使用ＦＬＧ. Aggregated 5 used flg..<p>
	 *
	 */
	public boolean sum5_flg() {
		return getConstBoolean(offset + 29, $sum5_flg);
	}

	/**
	 * 集計５使用ＦＬＧ. Aggregated 5 used flg..<p>
	 *
	 */
	public void sum5_flg(boolean value) {
		setConstBoolean(offset + 29, $sum5_flg, value);
	}

	/**
	 * プロジェクト使用ＦＬＧ. Project used flg..<p>
	 *
	 */
	public boolean project_flg() {
		return getConstBoolean(offset + 30, $project_flg);
	}

	/**
	 * プロジェクト使用ＦＬＧ. Project used flg..<p>
	 *
	 */
	public void project_flg(boolean value) {
		setConstBoolean(offset + 30, $project_flg, value);
	}

	/**
	 * 取引先使用ＦＬＧ. BP used flg..<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 31, $bp_flg);
	}

	/**
	 * 取引先使用ＦＬＧ. BP used flg..<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 31, $bp_flg, value);
	}

	/**
	 * 担当者使用ＦＬＧ. PIC used flg..<p>
	 *
	 */
	public boolean usr_flg() {
		return getConstBoolean(offset + 32, $usr_flg);
	}

	/**
	 * 担当者使用ＦＬＧ. PIC used flg..<p>
	 *
	 */
	public void usr_flg(boolean value) {
		setConstBoolean(offset + 32, $usr_flg, value);
	}

	/**
	 * 口座使用ＦＬＧ. Bank account used flg..<p>
	 *
	 */
	public boolean bank_ac_flg() {
		return getConstBoolean(offset + 33, $bank_ac_flg);
	}

	/**
	 * 口座使用ＦＬＧ. Bank account used flg..<p>
	 *
	 */
	public void bank_ac_flg(boolean value) {
		setConstBoolean(offset + 33, $bank_ac_flg, value);
	}

	/**
	 * ＡＰ科目区分. AP type.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 34, $ap_typ);
	}

	/**
	 * ＡＰ科目区分. AP type.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 34, $ap_typ, value);
	}

	/**
	 * ＡＲ科目区分. AR type.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 35, $ar_typ);
	}

	/**
	 * ＡＲ科目区分. AR type.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 35, $ar_typ, value);
	}

	/**
	 * 科目予備区分１. Account spare type 1.<p>
	 *
	 */
	public String ac_typ1() {
		return getConstString(offset + 36, $ac_typ1);
	}

	/**
	 * 科目予備区分１. Account spare type 1.<p>
	 *
	 */
	public void ac_typ1(String value) {
		setConstString(offset + 36, $ac_typ1, value);
	}

	/**
	 * 科目予備区分２. Account spare type 2.<p>
	 *
	 */
	public String ac_typ2() {
		return getConstString(offset + 37, $ac_typ2);
	}

	/**
	 * 科目予備区分２. Account spare type 2.<p>
	 *
	 */
	public void ac_typ2(String value) {
		setConstString(offset + 37, $ac_typ2, value);
	}

	/**
	 * 科目予備区分３. Account spare type 3.<p>
	 *
	 */
	public String ac_typ3() {
		return getConstString(offset + 38, $ac_typ3);
	}

	/**
	 * 科目予備区分３. Account spare type 3.<p>
	 *
	 */
	public void ac_typ3(String value) {
		setConstString(offset + 38, $ac_typ3, value);
	}

	/**
	 * 科目予備区分４. Account spare type 4.<p>
	 *
	 */
	public String ac_typ4() {
		return getConstString(offset + 39, $ac_typ4);
	}

	/**
	 * 科目予備区分４. Account spare type 4.<p>
	 *
	 */
	public void ac_typ4(String value) {
		setConstString(offset + 39, $ac_typ4, value);
	}

	/**
	 * 科目予備区分５. Account spare type 5.<p>
	 *
	 */
	public String ac_typ5() {
		return getConstString(offset + 40, $ac_typ5);
	}

	/**
	 * 科目予備区分５. Account spare type 5.<p>
	 *
	 */
	public void ac_typ5(String value) {
		setConstString(offset + 40, $ac_typ5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 41, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 41, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 42, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 42, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 43, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 43, $memo3, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 44, $if_sub_char1);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１. IF spare CHAR column 1.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 44, $if_sub_char1, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 45, $if_sub_char2);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２. IF spare CHAR column 2.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 45, $if_sub_char2, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 46, $if_sub_char3);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３. IF spare CHAR column 3.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 46, $if_sub_char3, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 47, $if_sub_char4);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目４. IF spare CHAR column 4.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 47, $if_sub_char4, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 48, $if_sub_char5);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目５. IF spare CHAR column 5.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 48, $if_sub_char5, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 49, $if_sub_char6);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目６. IF spare CHAR column 6.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 49, $if_sub_char6, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 50, $if_sub_char7);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目７. IF spare CHAR column 7.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 50, $if_sub_char7, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 51, $if_sub_char8);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目８. IF spare CHAR column 8.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 51, $if_sub_char8, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 52, $if_sub_char9);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目９. IF spare CHAR column 9.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 52, $if_sub_char9, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 53, $if_sub_char10);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１０. IF spare CHAR column 10.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 53, $if_sub_char10, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 54, $if_sub_char11);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１１. IF spare CHAR column 11.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 54, $if_sub_char11, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 55, $if_sub_char12);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１２. IF spare CHAR column 12.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 55, $if_sub_char12, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 56, $if_sub_char13);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１３. IF spare CHAR column 13.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 56, $if_sub_char13, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 57, $if_sub_char14);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１４. IF spare CHAR column 14.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 57, $if_sub_char14, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 58, $if_sub_char15);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１５. IF spare CHAR column 15.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 58, $if_sub_char15, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 59, $if_sub_char16);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１６. IF spare CHAR column 16.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 59, $if_sub_char16, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 60, $if_sub_char17);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１７. IF spare CHAR column 17.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 60, $if_sub_char17, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 61, $if_sub_char18);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１８. IF spare CHAR column 18.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 61, $if_sub_char18, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 62, $if_sub_char19);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目１９. IF spare CHAR column 19.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 62, $if_sub_char19, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 63, $if_sub_char20);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２０. IF spare CHAR column 20.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 63, $if_sub_char20, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 64, $if_sub_char21);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２１. IF spare CHAR column 21.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 64, $if_sub_char21, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 65, $if_sub_char22);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２２. IF spare CHAR column 22.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 65, $if_sub_char22, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 66, $if_sub_char23);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２３. IF spare CHAR column 23.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 66, $if_sub_char23, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 67, $if_sub_char24);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２４. IF spare CHAR column 24.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 67, $if_sub_char24, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 68, $if_sub_char25);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２５. IF spare CHAR column 25.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 68, $if_sub_char25, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 69, $if_sub_char26);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２６. IF spare CHAR column 26.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 69, $if_sub_char26, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 70, $if_sub_char27);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２７. IF spare CHAR column 27.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 70, $if_sub_char27, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 71, $if_sub_char28);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２８. IF spare CHAR column 28.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 71, $if_sub_char28, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 72, $if_sub_char29);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目２９. IF spare CHAR column 29.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 72, $if_sub_char29, value);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 73, $if_sub_char30);
	}

	/**
	 * ＩＦ予備ＣＨＡＲ項目３０. IF spare CHAR column 30.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 73, $if_sub_char30, value);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 74, $if_sub_num1);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 74, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 74, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 74, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 74, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目１. IF spare NUM column 1.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 74, $if_sub_num1, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 75, $if_sub_num2);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 75, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 75, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 75, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 75, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目２. IF spare NUM column 2.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 75, $if_sub_num2, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 76, $if_sub_num3);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 76, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 76, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 76, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 76, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目３. IF spare NUM column 3.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 76, $if_sub_num3, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 77, $if_sub_num4);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 77, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 77, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 77, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 77, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目４. IF spare NUM column 4.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 77, $if_sub_num4, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 78, $if_sub_num5);
	}

	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 78, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 78, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 78, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 78, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＮＵＭ項目５. IF spare NUM column 5.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 78, $if_sub_num5, value);
	}
	
	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 79, $if_sub_dt1);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目１. IF spare DATE column 1.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 79, $if_sub_dt1, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 80, $if_sub_dt2);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目２. IF spare DATE column 2.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 80, $if_sub_dt2, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 81, $if_sub_dt3);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目３. IF spare DATE column 3.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 81, $if_sub_dt3, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 82, $if_sub_dt4);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目４. IF spare DATE column 4.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 82, $if_sub_dt4, value);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 83, $if_sub_dt5);
	}

	/**
	 * ＩＦ予備ＤＡＴＥ項目５. IF spare DATE column 5.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 83, $if_sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 84, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 84, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 85, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 85, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 85, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 85, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 85, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 85, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 86, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 86, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 86, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 86, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 86, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 86, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 87, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 87, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 88, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 88, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 89, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 89, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 90, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 90, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 91, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 91, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 92, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 92, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 93, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 93, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 94, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 94, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 95, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 95, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 96, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 96, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 97, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 97, $sdrv_sts_typ, value);
	}

	/**
	 * 会計税名. Accounting tax name.<p>
	 *
	 */
	public String ac_tax_nm() {
		return getConstString(offset + 98, $ac_tax_nm);
	}

	/**
	 * 会計税名. Accounting tax name.<p>
	 *
	 */
	public void ac_tax_nm(String value) {
		setConstString(offset + 98, $ac_tax_nm, value);
	}

	public String getString(String name) {
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($ac_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_nm_lcl1();
		}
		if ($ac_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_nm_lcl2();
		}
		if ($ac_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_nm_lcl3();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($ac_nm2_lcl1.equalsIgnoreCase(name)) {
			return ac_nm2_lcl1();
		}
		if ($ac_nm2_lcl2.equalsIgnoreCase(name)) {
			return ac_nm2_lcl2();
		}
		if ($ac_nm2_lcl3.equalsIgnoreCase(name)) {
			return ac_nm2_lcl3();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			return ac_tax_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			return sdrv_sts_typ();
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			return ac_tax_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDate(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			return sum0_flg();
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			return sum1_flg();
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			return sum2_flg();
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			return sum3_flg();
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			return sum4_flg();
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			return sum5_flg();
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			return project_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			return usr_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($ac_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_nm_lcl1();
		}
		if ($ac_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_nm_lcl2();
		}
		if ($ac_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_nm_lcl3();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($ac_nm2_lcl1.equalsIgnoreCase(name)) {
			return ac_nm2_lcl1();
		}
		if ($ac_nm2_lcl2.equalsIgnoreCase(name)) {
			return ac_nm2_lcl2();
		}
		if ($ac_nm2_lcl3.equalsIgnoreCase(name)) {
			return ac_nm2_lcl3();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			return ac_tax_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			return sdrv_sts_typ();
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			return ac_tax_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDateNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			return sum0_flg();
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			return sum1_flg();
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			return sum2_flg();
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			return sum3_flg();
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			return sum4_flg();
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			return sum5_flg();
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			return project_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			return usr_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($ac_nm_lcl1.equalsIgnoreCase(name)) {
			ac_nm_lcl1(value);
			return;
		}
		if ($ac_nm_lcl2.equalsIgnoreCase(name)) {
			ac_nm_lcl2(value);
			return;
		}
		if ($ac_nm_lcl3.equalsIgnoreCase(name)) {
			ac_nm_lcl3(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($ac_nm2_lcl1.equalsIgnoreCase(name)) {
			ac_nm2_lcl1(value);
			return;
		}
		if ($ac_nm2_lcl2.equalsIgnoreCase(name)) {
			ac_nm2_lcl2(value);
			return;
		}
		if ($ac_nm2_lcl3.equalsIgnoreCase(name)) {
			ac_nm2_lcl3(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			ac_tax_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			sdrv_sts_typ(value);
			return;
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			ac_tax_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			sum0_flg(value);
			return;
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			sum1_flg(value);
			return;
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			sum2_flg(value);
			return;
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			sum3_flg(value);
			return;
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			sum4_flg(value);
			return;
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			sum5_flg(value);
			return;
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			project_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			usr_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($ac_nm_lcl1.equalsIgnoreCase(name)) {
			ac_nm_lcl1(value);
			return;
		}
		if ($ac_nm_lcl2.equalsIgnoreCase(name)) {
			ac_nm_lcl2(value);
			return;
		}
		if ($ac_nm_lcl3.equalsIgnoreCase(name)) {
			ac_nm_lcl3(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($ac_nm2_lcl1.equalsIgnoreCase(name)) {
			ac_nm2_lcl1(value);
			return;
		}
		if ($ac_nm2_lcl2.equalsIgnoreCase(name)) {
			ac_nm2_lcl2(value);
			return;
		}
		if ($ac_nm2_lcl3.equalsIgnoreCase(name)) {
			ac_nm2_lcl3(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			ac_tax_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			sdrv_sts_typ(value);
			return;
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			ac_tax_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			sum0_flg(value);
			return;
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			sum1_flg(value);
			return;
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			sum2_flg(value);
			return;
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			sum3_flg(value);
			return;
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			sum4_flg(value);
			return;
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			sum5_flg(value);
			return;
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			project_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			usr_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
