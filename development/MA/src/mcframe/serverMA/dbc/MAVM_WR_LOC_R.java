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
 * "更新可能場所マスタ // Updatable location master"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所名</td>
 *  	<td>Location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所名（ベース）</td>
 *  	<td>Location name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産管理部門ＣＤ</td>
 *  	<td>Asset management dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上部門ＣＤ</td>
 *  	<td>Sales dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループＣＤ</td>
 *  	<td>Distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lg_def_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流標準場所ＦＬＧ</td>
 *  	<td>Distribution standard location flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造場所グループＣＤ</td>
 *  	<td>Mfg. location group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループＣＤ</td>
 *  	<td>Gross allocation location group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_outsrc_act_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外注実績先行ＦＬＧ</td>
 *  	<td>Subcontracting result prior flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ddlv_prov_insp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>直送支給検査ＦＬＧ</td>
 *  	<td>Direct-delivery supply inspection flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>カレンダＣＤ</td>
 *  	<td>Calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>管轄区分</td>
 *  	<td>Controlling site type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prnt_lcl_cd</td>
 *  	<td>C</td>
 *  	<td>7</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票出力ロケールＣＤ</td>
 *  	<td>Report output locale cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国ＣＤ</td>
 *  	<td>Country cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_id</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発番ＩＤ</td>
 *  	<td>Numbering ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stktk_tgt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚卸対象ＦＬＧ</td>
 *  	<td>For inventory count flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stktk_tor_disp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>理論在庫初期表示ＦＬＧ</td>
 *  	<td>Logical inventory initial display flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stktk_tor_ex_zero_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>理論在庫数０除外ＦＬＧ</td>
 *  	<td>Logical inventory qty. 0 exclusion flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stktk_act_ex_zero_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>実棚差異数０除外ＦＬＧ</td>
 *  	<td>Inventory variance qty. 0 excluded flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stktk_amt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚卸金額出力ＦＬＧ</td>
 *  	<td>Inventory count amount output flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>str_ln_tgt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>棚・ライン対象ＦＬＧ</td>
 *  	<td>For rack/line flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_lmt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引当限定ＦＬＧ</td>
 *  	<td>Allocation limited flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_pack_xfer_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫時荷姿振替ＦＬＧ</td>
 *  	<td>SKU transfer at GI flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_vmi_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫時ＶＭＩ計上ＦＬＧ</td>
 *  	<td>VMI recording at GI flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rsrc_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源ＣＤ１</td>
 *  	<td>Resource cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rsrc_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資源ＣＤ２</td>
 *  	<td>Resource cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_sys_loc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システム場所区分</td>
 *  	<td>External system location type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所配賦グループ</td>
 *  	<td>Location allocation group</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>住所設定ＦＬＧ</td>
 *  	<td>Address setting flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>郵便番号</td>
 *  	<td>Zip code</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>郵便番号（ベース）</td>
 *  	<td>Zip code(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所１</td>
 *  	<td>Address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所１（ベース）</td>
 *  	<td>Address 1(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所２</td>
 *  	<td>Address 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所２（ベース）</td>
 *  	<td>Address 2(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所３</td>
 *  	<td>Address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所３（ベース）</td>
 *  	<td>Address 3(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所４</td>
 *  	<td>Address 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所４（ベース）</td>
 *  	<td>Address 4(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ</td>
 *  	<td>TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ（ベース）</td>
 *  	<td>TEL(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＦＡＸ</td>
 *  	<td>FAX</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＦＡＸ（ベース）</td>
 *  	<td>FAX(Base)</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_WR_LOC_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_WR_LOC";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	private static final MCPermColumnInfo _loc_nm = createColumnInfo("loc_nm");
	public final MCStringPermColumn loc_nm = createStringColumn(_loc_nm);
	
	/**
	 * 場所名（ベース）. Location name(Base).<p>
	 *
	 */
	public static final String $base_loc_nm = "base_loc_nm";
	private static final MCPermColumnInfo _base_loc_nm = createColumnInfo("base_loc_nm");
	public final MCStringPermColumn base_loc_nm = createStringColumn(_base_loc_nm);
	
	/**
	 * 資産管理部門ＣＤ. Asset management dept. cd..<p>
	 *
	 */
	public static final String $asst_dpt_cd = "asst_dpt_cd";
	private static final MCPermColumnInfo _asst_dpt_cd = createColumnInfo("asst_dpt_cd");
	public final MCStringPermColumn asst_dpt_cd = createStringColumn(_asst_dpt_cd);
	
	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	private static final MCPermColumnInfo _sls_dpt_cd = createColumnInfo("sls_dpt_cd");
	public final MCStringPermColumn sls_dpt_cd = createStringColumn(_sls_dpt_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	private static final MCPermColumnInfo _site_cd = createColumnInfo("site_cd");
	public final MCStringPermColumn site_cd = createStringColumn(_site_cd);
	
	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	private static final MCPermColumnInfo _lg_grp_cd = createColumnInfo("lg_grp_cd");
	public final MCStringPermColumn lg_grp_cd = createStringColumn(_lg_grp_cd);
	
	/**
	 * 物流標準場所ＦＬＧ. Distribution standard location flg..<p>
	 *
	 */
	public static final String $lg_def_flg = "lg_def_flg";
	private static final MCPermColumnInfo _lg_def_flg = createColumnInfo("lg_def_flg");
	public final MCBooleanPermColumn lg_def_flg = createBooleanColumn(_lg_def_flg);
	
	/**
	 * 製造場所グループＣＤ. Mfg. location group cd..<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	private static final MCPermColumnInfo _loc_grp_cd = createColumnInfo("loc_grp_cd");
	public final MCStringPermColumn loc_grp_cd = createStringColumn(_loc_grp_cd);
	
	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	private static final MCPermColumnInfo _alloc_grp_cd = createColumnInfo("alloc_grp_cd");
	public final MCStringPermColumn alloc_grp_cd = createStringColumn(_alloc_grp_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	private static final MCPermColumnInfo _maker_cd = createColumnInfo("maker_cd");
	public final MCStringPermColumn maker_cd = createStringColumn(_maker_cd);
	
	/**
	 * 外注実績先行ＦＬＧ. Subcontracting result prior flg..<p>
	 *
	 */
	public static final String $pre_outsrc_act_flg = "pre_outsrc_act_flg";
	private static final MCPermColumnInfo _pre_outsrc_act_flg = createColumnInfo("pre_outsrc_act_flg");
	public final MCBooleanPermColumn pre_outsrc_act_flg = createBooleanColumn(_pre_outsrc_act_flg);
	
	/**
	 * 直送支給検査ＦＬＧ. Direct-delivery supply inspection flg..<p>
	 *
	 */
	public static final String $ddlv_prov_insp_flg = "ddlv_prov_insp_flg";
	private static final MCPermColumnInfo _ddlv_prov_insp_flg = createColumnInfo("ddlv_prov_insp_flg");
	public final MCBooleanPermColumn ddlv_prov_insp_flg = createBooleanColumn(_ddlv_prov_insp_flg);
	
	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	private static final MCPermColumnInfo _cal_cd = createColumnInfo("cal_cd");
	public final MCStringPermColumn cal_cd = createStringColumn(_cal_cd);
	
	/**
	 * 管轄区分. Controlling site type.<p>
	 *
	 */
	public static final String $loc_mng_typ = "loc_mng_typ";
	private static final MCPermColumnInfo _loc_mng_typ = createColumnInfo("loc_mng_typ");
	public final MCStringPermColumn loc_mng_typ = createStringColumn(_loc_mng_typ);
	
	/**
	 * 帳票出力ロケールＣＤ. Report output locale cd..<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	private static final MCPermColumnInfo _prnt_lcl_cd = createColumnInfo("prnt_lcl_cd");
	public final MCStringPermColumn prnt_lcl_cd = createStringColumn(_prnt_lcl_cd);
	
	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	private static final MCPermColumnInfo _cntry_cd = createColumnInfo("cntry_cd");
	public final MCStringPermColumn cntry_cd = createStringColumn(_cntry_cd);
	
	/**
	 * 発番ＩＤ. Numbering ID.<p>
	 *
	 */
	public static final String $num_id = "num_id";
	private static final MCPermColumnInfo _num_id = createColumnInfo("num_id");
	public final MCStringPermColumn num_id = createStringColumn(_num_id);
	
	/**
	 * 棚卸対象ＦＬＧ. For inventory count flg..<p>
	 *
	 */
	public static final String $stktk_tgt_flg = "stktk_tgt_flg";
	private static final MCPermColumnInfo _stktk_tgt_flg = createColumnInfo("stktk_tgt_flg");
	public final MCBooleanPermColumn stktk_tgt_flg = createBooleanColumn(_stktk_tgt_flg);
	
	/**
	 * 理論在庫初期表示ＦＬＧ. Logical inventory initial display flg..<p>
	 *
	 */
	public static final String $stktk_tor_disp_flg = "stktk_tor_disp_flg";
	private static final MCPermColumnInfo _stktk_tor_disp_flg = createColumnInfo("stktk_tor_disp_flg");
	public final MCBooleanPermColumn stktk_tor_disp_flg = createBooleanColumn(_stktk_tor_disp_flg);
	
	/**
	 * 理論在庫数０除外ＦＬＧ. Logical inventory qty. 0 exclusion flg..<p>
	 *
	 */
	public static final String $stktk_tor_ex_zero_flg = "stktk_tor_ex_zero_flg";
	private static final MCPermColumnInfo _stktk_tor_ex_zero_flg = createColumnInfo("stktk_tor_ex_zero_flg");
	public final MCBooleanPermColumn stktk_tor_ex_zero_flg = createBooleanColumn(_stktk_tor_ex_zero_flg);
	
	/**
	 * 実棚差異数０除外ＦＬＧ. Inventory variance qty. 0 excluded flg..<p>
	 *
	 */
	public static final String $stktk_act_ex_zero_flg = "stktk_act_ex_zero_flg";
	private static final MCPermColumnInfo _stktk_act_ex_zero_flg = createColumnInfo("stktk_act_ex_zero_flg");
	public final MCBooleanPermColumn stktk_act_ex_zero_flg = createBooleanColumn(_stktk_act_ex_zero_flg);
	
	/**
	 * 棚卸金額出力ＦＬＧ. Inventory count amount output flg..<p>
	 *
	 */
	public static final String $stktk_amt_flg = "stktk_amt_flg";
	private static final MCPermColumnInfo _stktk_amt_flg = createColumnInfo("stktk_amt_flg");
	public final MCBooleanPermColumn stktk_amt_flg = createBooleanColumn(_stktk_amt_flg);
	
	/**
	 * 棚・ライン対象ＦＬＧ. For rack/line flg..<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	private static final MCPermColumnInfo _str_ln_tgt_flg = createColumnInfo("str_ln_tgt_flg");
	public final MCBooleanPermColumn str_ln_tgt_flg = createBooleanColumn(_str_ln_tgt_flg);
	
	/**
	 * 引当限定ＦＬＧ. Allocation limited flg..<p>
	 *
	 */
	public static final String $alloc_lmt_flg = "alloc_lmt_flg";
	private static final MCPermColumnInfo _alloc_lmt_flg = createColumnInfo("alloc_lmt_flg");
	public final MCBooleanPermColumn alloc_lmt_flg = createBooleanColumn(_alloc_lmt_flg);
	
	/**
	 * 出庫時荷姿振替ＦＬＧ. SKU transfer at GI flg..<p>
	 *
	 */
	public static final String $gi_pack_xfer_flg = "gi_pack_xfer_flg";
	private static final MCPermColumnInfo _gi_pack_xfer_flg = createColumnInfo("gi_pack_xfer_flg");
	public final MCBooleanPermColumn gi_pack_xfer_flg = createBooleanColumn(_gi_pack_xfer_flg);
	
	/**
	 * 出庫時ＶＭＩ計上ＦＬＧ. VMI recording at GI flg..<p>
	 *
	 */
	public static final String $gi_vmi_flg = "gi_vmi_flg";
	private static final MCPermColumnInfo _gi_vmi_flg = createColumnInfo("gi_vmi_flg");
	public final MCBooleanPermColumn gi_vmi_flg = createBooleanColumn(_gi_vmi_flg);
	
	/**
	 * 資源ＣＤ１. Resource cd. 1.<p>
	 *
	 */
	public static final String $rsrc_cd1 = "rsrc_cd1";
	private static final MCPermColumnInfo _rsrc_cd1 = createColumnInfo("rsrc_cd1");
	public final MCStringPermColumn rsrc_cd1 = createStringColumn(_rsrc_cd1);
	
	/**
	 * 資源ＣＤ２. Resource cd. 2.<p>
	 *
	 */
	public static final String $rsrc_cd2 = "rsrc_cd2";
	private static final MCPermColumnInfo _rsrc_cd2 = createColumnInfo("rsrc_cd2");
	public final MCStringPermColumn rsrc_cd2 = createStringColumn(_rsrc_cd2);
	
	/**
	 * 外部システム場所区分. External system location type.<p>
	 *
	 */
	public static final String $ext_sys_loc_typ = "ext_sys_loc_typ";
	private static final MCPermColumnInfo _ext_sys_loc_typ = createColumnInfo("ext_sys_loc_typ");
	public final MCStringPermColumn ext_sys_loc_typ = createStringColumn(_ext_sys_loc_typ);
	
	/**
	 * 場所配賦グループ. Location allocation group.<p>
	 *
	 */
	public static final String $loc_alc_grp = "loc_alc_grp";
	private static final MCPermColumnInfo _loc_alc_grp = createColumnInfo("loc_alc_grp");
	public final MCStringPermColumn loc_alc_grp = createStringColumn(_loc_alc_grp);
	
	/**
	 * 住所設定ＦＬＧ. Address setting flg..<p>
	 *
	 */
	public static final String $addr_flg = "addr_flg";
	private static final MCPermColumnInfo _addr_flg = createColumnInfo("addr_flg");
	public final MCBooleanPermColumn addr_flg = createBooleanColumn(_addr_flg);
	
	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	private static final MCPermColumnInfo _zip_cd = createColumnInfo("zip_cd");
	public final MCStringPermColumn zip_cd = createStringColumn(_zip_cd);
	
	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public static final String $base_zip_cd = "base_zip_cd";
	private static final MCPermColumnInfo _base_zip_cd = createColumnInfo("base_zip_cd");
	public final MCStringPermColumn base_zip_cd = createStringColumn(_base_zip_cd);
	
	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	private static final MCPermColumnInfo _addr1 = createColumnInfo("addr1");
	public final MCStringPermColumn addr1 = createStringColumn(_addr1);
	
	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public static final String $base_addr1 = "base_addr1";
	private static final MCPermColumnInfo _base_addr1 = createColumnInfo("base_addr1");
	public final MCStringPermColumn base_addr1 = createStringColumn(_base_addr1);
	
	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	private static final MCPermColumnInfo _addr2 = createColumnInfo("addr2");
	public final MCStringPermColumn addr2 = createStringColumn(_addr2);
	
	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public static final String $base_addr2 = "base_addr2";
	private static final MCPermColumnInfo _base_addr2 = createColumnInfo("base_addr2");
	public final MCStringPermColumn base_addr2 = createStringColumn(_base_addr2);
	
	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	private static final MCPermColumnInfo _addr3 = createColumnInfo("addr3");
	public final MCStringPermColumn addr3 = createStringColumn(_addr3);
	
	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public static final String $base_addr3 = "base_addr3";
	private static final MCPermColumnInfo _base_addr3 = createColumnInfo("base_addr3");
	public final MCStringPermColumn base_addr3 = createStringColumn(_base_addr3);
	
	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	private static final MCPermColumnInfo _addr4 = createColumnInfo("addr4");
	public final MCStringPermColumn addr4 = createStringColumn(_addr4);
	
	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public static final String $base_addr4 = "base_addr4";
	private static final MCPermColumnInfo _base_addr4 = createColumnInfo("base_addr4");
	public final MCStringPermColumn base_addr4 = createStringColumn(_base_addr4);
	
	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public static final String $tel = "tel";
	private static final MCPermColumnInfo _tel = createColumnInfo("tel");
	public final MCStringPermColumn tel = createStringColumn(_tel);
	
	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public static final String $base_tel = "base_tel";
	private static final MCPermColumnInfo _base_tel = createColumnInfo("base_tel");
	public final MCStringPermColumn base_tel = createStringColumn(_base_tel);
	
	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public static final String $fax = "fax";
	private static final MCPermColumnInfo _fax = createColumnInfo("fax");
	public final MCStringPermColumn fax = createStringColumn(_fax);
	
	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public static final String $base_fax = "base_fax";
	private static final MCPermColumnInfo _base_fax = createColumnInfo("base_fax");
	public final MCStringPermColumn base_fax = createStringColumn(_base_fax);
	
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
	
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta base_loc_nm_META = createCommonMeta($base_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta asst_dpt_cd_META = createCommonMeta($asst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_def_flg_META = createCommonMeta($lg_def_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ddlv_prov_insp_flg_META = createCommonMeta($ddlv_prov_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta loc_mng_typ_META = createCommonMeta($loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta num_id_META = createCommonMeta($num_id, mcframe.commonMA.meta.MA_META.NUM_ID);
	public static final MCMeta stktk_tgt_flg_META = createCommonMeta($stktk_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_tor_disp_flg_META = createCommonMeta($stktk_tor_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_tor_ex_zero_flg_META = createCommonMeta($stktk_tor_ex_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_act_ex_zero_flg_META = createCommonMeta($stktk_act_ex_zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_amt_flg_META = createCommonMeta($stktk_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_lmt_flg_META = createCommonMeta($alloc_lmt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_pack_xfer_flg_META = createCommonMeta($gi_pack_xfer_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_vmi_flg_META = createCommonMeta($gi_vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rsrc_cd1_META = createCommonMeta($rsrc_cd1, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_cd2_META = createCommonMeta($rsrc_cd2, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta ext_sys_loc_typ_META = createCommonMeta($ext_sys_loc_typ, mcframe.commonMA.meta.MA_META.EXT_SYS_LOC_TYP);
	public static final MCMeta loc_alc_grp_META = createCommonMeta($loc_alc_grp, mcframe.commonMA.meta.MA_META.LOC_ALC_GRP);
	public static final MCMeta addr_flg_META = createCommonMeta($addr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta base_zip_cd_META = createCommonMeta($base_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta base_addr1_META = createCommonMeta($base_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta base_addr2_META = createCommonMeta($base_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta base_addr3_META = createCommonMeta($base_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta base_addr4_META = createCommonMeta($base_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta base_tel_META = createCommonMeta($base_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta base_fax_META = createCommonMeta($base_fax, mcframe.commonMA.meta.MA_META.TEL);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_WR_LOC_R> constMetas = new ConstMetaList<MAVM_WR_LOC_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			loc_cd_META,
			loc_nm_META,
			base_loc_nm_META,
			asst_dpt_cd_META,
			sls_dpt_cd_META,
			wg_cd_META,
			site_cd_META,
			lg_grp_cd_META,
			lg_def_flg_META,
			loc_grp_cd_META,
			alloc_grp_cd_META,
			sppl_cd_META,
			maker_cd_META,
			pre_outsrc_act_flg_META,
			ddlv_prov_insp_flg_META,
			cal_cd_META,
			loc_mng_typ_META,
			prnt_lcl_cd_META,
			cntry_cd_META,
			num_id_META,
			stktk_tgt_flg_META,
			stktk_tor_disp_flg_META,
			stktk_tor_ex_zero_flg_META,
			stktk_act_ex_zero_flg_META,
			stktk_amt_flg_META,
			str_ln_tgt_flg_META,
			alloc_lmt_flg_META,
			gi_pack_xfer_flg_META,
			gi_vmi_flg_META,
			rsrc_cd1_META,
			rsrc_cd2_META,
			ext_sys_loc_typ_META,
			loc_alc_grp_META,
			addr_flg_META,
			zip_cd_META,
			base_zip_cd_META,
			addr1_META,
			base_addr1_META,
			addr2_META,
			base_addr2_META,
			addr3_META,
			base_addr3_META,
			addr4_META,
			base_addr4_META,
			tel_META,
			base_tel_META,
			fax_META,
			base_fax_META,
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
			upd_srv_req_no_META
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
	protected MAVM_WR_LOC_R(ConstMetaList<? extends MAVM_WR_LOC_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_WR_LOC_R(ConstMetaList<? extends MAVM_WR_LOC_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$loc_cd,
				"loc_cd",
				loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$loc_nm,
				"loc_nm",
				loc_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$base_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$base_loc_nm,
				"base_loc_nm",
				base_loc_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$asst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$asst_dpt_cd,
				"asst_dpt_cd",
				asst_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$sls_dpt_cd,
				"sls_dpt_cd",
				sls_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$site_cd,
				"site_cd",
				site_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$lg_grp_cd,
				"lg_grp_cd",
				lg_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$lg_def_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$lg_def_flg,
				"lg_def_flg",
				lg_def_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$loc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$loc_grp_cd,
				"loc_grp_cd",
				loc_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$alloc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$alloc_grp_cd,
				"alloc_grp_cd",
				alloc_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$maker_cd,
				"maker_cd",
				maker_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$pre_outsrc_act_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$pre_outsrc_act_flg,
				"pre_outsrc_act_flg",
				pre_outsrc_act_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$ddlv_prov_insp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$ddlv_prov_insp_flg,
				"ddlv_prov_insp_flg",
				ddlv_prov_insp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$cal_cd,
				"cal_cd",
				cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$loc_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$loc_mng_typ,
				"loc_mng_typ",
				loc_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$prnt_lcl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$prnt_lcl_cd,
				"prnt_lcl_cd",
				prnt_lcl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$cntry_cd,
				"cntry_cd",
				cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$num_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$num_id,
				"num_id",
				num_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$stktk_tgt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$stktk_tgt_flg,
				"stktk_tgt_flg",
				stktk_tgt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$stktk_tor_disp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$stktk_tor_disp_flg,
				"stktk_tor_disp_flg",
				stktk_tor_disp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$stktk_tor_ex_zero_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$stktk_tor_ex_zero_flg,
				"stktk_tor_ex_zero_flg",
				stktk_tor_ex_zero_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$stktk_act_ex_zero_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$stktk_act_ex_zero_flg,
				"stktk_act_ex_zero_flg",
				stktk_act_ex_zero_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$stktk_amt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$stktk_amt_flg,
				"stktk_amt_flg",
				stktk_amt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$str_ln_tgt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$str_ln_tgt_flg,
				"str_ln_tgt_flg",
				str_ln_tgt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$alloc_lmt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$alloc_lmt_flg,
				"alloc_lmt_flg",
				alloc_lmt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$gi_pack_xfer_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$gi_pack_xfer_flg,
				"gi_pack_xfer_flg",
				gi_pack_xfer_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$gi_vmi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$gi_vmi_flg,
				"gi_vmi_flg",
				gi_vmi_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$rsrc_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$rsrc_cd1,
				"rsrc_cd1",
				rsrc_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$rsrc_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$rsrc_cd2,
				"rsrc_cd2",
				rsrc_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$ext_sys_loc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$ext_sys_loc_typ,
				"ext_sys_loc_typ",
				ext_sys_loc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$loc_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$loc_alc_grp,
				"loc_alc_grp",
				loc_alc_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$addr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$addr_flg,
				"addr_flg",
				addr_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$zip_cd,
				"zip_cd",
				zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$base_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$base_zip_cd,
				"base_zip_cd",
				base_zip_cd,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$addr1,
				"addr1",
				addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$base_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$base_addr1,
				"base_addr1",
				base_addr1,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$addr2,
				"addr2",
				addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$base_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$base_addr2,
				"base_addr2",
				base_addr2,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$addr3,
				"addr3",
				addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$base_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$base_addr3,
				"base_addr3",
				base_addr3,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$addr4,
				"addr4",
				addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$base_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$base_addr4,
				"base_addr4",
				base_addr4,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$tel,
				"tel",
				tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$base_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$base_tel,
				"base_tel",
				base_tel,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$fax,
				"fax",
				fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$base_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$base_fax,
				"base_fax",
				base_fax,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LOC_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$memo1,
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
			MAVM_WR_LOC_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$memo2,
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
			MAVM_WR_LOC_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$memo3,
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
			MAVM_WR_LOC_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LOC_R.$del_flg,
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
			MAVM_WR_LOC_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$del_usr_id,
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
			MAVM_WR_LOC_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$del_usr_nm,
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
			MAVM_WR_LOC_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WR_LOC_R.$del_ts,
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
			MAVM_WR_LOC_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$ins_usr_id,
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
			MAVM_WR_LOC_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$ins_usr_nm,
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
			MAVM_WR_LOC_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WR_LOC_R.$ins_ts,
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
			MAVM_WR_LOC_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$ins_func_id,
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
			MAVM_WR_LOC_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_WR_LOC_R.$upd_cntr,
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
			MAVM_WR_LOC_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$upd_usr_id,
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
			MAVM_WR_LOC_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$upd_usr_nm,
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
			MAVM_WR_LOC_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WR_LOC_R.$upd_ts,
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
			MAVM_WR_LOC_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$upd_func_id,
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
			MAVM_WR_LOC_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LOC_R.$upd_srv_req_no,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_WR_LOC_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_WR_LOC_R create(String alias) {
		MAVM_WR_LOC_R row = new MAVM_WR_LOC_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_WR_LOC_R createByName(T proto) {
		MAVM_WR_LOC_R row = MAVM_WR_LOC_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WR_LOC_R clone() {
		return (MAVM_WR_LOC_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WR_LOC_R createInstance() {
		return (MAVM_WR_LOC_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WR_LOC_R getValues(String... names) {
		return (MAVM_WR_LOC_R) super.getValues(names);
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
		return false;
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
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 0, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 0, $loc_cd, value);
	}

	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 1, $loc_nm);
	}

	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 1, $loc_nm, value);
	}

	/**
	 * 場所名（ベース）. Location name(Base).<p>
	 *
	 */
	public String base_loc_nm() {
		return getConstString(offset + 2, $base_loc_nm);
	}

	/**
	 * 場所名（ベース）. Location name(Base).<p>
	 *
	 */
	public void base_loc_nm(String value) {
		setConstString(offset + 2, $base_loc_nm, value);
	}

	/**
	 * 資産管理部門ＣＤ. Asset management dept. cd..<p>
	 *
	 */
	public String asst_dpt_cd() {
		return getConstString(offset + 3, $asst_dpt_cd);
	}

	/**
	 * 資産管理部門ＣＤ. Asset management dept. cd..<p>
	 *
	 */
	public void asst_dpt_cd(String value) {
		setConstString(offset + 3, $asst_dpt_cd, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 4, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 4, $sls_dpt_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 6, $site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 6, $site_cd, value);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 7, $lg_grp_cd);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 7, $lg_grp_cd, value);
	}

	/**
	 * 物流標準場所ＦＬＧ. Distribution standard location flg..<p>
	 *
	 */
	public boolean lg_def_flg() {
		return getConstBoolean(offset + 8, $lg_def_flg);
	}

	/**
	 * 物流標準場所ＦＬＧ. Distribution standard location flg..<p>
	 *
	 */
	public void lg_def_flg(boolean value) {
		setConstBoolean(offset + 8, $lg_def_flg, value);
	}

	/**
	 * 製造場所グループＣＤ. Mfg. location group cd..<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 9, $loc_grp_cd);
	}

	/**
	 * 製造場所グループＣＤ. Mfg. location group cd..<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 9, $loc_grp_cd, value);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 10, $alloc_grp_cd);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 10, $alloc_grp_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 11, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 11, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 12, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 12, $maker_cd, value);
	}

	/**
	 * 外注実績先行ＦＬＧ. Subcontracting result prior flg..<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 13, $pre_outsrc_act_flg);
	}

	/**
	 * 外注実績先行ＦＬＧ. Subcontracting result prior flg..<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 13, $pre_outsrc_act_flg, value);
	}

	/**
	 * 直送支給検査ＦＬＧ. Direct-delivery supply inspection flg..<p>
	 *
	 */
	public boolean ddlv_prov_insp_flg() {
		return getConstBoolean(offset + 14, $ddlv_prov_insp_flg);
	}

	/**
	 * 直送支給検査ＦＬＧ. Direct-delivery supply inspection flg..<p>
	 *
	 */
	public void ddlv_prov_insp_flg(boolean value) {
		setConstBoolean(offset + 14, $ddlv_prov_insp_flg, value);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 15, $cal_cd);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 15, $cal_cd, value);
	}

	/**
	 * 管轄区分. Controlling site type.<p>
	 *
	 */
	public String loc_mng_typ() {
		return getConstString(offset + 16, $loc_mng_typ);
	}

	/**
	 * 管轄区分. Controlling site type.<p>
	 *
	 */
	public void loc_mng_typ(String value) {
		setConstString(offset + 16, $loc_mng_typ, value);
	}

	/**
	 * 帳票出力ロケールＣＤ. Report output locale cd..<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 17, $prnt_lcl_cd);
	}

	/**
	 * 帳票出力ロケールＣＤ. Report output locale cd..<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 17, $prnt_lcl_cd, value);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 18, $cntry_cd);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 18, $cntry_cd, value);
	}

	/**
	 * 発番ＩＤ. Numbering ID.<p>
	 *
	 */
	public String num_id() {
		return getConstString(offset + 19, $num_id);
	}

	/**
	 * 発番ＩＤ. Numbering ID.<p>
	 *
	 */
	public void num_id(String value) {
		setConstString(offset + 19, $num_id, value);
	}

	/**
	 * 棚卸対象ＦＬＧ. For inventory count flg..<p>
	 *
	 */
	public boolean stktk_tgt_flg() {
		return getConstBoolean(offset + 20, $stktk_tgt_flg);
	}

	/**
	 * 棚卸対象ＦＬＧ. For inventory count flg..<p>
	 *
	 */
	public void stktk_tgt_flg(boolean value) {
		setConstBoolean(offset + 20, $stktk_tgt_flg, value);
	}

	/**
	 * 理論在庫初期表示ＦＬＧ. Logical inventory initial display flg..<p>
	 *
	 */
	public boolean stktk_tor_disp_flg() {
		return getConstBoolean(offset + 21, $stktk_tor_disp_flg);
	}

	/**
	 * 理論在庫初期表示ＦＬＧ. Logical inventory initial display flg..<p>
	 *
	 */
	public void stktk_tor_disp_flg(boolean value) {
		setConstBoolean(offset + 21, $stktk_tor_disp_flg, value);
	}

	/**
	 * 理論在庫数０除外ＦＬＧ. Logical inventory qty. 0 exclusion flg..<p>
	 *
	 */
	public boolean stktk_tor_ex_zero_flg() {
		return getConstBoolean(offset + 22, $stktk_tor_ex_zero_flg);
	}

	/**
	 * 理論在庫数０除外ＦＬＧ. Logical inventory qty. 0 exclusion flg..<p>
	 *
	 */
	public void stktk_tor_ex_zero_flg(boolean value) {
		setConstBoolean(offset + 22, $stktk_tor_ex_zero_flg, value);
	}

	/**
	 * 実棚差異数０除外ＦＬＧ. Inventory variance qty. 0 excluded flg..<p>
	 *
	 */
	public boolean stktk_act_ex_zero_flg() {
		return getConstBoolean(offset + 23, $stktk_act_ex_zero_flg);
	}

	/**
	 * 実棚差異数０除外ＦＬＧ. Inventory variance qty. 0 excluded flg..<p>
	 *
	 */
	public void stktk_act_ex_zero_flg(boolean value) {
		setConstBoolean(offset + 23, $stktk_act_ex_zero_flg, value);
	}

	/**
	 * 棚卸金額出力ＦＬＧ. Inventory count amount output flg..<p>
	 *
	 */
	public boolean stktk_amt_flg() {
		return getConstBoolean(offset + 24, $stktk_amt_flg);
	}

	/**
	 * 棚卸金額出力ＦＬＧ. Inventory count amount output flg..<p>
	 *
	 */
	public void stktk_amt_flg(boolean value) {
		setConstBoolean(offset + 24, $stktk_amt_flg, value);
	}

	/**
	 * 棚・ライン対象ＦＬＧ. For rack/line flg..<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 25, $str_ln_tgt_flg);
	}

	/**
	 * 棚・ライン対象ＦＬＧ. For rack/line flg..<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 25, $str_ln_tgt_flg, value);
	}

	/**
	 * 引当限定ＦＬＧ. Allocation limited flg..<p>
	 *
	 */
	public boolean alloc_lmt_flg() {
		return getConstBoolean(offset + 26, $alloc_lmt_flg);
	}

	/**
	 * 引当限定ＦＬＧ. Allocation limited flg..<p>
	 *
	 */
	public void alloc_lmt_flg(boolean value) {
		setConstBoolean(offset + 26, $alloc_lmt_flg, value);
	}

	/**
	 * 出庫時荷姿振替ＦＬＧ. SKU transfer at GI flg..<p>
	 *
	 */
	public boolean gi_pack_xfer_flg() {
		return getConstBoolean(offset + 27, $gi_pack_xfer_flg);
	}

	/**
	 * 出庫時荷姿振替ＦＬＧ. SKU transfer at GI flg..<p>
	 *
	 */
	public void gi_pack_xfer_flg(boolean value) {
		setConstBoolean(offset + 27, $gi_pack_xfer_flg, value);
	}

	/**
	 * 出庫時ＶＭＩ計上ＦＬＧ. VMI recording at GI flg..<p>
	 *
	 */
	public boolean gi_vmi_flg() {
		return getConstBoolean(offset + 28, $gi_vmi_flg);
	}

	/**
	 * 出庫時ＶＭＩ計上ＦＬＧ. VMI recording at GI flg..<p>
	 *
	 */
	public void gi_vmi_flg(boolean value) {
		setConstBoolean(offset + 28, $gi_vmi_flg, value);
	}

	/**
	 * 資源ＣＤ１. Resource cd. 1.<p>
	 *
	 */
	public String rsrc_cd1() {
		return getConstString(offset + 29, $rsrc_cd1);
	}

	/**
	 * 資源ＣＤ１. Resource cd. 1.<p>
	 *
	 */
	public void rsrc_cd1(String value) {
		setConstString(offset + 29, $rsrc_cd1, value);
	}

	/**
	 * 資源ＣＤ２. Resource cd. 2.<p>
	 *
	 */
	public String rsrc_cd2() {
		return getConstString(offset + 30, $rsrc_cd2);
	}

	/**
	 * 資源ＣＤ２. Resource cd. 2.<p>
	 *
	 */
	public void rsrc_cd2(String value) {
		setConstString(offset + 30, $rsrc_cd2, value);
	}

	/**
	 * 外部システム場所区分. External system location type.<p>
	 *
	 */
	public String ext_sys_loc_typ() {
		return getConstString(offset + 31, $ext_sys_loc_typ);
	}

	/**
	 * 外部システム場所区分. External system location type.<p>
	 *
	 */
	public void ext_sys_loc_typ(String value) {
		setConstString(offset + 31, $ext_sys_loc_typ, value);
	}

	/**
	 * 場所配賦グループ. Location allocation group.<p>
	 *
	 */
	public String loc_alc_grp() {
		return getConstString(offset + 32, $loc_alc_grp);
	}

	/**
	 * 場所配賦グループ. Location allocation group.<p>
	 *
	 */
	public void loc_alc_grp(String value) {
		setConstString(offset + 32, $loc_alc_grp, value);
	}

	/**
	 * 住所設定ＦＬＧ. Address setting flg..<p>
	 *
	 */
	public boolean addr_flg() {
		return getConstBoolean(offset + 33, $addr_flg);
	}

	/**
	 * 住所設定ＦＬＧ. Address setting flg..<p>
	 *
	 */
	public void addr_flg(boolean value) {
		setConstBoolean(offset + 33, $addr_flg, value);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 34, $zip_cd);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 34, $zip_cd, value);
	}

	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public String base_zip_cd() {
		return getConstString(offset + 35, $base_zip_cd);
	}

	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public void base_zip_cd(String value) {
		setConstString(offset + 35, $base_zip_cd, value);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 36, $addr1);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 36, $addr1, value);
	}

	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public String base_addr1() {
		return getConstString(offset + 37, $base_addr1);
	}

	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public void base_addr1(String value) {
		setConstString(offset + 37, $base_addr1, value);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 38, $addr2);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 38, $addr2, value);
	}

	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public String base_addr2() {
		return getConstString(offset + 39, $base_addr2);
	}

	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public void base_addr2(String value) {
		setConstString(offset + 39, $base_addr2, value);
	}

	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 40, $addr3);
	}

	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 40, $addr3, value);
	}

	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public String base_addr3() {
		return getConstString(offset + 41, $base_addr3);
	}

	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public void base_addr3(String value) {
		setConstString(offset + 41, $base_addr3, value);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 42, $addr4);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 42, $addr4, value);
	}

	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public String base_addr4() {
		return getConstString(offset + 43, $base_addr4);
	}

	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public void base_addr4(String value) {
		setConstString(offset + 43, $base_addr4, value);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 44, $tel);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 44, $tel, value);
	}

	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public String base_tel() {
		return getConstString(offset + 45, $base_tel);
	}

	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public void base_tel(String value) {
		setConstString(offset + 45, $base_tel, value);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 46, $fax);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 46, $fax, value);
	}

	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public String base_fax() {
		return getConstString(offset + 47, $base_fax);
	}

	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public void base_fax(String value) {
		setConstString(offset + 47, $base_fax, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 48, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 48, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 49, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 49, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 50, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 50, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 51, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 51, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 52, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 52, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 53, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 53, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 54, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 55, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 55, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 56, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 56, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 57, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 57, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 58, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 58, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 59, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 60, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 60, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 61, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 61, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 62, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 62, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 63, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 63, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 64, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 64, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($base_loc_nm.equalsIgnoreCase(name)) {
			return base_loc_nm();
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			return asst_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($num_id.equalsIgnoreCase(name)) {
			return num_id();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			return ext_sys_loc_typ();
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			return loc_alc_grp();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			return base_zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			return base_addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			return base_addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			return base_addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			return base_addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			return base_tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			return base_fax();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
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
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			return lg_def_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			return ddlv_prov_insp_flg();
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			return stktk_tgt_flg();
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			return stktk_tor_disp_flg();
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_tor_ex_zero_flg();
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_act_ex_zero_flg();
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			return stktk_amt_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			return alloc_lmt_flg();
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			return gi_pack_xfer_flg();
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			return addr_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($base_loc_nm.equalsIgnoreCase(name)) {
			return base_loc_nm();
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			return asst_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($num_id.equalsIgnoreCase(name)) {
			return num_id();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			return ext_sys_loc_typ();
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			return loc_alc_grp();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			return base_zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			return base_addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			return base_addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			return base_addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			return base_addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			return base_tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			return base_fax();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
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
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			return lg_def_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			return ddlv_prov_insp_flg();
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			return stktk_tgt_flg();
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			return stktk_tor_disp_flg();
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_tor_ex_zero_flg();
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			return stktk_act_ex_zero_flg();
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			return stktk_amt_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			return alloc_lmt_flg();
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			return gi_pack_xfer_flg();
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			return gi_vmi_flg();
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			return addr_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($base_loc_nm.equalsIgnoreCase(name)) {
			base_loc_nm(value);
			return;
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			asst_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($num_id.equalsIgnoreCase(name)) {
			num_id(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			ext_sys_loc_typ(value);
			return;
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			loc_alc_grp(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			base_zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			base_addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			base_addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			base_addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			base_addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			base_tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			base_fax(value);
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
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
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
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			lg_def_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			ddlv_prov_insp_flg(value);
			return;
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			stktk_tgt_flg(value);
			return;
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			stktk_tor_disp_flg(value);
			return;
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_tor_ex_zero_flg(value);
			return;
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_act_ex_zero_flg(value);
			return;
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			stktk_amt_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			alloc_lmt_flg(value);
			return;
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			gi_pack_xfer_flg(value);
			return;
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			addr_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($base_loc_nm.equalsIgnoreCase(name)) {
			base_loc_nm(value);
			return;
		}
		if ($asst_dpt_cd.equalsIgnoreCase(name)) {
			asst_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($num_id.equalsIgnoreCase(name)) {
			num_id(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($ext_sys_loc_typ.equalsIgnoreCase(name)) {
			ext_sys_loc_typ(value);
			return;
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			loc_alc_grp(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			base_zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			base_addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			base_addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			base_addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			base_addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			base_tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			base_fax(value);
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
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
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
		if ($lg_def_flg.equalsIgnoreCase(name)) {
			lg_def_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($ddlv_prov_insp_flg.equalsIgnoreCase(name)) {
			ddlv_prov_insp_flg(value);
			return;
		}
		if ($stktk_tgt_flg.equalsIgnoreCase(name)) {
			stktk_tgt_flg(value);
			return;
		}
		if ($stktk_tor_disp_flg.equalsIgnoreCase(name)) {
			stktk_tor_disp_flg(value);
			return;
		}
		if ($stktk_tor_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_tor_ex_zero_flg(value);
			return;
		}
		if ($stktk_act_ex_zero_flg.equalsIgnoreCase(name)) {
			stktk_act_ex_zero_flg(value);
			return;
		}
		if ($stktk_amt_flg.equalsIgnoreCase(name)) {
			stktk_amt_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($alloc_lmt_flg.equalsIgnoreCase(name)) {
			alloc_lmt_flg(value);
			return;
		}
		if ($gi_pack_xfer_flg.equalsIgnoreCase(name)) {
			gi_pack_xfer_flg(value);
			return;
		}
		if ($gi_vmi_flg.equalsIgnoreCase(name)) {
			gi_vmi_flg(value);
			return;
		}
		if ($addr_flg.equalsIgnoreCase(name)) {
			addr_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
