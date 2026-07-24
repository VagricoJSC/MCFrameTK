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
 * "計算実行パタン構成 // Calculation run pattern configuration"DBコンテナRowクラスです。<p>
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
 *  	<td>act_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算実行パタンＣＤ</td>
 *  	<td>Calculation run pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_act_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算実行順序</td>
 *  	<td>Calculation execute sequence</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算対象先頭月</td>
 *  	<td>Calculation first month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算対象末尾月</td>
 *  	<td>Calculation last month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レートＣＤ</td>
 *  	<td>Exchange rate cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>carry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>繰越ＦＬＧ</td>
 *  	<td>Carry-over flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>err_proceed_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>エラー時続行ＦＬＧ</td>
 *  	<td>Continue on error flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>備考</td>
 *  	<td>Remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
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
public class MGT_ACT_PTN_CONFIG_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_ACT_PTN_CONFIG";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 計算実行パタンＣＤ. Calculation run pattern cd..<p>
	 *
	 */
	public static final String $act_ptn_cd = "act_ptn_cd";
	private static final MCPermColumnInfo _act_ptn_cd = createColumnInfo("act_ptn_cd");
	public final MCStringPermColumn act_ptn_cd = createStringColumn(_act_ptn_cd);
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public static final String $calc_act_seq = "calc_act_seq";
	private static final MCPermColumnInfo _calc_act_seq = createColumnInfo("calc_act_seq");
	public final MCNumberPermColumn calc_act_seq = createNumberColumn(_calc_act_seq);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * 計算対象先頭月. Calculation first month.<p>
	 *
	 */
	public static final String $st_ym = "st_ym";
	private static final MCPermColumnInfo _st_ym = createColumnInfo("st_ym");
	public final MCDatePermColumn st_ym = createDateColumn(_st_ym);
	
	/**
	 * 計算対象末尾月. Calculation last month.<p>
	 *
	 */
	public static final String $end_ym = "end_ym";
	private static final MCPermColumnInfo _end_ym = createColumnInfo("end_ym");
	public final MCDatePermColumn end_ym = createDateColumn(_end_ym);
	
	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	private static final MCPermColumnInfo _xrate_cd = createColumnInfo("xrate_cd");
	public final MCStringPermColumn xrate_cd = createStringColumn(_xrate_cd);
	
	/**
	 * 繰越ＦＬＧ. Carry-over flg..<p>
	 *
	 */
	public static final String $carry_flg = "carry_flg";
	private static final MCPermColumnInfo _carry_flg = createColumnInfo("carry_flg");
	public final MCBooleanPermColumn carry_flg = createBooleanColumn(_carry_flg);
	
	/**
	 * エラー時続行ＦＬＧ. Continue on error flg..<p>
	 *
	 */
	public static final String $err_proceed_flg = "err_proceed_flg";
	private static final MCPermColumnInfo _err_proceed_flg = createColumnInfo("err_proceed_flg");
	public final MCBooleanPermColumn err_proceed_flg = createBooleanColumn(_err_proceed_flg);
	
	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	private static final MCPermColumnInfo _rmrks = createColumnInfo("rmrks");
	public final MCStringPermColumn rmrks = createStringColumn(_rmrks);
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	private static final MCPermColumnInfo _sub_char1 = createColumnInfo("sub_char1");
	public final MCStringPermColumn sub_char1 = createStringColumn(_sub_char1);
	
	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	private static final MCPermColumnInfo _sub_char2 = createColumnInfo("sub_char2");
	public final MCStringPermColumn sub_char2 = createStringColumn(_sub_char2);
	
	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	private static final MCPermColumnInfo _sub_char3 = createColumnInfo("sub_char3");
	public final MCStringPermColumn sub_char3 = createStringColumn(_sub_char3);
	
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
	
	public static final MCMeta act_ptn_cd_META = createCommonMeta($act_ptn_cd, mcframe.commonMA.meta.MA_META.ACT_PTN_CD);
	public static final MCMeta calc_act_seq_META = createCommonMeta($calc_act_seq, mcframe.commonMG.meta.MG_META.CALC_ACT_SEQ);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta st_ym_META = createCommonMeta($st_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_META = createCommonMeta($end_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta carry_flg_META = createCommonMeta($carry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_proceed_flg_META = createCommonMeta($err_proceed_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.ACT_PTN_CONFIG_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.ACT_PTN_CONFIG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.ACT_PTN_CONFIG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.ACT_PTN_CONFIG_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MGT_ACT_PTN_CONFIG_R> constMetas = new ConstMetaList<MGT_ACT_PTN_CONFIG_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			act_ptn_cd_META,
			calc_act_seq_META,
			term_META,
			calc_grp_cd_META,
			st_ym_META,
			end_ym_META,
			xrate_cd_META,
			carry_flg_META,
			err_proceed_flg_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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
	protected MGT_ACT_PTN_CONFIG_R(ConstMetaList<? extends MGT_ACT_PTN_CONFIG_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_ACT_PTN_CONFIG_R(ConstMetaList<? extends MGT_ACT_PTN_CONFIG_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$act_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$act_ptn_cd,
				"act_ptn_cd",
				act_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$calc_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACT_PTN_CONFIG_R.$calc_act_seq,
				"calc_act_seq",
				calc_act_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_ACT_PTN_CONFIG_R.$term,
				"term",
				term,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$st_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_ACT_PTN_CONFIG_R.$st_ym,
				"st_ym",
				st_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$end_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_ACT_PTN_CONFIG_R.$end_ym,
				"end_ym",
				end_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$xrate_cd,
				"xrate_cd",
				xrate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$carry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGT_ACT_PTN_CONFIG_R.$carry_flg,
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
			MGT_ACT_PTN_CONFIG_R.$err_proceed_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGT_ACT_PTN_CONFIG_R.$err_proceed_flg,
				"err_proceed_flg",
				err_proceed_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$rmrks,
				"rmrks",
				rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$sub_char1,
				"sub_char1",
				sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$sub_char2,
				"sub_char2",
				sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$sub_char3,
				"sub_char3",
				sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_ACT_PTN_CONFIG_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$ins_usr_id,
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
			MGT_ACT_PTN_CONFIG_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$ins_usr_nm,
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
			MGT_ACT_PTN_CONFIG_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_ACT_PTN_CONFIG_R.$ins_ts,
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
			MGT_ACT_PTN_CONFIG_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$ins_func_id,
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
			MGT_ACT_PTN_CONFIG_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_ACT_PTN_CONFIG_R.$upd_cntr,
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
			MGT_ACT_PTN_CONFIG_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$upd_usr_id,
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
			MGT_ACT_PTN_CONFIG_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$upd_usr_nm,
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
			MGT_ACT_PTN_CONFIG_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_ACT_PTN_CONFIG_R.$upd_ts,
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
			MGT_ACT_PTN_CONFIG_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$upd_func_id,
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
			MGT_ACT_PTN_CONFIG_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_ACT_PTN_CONFIG_R.$upd_srv_req_no,
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
	public static MGT_ACT_PTN_CONFIG_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_ACT_PTN_CONFIG_R create(String alias) {
		MGT_ACT_PTN_CONFIG_R row = new MGT_ACT_PTN_CONFIG_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_ACT_PTN_CONFIG_R createByName(T proto) {
		MGT_ACT_PTN_CONFIG_R row = MGT_ACT_PTN_CONFIG_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_ACT_PTN_CONFIG_R clone() {
		return (MGT_ACT_PTN_CONFIG_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_ACT_PTN_CONFIG_R createInstance() {
		return (MGT_ACT_PTN_CONFIG_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_ACT_PTN_CONFIG_R getValues(String... names) {
		return (MGT_ACT_PTN_CONFIG_R) super.getValues(names);
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
	 public MGW_ACT_PTN_CONFIG_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_ACT_PTN_CONFIG_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_ACT_PTN_CONFIG_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_ACT_PTN_CONFIG_KEY_R.TABLE_NAME);
	 }

	/**
	 * 計算実行パタンＣＤ. Calculation run pattern cd..<p>
	 *
	 */
	public String act_ptn_cd() {
		return getConstString(offset + 0, $act_ptn_cd);
	}

	/**
	 * 計算実行パタンＣＤ. Calculation run pattern cd..<p>
	 *
	 */
	public void act_ptn_cd(String value) {
		setConstString(offset + 0, $act_ptn_cd, value);
	}

	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public MCNumber calc_act_seq() {
		return getConstNumber(offset + 1, $calc_act_seq);
	}

	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(int value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(long value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(float value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(double value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 2, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 2, $term, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 3, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 3, $calc_grp_cd, value);
	}

	/**
	 * 計算対象先頭月. Calculation first month.<p>
	 *
	 */
	public MCDate st_ym() {
		return getConstDate(offset + 4, $st_ym);
	}

	/**
	 * 計算対象先頭月. Calculation first month.<p>
	 *
	 */
	public void st_ym(MCDate value) {
		setConstDate(offset + 4, $st_ym, value);
	}

	/**
	 * 計算対象末尾月. Calculation last month.<p>
	 *
	 */
	public MCDate end_ym() {
		return getConstDate(offset + 5, $end_ym);
	}

	/**
	 * 計算対象末尾月. Calculation last month.<p>
	 *
	 */
	public void end_ym(MCDate value) {
		setConstDate(offset + 5, $end_ym, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 6, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 6, $xrate_cd, value);
	}

	/**
	 * 繰越ＦＬＧ. Carry-over flg..<p>
	 *
	 */
	public boolean carry_flg() {
		return getConstBoolean(offset + 7, $carry_flg);
	}

	/**
	 * 繰越ＦＬＧ. Carry-over flg..<p>
	 *
	 */
	public void carry_flg(boolean value) {
		setConstBoolean(offset + 7, $carry_flg, value);
	}

	/**
	 * エラー時続行ＦＬＧ. Continue on error flg..<p>
	 *
	 */
	public boolean err_proceed_flg() {
		return getConstBoolean(offset + 8, $err_proceed_flg);
	}

	/**
	 * エラー時続行ＦＬＧ. Continue on error flg..<p>
	 *
	 */
	public void err_proceed_flg(boolean value) {
		setConstBoolean(offset + 8, $err_proceed_flg, value);
	}

	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 9, $rmrks);
	}

	/**
	 * 備考. Remarks.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 9, $rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 10, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 10, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 11, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 11, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 12, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 12, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 13, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 13, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 14, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 14, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 15, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 15, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 16, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 16, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 17, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 18, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 18, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 19, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 19, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 20, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 20, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 21, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 21, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 22, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 22, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
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
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			return calc_act_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
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
		if ($carry_flg.equalsIgnoreCase(name)) {
			return carry_flg();
		}
		if ($err_proceed_flg.equalsIgnoreCase(name)) {
			return err_proceed_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
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
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			return calc_act_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
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
		if ($carry_flg.equalsIgnoreCase(name)) {
			return carry_flg();
		}
		if ($err_proceed_flg.equalsIgnoreCase(name)) {
			return err_proceed_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
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
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
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
		if ($carry_flg.equalsIgnoreCase(name)) {
			carry_flg(value);
			return;
		}
		if ($err_proceed_flg.equalsIgnoreCase(name)) {
			err_proceed_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
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
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
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
		if ($carry_flg.equalsIgnoreCase(name)) {
			carry_flg(value);
			return;
		}
		if ($err_proceed_flg.equalsIgnoreCase(name)) {
			err_proceed_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
