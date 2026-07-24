package mcframe.serverMG.dbc;

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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "場所別仕掛原価 // WIP cost by location"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>mng_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>管理部門ＣＤ</td>
 *  	<td>Management dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ラインＣＤ</td>
 *  	<td>Line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_wip_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月初仕掛原価</td>
 *  	<td>Beginning WIP cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prod_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発生原価</td>
 *  	<td>Incurred cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造品投入原価</td>
 *  	<td>Mfg. item input cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>comp_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>完成原価</td>
 *  	<td>Cost of completed item</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_wip_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月末仕掛原価</td>
 *  	<td>Ending WIP cost</td>
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
public class MGT_WIP_LOC_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_WIP_LOC";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	private static final MCPermColumnInfo _calc_no = createColumnInfo("calc_no");
	public final MCStringPermColumn calc_no = createStringColumn(_calc_no);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 年月. Year month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	private static final MCPermColumnInfo _mng_dpt_cd = createColumnInfo("mng_dpt_cd");
	public final MCStringPermColumn mng_dpt_cd = createStringColumn(_mng_dpt_cd);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	private static final MCPermColumnInfo _oper_seq = createColumnInfo("oper_seq");
	public final MCNumberPermColumn oper_seq = createNumberColumn(_oper_seq);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 月初仕掛原価. Beginning WIP cost.<p>
	 *
	 */
	public static final String $st_wip_amt = "st_wip_amt";
	private static final MCPermColumnInfo _st_wip_amt = createColumnInfo("st_wip_amt");
	public final MCNumberPermColumn st_wip_amt = createNumberColumn(_st_wip_amt);
	
	/**
	 * 発生原価. Incurred cost.<p>
	 *
	 */
	public static final String $prod_amt = "prod_amt";
	private static final MCPermColumnInfo _prod_amt = createColumnInfo("prod_amt");
	public final MCNumberPermColumn prod_amt = createNumberColumn(_prod_amt);
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public static final String $inpt_amt = "inpt_amt";
	private static final MCPermColumnInfo _inpt_amt = createColumnInfo("inpt_amt");
	public final MCNumberPermColumn inpt_amt = createNumberColumn(_inpt_amt);
	
	/**
	 * 完成原価. Cost of completed item.<p>
	 *
	 */
	public static final String $comp_amt = "comp_amt";
	private static final MCPermColumnInfo _comp_amt = createColumnInfo("comp_amt");
	public final MCNumberPermColumn comp_amt = createNumberColumn(_comp_amt);
	
	/**
	 * 月末仕掛原価. Ending WIP cost.<p>
	 *
	 */
	public static final String $end_wip_amt = "end_wip_amt";
	private static final MCPermColumnInfo _end_wip_amt = createColumnInfo("end_wip_amt");
	public final MCNumberPermColumn end_wip_amt = createNumberColumn(_end_wip_amt);
	
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
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta st_wip_amt_META = createCommonMeta($st_wip_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prod_amt_META = createCommonMeta($prod_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inpt_amt_META = createCommonMeta($inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta comp_amt_META = createCommonMeta($comp_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_wip_amt_META = createCommonMeta($end_wip_amt, mcframe.commonMA.meta.MA_META.MONEY);
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
	public static final String $ARG1 = "ARG1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MGT_ARG",
				$ARG1,
				new String[][]{
						{"calc_no", "calc_no"},
						{"calc_grp_cd", "calc_grp_cd"}
				},
				() -> {
					return mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
				},
				(alias) -> {
					MGT_WIP_LOC_R own = MGT_WIP_LOC_R.create(alias);
					mcframe.serverMG.dbc.MGT_ARG_R ref = mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_no.eq(ref.calc_no));
					cond = cond.and(own.calc_grp_cd.eq(ref.calc_grp_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MGT_WIP_LOC_R> constMetas = new ConstMetaList<MGT_WIP_LOC_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			wg_cd_META,
			ym_META,
			mng_dpt_cd_META,
			loc_cd_META,
			str_ln_cd_META,
			oper_cd_META,
			oper_seq_META,
			expns_cd_META,
			st_wip_amt_META,
			prod_amt_META,
			inpt_amt_META,
			comp_amt_META,
			end_wip_amt_META,
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
	protected MGT_WIP_LOC_R(ConstMetaList<? extends MGT_WIP_LOC_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_WIP_LOC_R(ConstMetaList<? extends MGT_WIP_LOC_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$calc_no,
				"calc_no",
				calc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_WIP_LOC_R.$ym,
				"ym",
				ym,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$mng_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$mng_dpt_cd,
				"mng_dpt_cd",
				mng_dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$loc_cd,
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
			MGT_WIP_LOC_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$str_ln_cd,
				"str_ln_cd",
				str_ln_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$oper_cd,
				"oper_cd",
				oper_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_WIP_LOC_R.$oper_seq,
				"oper_seq",
				oper_seq,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$expns_cd,
				"expns_cd",
				expns_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$st_wip_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_WIP_LOC_R.$st_wip_amt,
				"st_wip_amt",
				st_wip_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$prod_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_WIP_LOC_R.$prod_amt,
				"prod_amt",
				prod_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$inpt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_WIP_LOC_R.$inpt_amt,
				"inpt_amt",
				inpt_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$comp_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_WIP_LOC_R.$comp_amt,
				"comp_amt",
				comp_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$end_wip_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_WIP_LOC_R.$end_wip_amt,
				"end_wip_amt",
				end_wip_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_WIP_LOC_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$ins_usr_id,
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
			MGT_WIP_LOC_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$ins_usr_nm,
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
			MGT_WIP_LOC_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_WIP_LOC_R.$ins_ts,
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
			MGT_WIP_LOC_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$ins_func_id,
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
			MGT_WIP_LOC_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_WIP_LOC_R.$upd_cntr,
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
			MGT_WIP_LOC_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$upd_usr_id,
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
			MGT_WIP_LOC_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$upd_usr_nm,
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
			MGT_WIP_LOC_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_WIP_LOC_R.$upd_ts,
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
			MGT_WIP_LOC_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$upd_func_id,
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
			MGT_WIP_LOC_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_WIP_LOC_R.$upd_srv_req_no,
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
	public static MGT_WIP_LOC_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_WIP_LOC_R create(String alias) {
		MGT_WIP_LOC_R row = new MGT_WIP_LOC_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_WIP_LOC_R createByName(T proto) {
		MGT_WIP_LOC_R row = MGT_WIP_LOC_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_WIP_LOC_R clone() {
		return (MGT_WIP_LOC_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_WIP_LOC_R createInstance() {
		return (MGT_WIP_LOC_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_WIP_LOC_R getValues(String... names) {
		return (MGT_WIP_LOC_R) super.getValues(names);
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
	 public MGW_WIP_LOC_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_WIP_LOC_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_WIP_LOC_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_WIP_LOC_KEY_R.TABLE_NAME);
	 }

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 0, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 0, $calc_no, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 4, $mng_dpt_cd);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 4, $mng_dpt_cd, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 5, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 5, $loc_cd, value);
	}

	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 6, $str_ln_cd);
	}

	/**
	 * ラインＣＤ. Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 6, $str_ln_cd, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 7, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 7, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 8, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 8, $oper_seq, value);
	}
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 9, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 9, $expns_cd, value);
	}

	/**
	 * 月初仕掛原価. Beginning WIP cost.<p>
	 *
	 */
	public MCNumber st_wip_amt() {
		return getConstNumber(offset + 10, $st_wip_amt);
	}

	/**
	 * 月初仕掛原価. Beginning WIP cost.<p>
	 *
	 */
	public void st_wip_amt(MCNumber value) {
		setConstNumber(offset + 10, $st_wip_amt, value);
	}
	
	/**
	 * 月初仕掛原価. Beginning WIP cost.<p>
	 *
	 */
	public void st_wip_amt(int value) {
		setConstNumber(offset + 10, $st_wip_amt, value);
	}
	
	/**
	 * 月初仕掛原価. Beginning WIP cost.<p>
	 *
	 */
	public void st_wip_amt(long value) {
		setConstNumber(offset + 10, $st_wip_amt, value);
	}
	
	/**
	 * 月初仕掛原価. Beginning WIP cost.<p>
	 *
	 */
	public void st_wip_amt(float value) {
		setConstNumber(offset + 10, $st_wip_amt, value);
	}
	
	/**
	 * 月初仕掛原価. Beginning WIP cost.<p>
	 *
	 */
	public void st_wip_amt(double value) {
		setConstNumber(offset + 10, $st_wip_amt, value);
	}
	
	/**
	 * 発生原価. Incurred cost.<p>
	 *
	 */
	public MCNumber prod_amt() {
		return getConstNumber(offset + 11, $prod_amt);
	}

	/**
	 * 発生原価. Incurred cost.<p>
	 *
	 */
	public void prod_amt(MCNumber value) {
		setConstNumber(offset + 11, $prod_amt, value);
	}
	
	/**
	 * 発生原価. Incurred cost.<p>
	 *
	 */
	public void prod_amt(int value) {
		setConstNumber(offset + 11, $prod_amt, value);
	}
	
	/**
	 * 発生原価. Incurred cost.<p>
	 *
	 */
	public void prod_amt(long value) {
		setConstNumber(offset + 11, $prod_amt, value);
	}
	
	/**
	 * 発生原価. Incurred cost.<p>
	 *
	 */
	public void prod_amt(float value) {
		setConstNumber(offset + 11, $prod_amt, value);
	}
	
	/**
	 * 発生原価. Incurred cost.<p>
	 *
	 */
	public void prod_amt(double value) {
		setConstNumber(offset + 11, $prod_amt, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public MCNumber inpt_amt() {
		return getConstNumber(offset + 12, $inpt_amt);
	}

	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void inpt_amt(MCNumber value) {
		setConstNumber(offset + 12, $inpt_amt, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void inpt_amt(int value) {
		setConstNumber(offset + 12, $inpt_amt, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void inpt_amt(long value) {
		setConstNumber(offset + 12, $inpt_amt, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void inpt_amt(float value) {
		setConstNumber(offset + 12, $inpt_amt, value);
	}
	
	/**
	 * 製造品投入原価. Mfg. item input cost.<p>
	 *
	 */
	public void inpt_amt(double value) {
		setConstNumber(offset + 12, $inpt_amt, value);
	}
	
	/**
	 * 完成原価. Cost of completed item.<p>
	 *
	 */
	public MCNumber comp_amt() {
		return getConstNumber(offset + 13, $comp_amt);
	}

	/**
	 * 完成原価. Cost of completed item.<p>
	 *
	 */
	public void comp_amt(MCNumber value) {
		setConstNumber(offset + 13, $comp_amt, value);
	}
	
	/**
	 * 完成原価. Cost of completed item.<p>
	 *
	 */
	public void comp_amt(int value) {
		setConstNumber(offset + 13, $comp_amt, value);
	}
	
	/**
	 * 完成原価. Cost of completed item.<p>
	 *
	 */
	public void comp_amt(long value) {
		setConstNumber(offset + 13, $comp_amt, value);
	}
	
	/**
	 * 完成原価. Cost of completed item.<p>
	 *
	 */
	public void comp_amt(float value) {
		setConstNumber(offset + 13, $comp_amt, value);
	}
	
	/**
	 * 完成原価. Cost of completed item.<p>
	 *
	 */
	public void comp_amt(double value) {
		setConstNumber(offset + 13, $comp_amt, value);
	}
	
	/**
	 * 月末仕掛原価. Ending WIP cost.<p>
	 *
	 */
	public MCNumber end_wip_amt() {
		return getConstNumber(offset + 14, $end_wip_amt);
	}

	/**
	 * 月末仕掛原価. Ending WIP cost.<p>
	 *
	 */
	public void end_wip_amt(MCNumber value) {
		setConstNumber(offset + 14, $end_wip_amt, value);
	}
	
	/**
	 * 月末仕掛原価. Ending WIP cost.<p>
	 *
	 */
	public void end_wip_amt(int value) {
		setConstNumber(offset + 14, $end_wip_amt, value);
	}
	
	/**
	 * 月末仕掛原価. Ending WIP cost.<p>
	 *
	 */
	public void end_wip_amt(long value) {
		setConstNumber(offset + 14, $end_wip_amt, value);
	}
	
	/**
	 * 月末仕掛原価. Ending WIP cost.<p>
	 *
	 */
	public void end_wip_amt(float value) {
		setConstNumber(offset + 14, $end_wip_amt, value);
	}
	
	/**
	 * 月末仕掛原価. Ending WIP cost.<p>
	 *
	 */
	public void end_wip_amt(double value) {
		setConstNumber(offset + 14, $end_wip_amt, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 15, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 15, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 16, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 16, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 17, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 17, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 18, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 18, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 19, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 20, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 20, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 21, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 21, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 22, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 22, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 23, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 23, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 24, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 24, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			return st_wip_amt();
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			return prod_amt();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			return comp_amt();
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			return end_wip_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
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

	public String getStringNE(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			return st_wip_amt();
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			return prod_amt();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			return comp_amt();
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			return end_wip_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
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

	public void setString(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
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

	public void setStringNE(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($st_wip_amt.equalsIgnoreCase(name)) {
			st_wip_amt(value);
			return;
		}
		if ($prod_amt.equalsIgnoreCase(name)) {
			prod_amt(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($comp_amt.equalsIgnoreCase(name)) {
			comp_amt(value);
			return;
		}
		if ($end_wip_amt.equalsIgnoreCase(name)) {
			end_wip_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
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

}
