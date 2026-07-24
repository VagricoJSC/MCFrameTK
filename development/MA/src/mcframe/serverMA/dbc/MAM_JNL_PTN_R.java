package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
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
 * "自動仕訳パタンマスタ // Auto-journal pattern master"DBコンテナRowクラスです。<p>
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
 *  	<td>jnl_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳パタンＣＤ</td>
 *  	<td>Journal pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>jnl_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>連番</td>
 *  	<td>Sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_dpt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>借方部門区分</td>
 *  	<td>Debit dept. type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_dpt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸方部門区分</td>
 *  	<td>Credit dept. type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方部門ＣＤ</td>
 *  	<td>Debit dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方部門ＣＤ</td>
 *  	<td>Credit dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>借方パタン区分</td>
 *  	<td>Debit pattern type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dr_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方仕訳グループＣＤ</td>
 *  	<td>Debit journal group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cr_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸方パタン区分</td>
 *  	<td>Credit pattern type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方仕訳グループＣＤ</td>
 *  	<td>Credit journal group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_ac_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方勘定科目ＣＤ</td>
 *  	<td>Debit account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dr_sub_ac_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方補助勘定科目ＣＤ</td>
 *  	<td>Debit subsidiary account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cr_ac_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方勘定科目ＣＤ</td>
 *  	<td>Credit account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_sub_ac_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方補助勘定科目ＣＤ</td>
 *  	<td>Credit subsidiary account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_ac_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方会計税ＣＤ</td>
 *  	<td>Debit accounting tax cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_ac_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方会計税ＣＤ</td>
 *  	<td>Credit accounting tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_bp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方取引先区分</td>
 *  	<td>Debit BP type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_bp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方取引先区分</td>
 *  	<td>Credit BP type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方取引先ＣＤ</td>
 *  	<td>Debit BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方取引先ＣＤ</td>
 *  	<td>Credit company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方品目区分</td>
 *  	<td>Debit item type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方品目区分</td>
 *  	<td>Credit item type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_amt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方金額区分</td>
 *  	<td>Debit amount type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_amt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方金額区分</td>
 *  	<td>Credit amount type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_abs_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方摘要区分</td>
 *  	<td>Debit abstract type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dr_abstract</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>借方摘要</td>
 *  	<td>Debit summary</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cr_abs_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方摘要区分</td>
 *  	<td>Credit abstract type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_abstract</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>貸方摘要</td>
 *  	<td>Credit summary</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_trd_sml_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>借方振替先集計ＦＬＧ</td>
 *  	<td>Debit transfer destination aggregation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_trd_sml_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸方振替先集計ＦＬＧ</td>
 *  	<td>Credit transfer destination aggregation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>carry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>繰越仕訳ＦＬＧ</td>
 *  	<td>Carry-over journal flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>minus_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マイナスＦＬＧ</td>
 *  	<td>Minus flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_jnl_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳ＣＤ</td>
 *  	<td>Item journal cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買区分</td>
 *  	<td>Purchase type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>un_fix_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額未確定区分</td>
 *  	<td>Amount unfirm type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>foreign_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国外取引区分</td>
 *  	<td>Foreign transaction type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資産区分</td>
 *  	<td>Asset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>quality_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫良品区分</td>
 *  	<td>Inventory conforming type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inv_loc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫場所区分</td>
 *  	<td>Inventory location type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt_sign_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額符号区分</td>
 *  	<td>Amount sign type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jnl_key1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目１</td>
 *  	<td>Journal key column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>jnl_key2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目２</td>
 *  	<td>Journal key column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jnl_key3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目３</td>
 *  	<td>Journal key column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>jnl_key4</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目４</td>
 *  	<td>Journal key column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jnl_key5</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目５</td>
 *  	<td>Journal key column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>jnl_key6</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目６</td>
 *  	<td>Journal key column 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jnl_key7</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目７</td>
 *  	<td>Journal key column 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>jnl_key8</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目８</td>
 *  	<td>Journal key column 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jnl_key9</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目９</td>
 *  	<td>Journal key column 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>jnl_key10</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳キー項目１０</td>
 *  	<td>Journal key column 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon01_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１月対象外ＦＬＧ</td>
 *  	<td>Not for Jan. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon02_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>２月対象外ＦＬＧ</td>
 *  	<td>Not for Feb. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon03_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>３月対象外ＦＬＧ</td>
 *  	<td>Not for Mar. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon04_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>４月対象外ＦＬＧ</td>
 *  	<td>Not for Apr. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon05_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>５月対象外ＦＬＧ</td>
 *  	<td>Not for May flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon06_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>６月対象外ＦＬＧ</td>
 *  	<td>Not for Jun. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon07_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>７月対象外ＦＬＧ</td>
 *  	<td>Not for July flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon08_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>８月対象外ＦＬＧ</td>
 *  	<td>Not for Aug. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon09_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>９月対象外ＦＬＧ</td>
 *  	<td>Not for Sep. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon10_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１０月対象外ＦＬＧ</td>
 *  	<td>Not for Oct. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon11_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１１月対象外ＦＬＧ</td>
 *  	<td>Not for Nov. flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon12_invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１２月対象外ＦＬＧ</td>
 *  	<td>Not for Dec. flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
 *  	<td>jnl_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>JNL_PTN_BASE1.JNL_PTN_NM</td>
 *  	<td>仕訳パタン名</td>
 *  	<td>Journal pattern name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>JNL_GRP1.JNL_GRP_NM</td>
 *  	<td>借方仕訳グループ名</td>
 *  	<td>Debit journal group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>JNL_GRP2.JNL_GRP_NM</td>
 *  	<td>貸方仕訳グループ名</td>
 *  	<td>Credit journal group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>ACCOUNT1.AC_NM</td>
 *  	<td>借方勘定科目名</td>
 *  	<td>Debit account name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dr_sub_ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>SUB_ACCOUNT1.SUB_AC_NM</td>
 *  	<td>借方補助勘定科目名</td>
 *  	<td>Debit subsidiary account name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cr_ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>ACCOUNT2.AC_NM</td>
 *  	<td>貸方勘定科目名</td>
 *  	<td>Credit account name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_sub_ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>SUB_ACCOUNT2.SUB_AC_NM</td>
 *  	<td>貸方補助勘定科目名</td>
 *  	<td>Credit subsidiary account name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_ac_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>AC_TAX1.AC_TAX_NM</td>
 *  	<td>借方会計税名</td>
 *  	<td>Debit Accounting tax name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_ac_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>AC_TAX2.AC_TAX_NM</td>
 *  	<td>貸方会計税名</td>
 *  	<td>Credit accounting tax name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dr_bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP1.BP_NM</td>
 *  	<td>借方取引先名</td>
 *  	<td>Debit BP name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cr_bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP2.BP_NM</td>
 *  	<td>貸方取引先名</td>
 *  	<td>Credit BP name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_jnl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>ITM_JNL1.ITM_JNL_NM</td>
 *  	<td>品目仕訳名</td>
 *  	<td>Item journal name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>AC_RSN1.AC_RSN_NM</td>
 *  	<td>会計理由名</td>
 *  	<td>Accounting reason name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CUR1.CUR_NM</td>
 *  	<td>通貨名</td>
 *  	<td>Currency name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_JNL_PTN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_JNL_PTN";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	private static final MCPermColumnInfo _jnl_ptn_cd = createColumnInfo("jnl_ptn_cd");
	public final MCStringPermColumn jnl_ptn_cd = createStringColumn(_jnl_ptn_cd);
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public static final String $jnl_seq = "jnl_seq";
	private static final MCPermColumnInfo _jnl_seq = createColumnInfo("jnl_seq");
	public final MCNumberPermColumn jnl_seq = createNumberColumn(_jnl_seq);
	
	/**
	 * 借方部門区分. Debit dept. type.<p>
	 *
	 */
	public static final String $dr_dpt_typ = "dr_dpt_typ";
	private static final MCPermColumnInfo _dr_dpt_typ = createColumnInfo("dr_dpt_typ");
	public final MCStringPermColumn dr_dpt_typ = createStringColumn(_dr_dpt_typ);
	
	/**
	 * 貸方部門区分. Credit dept. type.<p>
	 *
	 */
	public static final String $cr_dpt_typ = "cr_dpt_typ";
	private static final MCPermColumnInfo _cr_dpt_typ = createColumnInfo("cr_dpt_typ");
	public final MCStringPermColumn cr_dpt_typ = createStringColumn(_cr_dpt_typ);
	
	/**
	 * 借方部門ＣＤ. Debit dept. cd..<p>
	 *
	 */
	public static final String $dr_dpt_cd = "dr_dpt_cd";
	private static final MCPermColumnInfo _dr_dpt_cd = createColumnInfo("dr_dpt_cd");
	public final MCStringPermColumn dr_dpt_cd = createStringColumn(_dr_dpt_cd);
	
	/**
	 * 貸方部門ＣＤ. Credit dept. cd..<p>
	 *
	 */
	public static final String $cr_dpt_cd = "cr_dpt_cd";
	private static final MCPermColumnInfo _cr_dpt_cd = createColumnInfo("cr_dpt_cd");
	public final MCStringPermColumn cr_dpt_cd = createStringColumn(_cr_dpt_cd);
	
	/**
	 * 借方パタン区分. Debit pattern type.<p>
	 *
	 */
	public static final String $dr_ptn_typ = "dr_ptn_typ";
	private static final MCPermColumnInfo _dr_ptn_typ = createColumnInfo("dr_ptn_typ");
	public final MCStringPermColumn dr_ptn_typ = createStringColumn(_dr_ptn_typ);
	
	/**
	 * 借方仕訳グループＣＤ. Debit journal group cd..<p>
	 *
	 */
	public static final String $dr_grp_cd = "dr_grp_cd";
	private static final MCPermColumnInfo _dr_grp_cd = createColumnInfo("dr_grp_cd");
	public final MCStringPermColumn dr_grp_cd = createStringColumn(_dr_grp_cd);
	
	/**
	 * 貸方パタン区分. Credit pattern type.<p>
	 *
	 */
	public static final String $cr_ptn_typ = "cr_ptn_typ";
	private static final MCPermColumnInfo _cr_ptn_typ = createColumnInfo("cr_ptn_typ");
	public final MCStringPermColumn cr_ptn_typ = createStringColumn(_cr_ptn_typ);
	
	/**
	 * 貸方仕訳グループＣＤ. Credit journal group cd..<p>
	 *
	 */
	public static final String $cr_grp_cd = "cr_grp_cd";
	private static final MCPermColumnInfo _cr_grp_cd = createColumnInfo("cr_grp_cd");
	public final MCStringPermColumn cr_grp_cd = createStringColumn(_cr_grp_cd);
	
	/**
	 * 借方勘定科目ＣＤ. Debit account cd..<p>
	 *
	 */
	public static final String $dr_ac_cd = "dr_ac_cd";
	private static final MCPermColumnInfo _dr_ac_cd = createColumnInfo("dr_ac_cd");
	public final MCStringPermColumn dr_ac_cd = createStringColumn(_dr_ac_cd);
	
	/**
	 * 借方補助勘定科目ＣＤ. Debit subsidiary account cd..<p>
	 *
	 */
	public static final String $dr_sub_ac_cd = "dr_sub_ac_cd";
	private static final MCPermColumnInfo _dr_sub_ac_cd = createColumnInfo("dr_sub_ac_cd");
	public final MCStringPermColumn dr_sub_ac_cd = createStringColumn(_dr_sub_ac_cd);
	
	/**
	 * 貸方勘定科目ＣＤ. Credit account cd..<p>
	 *
	 */
	public static final String $cr_ac_cd = "cr_ac_cd";
	private static final MCPermColumnInfo _cr_ac_cd = createColumnInfo("cr_ac_cd");
	public final MCStringPermColumn cr_ac_cd = createStringColumn(_cr_ac_cd);
	
	/**
	 * 貸方補助勘定科目ＣＤ. Credit subsidiary account cd..<p>
	 *
	 */
	public static final String $cr_sub_ac_cd = "cr_sub_ac_cd";
	private static final MCPermColumnInfo _cr_sub_ac_cd = createColumnInfo("cr_sub_ac_cd");
	public final MCStringPermColumn cr_sub_ac_cd = createStringColumn(_cr_sub_ac_cd);
	
	/**
	 * 借方会計税ＣＤ. Debit accounting tax cd..<p>
	 *
	 */
	public static final String $dr_ac_tax_cd = "dr_ac_tax_cd";
	private static final MCPermColumnInfo _dr_ac_tax_cd = createColumnInfo("dr_ac_tax_cd");
	public final MCStringPermColumn dr_ac_tax_cd = createStringColumn(_dr_ac_tax_cd);
	
	/**
	 * 貸方会計税ＣＤ. Credit accounting tax cd..<p>
	 *
	 */
	public static final String $cr_ac_tax_cd = "cr_ac_tax_cd";
	private static final MCPermColumnInfo _cr_ac_tax_cd = createColumnInfo("cr_ac_tax_cd");
	public final MCStringPermColumn cr_ac_tax_cd = createStringColumn(_cr_ac_tax_cd);
	
	/**
	 * 借方取引先区分. Debit BP type.<p>
	 *
	 */
	public static final String $dr_bp_typ = "dr_bp_typ";
	private static final MCPermColumnInfo _dr_bp_typ = createColumnInfo("dr_bp_typ");
	public final MCStringPermColumn dr_bp_typ = createStringColumn(_dr_bp_typ);
	
	/**
	 * 貸方取引先区分. Credit BP type.<p>
	 *
	 */
	public static final String $cr_bp_typ = "cr_bp_typ";
	private static final MCPermColumnInfo _cr_bp_typ = createColumnInfo("cr_bp_typ");
	public final MCStringPermColumn cr_bp_typ = createStringColumn(_cr_bp_typ);
	
	/**
	 * 借方取引先ＣＤ. Debit BP cd..<p>
	 *
	 */
	public static final String $dr_bp_cd = "dr_bp_cd";
	private static final MCPermColumnInfo _dr_bp_cd = createColumnInfo("dr_bp_cd");
	public final MCStringPermColumn dr_bp_cd = createStringColumn(_dr_bp_cd);
	
	/**
	 * 貸方取引先ＣＤ. Credit company cd..<p>
	 *
	 */
	public static final String $cr_bp_cd = "cr_bp_cd";
	private static final MCPermColumnInfo _cr_bp_cd = createColumnInfo("cr_bp_cd");
	public final MCStringPermColumn cr_bp_cd = createStringColumn(_cr_bp_cd);
	
	/**
	 * 借方品目区分. Debit item type.<p>
	 *
	 */
	public static final String $dr_itm_typ = "dr_itm_typ";
	private static final MCPermColumnInfo _dr_itm_typ = createColumnInfo("dr_itm_typ");
	public final MCStringPermColumn dr_itm_typ = createStringColumn(_dr_itm_typ);
	
	/**
	 * 貸方品目区分. Credit item type.<p>
	 *
	 */
	public static final String $cr_itm_typ = "cr_itm_typ";
	private static final MCPermColumnInfo _cr_itm_typ = createColumnInfo("cr_itm_typ");
	public final MCStringPermColumn cr_itm_typ = createStringColumn(_cr_itm_typ);
	
	/**
	 * 借方金額区分. Debit amount type.<p>
	 *
	 */
	public static final String $dr_amt_typ = "dr_amt_typ";
	private static final MCPermColumnInfo _dr_amt_typ = createColumnInfo("dr_amt_typ");
	public final MCStringPermColumn dr_amt_typ = createStringColumn(_dr_amt_typ);
	
	/**
	 * 貸方金額区分. Credit amount type.<p>
	 *
	 */
	public static final String $cr_amt_typ = "cr_amt_typ";
	private static final MCPermColumnInfo _cr_amt_typ = createColumnInfo("cr_amt_typ");
	public final MCStringPermColumn cr_amt_typ = createStringColumn(_cr_amt_typ);
	
	/**
	 * 借方摘要区分. Debit abstract type.<p>
	 *
	 */
	public static final String $dr_abs_typ = "dr_abs_typ";
	private static final MCPermColumnInfo _dr_abs_typ = createColumnInfo("dr_abs_typ");
	public final MCStringPermColumn dr_abs_typ = createStringColumn(_dr_abs_typ);
	
	/**
	 * 借方摘要. Debit summary.<p>
	 *
	 */
	public static final String $dr_abstract = "dr_abstract";
	private static final MCPermColumnInfo _dr_abstract = createColumnInfo("dr_abstract");
	public final MCStringPermColumn dr_abstract = createStringColumn(_dr_abstract);
	
	/**
	 * 貸方摘要区分. Credit abstract type.<p>
	 *
	 */
	public static final String $cr_abs_typ = "cr_abs_typ";
	private static final MCPermColumnInfo _cr_abs_typ = createColumnInfo("cr_abs_typ");
	public final MCStringPermColumn cr_abs_typ = createStringColumn(_cr_abs_typ);
	
	/**
	 * 貸方摘要. Credit summary.<p>
	 *
	 */
	public static final String $cr_abstract = "cr_abstract";
	private static final MCPermColumnInfo _cr_abstract = createColumnInfo("cr_abstract");
	public final MCStringPermColumn cr_abstract = createStringColumn(_cr_abstract);
	
	/**
	 * 借方振替先集計ＦＬＧ. Debit transfer destination aggregation flg..<p>
	 *
	 */
	public static final String $dr_trd_sml_flg = "dr_trd_sml_flg";
	private static final MCPermColumnInfo _dr_trd_sml_flg = createColumnInfo("dr_trd_sml_flg");
	public final MCBooleanPermColumn dr_trd_sml_flg = createBooleanColumn(_dr_trd_sml_flg);
	
	/**
	 * 貸方振替先集計ＦＬＧ. Credit transfer destination aggregation flg..<p>
	 *
	 */
	public static final String $cr_trd_sml_flg = "cr_trd_sml_flg";
	private static final MCPermColumnInfo _cr_trd_sml_flg = createColumnInfo("cr_trd_sml_flg");
	public final MCBooleanPermColumn cr_trd_sml_flg = createBooleanColumn(_cr_trd_sml_flg);
	
	/**
	 * 繰越仕訳ＦＬＧ. Carry-over journal flg..<p>
	 *
	 */
	public static final String $carry_flg = "carry_flg";
	private static final MCPermColumnInfo _carry_flg = createColumnInfo("carry_flg");
	public final MCBooleanPermColumn carry_flg = createBooleanColumn(_carry_flg);
	
	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public static final String $minus_flg = "minus_flg";
	private static final MCPermColumnInfo _minus_flg = createColumnInfo("minus_flg");
	public final MCBooleanPermColumn minus_flg = createBooleanColumn(_minus_flg);
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	private static final MCPermColumnInfo _itm_jnl_cd = createColumnInfo("itm_jnl_cd");
	public final MCStringPermColumn itm_jnl_cd = createStringColumn(_itm_jnl_cd);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 購買区分. Purchase type.<p>
	 *
	 */
	public static final String $purc_typ = "purc_typ";
	private static final MCPermColumnInfo _purc_typ = createColumnInfo("purc_typ");
	public final MCStringPermColumn purc_typ = createStringColumn(_purc_typ);
	
	/**
	 * 金額未確定区分. Amount unfirm type.<p>
	 *
	 */
	public static final String $un_fix_typ = "un_fix_typ";
	private static final MCPermColumnInfo _un_fix_typ = createColumnInfo("un_fix_typ");
	public final MCStringPermColumn un_fix_typ = createStringColumn(_un_fix_typ);
	
	/**
	 * 国外取引区分. Foreign transaction type.<p>
	 *
	 */
	public static final String $foreign_typ = "foreign_typ";
	private static final MCPermColumnInfo _foreign_typ = createColumnInfo("foreign_typ");
	public final MCStringPermColumn foreign_typ = createStringColumn(_foreign_typ);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	private static final MCPermColumnInfo _asst_typ = createColumnInfo("asst_typ");
	public final MCStringPermColumn asst_typ = createStringColumn(_asst_typ);
	
	/**
	 * 在庫良品区分. Inventory conforming type.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	private static final MCPermColumnInfo _quality_typ = createColumnInfo("quality_typ");
	public final MCStringPermColumn quality_typ = createStringColumn(_quality_typ);
	
	/**
	 * 在庫場所区分. Inventory location type.<p>
	 *
	 */
	public static final String $inv_loc_typ = "inv_loc_typ";
	private static final MCPermColumnInfo _inv_loc_typ = createColumnInfo("inv_loc_typ");
	public final MCStringPermColumn inv_loc_typ = createStringColumn(_inv_loc_typ);
	
	/**
	 * 金額符号区分. Amount sign type.<p>
	 *
	 */
	public static final String $amt_sign_typ = "amt_sign_typ";
	private static final MCPermColumnInfo _amt_sign_typ = createColumnInfo("amt_sign_typ");
	public final MCStringPermColumn amt_sign_typ = createStringColumn(_amt_sign_typ);
	
	/**
	 * 仕訳キー項目１. Journal key column 1.<p>
	 *
	 */
	public static final String $jnl_key1 = "jnl_key1";
	private static final MCPermColumnInfo _jnl_key1 = createColumnInfo("jnl_key1");
	public final MCStringPermColumn jnl_key1 = createStringColumn(_jnl_key1);
	
	/**
	 * 仕訳キー項目２. Journal key column 2.<p>
	 *
	 */
	public static final String $jnl_key2 = "jnl_key2";
	private static final MCPermColumnInfo _jnl_key2 = createColumnInfo("jnl_key2");
	public final MCStringPermColumn jnl_key2 = createStringColumn(_jnl_key2);
	
	/**
	 * 仕訳キー項目３. Journal key column 3.<p>
	 *
	 */
	public static final String $jnl_key3 = "jnl_key3";
	private static final MCPermColumnInfo _jnl_key3 = createColumnInfo("jnl_key3");
	public final MCStringPermColumn jnl_key3 = createStringColumn(_jnl_key3);
	
	/**
	 * 仕訳キー項目４. Journal key column 4.<p>
	 *
	 */
	public static final String $jnl_key4 = "jnl_key4";
	private static final MCPermColumnInfo _jnl_key4 = createColumnInfo("jnl_key4");
	public final MCStringPermColumn jnl_key4 = createStringColumn(_jnl_key4);
	
	/**
	 * 仕訳キー項目５. Journal key column 5.<p>
	 *
	 */
	public static final String $jnl_key5 = "jnl_key5";
	private static final MCPermColumnInfo _jnl_key5 = createColumnInfo("jnl_key5");
	public final MCStringPermColumn jnl_key5 = createStringColumn(_jnl_key5);
	
	/**
	 * 仕訳キー項目６. Journal key column 6.<p>
	 *
	 */
	public static final String $jnl_key6 = "jnl_key6";
	private static final MCPermColumnInfo _jnl_key6 = createColumnInfo("jnl_key6");
	public final MCStringPermColumn jnl_key6 = createStringColumn(_jnl_key6);
	
	/**
	 * 仕訳キー項目７. Journal key column 7.<p>
	 *
	 */
	public static final String $jnl_key7 = "jnl_key7";
	private static final MCPermColumnInfo _jnl_key7 = createColumnInfo("jnl_key7");
	public final MCStringPermColumn jnl_key7 = createStringColumn(_jnl_key7);
	
	/**
	 * 仕訳キー項目８. Journal key column 8.<p>
	 *
	 */
	public static final String $jnl_key8 = "jnl_key8";
	private static final MCPermColumnInfo _jnl_key8 = createColumnInfo("jnl_key8");
	public final MCStringPermColumn jnl_key8 = createStringColumn(_jnl_key8);
	
	/**
	 * 仕訳キー項目９. Journal key column 9.<p>
	 *
	 */
	public static final String $jnl_key9 = "jnl_key9";
	private static final MCPermColumnInfo _jnl_key9 = createColumnInfo("jnl_key9");
	public final MCStringPermColumn jnl_key9 = createStringColumn(_jnl_key9);
	
	/**
	 * 仕訳キー項目１０. Journal key column 10.<p>
	 *
	 */
	public static final String $jnl_key10 = "jnl_key10";
	private static final MCPermColumnInfo _jnl_key10 = createColumnInfo("jnl_key10");
	public final MCStringPermColumn jnl_key10 = createStringColumn(_jnl_key10);
	
	/**
	 * １月対象外ＦＬＧ. Not for Jan. flg..<p>
	 *
	 */
	public static final String $mon01_invalid_flg = "mon01_invalid_flg";
	private static final MCPermColumnInfo _mon01_invalid_flg = createColumnInfo("mon01_invalid_flg");
	public final MCBooleanPermColumn mon01_invalid_flg = createBooleanColumn(_mon01_invalid_flg);
	
	/**
	 * ２月対象外ＦＬＧ. Not for Feb. flg..<p>
	 *
	 */
	public static final String $mon02_invalid_flg = "mon02_invalid_flg";
	private static final MCPermColumnInfo _mon02_invalid_flg = createColumnInfo("mon02_invalid_flg");
	public final MCBooleanPermColumn mon02_invalid_flg = createBooleanColumn(_mon02_invalid_flg);
	
	/**
	 * ３月対象外ＦＬＧ. Not for Mar. flg..<p>
	 *
	 */
	public static final String $mon03_invalid_flg = "mon03_invalid_flg";
	private static final MCPermColumnInfo _mon03_invalid_flg = createColumnInfo("mon03_invalid_flg");
	public final MCBooleanPermColumn mon03_invalid_flg = createBooleanColumn(_mon03_invalid_flg);
	
	/**
	 * ４月対象外ＦＬＧ. Not for Apr. flg..<p>
	 *
	 */
	public static final String $mon04_invalid_flg = "mon04_invalid_flg";
	private static final MCPermColumnInfo _mon04_invalid_flg = createColumnInfo("mon04_invalid_flg");
	public final MCBooleanPermColumn mon04_invalid_flg = createBooleanColumn(_mon04_invalid_flg);
	
	/**
	 * ５月対象外ＦＬＧ. Not for May flg..<p>
	 *
	 */
	public static final String $mon05_invalid_flg = "mon05_invalid_flg";
	private static final MCPermColumnInfo _mon05_invalid_flg = createColumnInfo("mon05_invalid_flg");
	public final MCBooleanPermColumn mon05_invalid_flg = createBooleanColumn(_mon05_invalid_flg);
	
	/**
	 * ６月対象外ＦＬＧ. Not for Jun. flg..<p>
	 *
	 */
	public static final String $mon06_invalid_flg = "mon06_invalid_flg";
	private static final MCPermColumnInfo _mon06_invalid_flg = createColumnInfo("mon06_invalid_flg");
	public final MCBooleanPermColumn mon06_invalid_flg = createBooleanColumn(_mon06_invalid_flg);
	
	/**
	 * ７月対象外ＦＬＧ. Not for July flg..<p>
	 *
	 */
	public static final String $mon07_invalid_flg = "mon07_invalid_flg";
	private static final MCPermColumnInfo _mon07_invalid_flg = createColumnInfo("mon07_invalid_flg");
	public final MCBooleanPermColumn mon07_invalid_flg = createBooleanColumn(_mon07_invalid_flg);
	
	/**
	 * ８月対象外ＦＬＧ. Not for Aug. flg..<p>
	 *
	 */
	public static final String $mon08_invalid_flg = "mon08_invalid_flg";
	private static final MCPermColumnInfo _mon08_invalid_flg = createColumnInfo("mon08_invalid_flg");
	public final MCBooleanPermColumn mon08_invalid_flg = createBooleanColumn(_mon08_invalid_flg);
	
	/**
	 * ９月対象外ＦＬＧ. Not for Sep. flg..<p>
	 *
	 */
	public static final String $mon09_invalid_flg = "mon09_invalid_flg";
	private static final MCPermColumnInfo _mon09_invalid_flg = createColumnInfo("mon09_invalid_flg");
	public final MCBooleanPermColumn mon09_invalid_flg = createBooleanColumn(_mon09_invalid_flg);
	
	/**
	 * １０月対象外ＦＬＧ. Not for Oct. flg..<p>
	 *
	 */
	public static final String $mon10_invalid_flg = "mon10_invalid_flg";
	private static final MCPermColumnInfo _mon10_invalid_flg = createColumnInfo("mon10_invalid_flg");
	public final MCBooleanPermColumn mon10_invalid_flg = createBooleanColumn(_mon10_invalid_flg);
	
	/**
	 * １１月対象外ＦＬＧ. Not for Nov. flg..<p>
	 *
	 */
	public static final String $mon11_invalid_flg = "mon11_invalid_flg";
	private static final MCPermColumnInfo _mon11_invalid_flg = createColumnInfo("mon11_invalid_flg");
	public final MCBooleanPermColumn mon11_invalid_flg = createBooleanColumn(_mon11_invalid_flg);
	
	/**
	 * １２月対象外ＦＬＧ. Not for Dec. flg..<p>
	 *
	 */
	public static final String $mon12_invalid_flg = "mon12_invalid_flg";
	private static final MCPermColumnInfo _mon12_invalid_flg = createColumnInfo("mon12_invalid_flg");
	public final MCBooleanPermColumn mon12_invalid_flg = createBooleanColumn(_mon12_invalid_flg);
	
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
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	private static final MCPermColumnInfo _del_flg = createColumnInfo("del_flg");
	public final MCBooleanPermColumn del_flg = createBooleanColumn(_del_flg);
	
	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	private static final MCPermColumnInfo _del_usr_id = createColumnInfo("del_usr_id");
	public final MCStringPermColumn del_usr_id = createStringColumn(_del_usr_id);
	
	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	private static final MCPermColumnInfo _del_usr_nm = createColumnInfo("del_usr_nm");
	public final MCStringPermColumn del_usr_nm = createStringColumn(_del_usr_nm);
	
	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	private static final MCPermColumnInfo _del_ts = createColumnInfo("del_ts");
	public final MCTimestampPermColumn del_ts = createTimestampColumn(_del_ts);
	
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
	 * 仕訳パタン名. Journal pattern name.<p>
	 *
	 */
	public static final String $jnl_ptn_nm = "jnl_ptn_nm";
	
	/**
	 * 借方仕訳グループ名. Debit journal group name.<p>
	 *
	 */
	public static final String $dr_grp_nm = "dr_grp_nm";
	
	/**
	 * 貸方仕訳グループ名. Credit journal group name.<p>
	 *
	 */
	public static final String $cr_grp_nm = "cr_grp_nm";
	
	/**
	 * 借方勘定科目名. Debit account name.<p>
	 *
	 */
	public static final String $dr_ac_nm = "dr_ac_nm";
	
	/**
	 * 借方補助勘定科目名. Debit subsidiary account name.<p>
	 *
	 */
	public static final String $dr_sub_ac_nm = "dr_sub_ac_nm";
	
	/**
	 * 貸方勘定科目名. Credit account name.<p>
	 *
	 */
	public static final String $cr_ac_nm = "cr_ac_nm";
	
	/**
	 * 貸方補助勘定科目名. Credit subsidiary account name.<p>
	 *
	 */
	public static final String $cr_sub_ac_nm = "cr_sub_ac_nm";
	
	/**
	 * 借方会計税名. Debit Accounting tax name.<p>
	 *
	 */
	public static final String $dr_ac_tax_nm = "dr_ac_tax_nm";
	
	/**
	 * 貸方会計税名. Credit accounting tax name.<p>
	 *
	 */
	public static final String $cr_ac_tax_nm = "cr_ac_tax_nm";
	
	/**
	 * 借方取引先名. Debit BP name.<p>
	 *
	 */
	public static final String $dr_bp_nm = "dr_bp_nm";
	
	/**
	 * 貸方取引先名. Credit BP name.<p>
	 *
	 */
	public static final String $cr_bp_nm = "cr_bp_nm";
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	
	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	
	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta jnl_seq_META = createCommonMeta($jnl_seq, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta dr_dpt_typ_META = createCommonMeta($dr_dpt_typ, mcframe.commonMA.meta.MA_META.DPT_TYP);
	public static final MCMeta cr_dpt_typ_META = createCommonMeta($cr_dpt_typ, mcframe.commonMA.meta.MA_META.DPT_TYP);
	public static final MCMeta dr_dpt_cd_META = createCommonMeta($dr_dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta cr_dpt_cd_META = createCommonMeta($cr_dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta dr_ptn_typ_META = createCommonMeta($dr_ptn_typ, mcframe.commonMA.meta.MA_META.PTN_TYP);
	public static final MCMeta dr_grp_cd_META = createCommonMeta($dr_grp_cd, mcframe.commonMA.meta.MA_META.JNL_GRP_CD);
	public static final MCMeta cr_ptn_typ_META = createCommonMeta($cr_ptn_typ, mcframe.commonMA.meta.MA_META.PTN_TYP);
	public static final MCMeta cr_grp_cd_META = createCommonMeta($cr_grp_cd, mcframe.commonMA.meta.MA_META.JNL_GRP_CD);
	public static final MCMeta dr_ac_cd_META = createCommonMeta($dr_ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta dr_sub_ac_cd_META = createCommonMeta($dr_sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta cr_ac_cd_META = createCommonMeta($cr_ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta cr_sub_ac_cd_META = createCommonMeta($cr_sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta dr_ac_tax_cd_META = createCommonMeta($dr_ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta cr_ac_tax_cd_META = createCommonMeta($cr_ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta dr_bp_typ_META = createCommonMeta($dr_bp_typ, mcframe.commonMA.meta.MA_META.BP_SET_TYP);
	public static final MCMeta cr_bp_typ_META = createCommonMeta($cr_bp_typ, mcframe.commonMA.meta.MA_META.BP_SET_TYP);
	public static final MCMeta dr_bp_cd_META = createCommonMeta($dr_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cr_bp_cd_META = createCommonMeta($cr_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dr_itm_typ_META = createCommonMeta($dr_itm_typ, mcframe.commonMA.meta.MA_META.ITM_SET_TYP);
	public static final MCMeta cr_itm_typ_META = createCommonMeta($cr_itm_typ, mcframe.commonMA.meta.MA_META.ITM_SET_TYP);
	public static final MCMeta dr_amt_typ_META = createCommonMeta($dr_amt_typ, mcframe.commonMA.meta.MA_META.AMT_TYP);
	public static final MCMeta cr_amt_typ_META = createCommonMeta($cr_amt_typ, mcframe.commonMA.meta.MA_META.AMT_TYP);
	public static final MCMeta dr_abs_typ_META = createCommonMeta($dr_abs_typ, mcframe.commonMA.meta.MA_META.ABS_TYP);
	public static final MCMeta dr_abstract_META = createCommonMeta($dr_abstract, mcframe.commonMA.meta.MA_META.ABSTRACT_M);
	public static final MCMeta cr_abs_typ_META = createCommonMeta($cr_abs_typ, mcframe.commonMA.meta.MA_META.ABS_TYP);
	public static final MCMeta cr_abstract_META = createCommonMeta($cr_abstract, mcframe.commonMA.meta.MA_META.ABSTRACT_M);
	public static final MCMeta dr_trd_sml_flg_META = createCommonMeta($dr_trd_sml_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cr_trd_sml_flg_META = createCommonMeta($cr_trd_sml_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta carry_flg_META = createCommonMeta($carry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta minus_flg_META = createCommonMeta($minus_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta purc_typ_META = createCommonMeta($purc_typ, mcframe.commonMA.meta.MA_META.PURC_TYP);
	public static final MCMeta un_fix_typ_META = createCommonMeta($un_fix_typ, mcframe.commonMA.meta.MA_META.UN_FIX_TYP);
	public static final MCMeta foreign_typ_META = createCommonMeta($foreign_typ, mcframe.commonMA.meta.MA_META.FOREIGN_TYP);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta inv_loc_typ_META = createCommonMeta($inv_loc_typ, mcframe.commonMA.meta.MA_META.INV_LOC_TYP);
	public static final MCMeta amt_sign_typ_META = createCommonMeta($amt_sign_typ, mcframe.commonMA.meta.MA_META.AMT_SIGN_TYP);
	public static final MCMeta jnl_key1_META = createCommonMeta($jnl_key1, mcframe.commonMA.meta.MA_META.JNL_KEY1);
	public static final MCMeta jnl_key2_META = createCommonMeta($jnl_key2, mcframe.commonMA.meta.MA_META.JNL_KEY2);
	public static final MCMeta jnl_key3_META = createCommonMeta($jnl_key3, mcframe.commonMA.meta.MA_META.JNL_KEY3);
	public static final MCMeta jnl_key4_META = createCommonMeta($jnl_key4, mcframe.commonMA.meta.MA_META.JNL_KEY4);
	public static final MCMeta jnl_key5_META = createCommonMeta($jnl_key5, mcframe.commonMA.meta.MA_META.JNL_KEY5);
	public static final MCMeta jnl_key6_META = createCommonMeta($jnl_key6, mcframe.commonMA.meta.MA_META.JNL_KEY6);
	public static final MCMeta jnl_key7_META = createCommonMeta($jnl_key7, mcframe.commonMA.meta.MA_META.JNL_KEY7);
	public static final MCMeta jnl_key8_META = createCommonMeta($jnl_key8, mcframe.commonMA.meta.MA_META.JNL_KEY8);
	public static final MCMeta jnl_key9_META = createCommonMeta($jnl_key9, mcframe.commonMA.meta.MA_META.JNL_KEY9);
	public static final MCMeta jnl_key10_META = createCommonMeta($jnl_key10, mcframe.commonMA.meta.MA_META.JNL_KEY10);
	public static final MCMeta mon01_invalid_flg_META = createCommonMeta($mon01_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon02_invalid_flg_META = createCommonMeta($mon02_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon03_invalid_flg_META = createCommonMeta($mon03_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon04_invalid_flg_META = createCommonMeta($mon04_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon05_invalid_flg_META = createCommonMeta($mon05_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon06_invalid_flg_META = createCommonMeta($mon06_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon07_invalid_flg_META = createCommonMeta($mon07_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon08_invalid_flg_META = createCommonMeta($mon08_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon09_invalid_flg_META = createCommonMeta($mon09_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon10_invalid_flg_META = createCommonMeta($mon10_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon11_invalid_flg_META = createCommonMeta($mon11_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon12_invalid_flg_META = createCommonMeta($mon12_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
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
	public static final MCMeta jnl_ptn_nm_META = createCommonMeta($jnl_ptn_nm, mcframe.commonMA.meta.MA_META.JNL_PTN_NM);
	public static final MCMeta dr_grp_nm_META = createCommonMeta($dr_grp_nm, mcframe.commonMA.meta.MA_META.JNL_GRP_NM);
	public static final MCMeta cr_grp_nm_META = createCommonMeta($cr_grp_nm, mcframe.commonMA.meta.MA_META.JNL_GRP_NM);
	public static final MCMeta dr_ac_nm_META = createCommonMeta($dr_ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta dr_sub_ac_nm_META = createCommonMeta($dr_sub_ac_nm, mcframe.commonMA.meta.MA_META.SUB_AC_NM);
	public static final MCMeta cr_ac_nm_META = createCommonMeta($cr_ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta cr_sub_ac_nm_META = createCommonMeta($cr_sub_ac_nm, mcframe.commonMA.meta.MA_META.SUB_AC_NM);
	public static final MCMeta dr_ac_tax_nm_META = createCommonMeta($dr_ac_tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta cr_ac_tax_nm_META = createCommonMeta($cr_ac_tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta dr_bp_nm_META = createCommonMeta($dr_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cr_bp_nm_META = createCommonMeta($cr_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $JNL_PTN_BASE1 = "JNL_PTN_BASE1";
	public static final String $JNL_GRP1 = "JNL_GRP1";
	public static final String $JNL_GRP2 = "JNL_GRP2";
	public static final String $ACCOUNT1 = "ACCOUNT1";
	public static final String $SUB_ACCOUNT1 = "SUB_ACCOUNT1";
	public static final String $ACCOUNT2 = "ACCOUNT2";
	public static final String $SUB_ACCOUNT2 = "SUB_ACCOUNT2";
	public static final String $AC_TAX1 = "AC_TAX1";
	public static final String $AC_TAX2 = "AC_TAX2";
	public static final String $BP1 = "BP1";
	public static final String $BP2 = "BP2";
	public static final String $ITM_JNL1 = "ITM_JNL1";
	public static final String $AC_RSN1 = "AC_RSN1";
	public static final String $CUR1 = "CUR1";
	public static final String $ITM1 = "ITM1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_JNL_PTN_BASE",
				$JNL_PTN_BASE1,
				new String[][]{
						{"jnl_ptn_cd", "jnl_ptn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_JNL_PTN_BASE_R.create("JNL_PTN_BASE1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_JNL_PTN_BASE_R ref = mcframe.serverMA.dbc.MAM_JNL_PTN_BASE_R.create("JNL_PTN_BASE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.jnl_ptn_cd.eq(ref.jnl_ptn_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_JNL_GRP",
				$JNL_GRP1,
				new String[][]{
						{"dr_grp_cd", "jnl_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_JNL_GRP_R.create("JNL_GRP1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_JNL_GRP_R ref = mcframe.serverMA.dbc.MAM_JNL_GRP_R.create("JNL_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dr_grp_cd.eq(ref.jnl_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_JNL_GRP",
				$JNL_GRP2,
				new String[][]{
						{"cr_grp_cd", "jnl_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_JNL_GRP_R.create("JNL_GRP2");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_JNL_GRP_R ref = mcframe.serverMA.dbc.MAM_JNL_GRP_R.create("JNL_GRP2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cr_grp_cd.eq(ref.jnl_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ACCOUNT",
				$ACCOUNT1,
				new String[][]{
						{"dr_ac_cd", "ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ACCOUNT_R.create("ACCOUNT1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_ACCOUNT_R ref = mcframe.serverMA.dbc.MAM_ACCOUNT_R.create("ACCOUNT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dr_ac_cd.eq(ref.ac_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SUB_ACCOUNT",
				$SUB_ACCOUNT1,
				new String[][]{
						{"dr_ac_cd", "ac_cd"},
						{"dr_sub_ac_cd", "sub_ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_SUB_ACCOUNT_R.create("SUB_ACCOUNT1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_SUB_ACCOUNT_R ref = mcframe.serverMA.dbc.MAM_SUB_ACCOUNT_R.create("SUB_ACCOUNT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dr_ac_cd.eq(ref.ac_cd));
					cond = cond.and(own.dr_sub_ac_cd.eq(ref.sub_ac_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ACCOUNT",
				$ACCOUNT2,
				new String[][]{
						{"cr_ac_cd", "ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ACCOUNT_R.create("ACCOUNT2");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_ACCOUNT_R ref = mcframe.serverMA.dbc.MAM_ACCOUNT_R.create("ACCOUNT2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cr_ac_cd.eq(ref.ac_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SUB_ACCOUNT",
				$SUB_ACCOUNT2,
				new String[][]{
						{"cr_ac_cd", "ac_cd"},
						{"cr_sub_ac_cd", "sub_ac_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_SUB_ACCOUNT_R.create("SUB_ACCOUNT2");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_SUB_ACCOUNT_R ref = mcframe.serverMA.dbc.MAM_SUB_ACCOUNT_R.create("SUB_ACCOUNT2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cr_ac_cd.eq(ref.ac_cd));
					cond = cond.and(own.cr_sub_ac_cd.eq(ref.sub_ac_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AC_TAX",
				$AC_TAX1,
				new String[][]{
						{"dr_ac_tax_cd", "ac_tax_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_AC_TAX_R.create("AC_TAX1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_AC_TAX_R ref = mcframe.serverMA.dbc.MAM_AC_TAX_R.create("AC_TAX1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dr_ac_tax_cd.eq(ref.ac_tax_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AC_TAX",
				$AC_TAX2,
				new String[][]{
						{"cr_ac_tax_cd", "ac_tax_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_AC_TAX_R.create("AC_TAX2");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_AC_TAX_R ref = mcframe.serverMA.dbc.MAM_AC_TAX_R.create("AC_TAX2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cr_ac_tax_cd.eq(ref.ac_tax_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP1,
				new String[][]{
						{"dr_bp_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dr_bp_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP2,
				new String[][]{
						{"cr_bp_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP2");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cr_bp_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_JNL",
				$ITM_JNL1,
				new String[][]{
						{"itm_jnl_cd", "itm_jnl_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM_JNL_R.create("ITM_JNL1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM_JNL_R ref = mcframe.serverMA.dbc.MAM_ITM_JNL_R.create("ITM_JNL1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_jnl_cd.eq(ref.itm_jnl_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AC_RSN",
				$AC_RSN1,
				new String[][]{
						{"ac_rsn_cd", "ac_rsn_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_AC_RSN_R.create("AC_RSN1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_AC_RSN_R ref = mcframe.serverMA.dbc.MAM_AC_RSN_R.create("AC_RSN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ac_rsn_cd.eq(ref.ac_rsn_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR1,
				new String[][]{
						{"cur_cd", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cur_cd.eq(ref.cur_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"itm_cd", "itm_cd"},
						{"itm_sub1", "itm_sub1"},
						{"itm_sub2", "itm_sub2"},
						{"itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_JNL_PTN_R own = MAM_JNL_PTN_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_JNL_PTN_R> constMetas = new ConstMetaList<MAM_JNL_PTN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			jnl_ptn_cd_META,
			jnl_seq_META,
			dr_dpt_typ_META,
			cr_dpt_typ_META,
			dr_dpt_cd_META,
			cr_dpt_cd_META,
			dr_ptn_typ_META,
			dr_grp_cd_META,
			cr_ptn_typ_META,
			cr_grp_cd_META,
			dr_ac_cd_META,
			dr_sub_ac_cd_META,
			cr_ac_cd_META,
			cr_sub_ac_cd_META,
			dr_ac_tax_cd_META,
			cr_ac_tax_cd_META,
			dr_bp_typ_META,
			cr_bp_typ_META,
			dr_bp_cd_META,
			cr_bp_cd_META,
			dr_itm_typ_META,
			cr_itm_typ_META,
			dr_amt_typ_META,
			cr_amt_typ_META,
			dr_abs_typ_META,
			dr_abstract_META,
			cr_abs_typ_META,
			cr_abstract_META,
			dr_trd_sml_flg_META,
			cr_trd_sml_flg_META,
			carry_flg_META,
			minus_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_jnl_cd_META,
			ac_rsn_cd_META,
			purc_typ_META,
			un_fix_typ_META,
			foreign_typ_META,
			cur_cd_META,
			asst_typ_META,
			quality_typ_META,
			inv_loc_typ_META,
			amt_sign_typ_META,
			jnl_key1_META,
			jnl_key2_META,
			jnl_key3_META,
			jnl_key4_META,
			jnl_key5_META,
			jnl_key6_META,
			jnl_key7_META,
			jnl_key8_META,
			jnl_key9_META,
			jnl_key10_META,
			mon01_invalid_flg_META,
			mon02_invalid_flg_META,
			mon03_invalid_flg_META,
			mon04_invalid_flg_META,
			mon05_invalid_flg_META,
			mon06_invalid_flg_META,
			mon07_invalid_flg_META,
			mon08_invalid_flg_META,
			mon09_invalid_flg_META,
			mon10_invalid_flg_META,
			mon11_invalid_flg_META,
			mon12_invalid_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
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
			jnl_ptn_nm_META,
			dr_grp_nm_META,
			cr_grp_nm_META,
			dr_ac_nm_META,
			dr_sub_ac_nm_META,
			cr_ac_nm_META,
			cr_sub_ac_nm_META,
			dr_ac_tax_nm_META,
			cr_ac_tax_nm_META,
			dr_bp_nm_META,
			cr_bp_nm_META,
			itm_nm_META,
			itm_jnl_nm_META,
			ac_rsn_nm_META,
			cur_nm_META
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
	protected MAM_JNL_PTN_R(ConstMetaList<? extends MAM_JNL_PTN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_JNL_PTN_R(ConstMetaList<? extends MAM_JNL_PTN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_ptn_cd,
				"jnl_ptn_cd",
				jnl_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_JNL_PTN_R.$jnl_seq,
				"jnl_seq",
				jnl_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_dpt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_dpt_typ,
				"dr_dpt_typ",
				dr_dpt_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_dpt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_dpt_typ,
				"cr_dpt_typ",
				cr_dpt_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_dpt_cd,
				"dr_dpt_cd",
				dr_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_dpt_cd,
				"cr_dpt_cd",
				cr_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_ptn_typ,
				"dr_ptn_typ",
				dr_ptn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_grp_cd,
				"dr_grp_cd",
				dr_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_ptn_typ,
				"cr_ptn_typ",
				cr_ptn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_grp_cd,
				"cr_grp_cd",
				cr_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_ac_cd,
				"dr_ac_cd",
				dr_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_sub_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_sub_ac_cd,
				"dr_sub_ac_cd",
				dr_sub_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_ac_cd,
				"cr_ac_cd",
				cr_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_sub_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_sub_ac_cd,
				"cr_sub_ac_cd",
				cr_sub_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_ac_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_ac_tax_cd,
				"dr_ac_tax_cd",
				dr_ac_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_ac_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_ac_tax_cd,
				"cr_ac_tax_cd",
				cr_ac_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_bp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_bp_typ,
				"dr_bp_typ",
				dr_bp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_bp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_bp_typ,
				"cr_bp_typ",
				cr_bp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_bp_cd,
				"dr_bp_cd",
				dr_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_bp_cd,
				"cr_bp_cd",
				cr_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_itm_typ,
				"dr_itm_typ",
				dr_itm_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_itm_typ,
				"cr_itm_typ",
				cr_itm_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_amt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_amt_typ,
				"dr_amt_typ",
				dr_amt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_amt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_amt_typ,
				"cr_amt_typ",
				cr_amt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_abs_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_abs_typ,
				"dr_abs_typ",
				dr_abs_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_abstract,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_abstract,
				"dr_abstract",
				dr_abstract,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_abs_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_abs_typ,
				"cr_abs_typ",
				cr_abs_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_abstract,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_abstract,
				"cr_abstract",
				cr_abstract,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_trd_sml_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$dr_trd_sml_flg,
				"dr_trd_sml_flg",
				dr_trd_sml_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_trd_sml_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$cr_trd_sml_flg,
				"cr_trd_sml_flg",
				cr_trd_sml_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$carry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$carry_flg,
				"carry_flg",
				carry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$minus_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$minus_flg,
				"minus_flg",
				minus_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$itm_jnl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$itm_jnl_cd,
				"itm_jnl_cd",
				itm_jnl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$ac_rsn_cd,
				"ac_rsn_cd",
				ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$purc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$purc_typ,
				"purc_typ",
				purc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$un_fix_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$un_fix_typ,
				"un_fix_typ",
				un_fix_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$foreign_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$foreign_typ,
				"foreign_typ",
				foreign_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cur_cd,
				"cur_cd",
				cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$asst_typ,
				"asst_typ",
				asst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$quality_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$quality_typ,
				"quality_typ",
				quality_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$inv_loc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$inv_loc_typ,
				"inv_loc_typ",
				inv_loc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$amt_sign_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$amt_sign_typ,
				"amt_sign_typ",
				amt_sign_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key1,
				"jnl_key1",
				jnl_key1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key2,
				"jnl_key2",
				jnl_key2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key3,
				"jnl_key3",
				jnl_key3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key4,
				"jnl_key4",
				jnl_key4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key5,
				"jnl_key5",
				jnl_key5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key6,
				"jnl_key6",
				jnl_key6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key7,
				"jnl_key7",
				jnl_key7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key8,
				"jnl_key8",
				jnl_key8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key9,
				"jnl_key9",
				jnl_key9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$jnl_key10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_key10,
				"jnl_key10",
				jnl_key10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon01_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon01_invalid_flg,
				"mon01_invalid_flg",
				mon01_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon02_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon02_invalid_flg,
				"mon02_invalid_flg",
				mon02_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon03_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon03_invalid_flg,
				"mon03_invalid_flg",
				mon03_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon04_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon04_invalid_flg,
				"mon04_invalid_flg",
				mon04_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon05_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon05_invalid_flg,
				"mon05_invalid_flg",
				mon05_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon06_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon06_invalid_flg,
				"mon06_invalid_flg",
				mon06_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon07_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon07_invalid_flg,
				"mon07_invalid_flg",
				mon07_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon08_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon08_invalid_flg,
				"mon08_invalid_flg",
				mon08_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon09_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon09_invalid_flg,
				"mon09_invalid_flg",
				mon09_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon10_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon10_invalid_flg,
				"mon10_invalid_flg",
				mon10_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon11_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon11_invalid_flg,
				"mon11_invalid_flg",
				mon11_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$mon12_invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$mon12_invalid_flg,
				"mon12_invalid_flg",
				mon12_invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$memo1,
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
			MAM_JNL_PTN_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$memo2,
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
			MAM_JNL_PTN_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$memo3,
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
			MAM_JNL_PTN_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_JNL_PTN_R.$del_flg,
				"del_flg",
				del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$del_usr_id,
				"del_usr_id",
				del_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$del_usr_nm,
				"del_usr_nm",
				del_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_JNL_PTN_R.$del_ts,
				"del_ts",
				del_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$ins_usr_id,
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
			MAM_JNL_PTN_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$ins_usr_nm,
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
			MAM_JNL_PTN_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_JNL_PTN_R.$ins_ts,
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
			MAM_JNL_PTN_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$ins_func_id,
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
			MAM_JNL_PTN_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_JNL_PTN_R.$upd_cntr,
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
			MAM_JNL_PTN_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$upd_usr_id,
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
			MAM_JNL_PTN_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$upd_usr_nm,
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
			MAM_JNL_PTN_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_JNL_PTN_R.$upd_ts,
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
			MAM_JNL_PTN_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$upd_func_id,
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
			MAM_JNL_PTN_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$upd_srv_req_no,
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
			MAM_JNL_PTN_R.$jnl_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$jnl_ptn_nm,
				"jnl_ptn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"JNL_PTN_BASE1.JNL_PTN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_grp_nm,
				"dr_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"JNL_GRP1.JNL_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_grp_nm,
				"cr_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"JNL_GRP2.JNL_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_ac_nm,
				"dr_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ACCOUNT1.AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_sub_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_sub_ac_nm,
				"dr_sub_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"SUB_ACCOUNT1.SUB_AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_ac_nm,
				"cr_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ACCOUNT2.AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_sub_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_sub_ac_nm,
				"cr_sub_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"SUB_ACCOUNT2.SUB_AC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_ac_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_ac_tax_nm,
				"dr_ac_tax_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"AC_TAX1.AC_TAX_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_ac_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_ac_tax_nm,
				"cr_ac_tax_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"AC_TAX2.AC_TAX_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$dr_bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$dr_bp_nm,
				"dr_bp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP1.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cr_bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cr_bp_nm,
				"cr_bp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP2.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$itm_nm,
				"itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$itm_jnl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$itm_jnl_nm,
				"itm_jnl_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM_JNL1.ITM_JNL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$ac_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$ac_rsn_nm,
				"ac_rsn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"AC_RSN1.AC_RSN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_JNL_PTN_R.$cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_JNL_PTN_R.$cur_nm,
				"cur_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CUR1.CUR_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_JNL_PTN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_JNL_PTN_R create(String alias) {
		MAM_JNL_PTN_R row = new MAM_JNL_PTN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_JNL_PTN_R createByName(T proto) {
		MAM_JNL_PTN_R row = MAM_JNL_PTN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_JNL_PTN_R clone() {
		return (MAM_JNL_PTN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_JNL_PTN_R createInstance() {
		return (MAM_JNL_PTN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_JNL_PTN_R getValues(String... names) {
		return (MAM_JNL_PTN_R) super.getValues(names);
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
	 public MAW_JNL_PTN_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_JNL_PTN_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_JNL_PTN_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_JNL_PTN_KEY_R.TABLE_NAME);
	 }

	/**
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 0, $jnl_ptn_cd);
	}

	/**
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 0, $jnl_ptn_cd, value);
	}

	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public MCNumber jnl_seq() {
		return getConstNumber(offset + 1, $jnl_seq);
	}

	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(MCNumber value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(int value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(long value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(float value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(double value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 借方部門区分. Debit dept. type.<p>
	 *
	 */
	public String dr_dpt_typ() {
		return getConstString(offset + 2, $dr_dpt_typ);
	}

	/**
	 * 借方部門区分. Debit dept. type.<p>
	 *
	 */
	public void dr_dpt_typ(String value) {
		setConstString(offset + 2, $dr_dpt_typ, value);
	}

	/**
	 * 貸方部門区分. Credit dept. type.<p>
	 *
	 */
	public String cr_dpt_typ() {
		return getConstString(offset + 3, $cr_dpt_typ);
	}

	/**
	 * 貸方部門区分. Credit dept. type.<p>
	 *
	 */
	public void cr_dpt_typ(String value) {
		setConstString(offset + 3, $cr_dpt_typ, value);
	}

	/**
	 * 借方部門ＣＤ. Debit dept. cd..<p>
	 *
	 */
	public String dr_dpt_cd() {
		return getConstString(offset + 4, $dr_dpt_cd);
	}

	/**
	 * 借方部門ＣＤ. Debit dept. cd..<p>
	 *
	 */
	public void dr_dpt_cd(String value) {
		setConstString(offset + 4, $dr_dpt_cd, value);
	}

	/**
	 * 貸方部門ＣＤ. Credit dept. cd..<p>
	 *
	 */
	public String cr_dpt_cd() {
		return getConstString(offset + 5, $cr_dpt_cd);
	}

	/**
	 * 貸方部門ＣＤ. Credit dept. cd..<p>
	 *
	 */
	public void cr_dpt_cd(String value) {
		setConstString(offset + 5, $cr_dpt_cd, value);
	}

	/**
	 * 借方パタン区分. Debit pattern type.<p>
	 *
	 */
	public String dr_ptn_typ() {
		return getConstString(offset + 6, $dr_ptn_typ);
	}

	/**
	 * 借方パタン区分. Debit pattern type.<p>
	 *
	 */
	public void dr_ptn_typ(String value) {
		setConstString(offset + 6, $dr_ptn_typ, value);
	}

	/**
	 * 借方仕訳グループＣＤ. Debit journal group cd..<p>
	 *
	 */
	public String dr_grp_cd() {
		return getConstString(offset + 7, $dr_grp_cd);
	}

	/**
	 * 借方仕訳グループＣＤ. Debit journal group cd..<p>
	 *
	 */
	public void dr_grp_cd(String value) {
		setConstString(offset + 7, $dr_grp_cd, value);
	}

	/**
	 * 貸方パタン区分. Credit pattern type.<p>
	 *
	 */
	public String cr_ptn_typ() {
		return getConstString(offset + 8, $cr_ptn_typ);
	}

	/**
	 * 貸方パタン区分. Credit pattern type.<p>
	 *
	 */
	public void cr_ptn_typ(String value) {
		setConstString(offset + 8, $cr_ptn_typ, value);
	}

	/**
	 * 貸方仕訳グループＣＤ. Credit journal group cd..<p>
	 *
	 */
	public String cr_grp_cd() {
		return getConstString(offset + 9, $cr_grp_cd);
	}

	/**
	 * 貸方仕訳グループＣＤ. Credit journal group cd..<p>
	 *
	 */
	public void cr_grp_cd(String value) {
		setConstString(offset + 9, $cr_grp_cd, value);
	}

	/**
	 * 借方勘定科目ＣＤ. Debit account cd..<p>
	 *
	 */
	public String dr_ac_cd() {
		return getConstString(offset + 10, $dr_ac_cd);
	}

	/**
	 * 借方勘定科目ＣＤ. Debit account cd..<p>
	 *
	 */
	public void dr_ac_cd(String value) {
		setConstString(offset + 10, $dr_ac_cd, value);
	}

	/**
	 * 借方補助勘定科目ＣＤ. Debit subsidiary account cd..<p>
	 *
	 */
	public String dr_sub_ac_cd() {
		return getConstString(offset + 11, $dr_sub_ac_cd);
	}

	/**
	 * 借方補助勘定科目ＣＤ. Debit subsidiary account cd..<p>
	 *
	 */
	public void dr_sub_ac_cd(String value) {
		setConstString(offset + 11, $dr_sub_ac_cd, value);
	}

	/**
	 * 貸方勘定科目ＣＤ. Credit account cd..<p>
	 *
	 */
	public String cr_ac_cd() {
		return getConstString(offset + 12, $cr_ac_cd);
	}

	/**
	 * 貸方勘定科目ＣＤ. Credit account cd..<p>
	 *
	 */
	public void cr_ac_cd(String value) {
		setConstString(offset + 12, $cr_ac_cd, value);
	}

	/**
	 * 貸方補助勘定科目ＣＤ. Credit subsidiary account cd..<p>
	 *
	 */
	public String cr_sub_ac_cd() {
		return getConstString(offset + 13, $cr_sub_ac_cd);
	}

	/**
	 * 貸方補助勘定科目ＣＤ. Credit subsidiary account cd..<p>
	 *
	 */
	public void cr_sub_ac_cd(String value) {
		setConstString(offset + 13, $cr_sub_ac_cd, value);
	}

	/**
	 * 借方会計税ＣＤ. Debit accounting tax cd..<p>
	 *
	 */
	public String dr_ac_tax_cd() {
		return getConstString(offset + 14, $dr_ac_tax_cd);
	}

	/**
	 * 借方会計税ＣＤ. Debit accounting tax cd..<p>
	 *
	 */
	public void dr_ac_tax_cd(String value) {
		setConstString(offset + 14, $dr_ac_tax_cd, value);
	}

	/**
	 * 貸方会計税ＣＤ. Credit accounting tax cd..<p>
	 *
	 */
	public String cr_ac_tax_cd() {
		return getConstString(offset + 15, $cr_ac_tax_cd);
	}

	/**
	 * 貸方会計税ＣＤ. Credit accounting tax cd..<p>
	 *
	 */
	public void cr_ac_tax_cd(String value) {
		setConstString(offset + 15, $cr_ac_tax_cd, value);
	}

	/**
	 * 借方取引先区分. Debit BP type.<p>
	 *
	 */
	public String dr_bp_typ() {
		return getConstString(offset + 16, $dr_bp_typ);
	}

	/**
	 * 借方取引先区分. Debit BP type.<p>
	 *
	 */
	public void dr_bp_typ(String value) {
		setConstString(offset + 16, $dr_bp_typ, value);
	}

	/**
	 * 貸方取引先区分. Credit BP type.<p>
	 *
	 */
	public String cr_bp_typ() {
		return getConstString(offset + 17, $cr_bp_typ);
	}

	/**
	 * 貸方取引先区分. Credit BP type.<p>
	 *
	 */
	public void cr_bp_typ(String value) {
		setConstString(offset + 17, $cr_bp_typ, value);
	}

	/**
	 * 借方取引先ＣＤ. Debit BP cd..<p>
	 *
	 */
	public String dr_bp_cd() {
		return getConstString(offset + 18, $dr_bp_cd);
	}

	/**
	 * 借方取引先ＣＤ. Debit BP cd..<p>
	 *
	 */
	public void dr_bp_cd(String value) {
		setConstString(offset + 18, $dr_bp_cd, value);
	}

	/**
	 * 貸方取引先ＣＤ. Credit company cd..<p>
	 *
	 */
	public String cr_bp_cd() {
		return getConstString(offset + 19, $cr_bp_cd);
	}

	/**
	 * 貸方取引先ＣＤ. Credit company cd..<p>
	 *
	 */
	public void cr_bp_cd(String value) {
		setConstString(offset + 19, $cr_bp_cd, value);
	}

	/**
	 * 借方品目区分. Debit item type.<p>
	 *
	 */
	public String dr_itm_typ() {
		return getConstString(offset + 20, $dr_itm_typ);
	}

	/**
	 * 借方品目区分. Debit item type.<p>
	 *
	 */
	public void dr_itm_typ(String value) {
		setConstString(offset + 20, $dr_itm_typ, value);
	}

	/**
	 * 貸方品目区分. Credit item type.<p>
	 *
	 */
	public String cr_itm_typ() {
		return getConstString(offset + 21, $cr_itm_typ);
	}

	/**
	 * 貸方品目区分. Credit item type.<p>
	 *
	 */
	public void cr_itm_typ(String value) {
		setConstString(offset + 21, $cr_itm_typ, value);
	}

	/**
	 * 借方金額区分. Debit amount type.<p>
	 *
	 */
	public String dr_amt_typ() {
		return getConstString(offset + 22, $dr_amt_typ);
	}

	/**
	 * 借方金額区分. Debit amount type.<p>
	 *
	 */
	public void dr_amt_typ(String value) {
		setConstString(offset + 22, $dr_amt_typ, value);
	}

	/**
	 * 貸方金額区分. Credit amount type.<p>
	 *
	 */
	public String cr_amt_typ() {
		return getConstString(offset + 23, $cr_amt_typ);
	}

	/**
	 * 貸方金額区分. Credit amount type.<p>
	 *
	 */
	public void cr_amt_typ(String value) {
		setConstString(offset + 23, $cr_amt_typ, value);
	}

	/**
	 * 借方摘要区分. Debit abstract type.<p>
	 *
	 */
	public String dr_abs_typ() {
		return getConstString(offset + 24, $dr_abs_typ);
	}

	/**
	 * 借方摘要区分. Debit abstract type.<p>
	 *
	 */
	public void dr_abs_typ(String value) {
		setConstString(offset + 24, $dr_abs_typ, value);
	}

	/**
	 * 借方摘要. Debit summary.<p>
	 *
	 */
	public String dr_abstract() {
		return getConstString(offset + 25, $dr_abstract);
	}

	/**
	 * 借方摘要. Debit summary.<p>
	 *
	 */
	public void dr_abstract(String value) {
		setConstString(offset + 25, $dr_abstract, value);
	}

	/**
	 * 貸方摘要区分. Credit abstract type.<p>
	 *
	 */
	public String cr_abs_typ() {
		return getConstString(offset + 26, $cr_abs_typ);
	}

	/**
	 * 貸方摘要区分. Credit abstract type.<p>
	 *
	 */
	public void cr_abs_typ(String value) {
		setConstString(offset + 26, $cr_abs_typ, value);
	}

	/**
	 * 貸方摘要. Credit summary.<p>
	 *
	 */
	public String cr_abstract() {
		return getConstString(offset + 27, $cr_abstract);
	}

	/**
	 * 貸方摘要. Credit summary.<p>
	 *
	 */
	public void cr_abstract(String value) {
		setConstString(offset + 27, $cr_abstract, value);
	}

	/**
	 * 借方振替先集計ＦＬＧ. Debit transfer destination aggregation flg..<p>
	 *
	 */
	public boolean dr_trd_sml_flg() {
		return getConstBoolean(offset + 28, $dr_trd_sml_flg);
	}

	/**
	 * 借方振替先集計ＦＬＧ. Debit transfer destination aggregation flg..<p>
	 *
	 */
	public void dr_trd_sml_flg(boolean value) {
		setConstBoolean(offset + 28, $dr_trd_sml_flg, value);
	}

	/**
	 * 貸方振替先集計ＦＬＧ. Credit transfer destination aggregation flg..<p>
	 *
	 */
	public boolean cr_trd_sml_flg() {
		return getConstBoolean(offset + 29, $cr_trd_sml_flg);
	}

	/**
	 * 貸方振替先集計ＦＬＧ. Credit transfer destination aggregation flg..<p>
	 *
	 */
	public void cr_trd_sml_flg(boolean value) {
		setConstBoolean(offset + 29, $cr_trd_sml_flg, value);
	}

	/**
	 * 繰越仕訳ＦＬＧ. Carry-over journal flg..<p>
	 *
	 */
	public boolean carry_flg() {
		return getConstBoolean(offset + 30, $carry_flg);
	}

	/**
	 * 繰越仕訳ＦＬＧ. Carry-over journal flg..<p>
	 *
	 */
	public void carry_flg(boolean value) {
		setConstBoolean(offset + 30, $carry_flg, value);
	}

	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public boolean minus_flg() {
		return getConstBoolean(offset + 31, $minus_flg);
	}

	/**
	 * マイナスＦＬＧ. Minus flg..<p>
	 *
	 */
	public void minus_flg(boolean value) {
		setConstBoolean(offset + 31, $minus_flg, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 32, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 32, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 33, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 33, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 34, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 34, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 35, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 35, $itm_sub3, value);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 36, $itm_jnl_cd);
	}

	/**
	 * 品目仕訳ＣＤ. Item journal cd..<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 36, $itm_jnl_cd, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 37, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 37, $ac_rsn_cd, value);
	}

	/**
	 * 購買区分. Purchase type.<p>
	 *
	 */
	public String purc_typ() {
		return getConstString(offset + 38, $purc_typ);
	}

	/**
	 * 購買区分. Purchase type.<p>
	 *
	 */
	public void purc_typ(String value) {
		setConstString(offset + 38, $purc_typ, value);
	}

	/**
	 * 金額未確定区分. Amount unfirm type.<p>
	 *
	 */
	public String un_fix_typ() {
		return getConstString(offset + 39, $un_fix_typ);
	}

	/**
	 * 金額未確定区分. Amount unfirm type.<p>
	 *
	 */
	public void un_fix_typ(String value) {
		setConstString(offset + 39, $un_fix_typ, value);
	}

	/**
	 * 国外取引区分. Foreign transaction type.<p>
	 *
	 */
	public String foreign_typ() {
		return getConstString(offset + 40, $foreign_typ);
	}

	/**
	 * 国外取引区分. Foreign transaction type.<p>
	 *
	 */
	public void foreign_typ(String value) {
		setConstString(offset + 40, $foreign_typ, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 41, $cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 41, $cur_cd, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 42, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 42, $asst_typ, value);
	}

	/**
	 * 在庫良品区分. Inventory conforming type.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 43, $quality_typ);
	}

	/**
	 * 在庫良品区分. Inventory conforming type.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 43, $quality_typ, value);
	}

	/**
	 * 在庫場所区分. Inventory location type.<p>
	 *
	 */
	public String inv_loc_typ() {
		return getConstString(offset + 44, $inv_loc_typ);
	}

	/**
	 * 在庫場所区分. Inventory location type.<p>
	 *
	 */
	public void inv_loc_typ(String value) {
		setConstString(offset + 44, $inv_loc_typ, value);
	}

	/**
	 * 金額符号区分. Amount sign type.<p>
	 *
	 */
	public String amt_sign_typ() {
		return getConstString(offset + 45, $amt_sign_typ);
	}

	/**
	 * 金額符号区分. Amount sign type.<p>
	 *
	 */
	public void amt_sign_typ(String value) {
		setConstString(offset + 45, $amt_sign_typ, value);
	}

	/**
	 * 仕訳キー項目１. Journal key column 1.<p>
	 *
	 */
	public String jnl_key1() {
		return getConstString(offset + 46, $jnl_key1);
	}

	/**
	 * 仕訳キー項目１. Journal key column 1.<p>
	 *
	 */
	public void jnl_key1(String value) {
		setConstString(offset + 46, $jnl_key1, value);
	}

	/**
	 * 仕訳キー項目２. Journal key column 2.<p>
	 *
	 */
	public String jnl_key2() {
		return getConstString(offset + 47, $jnl_key2);
	}

	/**
	 * 仕訳キー項目２. Journal key column 2.<p>
	 *
	 */
	public void jnl_key2(String value) {
		setConstString(offset + 47, $jnl_key2, value);
	}

	/**
	 * 仕訳キー項目３. Journal key column 3.<p>
	 *
	 */
	public String jnl_key3() {
		return getConstString(offset + 48, $jnl_key3);
	}

	/**
	 * 仕訳キー項目３. Journal key column 3.<p>
	 *
	 */
	public void jnl_key3(String value) {
		setConstString(offset + 48, $jnl_key3, value);
	}

	/**
	 * 仕訳キー項目４. Journal key column 4.<p>
	 *
	 */
	public String jnl_key4() {
		return getConstString(offset + 49, $jnl_key4);
	}

	/**
	 * 仕訳キー項目４. Journal key column 4.<p>
	 *
	 */
	public void jnl_key4(String value) {
		setConstString(offset + 49, $jnl_key4, value);
	}

	/**
	 * 仕訳キー項目５. Journal key column 5.<p>
	 *
	 */
	public String jnl_key5() {
		return getConstString(offset + 50, $jnl_key5);
	}

	/**
	 * 仕訳キー項目５. Journal key column 5.<p>
	 *
	 */
	public void jnl_key5(String value) {
		setConstString(offset + 50, $jnl_key5, value);
	}

	/**
	 * 仕訳キー項目６. Journal key column 6.<p>
	 *
	 */
	public String jnl_key6() {
		return getConstString(offset + 51, $jnl_key6);
	}

	/**
	 * 仕訳キー項目６. Journal key column 6.<p>
	 *
	 */
	public void jnl_key6(String value) {
		setConstString(offset + 51, $jnl_key6, value);
	}

	/**
	 * 仕訳キー項目７. Journal key column 7.<p>
	 *
	 */
	public String jnl_key7() {
		return getConstString(offset + 52, $jnl_key7);
	}

	/**
	 * 仕訳キー項目７. Journal key column 7.<p>
	 *
	 */
	public void jnl_key7(String value) {
		setConstString(offset + 52, $jnl_key7, value);
	}

	/**
	 * 仕訳キー項目８. Journal key column 8.<p>
	 *
	 */
	public String jnl_key8() {
		return getConstString(offset + 53, $jnl_key8);
	}

	/**
	 * 仕訳キー項目８. Journal key column 8.<p>
	 *
	 */
	public void jnl_key8(String value) {
		setConstString(offset + 53, $jnl_key8, value);
	}

	/**
	 * 仕訳キー項目９. Journal key column 9.<p>
	 *
	 */
	public String jnl_key9() {
		return getConstString(offset + 54, $jnl_key9);
	}

	/**
	 * 仕訳キー項目９. Journal key column 9.<p>
	 *
	 */
	public void jnl_key9(String value) {
		setConstString(offset + 54, $jnl_key9, value);
	}

	/**
	 * 仕訳キー項目１０. Journal key column 10.<p>
	 *
	 */
	public String jnl_key10() {
		return getConstString(offset + 55, $jnl_key10);
	}

	/**
	 * 仕訳キー項目１０. Journal key column 10.<p>
	 *
	 */
	public void jnl_key10(String value) {
		setConstString(offset + 55, $jnl_key10, value);
	}

	/**
	 * １月対象外ＦＬＧ. Not for Jan. flg..<p>
	 *
	 */
	public boolean mon01_invalid_flg() {
		return getConstBoolean(offset + 56, $mon01_invalid_flg);
	}

	/**
	 * １月対象外ＦＬＧ. Not for Jan. flg..<p>
	 *
	 */
	public void mon01_invalid_flg(boolean value) {
		setConstBoolean(offset + 56, $mon01_invalid_flg, value);
	}

	/**
	 * ２月対象外ＦＬＧ. Not for Feb. flg..<p>
	 *
	 */
	public boolean mon02_invalid_flg() {
		return getConstBoolean(offset + 57, $mon02_invalid_flg);
	}

	/**
	 * ２月対象外ＦＬＧ. Not for Feb. flg..<p>
	 *
	 */
	public void mon02_invalid_flg(boolean value) {
		setConstBoolean(offset + 57, $mon02_invalid_flg, value);
	}

	/**
	 * ３月対象外ＦＬＧ. Not for Mar. flg..<p>
	 *
	 */
	public boolean mon03_invalid_flg() {
		return getConstBoolean(offset + 58, $mon03_invalid_flg);
	}

	/**
	 * ３月対象外ＦＬＧ. Not for Mar. flg..<p>
	 *
	 */
	public void mon03_invalid_flg(boolean value) {
		setConstBoolean(offset + 58, $mon03_invalid_flg, value);
	}

	/**
	 * ４月対象外ＦＬＧ. Not for Apr. flg..<p>
	 *
	 */
	public boolean mon04_invalid_flg() {
		return getConstBoolean(offset + 59, $mon04_invalid_flg);
	}

	/**
	 * ４月対象外ＦＬＧ. Not for Apr. flg..<p>
	 *
	 */
	public void mon04_invalid_flg(boolean value) {
		setConstBoolean(offset + 59, $mon04_invalid_flg, value);
	}

	/**
	 * ５月対象外ＦＬＧ. Not for May flg..<p>
	 *
	 */
	public boolean mon05_invalid_flg() {
		return getConstBoolean(offset + 60, $mon05_invalid_flg);
	}

	/**
	 * ５月対象外ＦＬＧ. Not for May flg..<p>
	 *
	 */
	public void mon05_invalid_flg(boolean value) {
		setConstBoolean(offset + 60, $mon05_invalid_flg, value);
	}

	/**
	 * ６月対象外ＦＬＧ. Not for Jun. flg..<p>
	 *
	 */
	public boolean mon06_invalid_flg() {
		return getConstBoolean(offset + 61, $mon06_invalid_flg);
	}

	/**
	 * ６月対象外ＦＬＧ. Not for Jun. flg..<p>
	 *
	 */
	public void mon06_invalid_flg(boolean value) {
		setConstBoolean(offset + 61, $mon06_invalid_flg, value);
	}

	/**
	 * ７月対象外ＦＬＧ. Not for July flg..<p>
	 *
	 */
	public boolean mon07_invalid_flg() {
		return getConstBoolean(offset + 62, $mon07_invalid_flg);
	}

	/**
	 * ７月対象外ＦＬＧ. Not for July flg..<p>
	 *
	 */
	public void mon07_invalid_flg(boolean value) {
		setConstBoolean(offset + 62, $mon07_invalid_flg, value);
	}

	/**
	 * ８月対象外ＦＬＧ. Not for Aug. flg..<p>
	 *
	 */
	public boolean mon08_invalid_flg() {
		return getConstBoolean(offset + 63, $mon08_invalid_flg);
	}

	/**
	 * ８月対象外ＦＬＧ. Not for Aug. flg..<p>
	 *
	 */
	public void mon08_invalid_flg(boolean value) {
		setConstBoolean(offset + 63, $mon08_invalid_flg, value);
	}

	/**
	 * ９月対象外ＦＬＧ. Not for Sep. flg..<p>
	 *
	 */
	public boolean mon09_invalid_flg() {
		return getConstBoolean(offset + 64, $mon09_invalid_flg);
	}

	/**
	 * ９月対象外ＦＬＧ. Not for Sep. flg..<p>
	 *
	 */
	public void mon09_invalid_flg(boolean value) {
		setConstBoolean(offset + 64, $mon09_invalid_flg, value);
	}

	/**
	 * １０月対象外ＦＬＧ. Not for Oct. flg..<p>
	 *
	 */
	public boolean mon10_invalid_flg() {
		return getConstBoolean(offset + 65, $mon10_invalid_flg);
	}

	/**
	 * １０月対象外ＦＬＧ. Not for Oct. flg..<p>
	 *
	 */
	public void mon10_invalid_flg(boolean value) {
		setConstBoolean(offset + 65, $mon10_invalid_flg, value);
	}

	/**
	 * １１月対象外ＦＬＧ. Not for Nov. flg..<p>
	 *
	 */
	public boolean mon11_invalid_flg() {
		return getConstBoolean(offset + 66, $mon11_invalid_flg);
	}

	/**
	 * １１月対象外ＦＬＧ. Not for Nov. flg..<p>
	 *
	 */
	public void mon11_invalid_flg(boolean value) {
		setConstBoolean(offset + 66, $mon11_invalid_flg, value);
	}

	/**
	 * １２月対象外ＦＬＧ. Not for Dec. flg..<p>
	 *
	 */
	public boolean mon12_invalid_flg() {
		return getConstBoolean(offset + 67, $mon12_invalid_flg);
	}

	/**
	 * １２月対象外ＦＬＧ. Not for Dec. flg..<p>
	 *
	 */
	public void mon12_invalid_flg(boolean value) {
		setConstBoolean(offset + 67, $mon12_invalid_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 68, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 68, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 69, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 69, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 70, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 70, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 71, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 71, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 72, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 72, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 73, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 73, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 74, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 74, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 75, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 75, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 76, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 76, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 77, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 77, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 78, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 78, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 79, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 80, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 80, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 81, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 81, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 82, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 82, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 83, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 83, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 84, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 84, $upd_srv_req_no, value);
	}

	/**
	 * 仕訳パタン名. Journal pattern name.<p>
	 *
	 */
	public String jnl_ptn_nm() {
		return getConstString(offset + 85, $jnl_ptn_nm);
	}

	/**
	 * 仕訳パタン名. Journal pattern name.<p>
	 *
	 */
	public void jnl_ptn_nm(String value) {
		setConstString(offset + 85, $jnl_ptn_nm, value);
	}

	/**
	 * 借方仕訳グループ名. Debit journal group name.<p>
	 *
	 */
	public String dr_grp_nm() {
		return getConstString(offset + 86, $dr_grp_nm);
	}

	/**
	 * 借方仕訳グループ名. Debit journal group name.<p>
	 *
	 */
	public void dr_grp_nm(String value) {
		setConstString(offset + 86, $dr_grp_nm, value);
	}

	/**
	 * 貸方仕訳グループ名. Credit journal group name.<p>
	 *
	 */
	public String cr_grp_nm() {
		return getConstString(offset + 87, $cr_grp_nm);
	}

	/**
	 * 貸方仕訳グループ名. Credit journal group name.<p>
	 *
	 */
	public void cr_grp_nm(String value) {
		setConstString(offset + 87, $cr_grp_nm, value);
	}

	/**
	 * 借方勘定科目名. Debit account name.<p>
	 *
	 */
	public String dr_ac_nm() {
		return getConstString(offset + 88, $dr_ac_nm);
	}

	/**
	 * 借方勘定科目名. Debit account name.<p>
	 *
	 */
	public void dr_ac_nm(String value) {
		setConstString(offset + 88, $dr_ac_nm, value);
	}

	/**
	 * 借方補助勘定科目名. Debit subsidiary account name.<p>
	 *
	 */
	public String dr_sub_ac_nm() {
		return getConstString(offset + 89, $dr_sub_ac_nm);
	}

	/**
	 * 借方補助勘定科目名. Debit subsidiary account name.<p>
	 *
	 */
	public void dr_sub_ac_nm(String value) {
		setConstString(offset + 89, $dr_sub_ac_nm, value);
	}

	/**
	 * 貸方勘定科目名. Credit account name.<p>
	 *
	 */
	public String cr_ac_nm() {
		return getConstString(offset + 90, $cr_ac_nm);
	}

	/**
	 * 貸方勘定科目名. Credit account name.<p>
	 *
	 */
	public void cr_ac_nm(String value) {
		setConstString(offset + 90, $cr_ac_nm, value);
	}

	/**
	 * 貸方補助勘定科目名. Credit subsidiary account name.<p>
	 *
	 */
	public String cr_sub_ac_nm() {
		return getConstString(offset + 91, $cr_sub_ac_nm);
	}

	/**
	 * 貸方補助勘定科目名. Credit subsidiary account name.<p>
	 *
	 */
	public void cr_sub_ac_nm(String value) {
		setConstString(offset + 91, $cr_sub_ac_nm, value);
	}

	/**
	 * 借方会計税名. Debit Accounting tax name.<p>
	 *
	 */
	public String dr_ac_tax_nm() {
		return getConstString(offset + 92, $dr_ac_tax_nm);
	}

	/**
	 * 借方会計税名. Debit Accounting tax name.<p>
	 *
	 */
	public void dr_ac_tax_nm(String value) {
		setConstString(offset + 92, $dr_ac_tax_nm, value);
	}

	/**
	 * 貸方会計税名. Credit accounting tax name.<p>
	 *
	 */
	public String cr_ac_tax_nm() {
		return getConstString(offset + 93, $cr_ac_tax_nm);
	}

	/**
	 * 貸方会計税名. Credit accounting tax name.<p>
	 *
	 */
	public void cr_ac_tax_nm(String value) {
		setConstString(offset + 93, $cr_ac_tax_nm, value);
	}

	/**
	 * 借方取引先名. Debit BP name.<p>
	 *
	 */
	public String dr_bp_nm() {
		return getConstString(offset + 94, $dr_bp_nm);
	}

	/**
	 * 借方取引先名. Debit BP name.<p>
	 *
	 */
	public void dr_bp_nm(String value) {
		setConstString(offset + 94, $dr_bp_nm, value);
	}

	/**
	 * 貸方取引先名. Credit BP name.<p>
	 *
	 */
	public String cr_bp_nm() {
		return getConstString(offset + 95, $cr_bp_nm);
	}

	/**
	 * 貸方取引先名. Credit BP name.<p>
	 *
	 */
	public void cr_bp_nm(String value) {
		setConstString(offset + 95, $cr_bp_nm, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 96, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 96, $itm_nm, value);
	}

	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 97, $itm_jnl_nm);
	}

	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 97, $itm_jnl_nm, value);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 98, $ac_rsn_nm);
	}

	/**
	 * 会計理由名. Accounting reason name.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 98, $ac_rsn_nm, value);
	}

	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 99, $cur_nm);
	}

	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 99, $cur_nm, value);
	}

	public String getString(String name) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($dr_dpt_typ.equalsIgnoreCase(name)) {
			return dr_dpt_typ();
		}
		if ($cr_dpt_typ.equalsIgnoreCase(name)) {
			return cr_dpt_typ();
		}
		if ($dr_dpt_cd.equalsIgnoreCase(name)) {
			return dr_dpt_cd();
		}
		if ($cr_dpt_cd.equalsIgnoreCase(name)) {
			return cr_dpt_cd();
		}
		if ($dr_ptn_typ.equalsIgnoreCase(name)) {
			return dr_ptn_typ();
		}
		if ($dr_grp_cd.equalsIgnoreCase(name)) {
			return dr_grp_cd();
		}
		if ($cr_ptn_typ.equalsIgnoreCase(name)) {
			return cr_ptn_typ();
		}
		if ($cr_grp_cd.equalsIgnoreCase(name)) {
			return cr_grp_cd();
		}
		if ($dr_ac_cd.equalsIgnoreCase(name)) {
			return dr_ac_cd();
		}
		if ($dr_sub_ac_cd.equalsIgnoreCase(name)) {
			return dr_sub_ac_cd();
		}
		if ($cr_ac_cd.equalsIgnoreCase(name)) {
			return cr_ac_cd();
		}
		if ($cr_sub_ac_cd.equalsIgnoreCase(name)) {
			return cr_sub_ac_cd();
		}
		if ($dr_ac_tax_cd.equalsIgnoreCase(name)) {
			return dr_ac_tax_cd();
		}
		if ($cr_ac_tax_cd.equalsIgnoreCase(name)) {
			return cr_ac_tax_cd();
		}
		if ($dr_bp_typ.equalsIgnoreCase(name)) {
			return dr_bp_typ();
		}
		if ($cr_bp_typ.equalsIgnoreCase(name)) {
			return cr_bp_typ();
		}
		if ($dr_bp_cd.equalsIgnoreCase(name)) {
			return dr_bp_cd();
		}
		if ($cr_bp_cd.equalsIgnoreCase(name)) {
			return cr_bp_cd();
		}
		if ($dr_itm_typ.equalsIgnoreCase(name)) {
			return dr_itm_typ();
		}
		if ($cr_itm_typ.equalsIgnoreCase(name)) {
			return cr_itm_typ();
		}
		if ($dr_amt_typ.equalsIgnoreCase(name)) {
			return dr_amt_typ();
		}
		if ($cr_amt_typ.equalsIgnoreCase(name)) {
			return cr_amt_typ();
		}
		if ($dr_abs_typ.equalsIgnoreCase(name)) {
			return dr_abs_typ();
		}
		if ($dr_abstract.equalsIgnoreCase(name)) {
			return dr_abstract();
		}
		if ($cr_abs_typ.equalsIgnoreCase(name)) {
			return cr_abs_typ();
		}
		if ($cr_abstract.equalsIgnoreCase(name)) {
			return cr_abstract();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($un_fix_typ.equalsIgnoreCase(name)) {
			return un_fix_typ();
		}
		if ($foreign_typ.equalsIgnoreCase(name)) {
			return foreign_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			return inv_loc_typ();
		}
		if ($amt_sign_typ.equalsIgnoreCase(name)) {
			return amt_sign_typ();
		}
		if ($jnl_key1.equalsIgnoreCase(name)) {
			return jnl_key1();
		}
		if ($jnl_key2.equalsIgnoreCase(name)) {
			return jnl_key2();
		}
		if ($jnl_key3.equalsIgnoreCase(name)) {
			return jnl_key3();
		}
		if ($jnl_key4.equalsIgnoreCase(name)) {
			return jnl_key4();
		}
		if ($jnl_key5.equalsIgnoreCase(name)) {
			return jnl_key5();
		}
		if ($jnl_key6.equalsIgnoreCase(name)) {
			return jnl_key6();
		}
		if ($jnl_key7.equalsIgnoreCase(name)) {
			return jnl_key7();
		}
		if ($jnl_key8.equalsIgnoreCase(name)) {
			return jnl_key8();
		}
		if ($jnl_key9.equalsIgnoreCase(name)) {
			return jnl_key9();
		}
		if ($jnl_key10.equalsIgnoreCase(name)) {
			return jnl_key10();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		if ($dr_grp_nm.equalsIgnoreCase(name)) {
			return dr_grp_nm();
		}
		if ($cr_grp_nm.equalsIgnoreCase(name)) {
			return cr_grp_nm();
		}
		if ($dr_ac_nm.equalsIgnoreCase(name)) {
			return dr_ac_nm();
		}
		if ($dr_sub_ac_nm.equalsIgnoreCase(name)) {
			return dr_sub_ac_nm();
		}
		if ($cr_ac_nm.equalsIgnoreCase(name)) {
			return cr_ac_nm();
		}
		if ($cr_sub_ac_nm.equalsIgnoreCase(name)) {
			return cr_sub_ac_nm();
		}
		if ($dr_ac_tax_nm.equalsIgnoreCase(name)) {
			return dr_ac_tax_nm();
		}
		if ($cr_ac_tax_nm.equalsIgnoreCase(name)) {
			return cr_ac_tax_nm();
		}
		if ($dr_bp_nm.equalsIgnoreCase(name)) {
			return dr_bp_nm();
		}
		if ($cr_bp_nm.equalsIgnoreCase(name)) {
			return cr_bp_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			return jnl_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($dr_trd_sml_flg.equalsIgnoreCase(name)) {
			return dr_trd_sml_flg();
		}
		if ($cr_trd_sml_flg.equalsIgnoreCase(name)) {
			return cr_trd_sml_flg();
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			return carry_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		if ($mon01_invalid_flg.equalsIgnoreCase(name)) {
			return mon01_invalid_flg();
		}
		if ($mon02_invalid_flg.equalsIgnoreCase(name)) {
			return mon02_invalid_flg();
		}
		if ($mon03_invalid_flg.equalsIgnoreCase(name)) {
			return mon03_invalid_flg();
		}
		if ($mon04_invalid_flg.equalsIgnoreCase(name)) {
			return mon04_invalid_flg();
		}
		if ($mon05_invalid_flg.equalsIgnoreCase(name)) {
			return mon05_invalid_flg();
		}
		if ($mon06_invalid_flg.equalsIgnoreCase(name)) {
			return mon06_invalid_flg();
		}
		if ($mon07_invalid_flg.equalsIgnoreCase(name)) {
			return mon07_invalid_flg();
		}
		if ($mon08_invalid_flg.equalsIgnoreCase(name)) {
			return mon08_invalid_flg();
		}
		if ($mon09_invalid_flg.equalsIgnoreCase(name)) {
			return mon09_invalid_flg();
		}
		if ($mon10_invalid_flg.equalsIgnoreCase(name)) {
			return mon10_invalid_flg();
		}
		if ($mon11_invalid_flg.equalsIgnoreCase(name)) {
			return mon11_invalid_flg();
		}
		if ($mon12_invalid_flg.equalsIgnoreCase(name)) {
			return mon12_invalid_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($dr_dpt_typ.equalsIgnoreCase(name)) {
			return dr_dpt_typ();
		}
		if ($cr_dpt_typ.equalsIgnoreCase(name)) {
			return cr_dpt_typ();
		}
		if ($dr_dpt_cd.equalsIgnoreCase(name)) {
			return dr_dpt_cd();
		}
		if ($cr_dpt_cd.equalsIgnoreCase(name)) {
			return cr_dpt_cd();
		}
		if ($dr_ptn_typ.equalsIgnoreCase(name)) {
			return dr_ptn_typ();
		}
		if ($dr_grp_cd.equalsIgnoreCase(name)) {
			return dr_grp_cd();
		}
		if ($cr_ptn_typ.equalsIgnoreCase(name)) {
			return cr_ptn_typ();
		}
		if ($cr_grp_cd.equalsIgnoreCase(name)) {
			return cr_grp_cd();
		}
		if ($dr_ac_cd.equalsIgnoreCase(name)) {
			return dr_ac_cd();
		}
		if ($dr_sub_ac_cd.equalsIgnoreCase(name)) {
			return dr_sub_ac_cd();
		}
		if ($cr_ac_cd.equalsIgnoreCase(name)) {
			return cr_ac_cd();
		}
		if ($cr_sub_ac_cd.equalsIgnoreCase(name)) {
			return cr_sub_ac_cd();
		}
		if ($dr_ac_tax_cd.equalsIgnoreCase(name)) {
			return dr_ac_tax_cd();
		}
		if ($cr_ac_tax_cd.equalsIgnoreCase(name)) {
			return cr_ac_tax_cd();
		}
		if ($dr_bp_typ.equalsIgnoreCase(name)) {
			return dr_bp_typ();
		}
		if ($cr_bp_typ.equalsIgnoreCase(name)) {
			return cr_bp_typ();
		}
		if ($dr_bp_cd.equalsIgnoreCase(name)) {
			return dr_bp_cd();
		}
		if ($cr_bp_cd.equalsIgnoreCase(name)) {
			return cr_bp_cd();
		}
		if ($dr_itm_typ.equalsIgnoreCase(name)) {
			return dr_itm_typ();
		}
		if ($cr_itm_typ.equalsIgnoreCase(name)) {
			return cr_itm_typ();
		}
		if ($dr_amt_typ.equalsIgnoreCase(name)) {
			return dr_amt_typ();
		}
		if ($cr_amt_typ.equalsIgnoreCase(name)) {
			return cr_amt_typ();
		}
		if ($dr_abs_typ.equalsIgnoreCase(name)) {
			return dr_abs_typ();
		}
		if ($dr_abstract.equalsIgnoreCase(name)) {
			return dr_abstract();
		}
		if ($cr_abs_typ.equalsIgnoreCase(name)) {
			return cr_abs_typ();
		}
		if ($cr_abstract.equalsIgnoreCase(name)) {
			return cr_abstract();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($un_fix_typ.equalsIgnoreCase(name)) {
			return un_fix_typ();
		}
		if ($foreign_typ.equalsIgnoreCase(name)) {
			return foreign_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			return inv_loc_typ();
		}
		if ($amt_sign_typ.equalsIgnoreCase(name)) {
			return amt_sign_typ();
		}
		if ($jnl_key1.equalsIgnoreCase(name)) {
			return jnl_key1();
		}
		if ($jnl_key2.equalsIgnoreCase(name)) {
			return jnl_key2();
		}
		if ($jnl_key3.equalsIgnoreCase(name)) {
			return jnl_key3();
		}
		if ($jnl_key4.equalsIgnoreCase(name)) {
			return jnl_key4();
		}
		if ($jnl_key5.equalsIgnoreCase(name)) {
			return jnl_key5();
		}
		if ($jnl_key6.equalsIgnoreCase(name)) {
			return jnl_key6();
		}
		if ($jnl_key7.equalsIgnoreCase(name)) {
			return jnl_key7();
		}
		if ($jnl_key8.equalsIgnoreCase(name)) {
			return jnl_key8();
		}
		if ($jnl_key9.equalsIgnoreCase(name)) {
			return jnl_key9();
		}
		if ($jnl_key10.equalsIgnoreCase(name)) {
			return jnl_key10();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		if ($dr_grp_nm.equalsIgnoreCase(name)) {
			return dr_grp_nm();
		}
		if ($cr_grp_nm.equalsIgnoreCase(name)) {
			return cr_grp_nm();
		}
		if ($dr_ac_nm.equalsIgnoreCase(name)) {
			return dr_ac_nm();
		}
		if ($dr_sub_ac_nm.equalsIgnoreCase(name)) {
			return dr_sub_ac_nm();
		}
		if ($cr_ac_nm.equalsIgnoreCase(name)) {
			return cr_ac_nm();
		}
		if ($cr_sub_ac_nm.equalsIgnoreCase(name)) {
			return cr_sub_ac_nm();
		}
		if ($dr_ac_tax_nm.equalsIgnoreCase(name)) {
			return dr_ac_tax_nm();
		}
		if ($cr_ac_tax_nm.equalsIgnoreCase(name)) {
			return cr_ac_tax_nm();
		}
		if ($dr_bp_nm.equalsIgnoreCase(name)) {
			return dr_bp_nm();
		}
		if ($cr_bp_nm.equalsIgnoreCase(name)) {
			return cr_bp_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			return jnl_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($dr_trd_sml_flg.equalsIgnoreCase(name)) {
			return dr_trd_sml_flg();
		}
		if ($cr_trd_sml_flg.equalsIgnoreCase(name)) {
			return cr_trd_sml_flg();
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			return carry_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		if ($mon01_invalid_flg.equalsIgnoreCase(name)) {
			return mon01_invalid_flg();
		}
		if ($mon02_invalid_flg.equalsIgnoreCase(name)) {
			return mon02_invalid_flg();
		}
		if ($mon03_invalid_flg.equalsIgnoreCase(name)) {
			return mon03_invalid_flg();
		}
		if ($mon04_invalid_flg.equalsIgnoreCase(name)) {
			return mon04_invalid_flg();
		}
		if ($mon05_invalid_flg.equalsIgnoreCase(name)) {
			return mon05_invalid_flg();
		}
		if ($mon06_invalid_flg.equalsIgnoreCase(name)) {
			return mon06_invalid_flg();
		}
		if ($mon07_invalid_flg.equalsIgnoreCase(name)) {
			return mon07_invalid_flg();
		}
		if ($mon08_invalid_flg.equalsIgnoreCase(name)) {
			return mon08_invalid_flg();
		}
		if ($mon09_invalid_flg.equalsIgnoreCase(name)) {
			return mon09_invalid_flg();
		}
		if ($mon10_invalid_flg.equalsIgnoreCase(name)) {
			return mon10_invalid_flg();
		}
		if ($mon11_invalid_flg.equalsIgnoreCase(name)) {
			return mon11_invalid_flg();
		}
		if ($mon12_invalid_flg.equalsIgnoreCase(name)) {
			return mon12_invalid_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($dr_dpt_typ.equalsIgnoreCase(name)) {
			dr_dpt_typ(value);
			return;
		}
		if ($cr_dpt_typ.equalsIgnoreCase(name)) {
			cr_dpt_typ(value);
			return;
		}
		if ($dr_dpt_cd.equalsIgnoreCase(name)) {
			dr_dpt_cd(value);
			return;
		}
		if ($cr_dpt_cd.equalsIgnoreCase(name)) {
			cr_dpt_cd(value);
			return;
		}
		if ($dr_ptn_typ.equalsIgnoreCase(name)) {
			dr_ptn_typ(value);
			return;
		}
		if ($dr_grp_cd.equalsIgnoreCase(name)) {
			dr_grp_cd(value);
			return;
		}
		if ($cr_ptn_typ.equalsIgnoreCase(name)) {
			cr_ptn_typ(value);
			return;
		}
		if ($cr_grp_cd.equalsIgnoreCase(name)) {
			cr_grp_cd(value);
			return;
		}
		if ($dr_ac_cd.equalsIgnoreCase(name)) {
			dr_ac_cd(value);
			return;
		}
		if ($dr_sub_ac_cd.equalsIgnoreCase(name)) {
			dr_sub_ac_cd(value);
			return;
		}
		if ($cr_ac_cd.equalsIgnoreCase(name)) {
			cr_ac_cd(value);
			return;
		}
		if ($cr_sub_ac_cd.equalsIgnoreCase(name)) {
			cr_sub_ac_cd(value);
			return;
		}
		if ($dr_ac_tax_cd.equalsIgnoreCase(name)) {
			dr_ac_tax_cd(value);
			return;
		}
		if ($cr_ac_tax_cd.equalsIgnoreCase(name)) {
			cr_ac_tax_cd(value);
			return;
		}
		if ($dr_bp_typ.equalsIgnoreCase(name)) {
			dr_bp_typ(value);
			return;
		}
		if ($cr_bp_typ.equalsIgnoreCase(name)) {
			cr_bp_typ(value);
			return;
		}
		if ($dr_bp_cd.equalsIgnoreCase(name)) {
			dr_bp_cd(value);
			return;
		}
		if ($cr_bp_cd.equalsIgnoreCase(name)) {
			cr_bp_cd(value);
			return;
		}
		if ($dr_itm_typ.equalsIgnoreCase(name)) {
			dr_itm_typ(value);
			return;
		}
		if ($cr_itm_typ.equalsIgnoreCase(name)) {
			cr_itm_typ(value);
			return;
		}
		if ($dr_amt_typ.equalsIgnoreCase(name)) {
			dr_amt_typ(value);
			return;
		}
		if ($cr_amt_typ.equalsIgnoreCase(name)) {
			cr_amt_typ(value);
			return;
		}
		if ($dr_abs_typ.equalsIgnoreCase(name)) {
			dr_abs_typ(value);
			return;
		}
		if ($dr_abstract.equalsIgnoreCase(name)) {
			dr_abstract(value);
			return;
		}
		if ($cr_abs_typ.equalsIgnoreCase(name)) {
			cr_abs_typ(value);
			return;
		}
		if ($cr_abstract.equalsIgnoreCase(name)) {
			cr_abstract(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($un_fix_typ.equalsIgnoreCase(name)) {
			un_fix_typ(value);
			return;
		}
		if ($foreign_typ.equalsIgnoreCase(name)) {
			foreign_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			inv_loc_typ(value);
			return;
		}
		if ($amt_sign_typ.equalsIgnoreCase(name)) {
			amt_sign_typ(value);
			return;
		}
		if ($jnl_key1.equalsIgnoreCase(name)) {
			jnl_key1(value);
			return;
		}
		if ($jnl_key2.equalsIgnoreCase(name)) {
			jnl_key2(value);
			return;
		}
		if ($jnl_key3.equalsIgnoreCase(name)) {
			jnl_key3(value);
			return;
		}
		if ($jnl_key4.equalsIgnoreCase(name)) {
			jnl_key4(value);
			return;
		}
		if ($jnl_key5.equalsIgnoreCase(name)) {
			jnl_key5(value);
			return;
		}
		if ($jnl_key6.equalsIgnoreCase(name)) {
			jnl_key6(value);
			return;
		}
		if ($jnl_key7.equalsIgnoreCase(name)) {
			jnl_key7(value);
			return;
		}
		if ($jnl_key8.equalsIgnoreCase(name)) {
			jnl_key8(value);
			return;
		}
		if ($jnl_key9.equalsIgnoreCase(name)) {
			jnl_key9(value);
			return;
		}
		if ($jnl_key10.equalsIgnoreCase(name)) {
			jnl_key10(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
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
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		if ($dr_grp_nm.equalsIgnoreCase(name)) {
			dr_grp_nm(value);
			return;
		}
		if ($cr_grp_nm.equalsIgnoreCase(name)) {
			cr_grp_nm(value);
			return;
		}
		if ($dr_ac_nm.equalsIgnoreCase(name)) {
			dr_ac_nm(value);
			return;
		}
		if ($dr_sub_ac_nm.equalsIgnoreCase(name)) {
			dr_sub_ac_nm(value);
			return;
		}
		if ($cr_ac_nm.equalsIgnoreCase(name)) {
			cr_ac_nm(value);
			return;
		}
		if ($cr_sub_ac_nm.equalsIgnoreCase(name)) {
			cr_sub_ac_nm(value);
			return;
		}
		if ($dr_ac_tax_nm.equalsIgnoreCase(name)) {
			dr_ac_tax_nm(value);
			return;
		}
		if ($cr_ac_tax_nm.equalsIgnoreCase(name)) {
			cr_ac_tax_nm(value);
			return;
		}
		if ($dr_bp_nm.equalsIgnoreCase(name)) {
			dr_bp_nm(value);
			return;
		}
		if ($cr_bp_nm.equalsIgnoreCase(name)) {
			cr_bp_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
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
		if ($dr_trd_sml_flg.equalsIgnoreCase(name)) {
			dr_trd_sml_flg(value);
			return;
		}
		if ($cr_trd_sml_flg.equalsIgnoreCase(name)) {
			cr_trd_sml_flg(value);
			return;
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			carry_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		if ($mon01_invalid_flg.equalsIgnoreCase(name)) {
			mon01_invalid_flg(value);
			return;
		}
		if ($mon02_invalid_flg.equalsIgnoreCase(name)) {
			mon02_invalid_flg(value);
			return;
		}
		if ($mon03_invalid_flg.equalsIgnoreCase(name)) {
			mon03_invalid_flg(value);
			return;
		}
		if ($mon04_invalid_flg.equalsIgnoreCase(name)) {
			mon04_invalid_flg(value);
			return;
		}
		if ($mon05_invalid_flg.equalsIgnoreCase(name)) {
			mon05_invalid_flg(value);
			return;
		}
		if ($mon06_invalid_flg.equalsIgnoreCase(name)) {
			mon06_invalid_flg(value);
			return;
		}
		if ($mon07_invalid_flg.equalsIgnoreCase(name)) {
			mon07_invalid_flg(value);
			return;
		}
		if ($mon08_invalid_flg.equalsIgnoreCase(name)) {
			mon08_invalid_flg(value);
			return;
		}
		if ($mon09_invalid_flg.equalsIgnoreCase(name)) {
			mon09_invalid_flg(value);
			return;
		}
		if ($mon10_invalid_flg.equalsIgnoreCase(name)) {
			mon10_invalid_flg(value);
			return;
		}
		if ($mon11_invalid_flg.equalsIgnoreCase(name)) {
			mon11_invalid_flg(value);
			return;
		}
		if ($mon12_invalid_flg.equalsIgnoreCase(name)) {
			mon12_invalid_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($dr_dpt_typ.equalsIgnoreCase(name)) {
			dr_dpt_typ(value);
			return;
		}
		if ($cr_dpt_typ.equalsIgnoreCase(name)) {
			cr_dpt_typ(value);
			return;
		}
		if ($dr_dpt_cd.equalsIgnoreCase(name)) {
			dr_dpt_cd(value);
			return;
		}
		if ($cr_dpt_cd.equalsIgnoreCase(name)) {
			cr_dpt_cd(value);
			return;
		}
		if ($dr_ptn_typ.equalsIgnoreCase(name)) {
			dr_ptn_typ(value);
			return;
		}
		if ($dr_grp_cd.equalsIgnoreCase(name)) {
			dr_grp_cd(value);
			return;
		}
		if ($cr_ptn_typ.equalsIgnoreCase(name)) {
			cr_ptn_typ(value);
			return;
		}
		if ($cr_grp_cd.equalsIgnoreCase(name)) {
			cr_grp_cd(value);
			return;
		}
		if ($dr_ac_cd.equalsIgnoreCase(name)) {
			dr_ac_cd(value);
			return;
		}
		if ($dr_sub_ac_cd.equalsIgnoreCase(name)) {
			dr_sub_ac_cd(value);
			return;
		}
		if ($cr_ac_cd.equalsIgnoreCase(name)) {
			cr_ac_cd(value);
			return;
		}
		if ($cr_sub_ac_cd.equalsIgnoreCase(name)) {
			cr_sub_ac_cd(value);
			return;
		}
		if ($dr_ac_tax_cd.equalsIgnoreCase(name)) {
			dr_ac_tax_cd(value);
			return;
		}
		if ($cr_ac_tax_cd.equalsIgnoreCase(name)) {
			cr_ac_tax_cd(value);
			return;
		}
		if ($dr_bp_typ.equalsIgnoreCase(name)) {
			dr_bp_typ(value);
			return;
		}
		if ($cr_bp_typ.equalsIgnoreCase(name)) {
			cr_bp_typ(value);
			return;
		}
		if ($dr_bp_cd.equalsIgnoreCase(name)) {
			dr_bp_cd(value);
			return;
		}
		if ($cr_bp_cd.equalsIgnoreCase(name)) {
			cr_bp_cd(value);
			return;
		}
		if ($dr_itm_typ.equalsIgnoreCase(name)) {
			dr_itm_typ(value);
			return;
		}
		if ($cr_itm_typ.equalsIgnoreCase(name)) {
			cr_itm_typ(value);
			return;
		}
		if ($dr_amt_typ.equalsIgnoreCase(name)) {
			dr_amt_typ(value);
			return;
		}
		if ($cr_amt_typ.equalsIgnoreCase(name)) {
			cr_amt_typ(value);
			return;
		}
		if ($dr_abs_typ.equalsIgnoreCase(name)) {
			dr_abs_typ(value);
			return;
		}
		if ($dr_abstract.equalsIgnoreCase(name)) {
			dr_abstract(value);
			return;
		}
		if ($cr_abs_typ.equalsIgnoreCase(name)) {
			cr_abs_typ(value);
			return;
		}
		if ($cr_abstract.equalsIgnoreCase(name)) {
			cr_abstract(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($un_fix_typ.equalsIgnoreCase(name)) {
			un_fix_typ(value);
			return;
		}
		if ($foreign_typ.equalsIgnoreCase(name)) {
			foreign_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			inv_loc_typ(value);
			return;
		}
		if ($amt_sign_typ.equalsIgnoreCase(name)) {
			amt_sign_typ(value);
			return;
		}
		if ($jnl_key1.equalsIgnoreCase(name)) {
			jnl_key1(value);
			return;
		}
		if ($jnl_key2.equalsIgnoreCase(name)) {
			jnl_key2(value);
			return;
		}
		if ($jnl_key3.equalsIgnoreCase(name)) {
			jnl_key3(value);
			return;
		}
		if ($jnl_key4.equalsIgnoreCase(name)) {
			jnl_key4(value);
			return;
		}
		if ($jnl_key5.equalsIgnoreCase(name)) {
			jnl_key5(value);
			return;
		}
		if ($jnl_key6.equalsIgnoreCase(name)) {
			jnl_key6(value);
			return;
		}
		if ($jnl_key7.equalsIgnoreCase(name)) {
			jnl_key7(value);
			return;
		}
		if ($jnl_key8.equalsIgnoreCase(name)) {
			jnl_key8(value);
			return;
		}
		if ($jnl_key9.equalsIgnoreCase(name)) {
			jnl_key9(value);
			return;
		}
		if ($jnl_key10.equalsIgnoreCase(name)) {
			jnl_key10(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
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
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		if ($dr_grp_nm.equalsIgnoreCase(name)) {
			dr_grp_nm(value);
			return;
		}
		if ($cr_grp_nm.equalsIgnoreCase(name)) {
			cr_grp_nm(value);
			return;
		}
		if ($dr_ac_nm.equalsIgnoreCase(name)) {
			dr_ac_nm(value);
			return;
		}
		if ($dr_sub_ac_nm.equalsIgnoreCase(name)) {
			dr_sub_ac_nm(value);
			return;
		}
		if ($cr_ac_nm.equalsIgnoreCase(name)) {
			cr_ac_nm(value);
			return;
		}
		if ($cr_sub_ac_nm.equalsIgnoreCase(name)) {
			cr_sub_ac_nm(value);
			return;
		}
		if ($dr_ac_tax_nm.equalsIgnoreCase(name)) {
			dr_ac_tax_nm(value);
			return;
		}
		if ($cr_ac_tax_nm.equalsIgnoreCase(name)) {
			cr_ac_tax_nm(value);
			return;
		}
		if ($dr_bp_nm.equalsIgnoreCase(name)) {
			dr_bp_nm(value);
			return;
		}
		if ($cr_bp_nm.equalsIgnoreCase(name)) {
			cr_bp_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
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
		if ($dr_trd_sml_flg.equalsIgnoreCase(name)) {
			dr_trd_sml_flg(value);
			return;
		}
		if ($cr_trd_sml_flg.equalsIgnoreCase(name)) {
			cr_trd_sml_flg(value);
			return;
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			carry_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		if ($mon01_invalid_flg.equalsIgnoreCase(name)) {
			mon01_invalid_flg(value);
			return;
		}
		if ($mon02_invalid_flg.equalsIgnoreCase(name)) {
			mon02_invalid_flg(value);
			return;
		}
		if ($mon03_invalid_flg.equalsIgnoreCase(name)) {
			mon03_invalid_flg(value);
			return;
		}
		if ($mon04_invalid_flg.equalsIgnoreCase(name)) {
			mon04_invalid_flg(value);
			return;
		}
		if ($mon05_invalid_flg.equalsIgnoreCase(name)) {
			mon05_invalid_flg(value);
			return;
		}
		if ($mon06_invalid_flg.equalsIgnoreCase(name)) {
			mon06_invalid_flg(value);
			return;
		}
		if ($mon07_invalid_flg.equalsIgnoreCase(name)) {
			mon07_invalid_flg(value);
			return;
		}
		if ($mon08_invalid_flg.equalsIgnoreCase(name)) {
			mon08_invalid_flg(value);
			return;
		}
		if ($mon09_invalid_flg.equalsIgnoreCase(name)) {
			mon09_invalid_flg(value);
			return;
		}
		if ($mon10_invalid_flg.equalsIgnoreCase(name)) {
			mon10_invalid_flg(value);
			return;
		}
		if ($mon11_invalid_flg.equalsIgnoreCase(name)) {
			mon11_invalid_flg(value);
			return;
		}
		if ($mon12_invalid_flg.equalsIgnoreCase(name)) {
			mon12_invalid_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
