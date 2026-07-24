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
 * "ＭＰＳグループマスタ // MPS group master"DBコンテナRowクラスです。<p>
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
 *  	<td>mps_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＭＰＳグループＣＤ</td>
 *  	<td>MPS group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mps_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＭＰＳグループ名</td>
 *  	<td>MPS group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_mps_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＭＰＳグループ名（ベース）</td>
 *  	<td>MPS group name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqmt_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>日次生産依頼作成月数</td>
 *  	<td>Daily production request created months</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prcd_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>先行手配依頼作成月数</td>
 *  	<td>Long LT request creation months</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>date_div_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>日ばらし月数</td>
 *  	<td>Number of months for disaggregation by day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>week_div_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>週ばらし月数</td>
 *  	<td>Number of months disaggregated by week</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>period_div_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>旬ばらし月数</td>
 *  	<td>Number of months disaggregated by 10 days</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>date_div_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>日ばらし区分</td>
 *  	<td>Disaggregation by day type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon01_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１月生産可能数量／日</td>
 *  	<td>Possible daily production qty. in January</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon02_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>２月生産可能数量／日</td>
 *  	<td>Production possible qty. in February/day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon03_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>３月生産可能数量／日</td>
 *  	<td>Production possible qty. in March/day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon04_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>４月生産可能数量／日</td>
 *  	<td>Production possible qty. in April/day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon05_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>５月生産可能数量／日</td>
 *  	<td>Production possible qty. in May/day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon06_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>６月生産可能数量／日</td>
 *  	<td>Production possible qty. in June/day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon07_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>７月生産可能数量／日</td>
 *  	<td>Production possible qty. in July/day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon08_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>８月生産可能数量／日</td>
 *  	<td>Production possible qty. in August/day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon09_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>９月生産可能数量／日</td>
 *  	<td>Production possible qty. in September/day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon10_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１０月生産可能数量／日</td>
 *  	<td>Production possible qty. in October/day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon11_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１１月生産可能数量／日</td>
 *  	<td>Production possible qty. in November/day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon12_prod_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１２月生産可能数量／日</td>
 *  	<td>Production possible qty. in December/day</td>
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
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr >
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
public class MAM_MPS_GRP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_MPS_GRP";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ＭＰＳグループＣＤ. MPS group cd..<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	private static final MCPermColumnInfo _mps_grp_cd = createColumnInfo("mps_grp_cd");
	public final MCStringPermColumn mps_grp_cd = createStringColumn(_mps_grp_cd);
	
	/**
	 * ＭＰＳグループ名. MPS group name.<p>
	 *
	 */
	public static final String $mps_grp_nm = "mps_grp_nm";
	private static final MCPermColumnInfo _mps_grp_nm = createColumnInfo("mps_grp_nm");
	public final MCStringPermColumn mps_grp_nm = createStringColumn(_mps_grp_nm);
	
	/**
	 * ＭＰＳグループ名（ベース）. MPS group name(Base).<p>
	 *
	 */
	public static final String $base_mps_grp_nm = "base_mps_grp_nm";
	private static final MCPermColumnInfo _base_mps_grp_nm = createColumnInfo("base_mps_grp_nm");
	public final MCStringPermColumn base_mps_grp_nm = createStringColumn(_base_mps_grp_nm);
	
	/**
	 * 日次生産依頼作成月数. Daily production request created months.<p>
	 *
	 */
	public static final String $rqmt_mons = "rqmt_mons";
	private static final MCPermColumnInfo _rqmt_mons = createColumnInfo("rqmt_mons");
	public final MCNumberPermColumn rqmt_mons = createNumberColumn(_rqmt_mons);
	
	/**
	 * 先行手配依頼作成月数. Long LT request creation months.<p>
	 *
	 */
	public static final String $prcd_mons = "prcd_mons";
	private static final MCPermColumnInfo _prcd_mons = createColumnInfo("prcd_mons");
	public final MCNumberPermColumn prcd_mons = createNumberColumn(_prcd_mons);
	
	/**
	 * 日ばらし月数. Number of months for disaggregation by day.<p>
	 *
	 */
	public static final String $date_div_mons = "date_div_mons";
	private static final MCPermColumnInfo _date_div_mons = createColumnInfo("date_div_mons");
	public final MCNumberPermColumn date_div_mons = createNumberColumn(_date_div_mons);
	
	/**
	 * 週ばらし月数. Number of months disaggregated by week.<p>
	 *
	 */
	public static final String $week_div_mons = "week_div_mons";
	private static final MCPermColumnInfo _week_div_mons = createColumnInfo("week_div_mons");
	public final MCNumberPermColumn week_div_mons = createNumberColumn(_week_div_mons);
	
	/**
	 * 旬ばらし月数. Number of months disaggregated by 10 days.<p>
	 *
	 */
	public static final String $period_div_mons = "period_div_mons";
	private static final MCPermColumnInfo _period_div_mons = createColumnInfo("period_div_mons");
	public final MCNumberPermColumn period_div_mons = createNumberColumn(_period_div_mons);
	
	/**
	 * 日ばらし区分. Disaggregation by day type.<p>
	 *
	 */
	public static final String $date_div_typ = "date_div_typ";
	private static final MCPermColumnInfo _date_div_typ = createColumnInfo("date_div_typ");
	public final MCStringPermColumn date_div_typ = createStringColumn(_date_div_typ);
	
	/**
	 * １月生産可能数量／日. Possible daily production qty. in January.<p>
	 *
	 */
	public static final String $mon01_prod_qty = "mon01_prod_qty";
	private static final MCPermColumnInfo _mon01_prod_qty = createColumnInfo("mon01_prod_qty");
	public final MCNumberPermColumn mon01_prod_qty = createNumberColumn(_mon01_prod_qty);
	
	/**
	 * ２月生産可能数量／日. Production possible qty. in February/day.<p>
	 *
	 */
	public static final String $mon02_prod_qty = "mon02_prod_qty";
	private static final MCPermColumnInfo _mon02_prod_qty = createColumnInfo("mon02_prod_qty");
	public final MCNumberPermColumn mon02_prod_qty = createNumberColumn(_mon02_prod_qty);
	
	/**
	 * ３月生産可能数量／日. Production possible qty. in March/day.<p>
	 *
	 */
	public static final String $mon03_prod_qty = "mon03_prod_qty";
	private static final MCPermColumnInfo _mon03_prod_qty = createColumnInfo("mon03_prod_qty");
	public final MCNumberPermColumn mon03_prod_qty = createNumberColumn(_mon03_prod_qty);
	
	/**
	 * ４月生産可能数量／日. Production possible qty. in April/day.<p>
	 *
	 */
	public static final String $mon04_prod_qty = "mon04_prod_qty";
	private static final MCPermColumnInfo _mon04_prod_qty = createColumnInfo("mon04_prod_qty");
	public final MCNumberPermColumn mon04_prod_qty = createNumberColumn(_mon04_prod_qty);
	
	/**
	 * ５月生産可能数量／日. Production possible qty. in May/day.<p>
	 *
	 */
	public static final String $mon05_prod_qty = "mon05_prod_qty";
	private static final MCPermColumnInfo _mon05_prod_qty = createColumnInfo("mon05_prod_qty");
	public final MCNumberPermColumn mon05_prod_qty = createNumberColumn(_mon05_prod_qty);
	
	/**
	 * ６月生産可能数量／日. Production possible qty. in June/day.<p>
	 *
	 */
	public static final String $mon06_prod_qty = "mon06_prod_qty";
	private static final MCPermColumnInfo _mon06_prod_qty = createColumnInfo("mon06_prod_qty");
	public final MCNumberPermColumn mon06_prod_qty = createNumberColumn(_mon06_prod_qty);
	
	/**
	 * ７月生産可能数量／日. Production possible qty. in July/day.<p>
	 *
	 */
	public static final String $mon07_prod_qty = "mon07_prod_qty";
	private static final MCPermColumnInfo _mon07_prod_qty = createColumnInfo("mon07_prod_qty");
	public final MCNumberPermColumn mon07_prod_qty = createNumberColumn(_mon07_prod_qty);
	
	/**
	 * ８月生産可能数量／日. Production possible qty. in August/day.<p>
	 *
	 */
	public static final String $mon08_prod_qty = "mon08_prod_qty";
	private static final MCPermColumnInfo _mon08_prod_qty = createColumnInfo("mon08_prod_qty");
	public final MCNumberPermColumn mon08_prod_qty = createNumberColumn(_mon08_prod_qty);
	
	/**
	 * ９月生産可能数量／日. Production possible qty. in September/day.<p>
	 *
	 */
	public static final String $mon09_prod_qty = "mon09_prod_qty";
	private static final MCPermColumnInfo _mon09_prod_qty = createColumnInfo("mon09_prod_qty");
	public final MCNumberPermColumn mon09_prod_qty = createNumberColumn(_mon09_prod_qty);
	
	/**
	 * １０月生産可能数量／日. Production possible qty. in October/day.<p>
	 *
	 */
	public static final String $mon10_prod_qty = "mon10_prod_qty";
	private static final MCPermColumnInfo _mon10_prod_qty = createColumnInfo("mon10_prod_qty");
	public final MCNumberPermColumn mon10_prod_qty = createNumberColumn(_mon10_prod_qty);
	
	/**
	 * １１月生産可能数量／日. Production possible qty. in November/day.<p>
	 *
	 */
	public static final String $mon11_prod_qty = "mon11_prod_qty";
	private static final MCPermColumnInfo _mon11_prod_qty = createColumnInfo("mon11_prod_qty");
	public final MCNumberPermColumn mon11_prod_qty = createNumberColumn(_mon11_prod_qty);
	
	/**
	 * １２月生産可能数量／日. Production possible qty. in December/day.<p>
	 *
	 */
	public static final String $mon12_prod_qty = "mon12_prod_qty";
	private static final MCPermColumnInfo _mon12_prod_qty = createColumnInfo("mon12_prod_qty");
	public final MCNumberPermColumn mon12_prod_qty = createNumberColumn(_mon12_prod_qty);
	
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
	
	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta mps_grp_nm_META = createCommonMeta($mps_grp_nm, mcframe.commonMA.meta.MA_META.MPS_GRP_NM);
	public static final MCMeta base_mps_grp_nm_META = createCommonMeta($base_mps_grp_nm, mcframe.commonMA.meta.MA_META.MPS_GRP_NM);
	public static final MCMeta rqmt_mons_META = createCommonMeta($rqmt_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta prcd_mons_META = createCommonMeta($prcd_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta date_div_mons_META = createCommonMeta($date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta week_div_mons_META = createCommonMeta($week_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta period_div_mons_META = createCommonMeta($period_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta date_div_typ_META = createCommonMeta($date_div_typ, mcframe.commonMA.meta.MA_META.DATE_DIV_TYP);
	public static final MCMeta mon01_prod_qty_META = createCommonMeta($mon01_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon02_prod_qty_META = createCommonMeta($mon02_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon03_prod_qty_META = createCommonMeta($mon03_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon04_prod_qty_META = createCommonMeta($mon04_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon05_prod_qty_META = createCommonMeta($mon05_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon06_prod_qty_META = createCommonMeta($mon06_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon07_prod_qty_META = createCommonMeta($mon07_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon08_prod_qty_META = createCommonMeta($mon08_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon09_prod_qty_META = createCommonMeta($mon09_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon10_prod_qty_META = createCommonMeta($mon10_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon11_prod_qty_META = createCommonMeta($mon11_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mon12_prod_qty_META = createCommonMeta($mon12_prod_qty, mcframe.commonMA.meta.MA_META.QTY);
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
	
	protected static final ConstMetaList<MAM_MPS_GRP_R> constMetas = new ConstMetaList<MAM_MPS_GRP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			mps_grp_cd_META,
			mps_grp_nm_META,
			base_mps_grp_nm_META,
			rqmt_mons_META,
			prcd_mons_META,
			date_div_mons_META,
			week_div_mons_META,
			period_div_mons_META,
			date_div_typ_META,
			mon01_prod_qty_META,
			mon02_prod_qty_META,
			mon03_prod_qty_META,
			mon04_prod_qty_META,
			mon05_prod_qty_META,
			mon06_prod_qty_META,
			mon07_prod_qty_META,
			mon08_prod_qty_META,
			mon09_prod_qty_META,
			mon10_prod_qty_META,
			mon11_prod_qty_META,
			mon12_prod_qty_META,
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
	protected MAM_MPS_GRP_R(ConstMetaList<? extends MAM_MPS_GRP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_MPS_GRP_R(ConstMetaList<? extends MAM_MPS_GRP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mps_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$mps_grp_cd,
				"mps_grp_cd",
				mps_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mps_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$mps_grp_nm,
				"mps_grp_nm",
				mps_grp_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$base_mps_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$base_mps_grp_nm,
				"base_mps_grp_nm",
				base_mps_grp_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$rqmt_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$rqmt_mons,
				"rqmt_mons",
				rqmt_mons,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$prcd_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$prcd_mons,
				"prcd_mons",
				prcd_mons,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$date_div_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$date_div_mons,
				"date_div_mons",
				date_div_mons,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$week_div_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$week_div_mons,
				"week_div_mons",
				week_div_mons,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$period_div_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$period_div_mons,
				"period_div_mons",
				period_div_mons,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$date_div_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$date_div_typ,
				"date_div_typ",
				date_div_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon01_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon01_prod_qty,
				"mon01_prod_qty",
				mon01_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon02_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon02_prod_qty,
				"mon02_prod_qty",
				mon02_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon03_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon03_prod_qty,
				"mon03_prod_qty",
				mon03_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon04_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon04_prod_qty,
				"mon04_prod_qty",
				mon04_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon05_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon05_prod_qty,
				"mon05_prod_qty",
				mon05_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon06_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon06_prod_qty,
				"mon06_prod_qty",
				mon06_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon07_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon07_prod_qty,
				"mon07_prod_qty",
				mon07_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon08_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon08_prod_qty,
				"mon08_prod_qty",
				mon08_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon09_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon09_prod_qty,
				"mon09_prod_qty",
				mon09_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon10_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon10_prod_qty,
				"mon10_prod_qty",
				mon10_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon11_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon11_prod_qty,
				"mon11_prod_qty",
				mon11_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$mon12_prod_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$mon12_prod_qty,
				"mon12_prod_qty",
				mon12_prod_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_MPS_GRP_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$memo1,
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
			MAM_MPS_GRP_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$memo2,
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
			MAM_MPS_GRP_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$memo3,
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
			MAM_MPS_GRP_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_MPS_GRP_R.$del_flg,
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
			MAM_MPS_GRP_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$del_usr_id,
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
			MAM_MPS_GRP_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$del_usr_nm,
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
			MAM_MPS_GRP_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_MPS_GRP_R.$del_ts,
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
			MAM_MPS_GRP_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$ins_usr_id,
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
			MAM_MPS_GRP_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$ins_usr_nm,
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
			MAM_MPS_GRP_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_MPS_GRP_R.$ins_ts,
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
			MAM_MPS_GRP_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$ins_func_id,
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
			MAM_MPS_GRP_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_MPS_GRP_R.$upd_cntr,
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
			MAM_MPS_GRP_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$upd_usr_id,
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
			MAM_MPS_GRP_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$upd_usr_nm,
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
			MAM_MPS_GRP_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_MPS_GRP_R.$upd_ts,
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
			MAM_MPS_GRP_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$upd_func_id,
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
			MAM_MPS_GRP_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_MPS_GRP_R.$upd_srv_req_no,
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
	public static MAM_MPS_GRP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_MPS_GRP_R create(String alias) {
		MAM_MPS_GRP_R row = new MAM_MPS_GRP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_MPS_GRP_R createByName(T proto) {
		MAM_MPS_GRP_R row = MAM_MPS_GRP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_MPS_GRP_R clone() {
		return (MAM_MPS_GRP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_MPS_GRP_R createInstance() {
		return (MAM_MPS_GRP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_MPS_GRP_R getValues(String... names) {
		return (MAM_MPS_GRP_R) super.getValues(names);
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
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_MPS_GRP_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_MPS_GRP_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_MPS_GRP_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_MPS_GRP_KEY_R.TABLE_NAME);
	 }

	/**
	 * ＭＰＳグループＣＤ. MPS group cd..<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 0, $mps_grp_cd);
	}

	/**
	 * ＭＰＳグループＣＤ. MPS group cd..<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 0, $mps_grp_cd, value);
	}

	/**
	 * ＭＰＳグループ名. MPS group name.<p>
	 *
	 */
	public String mps_grp_nm() {
		return getConstString(offset + 1, $mps_grp_nm);
	}

	/**
	 * ＭＰＳグループ名. MPS group name.<p>
	 *
	 */
	public void mps_grp_nm(String value) {
		setConstString(offset + 1, $mps_grp_nm, value);
	}

	/**
	 * ＭＰＳグループ名（ベース）. MPS group name(Base).<p>
	 *
	 */
	public String base_mps_grp_nm() {
		return getConstString(offset + 2, $base_mps_grp_nm);
	}

	/**
	 * ＭＰＳグループ名（ベース）. MPS group name(Base).<p>
	 *
	 */
	public void base_mps_grp_nm(String value) {
		setConstString(offset + 2, $base_mps_grp_nm, value);
	}

	/**
	 * 日次生産依頼作成月数. Daily production request created months.<p>
	 *
	 */
	public MCNumber rqmt_mons() {
		return getConstNumber(offset + 3, $rqmt_mons);
	}

	/**
	 * 日次生産依頼作成月数. Daily production request created months.<p>
	 *
	 */
	public void rqmt_mons(MCNumber value) {
		setConstNumber(offset + 3, $rqmt_mons, value);
	}
	
	/**
	 * 日次生産依頼作成月数. Daily production request created months.<p>
	 *
	 */
	public void rqmt_mons(int value) {
		setConstNumber(offset + 3, $rqmt_mons, value);
	}
	
	/**
	 * 日次生産依頼作成月数. Daily production request created months.<p>
	 *
	 */
	public void rqmt_mons(long value) {
		setConstNumber(offset + 3, $rqmt_mons, value);
	}
	
	/**
	 * 日次生産依頼作成月数. Daily production request created months.<p>
	 *
	 */
	public void rqmt_mons(float value) {
		setConstNumber(offset + 3, $rqmt_mons, value);
	}
	
	/**
	 * 日次生産依頼作成月数. Daily production request created months.<p>
	 *
	 */
	public void rqmt_mons(double value) {
		setConstNumber(offset + 3, $rqmt_mons, value);
	}
	
	/**
	 * 先行手配依頼作成月数. Long LT request creation months.<p>
	 *
	 */
	public MCNumber prcd_mons() {
		return getConstNumber(offset + 4, $prcd_mons);
	}

	/**
	 * 先行手配依頼作成月数. Long LT request creation months.<p>
	 *
	 */
	public void prcd_mons(MCNumber value) {
		setConstNumber(offset + 4, $prcd_mons, value);
	}
	
	/**
	 * 先行手配依頼作成月数. Long LT request creation months.<p>
	 *
	 */
	public void prcd_mons(int value) {
		setConstNumber(offset + 4, $prcd_mons, value);
	}
	
	/**
	 * 先行手配依頼作成月数. Long LT request creation months.<p>
	 *
	 */
	public void prcd_mons(long value) {
		setConstNumber(offset + 4, $prcd_mons, value);
	}
	
	/**
	 * 先行手配依頼作成月数. Long LT request creation months.<p>
	 *
	 */
	public void prcd_mons(float value) {
		setConstNumber(offset + 4, $prcd_mons, value);
	}
	
	/**
	 * 先行手配依頼作成月数. Long LT request creation months.<p>
	 *
	 */
	public void prcd_mons(double value) {
		setConstNumber(offset + 4, $prcd_mons, value);
	}
	
	/**
	 * 日ばらし月数. Number of months for disaggregation by day.<p>
	 *
	 */
	public MCNumber date_div_mons() {
		return getConstNumber(offset + 5, $date_div_mons);
	}

	/**
	 * 日ばらし月数. Number of months for disaggregation by day.<p>
	 *
	 */
	public void date_div_mons(MCNumber value) {
		setConstNumber(offset + 5, $date_div_mons, value);
	}
	
	/**
	 * 日ばらし月数. Number of months for disaggregation by day.<p>
	 *
	 */
	public void date_div_mons(int value) {
		setConstNumber(offset + 5, $date_div_mons, value);
	}
	
	/**
	 * 日ばらし月数. Number of months for disaggregation by day.<p>
	 *
	 */
	public void date_div_mons(long value) {
		setConstNumber(offset + 5, $date_div_mons, value);
	}
	
	/**
	 * 日ばらし月数. Number of months for disaggregation by day.<p>
	 *
	 */
	public void date_div_mons(float value) {
		setConstNumber(offset + 5, $date_div_mons, value);
	}
	
	/**
	 * 日ばらし月数. Number of months for disaggregation by day.<p>
	 *
	 */
	public void date_div_mons(double value) {
		setConstNumber(offset + 5, $date_div_mons, value);
	}
	
	/**
	 * 週ばらし月数. Number of months disaggregated by week.<p>
	 *
	 */
	public MCNumber week_div_mons() {
		return getConstNumber(offset + 6, $week_div_mons);
	}

	/**
	 * 週ばらし月数. Number of months disaggregated by week.<p>
	 *
	 */
	public void week_div_mons(MCNumber value) {
		setConstNumber(offset + 6, $week_div_mons, value);
	}
	
	/**
	 * 週ばらし月数. Number of months disaggregated by week.<p>
	 *
	 */
	public void week_div_mons(int value) {
		setConstNumber(offset + 6, $week_div_mons, value);
	}
	
	/**
	 * 週ばらし月数. Number of months disaggregated by week.<p>
	 *
	 */
	public void week_div_mons(long value) {
		setConstNumber(offset + 6, $week_div_mons, value);
	}
	
	/**
	 * 週ばらし月数. Number of months disaggregated by week.<p>
	 *
	 */
	public void week_div_mons(float value) {
		setConstNumber(offset + 6, $week_div_mons, value);
	}
	
	/**
	 * 週ばらし月数. Number of months disaggregated by week.<p>
	 *
	 */
	public void week_div_mons(double value) {
		setConstNumber(offset + 6, $week_div_mons, value);
	}
	
	/**
	 * 旬ばらし月数. Number of months disaggregated by 10 days.<p>
	 *
	 */
	public MCNumber period_div_mons() {
		return getConstNumber(offset + 7, $period_div_mons);
	}

	/**
	 * 旬ばらし月数. Number of months disaggregated by 10 days.<p>
	 *
	 */
	public void period_div_mons(MCNumber value) {
		setConstNumber(offset + 7, $period_div_mons, value);
	}
	
	/**
	 * 旬ばらし月数. Number of months disaggregated by 10 days.<p>
	 *
	 */
	public void period_div_mons(int value) {
		setConstNumber(offset + 7, $period_div_mons, value);
	}
	
	/**
	 * 旬ばらし月数. Number of months disaggregated by 10 days.<p>
	 *
	 */
	public void period_div_mons(long value) {
		setConstNumber(offset + 7, $period_div_mons, value);
	}
	
	/**
	 * 旬ばらし月数. Number of months disaggregated by 10 days.<p>
	 *
	 */
	public void period_div_mons(float value) {
		setConstNumber(offset + 7, $period_div_mons, value);
	}
	
	/**
	 * 旬ばらし月数. Number of months disaggregated by 10 days.<p>
	 *
	 */
	public void period_div_mons(double value) {
		setConstNumber(offset + 7, $period_div_mons, value);
	}
	
	/**
	 * 日ばらし区分. Disaggregation by day type.<p>
	 *
	 */
	public String date_div_typ() {
		return getConstString(offset + 8, $date_div_typ);
	}

	/**
	 * 日ばらし区分. Disaggregation by day type.<p>
	 *
	 */
	public void date_div_typ(String value) {
		setConstString(offset + 8, $date_div_typ, value);
	}

	/**
	 * １月生産可能数量／日. Possible daily production qty. in January.<p>
	 *
	 */
	public MCNumber mon01_prod_qty() {
		return getConstNumber(offset + 9, $mon01_prod_qty);
	}

	/**
	 * １月生産可能数量／日. Possible daily production qty. in January.<p>
	 *
	 */
	public void mon01_prod_qty(MCNumber value) {
		setConstNumber(offset + 9, $mon01_prod_qty, value);
	}
	
	/**
	 * １月生産可能数量／日. Possible daily production qty. in January.<p>
	 *
	 */
	public void mon01_prod_qty(int value) {
		setConstNumber(offset + 9, $mon01_prod_qty, value);
	}
	
	/**
	 * １月生産可能数量／日. Possible daily production qty. in January.<p>
	 *
	 */
	public void mon01_prod_qty(long value) {
		setConstNumber(offset + 9, $mon01_prod_qty, value);
	}
	
	/**
	 * １月生産可能数量／日. Possible daily production qty. in January.<p>
	 *
	 */
	public void mon01_prod_qty(float value) {
		setConstNumber(offset + 9, $mon01_prod_qty, value);
	}
	
	/**
	 * １月生産可能数量／日. Possible daily production qty. in January.<p>
	 *
	 */
	public void mon01_prod_qty(double value) {
		setConstNumber(offset + 9, $mon01_prod_qty, value);
	}
	
	/**
	 * ２月生産可能数量／日. Production possible qty. in February/day.<p>
	 *
	 */
	public MCNumber mon02_prod_qty() {
		return getConstNumber(offset + 10, $mon02_prod_qty);
	}

	/**
	 * ２月生産可能数量／日. Production possible qty. in February/day.<p>
	 *
	 */
	public void mon02_prod_qty(MCNumber value) {
		setConstNumber(offset + 10, $mon02_prod_qty, value);
	}
	
	/**
	 * ２月生産可能数量／日. Production possible qty. in February/day.<p>
	 *
	 */
	public void mon02_prod_qty(int value) {
		setConstNumber(offset + 10, $mon02_prod_qty, value);
	}
	
	/**
	 * ２月生産可能数量／日. Production possible qty. in February/day.<p>
	 *
	 */
	public void mon02_prod_qty(long value) {
		setConstNumber(offset + 10, $mon02_prod_qty, value);
	}
	
	/**
	 * ２月生産可能数量／日. Production possible qty. in February/day.<p>
	 *
	 */
	public void mon02_prod_qty(float value) {
		setConstNumber(offset + 10, $mon02_prod_qty, value);
	}
	
	/**
	 * ２月生産可能数量／日. Production possible qty. in February/day.<p>
	 *
	 */
	public void mon02_prod_qty(double value) {
		setConstNumber(offset + 10, $mon02_prod_qty, value);
	}
	
	/**
	 * ３月生産可能数量／日. Production possible qty. in March/day.<p>
	 *
	 */
	public MCNumber mon03_prod_qty() {
		return getConstNumber(offset + 11, $mon03_prod_qty);
	}

	/**
	 * ３月生産可能数量／日. Production possible qty. in March/day.<p>
	 *
	 */
	public void mon03_prod_qty(MCNumber value) {
		setConstNumber(offset + 11, $mon03_prod_qty, value);
	}
	
	/**
	 * ３月生産可能数量／日. Production possible qty. in March/day.<p>
	 *
	 */
	public void mon03_prod_qty(int value) {
		setConstNumber(offset + 11, $mon03_prod_qty, value);
	}
	
	/**
	 * ３月生産可能数量／日. Production possible qty. in March/day.<p>
	 *
	 */
	public void mon03_prod_qty(long value) {
		setConstNumber(offset + 11, $mon03_prod_qty, value);
	}
	
	/**
	 * ３月生産可能数量／日. Production possible qty. in March/day.<p>
	 *
	 */
	public void mon03_prod_qty(float value) {
		setConstNumber(offset + 11, $mon03_prod_qty, value);
	}
	
	/**
	 * ３月生産可能数量／日. Production possible qty. in March/day.<p>
	 *
	 */
	public void mon03_prod_qty(double value) {
		setConstNumber(offset + 11, $mon03_prod_qty, value);
	}
	
	/**
	 * ４月生産可能数量／日. Production possible qty. in April/day.<p>
	 *
	 */
	public MCNumber mon04_prod_qty() {
		return getConstNumber(offset + 12, $mon04_prod_qty);
	}

	/**
	 * ４月生産可能数量／日. Production possible qty. in April/day.<p>
	 *
	 */
	public void mon04_prod_qty(MCNumber value) {
		setConstNumber(offset + 12, $mon04_prod_qty, value);
	}
	
	/**
	 * ４月生産可能数量／日. Production possible qty. in April/day.<p>
	 *
	 */
	public void mon04_prod_qty(int value) {
		setConstNumber(offset + 12, $mon04_prod_qty, value);
	}
	
	/**
	 * ４月生産可能数量／日. Production possible qty. in April/day.<p>
	 *
	 */
	public void mon04_prod_qty(long value) {
		setConstNumber(offset + 12, $mon04_prod_qty, value);
	}
	
	/**
	 * ４月生産可能数量／日. Production possible qty. in April/day.<p>
	 *
	 */
	public void mon04_prod_qty(float value) {
		setConstNumber(offset + 12, $mon04_prod_qty, value);
	}
	
	/**
	 * ４月生産可能数量／日. Production possible qty. in April/day.<p>
	 *
	 */
	public void mon04_prod_qty(double value) {
		setConstNumber(offset + 12, $mon04_prod_qty, value);
	}
	
	/**
	 * ５月生産可能数量／日. Production possible qty. in May/day.<p>
	 *
	 */
	public MCNumber mon05_prod_qty() {
		return getConstNumber(offset + 13, $mon05_prod_qty);
	}

	/**
	 * ５月生産可能数量／日. Production possible qty. in May/day.<p>
	 *
	 */
	public void mon05_prod_qty(MCNumber value) {
		setConstNumber(offset + 13, $mon05_prod_qty, value);
	}
	
	/**
	 * ５月生産可能数量／日. Production possible qty. in May/day.<p>
	 *
	 */
	public void mon05_prod_qty(int value) {
		setConstNumber(offset + 13, $mon05_prod_qty, value);
	}
	
	/**
	 * ５月生産可能数量／日. Production possible qty. in May/day.<p>
	 *
	 */
	public void mon05_prod_qty(long value) {
		setConstNumber(offset + 13, $mon05_prod_qty, value);
	}
	
	/**
	 * ５月生産可能数量／日. Production possible qty. in May/day.<p>
	 *
	 */
	public void mon05_prod_qty(float value) {
		setConstNumber(offset + 13, $mon05_prod_qty, value);
	}
	
	/**
	 * ５月生産可能数量／日. Production possible qty. in May/day.<p>
	 *
	 */
	public void mon05_prod_qty(double value) {
		setConstNumber(offset + 13, $mon05_prod_qty, value);
	}
	
	/**
	 * ６月生産可能数量／日. Production possible qty. in June/day.<p>
	 *
	 */
	public MCNumber mon06_prod_qty() {
		return getConstNumber(offset + 14, $mon06_prod_qty);
	}

	/**
	 * ６月生産可能数量／日. Production possible qty. in June/day.<p>
	 *
	 */
	public void mon06_prod_qty(MCNumber value) {
		setConstNumber(offset + 14, $mon06_prod_qty, value);
	}
	
	/**
	 * ６月生産可能数量／日. Production possible qty. in June/day.<p>
	 *
	 */
	public void mon06_prod_qty(int value) {
		setConstNumber(offset + 14, $mon06_prod_qty, value);
	}
	
	/**
	 * ６月生産可能数量／日. Production possible qty. in June/day.<p>
	 *
	 */
	public void mon06_prod_qty(long value) {
		setConstNumber(offset + 14, $mon06_prod_qty, value);
	}
	
	/**
	 * ６月生産可能数量／日. Production possible qty. in June/day.<p>
	 *
	 */
	public void mon06_prod_qty(float value) {
		setConstNumber(offset + 14, $mon06_prod_qty, value);
	}
	
	/**
	 * ６月生産可能数量／日. Production possible qty. in June/day.<p>
	 *
	 */
	public void mon06_prod_qty(double value) {
		setConstNumber(offset + 14, $mon06_prod_qty, value);
	}
	
	/**
	 * ７月生産可能数量／日. Production possible qty. in July/day.<p>
	 *
	 */
	public MCNumber mon07_prod_qty() {
		return getConstNumber(offset + 15, $mon07_prod_qty);
	}

	/**
	 * ７月生産可能数量／日. Production possible qty. in July/day.<p>
	 *
	 */
	public void mon07_prod_qty(MCNumber value) {
		setConstNumber(offset + 15, $mon07_prod_qty, value);
	}
	
	/**
	 * ７月生産可能数量／日. Production possible qty. in July/day.<p>
	 *
	 */
	public void mon07_prod_qty(int value) {
		setConstNumber(offset + 15, $mon07_prod_qty, value);
	}
	
	/**
	 * ７月生産可能数量／日. Production possible qty. in July/day.<p>
	 *
	 */
	public void mon07_prod_qty(long value) {
		setConstNumber(offset + 15, $mon07_prod_qty, value);
	}
	
	/**
	 * ７月生産可能数量／日. Production possible qty. in July/day.<p>
	 *
	 */
	public void mon07_prod_qty(float value) {
		setConstNumber(offset + 15, $mon07_prod_qty, value);
	}
	
	/**
	 * ７月生産可能数量／日. Production possible qty. in July/day.<p>
	 *
	 */
	public void mon07_prod_qty(double value) {
		setConstNumber(offset + 15, $mon07_prod_qty, value);
	}
	
	/**
	 * ８月生産可能数量／日. Production possible qty. in August/day.<p>
	 *
	 */
	public MCNumber mon08_prod_qty() {
		return getConstNumber(offset + 16, $mon08_prod_qty);
	}

	/**
	 * ８月生産可能数量／日. Production possible qty. in August/day.<p>
	 *
	 */
	public void mon08_prod_qty(MCNumber value) {
		setConstNumber(offset + 16, $mon08_prod_qty, value);
	}
	
	/**
	 * ８月生産可能数量／日. Production possible qty. in August/day.<p>
	 *
	 */
	public void mon08_prod_qty(int value) {
		setConstNumber(offset + 16, $mon08_prod_qty, value);
	}
	
	/**
	 * ８月生産可能数量／日. Production possible qty. in August/day.<p>
	 *
	 */
	public void mon08_prod_qty(long value) {
		setConstNumber(offset + 16, $mon08_prod_qty, value);
	}
	
	/**
	 * ８月生産可能数量／日. Production possible qty. in August/day.<p>
	 *
	 */
	public void mon08_prod_qty(float value) {
		setConstNumber(offset + 16, $mon08_prod_qty, value);
	}
	
	/**
	 * ８月生産可能数量／日. Production possible qty. in August/day.<p>
	 *
	 */
	public void mon08_prod_qty(double value) {
		setConstNumber(offset + 16, $mon08_prod_qty, value);
	}
	
	/**
	 * ９月生産可能数量／日. Production possible qty. in September/day.<p>
	 *
	 */
	public MCNumber mon09_prod_qty() {
		return getConstNumber(offset + 17, $mon09_prod_qty);
	}

	/**
	 * ９月生産可能数量／日. Production possible qty. in September/day.<p>
	 *
	 */
	public void mon09_prod_qty(MCNumber value) {
		setConstNumber(offset + 17, $mon09_prod_qty, value);
	}
	
	/**
	 * ９月生産可能数量／日. Production possible qty. in September/day.<p>
	 *
	 */
	public void mon09_prod_qty(int value) {
		setConstNumber(offset + 17, $mon09_prod_qty, value);
	}
	
	/**
	 * ９月生産可能数量／日. Production possible qty. in September/day.<p>
	 *
	 */
	public void mon09_prod_qty(long value) {
		setConstNumber(offset + 17, $mon09_prod_qty, value);
	}
	
	/**
	 * ９月生産可能数量／日. Production possible qty. in September/day.<p>
	 *
	 */
	public void mon09_prod_qty(float value) {
		setConstNumber(offset + 17, $mon09_prod_qty, value);
	}
	
	/**
	 * ９月生産可能数量／日. Production possible qty. in September/day.<p>
	 *
	 */
	public void mon09_prod_qty(double value) {
		setConstNumber(offset + 17, $mon09_prod_qty, value);
	}
	
	/**
	 * １０月生産可能数量／日. Production possible qty. in October/day.<p>
	 *
	 */
	public MCNumber mon10_prod_qty() {
		return getConstNumber(offset + 18, $mon10_prod_qty);
	}

	/**
	 * １０月生産可能数量／日. Production possible qty. in October/day.<p>
	 *
	 */
	public void mon10_prod_qty(MCNumber value) {
		setConstNumber(offset + 18, $mon10_prod_qty, value);
	}
	
	/**
	 * １０月生産可能数量／日. Production possible qty. in October/day.<p>
	 *
	 */
	public void mon10_prod_qty(int value) {
		setConstNumber(offset + 18, $mon10_prod_qty, value);
	}
	
	/**
	 * １０月生産可能数量／日. Production possible qty. in October/day.<p>
	 *
	 */
	public void mon10_prod_qty(long value) {
		setConstNumber(offset + 18, $mon10_prod_qty, value);
	}
	
	/**
	 * １０月生産可能数量／日. Production possible qty. in October/day.<p>
	 *
	 */
	public void mon10_prod_qty(float value) {
		setConstNumber(offset + 18, $mon10_prod_qty, value);
	}
	
	/**
	 * １０月生産可能数量／日. Production possible qty. in October/day.<p>
	 *
	 */
	public void mon10_prod_qty(double value) {
		setConstNumber(offset + 18, $mon10_prod_qty, value);
	}
	
	/**
	 * １１月生産可能数量／日. Production possible qty. in November/day.<p>
	 *
	 */
	public MCNumber mon11_prod_qty() {
		return getConstNumber(offset + 19, $mon11_prod_qty);
	}

	/**
	 * １１月生産可能数量／日. Production possible qty. in November/day.<p>
	 *
	 */
	public void mon11_prod_qty(MCNumber value) {
		setConstNumber(offset + 19, $mon11_prod_qty, value);
	}
	
	/**
	 * １１月生産可能数量／日. Production possible qty. in November/day.<p>
	 *
	 */
	public void mon11_prod_qty(int value) {
		setConstNumber(offset + 19, $mon11_prod_qty, value);
	}
	
	/**
	 * １１月生産可能数量／日. Production possible qty. in November/day.<p>
	 *
	 */
	public void mon11_prod_qty(long value) {
		setConstNumber(offset + 19, $mon11_prod_qty, value);
	}
	
	/**
	 * １１月生産可能数量／日. Production possible qty. in November/day.<p>
	 *
	 */
	public void mon11_prod_qty(float value) {
		setConstNumber(offset + 19, $mon11_prod_qty, value);
	}
	
	/**
	 * １１月生産可能数量／日. Production possible qty. in November/day.<p>
	 *
	 */
	public void mon11_prod_qty(double value) {
		setConstNumber(offset + 19, $mon11_prod_qty, value);
	}
	
	/**
	 * １２月生産可能数量／日. Production possible qty. in December/day.<p>
	 *
	 */
	public MCNumber mon12_prod_qty() {
		return getConstNumber(offset + 20, $mon12_prod_qty);
	}

	/**
	 * １２月生産可能数量／日. Production possible qty. in December/day.<p>
	 *
	 */
	public void mon12_prod_qty(MCNumber value) {
		setConstNumber(offset + 20, $mon12_prod_qty, value);
	}
	
	/**
	 * １２月生産可能数量／日. Production possible qty. in December/day.<p>
	 *
	 */
	public void mon12_prod_qty(int value) {
		setConstNumber(offset + 20, $mon12_prod_qty, value);
	}
	
	/**
	 * １２月生産可能数量／日. Production possible qty. in December/day.<p>
	 *
	 */
	public void mon12_prod_qty(long value) {
		setConstNumber(offset + 20, $mon12_prod_qty, value);
	}
	
	/**
	 * １２月生産可能数量／日. Production possible qty. in December/day.<p>
	 *
	 */
	public void mon12_prod_qty(float value) {
		setConstNumber(offset + 20, $mon12_prod_qty, value);
	}
	
	/**
	 * １２月生産可能数量／日. Production possible qty. in December/day.<p>
	 *
	 */
	public void mon12_prod_qty(double value) {
		setConstNumber(offset + 20, $mon12_prod_qty, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 21, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 21, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 22, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 22, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 23, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 23, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 24, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 24, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 25, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 25, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 26, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 26, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 27, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 27, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 28, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 28, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 29, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 29, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 30, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 31, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 31, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 32, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 33, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 33, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 34, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 34, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 35, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 36, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 36, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 37, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 37, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($base_mps_grp_nm.equalsIgnoreCase(name)) {
			return base_mps_grp_nm();
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			return date_div_typ();
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
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			return rqmt_mons();
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			return prcd_mons();
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			return date_div_mons();
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			return week_div_mons();
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			return period_div_mons();
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			return mon01_prod_qty();
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			return mon02_prod_qty();
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			return mon03_prod_qty();
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			return mon04_prod_qty();
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			return mon05_prod_qty();
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			return mon06_prod_qty();
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			return mon07_prod_qty();
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			return mon08_prod_qty();
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			return mon09_prod_qty();
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			return mon10_prod_qty();
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			return mon11_prod_qty();
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			return mon12_prod_qty();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($base_mps_grp_nm.equalsIgnoreCase(name)) {
			return base_mps_grp_nm();
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			return date_div_typ();
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
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			return rqmt_mons();
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			return prcd_mons();
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			return date_div_mons();
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			return week_div_mons();
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			return period_div_mons();
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			return mon01_prod_qty();
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			return mon02_prod_qty();
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			return mon03_prod_qty();
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			return mon04_prod_qty();
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			return mon05_prod_qty();
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			return mon06_prod_qty();
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			return mon07_prod_qty();
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			return mon08_prod_qty();
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			return mon09_prod_qty();
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			return mon10_prod_qty();
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			return mon11_prod_qty();
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			return mon12_prod_qty();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
			return;
		}
		if ($base_mps_grp_nm.equalsIgnoreCase(name)) {
			base_mps_grp_nm(value);
			return;
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			date_div_typ(value);
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
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
			return;
		}
		if ($base_mps_grp_nm.equalsIgnoreCase(name)) {
			base_mps_grp_nm(value);
			return;
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			date_div_typ(value);
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
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($rqmt_mons.equalsIgnoreCase(name)) {
			rqmt_mons(value);
			return;
		}
		if ($prcd_mons.equalsIgnoreCase(name)) {
			prcd_mons(value);
			return;
		}
		if ($date_div_mons.equalsIgnoreCase(name)) {
			date_div_mons(value);
			return;
		}
		if ($week_div_mons.equalsIgnoreCase(name)) {
			week_div_mons(value);
			return;
		}
		if ($period_div_mons.equalsIgnoreCase(name)) {
			period_div_mons(value);
			return;
		}
		if ($mon01_prod_qty.equalsIgnoreCase(name)) {
			mon01_prod_qty(value);
			return;
		}
		if ($mon02_prod_qty.equalsIgnoreCase(name)) {
			mon02_prod_qty(value);
			return;
		}
		if ($mon03_prod_qty.equalsIgnoreCase(name)) {
			mon03_prod_qty(value);
			return;
		}
		if ($mon04_prod_qty.equalsIgnoreCase(name)) {
			mon04_prod_qty(value);
			return;
		}
		if ($mon05_prod_qty.equalsIgnoreCase(name)) {
			mon05_prod_qty(value);
			return;
		}
		if ($mon06_prod_qty.equalsIgnoreCase(name)) {
			mon06_prod_qty(value);
			return;
		}
		if ($mon07_prod_qty.equalsIgnoreCase(name)) {
			mon07_prod_qty(value);
			return;
		}
		if ($mon08_prod_qty.equalsIgnoreCase(name)) {
			mon08_prod_qty(value);
			return;
		}
		if ($mon09_prod_qty.equalsIgnoreCase(name)) {
			mon09_prod_qty(value);
			return;
		}
		if ($mon10_prod_qty.equalsIgnoreCase(name)) {
			mon10_prod_qty(value);
			return;
		}
		if ($mon11_prod_qty.equalsIgnoreCase(name)) {
			mon11_prod_qty(value);
			return;
		}
		if ($mon12_prod_qty.equalsIgnoreCase(name)) {
			mon12_prod_qty(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
