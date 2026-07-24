package mcframe.serverMABS.MABSL0840;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public static final String $mps_grp_nm_lcl = "mps_grp_nm_lcl";
	/**
	 * Standard MPS group name 標準ＭＰＳグループ名.<p>
	 *
	 */
	public static final String $mps_grp_nm = "mps_grp_nm";
	/**
	 * Daily production request created months 日次生産依頼作成月数.<p>
	 *
	 */
	public static final String $rqmt_mons = "rqmt_mons";
	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public static final String $prcd_mons = "prcd_mons";
	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public static final String $date_div_mons = "date_div_mons";
	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public static final String $week_div_mons = "week_div_mons";
	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public static final String $period_div_mons = "period_div_mons";
	/**
	 * Disaggregation by day type 日ばらし区分.<p>
	 *
	 */
	public static final String $date_div_typ = "date_div_typ";
	/**
	 * Disaggregation by day type name 日ばらし区分名.<p>
	 *
	 */
	public static final String $date_div_typ_nm = "date_div_typ_nm";
	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon01_prod_qty = "mon01_prod_qty";
	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon02_prod_qty = "mon02_prod_qty";
	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon03_prod_qty = "mon03_prod_qty";
	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon04_prod_qty = "mon04_prod_qty";
	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon05_prod_qty = "mon05_prod_qty";
	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon06_prod_qty = "mon06_prod_qty";
	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon07_prod_qty = "mon07_prod_qty";
	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon08_prod_qty = "mon08_prod_qty";
	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon09_prod_qty = "mon09_prod_qty";
	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon10_prod_qty = "mon10_prod_qty";
	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon11_prod_qty = "mon11_prod_qty";
	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public static final String $mon12_prod_qty = "mon12_prod_qty";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta mps_grp_nm_lcl_META = createCommonMeta($mps_grp_nm_lcl, mcframe.commonMA.meta.MA_META.MPS_GRP_NM);
	public static final MCMeta mps_grp_nm_META = createCommonMeta($mps_grp_nm, mcframe.commonMA.meta.MA_META.MPS_GRP_NM);
	public static final MCMeta rqmt_mons_META = createCommonMeta($rqmt_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta prcd_mons_META = createCommonMeta($prcd_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta date_div_mons_META = createCommonMeta($date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta week_div_mons_META = createCommonMeta($week_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta period_div_mons_META = createCommonMeta($period_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta date_div_typ_META = createCommonMeta($date_div_typ, mcframe.commonMA.meta.MA_META.DATE_DIV_TYP);
	public static final MCMeta date_div_typ_nm_META = createCommonMeta($date_div_typ_nm, mcframe.commonMA.meta.MA_META.DATE_DIV_TYP_NM);
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
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			mps_grp_cd_META,
			mps_grp_nm_lcl_META,
			mps_grp_nm_META,
			rqmt_mons_META,
			prcd_mons_META,
			date_div_mons_META,
			week_div_mons_META,
			period_div_mons_META,
			date_div_typ_META,
			date_div_typ_nm_META,
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
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$date_div_typ, "MAC_DATE_DIV_TYP"}	// date_div_typ
			}
		))
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 1, $mps_grp_cd);
	}

	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 1, $mps_grp_cd, value);
	}


	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public String mps_grp_nm_lcl() {
		return getConstString(offset + 2, $mps_grp_nm_lcl);
	}

	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public void mps_grp_nm_lcl(String value) {
		setConstString(offset + 2, $mps_grp_nm_lcl, value);
	}


	/**
	 * Standard MPS group name 標準ＭＰＳグループ名.<p>
	 *
	 */
	public String mps_grp_nm() {
		return getConstString(offset + 3, $mps_grp_nm);
	}

	/**
	 * Standard MPS group name 標準ＭＰＳグループ名.<p>
	 *
	 */
	public void mps_grp_nm(String value) {
		setConstString(offset + 3, $mps_grp_nm, value);
	}


	/**
	 * Daily production request created months 日次生産依頼作成月数.<p>
	 *
	 */
	public MCNumber rqmt_mons() {
		return getConstNumber(offset + 4, $rqmt_mons);
	}

	/**
	 * Daily production request created months 日次生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(MCNumber value) {
		setConstNumber(offset + 4, $rqmt_mons, value);
	}

	/**
	 * Daily production request created months 日次生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(int value) {
		setConstNumber(offset + 4, $rqmt_mons, value);
	}

	/**
	 * Daily production request created months 日次生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(long value) {
		setConstNumber(offset + 4, $rqmt_mons, value);
	}

	/**
	 * Daily production request created months 日次生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(float value) {
		setConstNumber(offset + 4, $rqmt_mons, value);
	}

	/**
	 * Daily production request created months 日次生産依頼作成月数.<p>
	 *
	 */
	public void rqmt_mons(double value) {
		setConstNumber(offset + 4, $rqmt_mons, value);
	}


	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public MCNumber prcd_mons() {
		return getConstNumber(offset + 5, $prcd_mons);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(MCNumber value) {
		setConstNumber(offset + 5, $prcd_mons, value);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(int value) {
		setConstNumber(offset + 5, $prcd_mons, value);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(long value) {
		setConstNumber(offset + 5, $prcd_mons, value);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(float value) {
		setConstNumber(offset + 5, $prcd_mons, value);
	}

	/**
	 * Long LT request creation months 先行手配依頼作成月数.<p>
	 *
	 */
	public void prcd_mons(double value) {
		setConstNumber(offset + 5, $prcd_mons, value);
	}


	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public MCNumber date_div_mons() {
		return getConstNumber(offset + 6, $date_div_mons);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(MCNumber value) {
		setConstNumber(offset + 6, $date_div_mons, value);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(int value) {
		setConstNumber(offset + 6, $date_div_mons, value);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(long value) {
		setConstNumber(offset + 6, $date_div_mons, value);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(float value) {
		setConstNumber(offset + 6, $date_div_mons, value);
	}

	/**
	 * Number of months for disaggregation by day 日ばらし月数.<p>
	 *
	 */
	public void date_div_mons(double value) {
		setConstNumber(offset + 6, $date_div_mons, value);
	}


	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public MCNumber week_div_mons() {
		return getConstNumber(offset + 7, $week_div_mons);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(MCNumber value) {
		setConstNumber(offset + 7, $week_div_mons, value);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(int value) {
		setConstNumber(offset + 7, $week_div_mons, value);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(long value) {
		setConstNumber(offset + 7, $week_div_mons, value);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(float value) {
		setConstNumber(offset + 7, $week_div_mons, value);
	}

	/**
	 * Number of months disaggregated by week 週ばらし月数.<p>
	 *
	 */
	public void week_div_mons(double value) {
		setConstNumber(offset + 7, $week_div_mons, value);
	}


	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public MCNumber period_div_mons() {
		return getConstNumber(offset + 8, $period_div_mons);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(MCNumber value) {
		setConstNumber(offset + 8, $period_div_mons, value);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(int value) {
		setConstNumber(offset + 8, $period_div_mons, value);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(long value) {
		setConstNumber(offset + 8, $period_div_mons, value);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(float value) {
		setConstNumber(offset + 8, $period_div_mons, value);
	}

	/**
	 * Number of months disaggregated by 10 days 旬ばらし月数.<p>
	 *
	 */
	public void period_div_mons(double value) {
		setConstNumber(offset + 8, $period_div_mons, value);
	}


	/**
	 * Disaggregation by day type 日ばらし区分.<p>
	 *
	 */
	public String date_div_typ() {
		return getConstString(offset + 9, $date_div_typ);
	}

	/**
	 * Disaggregation by day type 日ばらし区分.<p>
	 *
	 */
	public void date_div_typ(String value) {
		setConstString(offset + 9, $date_div_typ, value);
	}


	/**
	 * Disaggregation by day type name 日ばらし区分名.<p>
	 *
	 */
	public String date_div_typ_nm() {
		return getConstString(offset + 10, $date_div_typ_nm);
	}

	/**
	 * Disaggregation by day type name 日ばらし区分名.<p>
	 *
	 */
	public void date_div_typ_nm(String value) {
		setConstString(offset + 10, $date_div_typ_nm, value);
	}


	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon01_prod_qty() {
		return getConstNumber(offset + 11, $mon01_prod_qty);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(MCNumber value) {
		setConstNumber(offset + 11, $mon01_prod_qty, value);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(int value) {
		setConstNumber(offset + 11, $mon01_prod_qty, value);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(long value) {
		setConstNumber(offset + 11, $mon01_prod_qty, value);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(float value) {
		setConstNumber(offset + 11, $mon01_prod_qty, value);
	}

	/**
	 * Possible daily production qty. in January １月生産可能数量／日.<p>
	 *
	 */
	public void mon01_prod_qty(double value) {
		setConstNumber(offset + 11, $mon01_prod_qty, value);
	}


	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon02_prod_qty() {
		return getConstNumber(offset + 12, $mon02_prod_qty);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(MCNumber value) {
		setConstNumber(offset + 12, $mon02_prod_qty, value);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(int value) {
		setConstNumber(offset + 12, $mon02_prod_qty, value);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(long value) {
		setConstNumber(offset + 12, $mon02_prod_qty, value);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(float value) {
		setConstNumber(offset + 12, $mon02_prod_qty, value);
	}

	/**
	 * Production possible qty. in February/day ２月生産可能数量／日.<p>
	 *
	 */
	public void mon02_prod_qty(double value) {
		setConstNumber(offset + 12, $mon02_prod_qty, value);
	}


	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon03_prod_qty() {
		return getConstNumber(offset + 13, $mon03_prod_qty);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(MCNumber value) {
		setConstNumber(offset + 13, $mon03_prod_qty, value);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(int value) {
		setConstNumber(offset + 13, $mon03_prod_qty, value);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(long value) {
		setConstNumber(offset + 13, $mon03_prod_qty, value);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(float value) {
		setConstNumber(offset + 13, $mon03_prod_qty, value);
	}

	/**
	 * Production possible qty. in March/day ３月生産可能数量／日.<p>
	 *
	 */
	public void mon03_prod_qty(double value) {
		setConstNumber(offset + 13, $mon03_prod_qty, value);
	}


	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon04_prod_qty() {
		return getConstNumber(offset + 14, $mon04_prod_qty);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(MCNumber value) {
		setConstNumber(offset + 14, $mon04_prod_qty, value);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(int value) {
		setConstNumber(offset + 14, $mon04_prod_qty, value);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(long value) {
		setConstNumber(offset + 14, $mon04_prod_qty, value);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(float value) {
		setConstNumber(offset + 14, $mon04_prod_qty, value);
	}

	/**
	 * Production possible qty. in April/day ４月生産可能数量／日.<p>
	 *
	 */
	public void mon04_prod_qty(double value) {
		setConstNumber(offset + 14, $mon04_prod_qty, value);
	}


	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon05_prod_qty() {
		return getConstNumber(offset + 15, $mon05_prod_qty);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(MCNumber value) {
		setConstNumber(offset + 15, $mon05_prod_qty, value);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(int value) {
		setConstNumber(offset + 15, $mon05_prod_qty, value);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(long value) {
		setConstNumber(offset + 15, $mon05_prod_qty, value);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(float value) {
		setConstNumber(offset + 15, $mon05_prod_qty, value);
	}

	/**
	 * Production possible qty. in May/day ５月生産可能数量／日.<p>
	 *
	 */
	public void mon05_prod_qty(double value) {
		setConstNumber(offset + 15, $mon05_prod_qty, value);
	}


	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon06_prod_qty() {
		return getConstNumber(offset + 16, $mon06_prod_qty);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(MCNumber value) {
		setConstNumber(offset + 16, $mon06_prod_qty, value);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(int value) {
		setConstNumber(offset + 16, $mon06_prod_qty, value);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(long value) {
		setConstNumber(offset + 16, $mon06_prod_qty, value);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(float value) {
		setConstNumber(offset + 16, $mon06_prod_qty, value);
	}

	/**
	 * Production possible qty. in June/day ６月生産可能数量／日.<p>
	 *
	 */
	public void mon06_prod_qty(double value) {
		setConstNumber(offset + 16, $mon06_prod_qty, value);
	}


	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon07_prod_qty() {
		return getConstNumber(offset + 17, $mon07_prod_qty);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(MCNumber value) {
		setConstNumber(offset + 17, $mon07_prod_qty, value);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(int value) {
		setConstNumber(offset + 17, $mon07_prod_qty, value);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(long value) {
		setConstNumber(offset + 17, $mon07_prod_qty, value);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(float value) {
		setConstNumber(offset + 17, $mon07_prod_qty, value);
	}

	/**
	 * Production possible qty. in July/day ７月生産可能数量／日.<p>
	 *
	 */
	public void mon07_prod_qty(double value) {
		setConstNumber(offset + 17, $mon07_prod_qty, value);
	}


	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon08_prod_qty() {
		return getConstNumber(offset + 18, $mon08_prod_qty);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(MCNumber value) {
		setConstNumber(offset + 18, $mon08_prod_qty, value);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(int value) {
		setConstNumber(offset + 18, $mon08_prod_qty, value);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(long value) {
		setConstNumber(offset + 18, $mon08_prod_qty, value);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(float value) {
		setConstNumber(offset + 18, $mon08_prod_qty, value);
	}

	/**
	 * Production possible qty. in August/day ８月生産可能数量／日.<p>
	 *
	 */
	public void mon08_prod_qty(double value) {
		setConstNumber(offset + 18, $mon08_prod_qty, value);
	}


	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon09_prod_qty() {
		return getConstNumber(offset + 19, $mon09_prod_qty);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(MCNumber value) {
		setConstNumber(offset + 19, $mon09_prod_qty, value);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(int value) {
		setConstNumber(offset + 19, $mon09_prod_qty, value);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(long value) {
		setConstNumber(offset + 19, $mon09_prod_qty, value);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(float value) {
		setConstNumber(offset + 19, $mon09_prod_qty, value);
	}

	/**
	 * Production possible qty. in September/day ９月生産可能数量／日.<p>
	 *
	 */
	public void mon09_prod_qty(double value) {
		setConstNumber(offset + 19, $mon09_prod_qty, value);
	}


	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon10_prod_qty() {
		return getConstNumber(offset + 20, $mon10_prod_qty);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(MCNumber value) {
		setConstNumber(offset + 20, $mon10_prod_qty, value);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(int value) {
		setConstNumber(offset + 20, $mon10_prod_qty, value);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(long value) {
		setConstNumber(offset + 20, $mon10_prod_qty, value);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(float value) {
		setConstNumber(offset + 20, $mon10_prod_qty, value);
	}

	/**
	 * Production possible qty. in October/day １０月生産可能数量／日.<p>
	 *
	 */
	public void mon10_prod_qty(double value) {
		setConstNumber(offset + 20, $mon10_prod_qty, value);
	}


	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon11_prod_qty() {
		return getConstNumber(offset + 21, $mon11_prod_qty);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(MCNumber value) {
		setConstNumber(offset + 21, $mon11_prod_qty, value);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(int value) {
		setConstNumber(offset + 21, $mon11_prod_qty, value);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(long value) {
		setConstNumber(offset + 21, $mon11_prod_qty, value);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(float value) {
		setConstNumber(offset + 21, $mon11_prod_qty, value);
	}

	/**
	 * Production possible qty. in November/day １１月生産可能数量／日.<p>
	 *
	 */
	public void mon11_prod_qty(double value) {
		setConstNumber(offset + 21, $mon11_prod_qty, value);
	}


	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public MCNumber mon12_prod_qty() {
		return getConstNumber(offset + 22, $mon12_prod_qty);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(MCNumber value) {
		setConstNumber(offset + 22, $mon12_prod_qty, value);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(int value) {
		setConstNumber(offset + 22, $mon12_prod_qty, value);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(long value) {
		setConstNumber(offset + 22, $mon12_prod_qty, value);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(float value) {
		setConstNumber(offset + 22, $mon12_prod_qty, value);
	}

	/**
	 * Production possible qty. in December/day １２月生産可能数量／日.<p>
	 *
	 */
	public void mon12_prod_qty(double value) {
		setConstNumber(offset + 22, $mon12_prod_qty, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 23, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 23, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 24, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 24, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 25, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 25, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 26, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 26, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 27, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 27, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 28, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 29, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 29, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 30, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 30, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 31, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 32, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 32, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 33, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 33, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 34, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 35, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 35, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 36, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 36, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 37, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 37, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 38, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 38, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 39, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 39, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 40, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $del_ts, value);
	}


	public String getString(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm_lcl.equalsIgnoreCase(name)) {
			return mps_grp_nm_lcl();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			return date_div_typ();
		}
		if ($date_div_typ_nm.equalsIgnoreCase(name)) {
			return date_div_typ_nm();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
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
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
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
		if ($mps_grp_nm_lcl.equalsIgnoreCase(name)) {
			return mps_grp_nm_lcl();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			return date_div_typ();
		}
		if ($date_div_typ_nm.equalsIgnoreCase(name)) {
			return date_div_typ_nm();
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
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
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
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
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
		if ($mps_grp_nm_lcl.equalsIgnoreCase(name)) {
			mps_grp_nm_lcl(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
			return;
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			date_div_typ(value);
			return;
		}
		if ($date_div_typ_nm.equalsIgnoreCase(name)) {
			date_div_typ_nm(value);
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
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
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
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
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
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
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
		if ($mps_grp_nm_lcl.equalsIgnoreCase(name)) {
			mps_grp_nm_lcl(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
			return;
		}
		if ($date_div_typ.equalsIgnoreCase(name)) {
			date_div_typ(value);
			return;
		}
		if ($date_div_typ_nm.equalsIgnoreCase(name)) {
			date_div_typ_nm(value);
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
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
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
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
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
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
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

