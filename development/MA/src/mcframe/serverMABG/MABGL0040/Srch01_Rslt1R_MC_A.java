package mcframe.serverMABG.MABGL0040;

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
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm_lcl = "calc_grp_nm_lcl";
	/**
	 * Standard calculation group name 標準計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	/**
	 * Cost calculation type 計算区分.<p>
	 *
	 */
	public static final String $cost_calc_typ = "cost_calc_typ";
	/**
	 * Calculation type name 計算区分名.<p>
	 *
	 */
	public static final String $cost_calc_typ_nm = "cost_calc_typ_nm";
	/**
	 * Amount evaluation type 金額評価区分.<p>
	 *
	 */
	public static final String $eval_typ = "eval_typ";
	/**
	 * Amount evaluation type name 金額評価区分名.<p>
	 *
	 */
	public static final String $eval_typ_nm = "eval_typ_nm";
	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public static final String $max_mons = "max_mons";
	/**
	 * Calculation count 計算回数.<p>
	 *
	 */
	public static final String $calc_cnt = "calc_cnt";
	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public static final String $sa_typ = "sa_typ";
	/**
	 * Plan/Result type name 予実区分名.<p>
	 *
	 */
	public static final String $sa_typ_nm = "sa_typ_nm";
	/**
	 * BOM explosion calculation type 展開計算区分.<p>
	 *
	 */
	public static final String $exp_calc_typ = "exp_calc_typ";
	/**
	 * BOM explosion calculation type name 展開計算区分名.<p>
	 *
	 */
	public static final String $exp_calc_typ_nm = "exp_calc_typ_nm";
	/**
	 * Departmental alloc. calculation type 一次配賦計算区分.<p>
	 *
	 */
	public static final String $pre_alc_calc_typ = "pre_alc_calc_typ";
	/**
	 * Departmental alloc. calculation type name 一次配賦計算区分名.<p>
	 *
	 */
	public static final String $pre_alc_calc_typ_nm = "pre_alc_calc_typ_nm";
	/**
	 * Allocation rate calculation type 配賦率計算区分.<p>
	 *
	 */
	public static final String $alc_calc_typ = "alc_calc_typ";
	/**
	 * Allocation rate calculation type name 配賦率計算区分名.<p>
	 *
	 */
	public static final String $alc_calc_typ_nm = "alc_calc_typ_nm";
	/**
	 * Input calculation 投入計算.<p>
	 *
	 */
	public static final String $inpt_calc_flg = "inpt_calc_flg";
	/**
	 * Man-hour calculation 工数計算.<p>
	 *
	 */
	public static final String $wk_calc_flg = "wk_calc_flg";
	/**
	 * Supply calculation 支給計算.<p>
	 *
	 */
	public static final String $prov_calc_flg = "prov_calc_flg";
	/**
	 * Movement calculation 移動計算.<p>
	 *
	 */
	public static final String $xfr_calc_flg = "xfr_calc_flg";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public static final String $xrate_nm = "xrate_nm";
	/**
	 * Calculation sequence G 計算順序Ｇ.<p>
	 *
	 */
	public static final String $calc_seq_grp = "calc_seq_grp";
	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public static final String $calc_seq = "calc_seq";
	/**
	 * Execution working group cd. 実行時ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $runtime_wg_cd = "runtime_wg_cd";
	/**
	 * Execution working group name 実行時ワーキンググループ名.<p>
	 *
	 */
	public static final String $runtime_wg_nm = "runtime_wg_nm";
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
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_lcl_META = createCommonMeta($calc_grp_nm_lcl, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta cost_calc_typ_META = createCommonMeta($cost_calc_typ, mcframe.commonMA.meta.MA_META.COST_CALC_TYP);
	public static final MCMeta cost_calc_typ_nm_META = createCommonMeta($cost_calc_typ_nm, mcframe.commonMA.meta.MA_META.COST_CALC_TYP_NM);
	public static final MCMeta eval_typ_META = createCommonMeta($eval_typ, mcframe.commonMA.meta.MA_META.EVAL_TYP);
	public static final MCMeta eval_typ_nm_META = createCommonMeta($eval_typ_nm, mcframe.commonMA.meta.MA_META.EVAL_TYP_NM);
	public static final MCMeta max_mons_META = createCommonMeta($max_mons, mcframe.commonMA.meta.MA_META.MAX_MONS);
	public static final MCMeta calc_cnt_META = createCommonMeta($calc_cnt, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta sa_typ_META = createCommonMeta($sa_typ, mcframe.commonMA.meta.MA_META.SA_TYP);
	public static final MCMeta sa_typ_nm_META = createCommonMeta($sa_typ_nm, mcframe.commonMA.meta.MA_META.SA_TYP_NM);
	public static final MCMeta exp_calc_typ_META = createCommonMeta($exp_calc_typ, mcframe.commonMA.meta.MA_META.EXP_CALC_TYP);
	public static final MCMeta exp_calc_typ_nm_META = createCommonMeta($exp_calc_typ_nm, mcframe.commonMA.meta.MA_META.EXP_CALC_TYP_NM);
	public static final MCMeta pre_alc_calc_typ_META = createCommonMeta($pre_alc_calc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_CALC_TYP);
	public static final MCMeta pre_alc_calc_typ_nm_META = createCommonMeta($pre_alc_calc_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_CALC_TYP_NM);
	public static final MCMeta alc_calc_typ_META = createCommonMeta($alc_calc_typ, mcframe.commonMA.meta.MA_META.ALC_CALC_TYP);
	public static final MCMeta alc_calc_typ_nm_META = createCommonMeta($alc_calc_typ_nm, mcframe.commonMA.meta.MA_META.ALC_CALC_TYP_NM);
	public static final MCMeta inpt_calc_flg_META = createCommonMeta($inpt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_calc_flg_META = createCommonMeta($wk_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_calc_flg_META = createCommonMeta($prov_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_calc_flg_META = createCommonMeta($xfr_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta calc_seq_grp_META = createCommonMeta($calc_seq_grp, mcframe.commonMA.meta.MA_META.CALC_SEQ_GRP);
	public static final MCMeta calc_seq_META = createCommonMeta($calc_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta runtime_wg_cd_META = createCommonMeta($runtime_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta runtime_wg_nm_META = createCommonMeta($runtime_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
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
			calc_grp_cd_META,
			calc_grp_nm_lcl_META,
			calc_grp_nm_META,
			cost_calc_typ_META,
			cost_calc_typ_nm_META,
			eval_typ_META,
			eval_typ_nm_META,
			max_mons_META,
			calc_cnt_META,
			sa_typ_META,
			sa_typ_nm_META,
			exp_calc_typ_META,
			exp_calc_typ_nm_META,
			pre_alc_calc_typ_META,
			pre_alc_calc_typ_nm_META,
			alc_calc_typ_META,
			alc_calc_typ_nm_META,
			inpt_calc_flg_META,
			wk_calc_flg_META,
			prov_calc_flg_META,
			xfr_calc_flg_META,
			xrate_cd_META,
			xrate_nm_META,
			calc_seq_grp_META,
			calc_seq_META,
			runtime_wg_cd_META,
			runtime_wg_nm_META,
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
				{$cost_calc_typ, "MAC_COST_CALC_TYP"},	// cost_calc_typ
				{$eval_typ, "MAC_EVAL_TYP"},	// eval_typ
				{$sa_typ, "MAC_SA_TYP"},	// sa_typ
				{$exp_calc_typ, "MAC_EXP_CALC_TYP"},	// exp_calc_typ
				{$pre_alc_calc_typ, "MAC_PRE_ALC_CALC_TYP"},	// pre_alc_calc_typ
				{$alc_calc_typ, "MAC_ALC_CALC_TYP"}	// alc_calc_typ
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
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm_lcl() {
		return getConstString(offset + 2, $calc_grp_nm_lcl);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm_lcl(String value) {
		setConstString(offset + 2, $calc_grp_nm_lcl, value);
	}


	/**
	 * Standard calculation group name 標準計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 3, $calc_grp_nm);
	}

	/**
	 * Standard calculation group name 標準計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 3, $calc_grp_nm, value);
	}


	/**
	 * Cost calculation type 計算区分.<p>
	 *
	 */
	public String cost_calc_typ() {
		return getConstString(offset + 4, $cost_calc_typ);
	}

	/**
	 * Cost calculation type 計算区分.<p>
	 *
	 */
	public void cost_calc_typ(String value) {
		setConstString(offset + 4, $cost_calc_typ, value);
	}


	/**
	 * Calculation type name 計算区分名.<p>
	 *
	 */
	public String cost_calc_typ_nm() {
		return getConstString(offset + 5, $cost_calc_typ_nm);
	}

	/**
	 * Calculation type name 計算区分名.<p>
	 *
	 */
	public void cost_calc_typ_nm(String value) {
		setConstString(offset + 5, $cost_calc_typ_nm, value);
	}


	/**
	 * Amount evaluation type 金額評価区分.<p>
	 *
	 */
	public String eval_typ() {
		return getConstString(offset + 6, $eval_typ);
	}

	/**
	 * Amount evaluation type 金額評価区分.<p>
	 *
	 */
	public void eval_typ(String value) {
		setConstString(offset + 6, $eval_typ, value);
	}


	/**
	 * Amount evaluation type name 金額評価区分名.<p>
	 *
	 */
	public String eval_typ_nm() {
		return getConstString(offset + 7, $eval_typ_nm);
	}

	/**
	 * Amount evaluation type name 金額評価区分名.<p>
	 *
	 */
	public void eval_typ_nm(String value) {
		setConstString(offset + 7, $eval_typ_nm, value);
	}


	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public MCNumber max_mons() {
		return getConstNumber(offset + 8, $max_mons);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(MCNumber value) {
		setConstNumber(offset + 8, $max_mons, value);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(int value) {
		setConstNumber(offset + 8, $max_mons, value);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(long value) {
		setConstNumber(offset + 8, $max_mons, value);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(float value) {
		setConstNumber(offset + 8, $max_mons, value);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(double value) {
		setConstNumber(offset + 8, $max_mons, value);
	}


	/**
	 * Calculation count 計算回数.<p>
	 *
	 */
	public MCNumber calc_cnt() {
		return getConstNumber(offset + 9, $calc_cnt);
	}

	/**
	 * Calculation count 計算回数.<p>
	 *
	 */
	public void calc_cnt(MCNumber value) {
		setConstNumber(offset + 9, $calc_cnt, value);
	}

	/**
	 * Calculation count 計算回数.<p>
	 *
	 */
	public void calc_cnt(int value) {
		setConstNumber(offset + 9, $calc_cnt, value);
	}

	/**
	 * Calculation count 計算回数.<p>
	 *
	 */
	public void calc_cnt(long value) {
		setConstNumber(offset + 9, $calc_cnt, value);
	}

	/**
	 * Calculation count 計算回数.<p>
	 *
	 */
	public void calc_cnt(float value) {
		setConstNumber(offset + 9, $calc_cnt, value);
	}

	/**
	 * Calculation count 計算回数.<p>
	 *
	 */
	public void calc_cnt(double value) {
		setConstNumber(offset + 9, $calc_cnt, value);
	}


	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public String sa_typ() {
		return getConstString(offset + 10, $sa_typ);
	}

	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public void sa_typ(String value) {
		setConstString(offset + 10, $sa_typ, value);
	}


	/**
	 * Plan/Result type name 予実区分名.<p>
	 *
	 */
	public String sa_typ_nm() {
		return getConstString(offset + 11, $sa_typ_nm);
	}

	/**
	 * Plan/Result type name 予実区分名.<p>
	 *
	 */
	public void sa_typ_nm(String value) {
		setConstString(offset + 11, $sa_typ_nm, value);
	}


	/**
	 * BOM explosion calculation type 展開計算区分.<p>
	 *
	 */
	public String exp_calc_typ() {
		return getConstString(offset + 12, $exp_calc_typ);
	}

	/**
	 * BOM explosion calculation type 展開計算区分.<p>
	 *
	 */
	public void exp_calc_typ(String value) {
		setConstString(offset + 12, $exp_calc_typ, value);
	}


	/**
	 * BOM explosion calculation type name 展開計算区分名.<p>
	 *
	 */
	public String exp_calc_typ_nm() {
		return getConstString(offset + 13, $exp_calc_typ_nm);
	}

	/**
	 * BOM explosion calculation type name 展開計算区分名.<p>
	 *
	 */
	public void exp_calc_typ_nm(String value) {
		setConstString(offset + 13, $exp_calc_typ_nm, value);
	}


	/**
	 * Departmental alloc. calculation type 一次配賦計算区分.<p>
	 *
	 */
	public String pre_alc_calc_typ() {
		return getConstString(offset + 14, $pre_alc_calc_typ);
	}

	/**
	 * Departmental alloc. calculation type 一次配賦計算区分.<p>
	 *
	 */
	public void pre_alc_calc_typ(String value) {
		setConstString(offset + 14, $pre_alc_calc_typ, value);
	}


	/**
	 * Departmental alloc. calculation type name 一次配賦計算区分名.<p>
	 *
	 */
	public String pre_alc_calc_typ_nm() {
		return getConstString(offset + 15, $pre_alc_calc_typ_nm);
	}

	/**
	 * Departmental alloc. calculation type name 一次配賦計算区分名.<p>
	 *
	 */
	public void pre_alc_calc_typ_nm(String value) {
		setConstString(offset + 15, $pre_alc_calc_typ_nm, value);
	}


	/**
	 * Allocation rate calculation type 配賦率計算区分.<p>
	 *
	 */
	public String alc_calc_typ() {
		return getConstString(offset + 16, $alc_calc_typ);
	}

	/**
	 * Allocation rate calculation type 配賦率計算区分.<p>
	 *
	 */
	public void alc_calc_typ(String value) {
		setConstString(offset + 16, $alc_calc_typ, value);
	}


	/**
	 * Allocation rate calculation type name 配賦率計算区分名.<p>
	 *
	 */
	public String alc_calc_typ_nm() {
		return getConstString(offset + 17, $alc_calc_typ_nm);
	}

	/**
	 * Allocation rate calculation type name 配賦率計算区分名.<p>
	 *
	 */
	public void alc_calc_typ_nm(String value) {
		setConstString(offset + 17, $alc_calc_typ_nm, value);
	}


	/**
	 * Input calculation 投入計算.<p>
	 *
	 */
	public boolean inpt_calc_flg() {
		return getConstBoolean(offset + 18, $inpt_calc_flg);
	}

	/**
	 * Input calculation 投入計算.<p>
	 *
	 */
	public void inpt_calc_flg(boolean value) {
		setConstBoolean(offset + 18, $inpt_calc_flg, value);
	}


	/**
	 * Man-hour calculation 工数計算.<p>
	 *
	 */
	public boolean wk_calc_flg() {
		return getConstBoolean(offset + 19, $wk_calc_flg);
	}

	/**
	 * Man-hour calculation 工数計算.<p>
	 *
	 */
	public void wk_calc_flg(boolean value) {
		setConstBoolean(offset + 19, $wk_calc_flg, value);
	}


	/**
	 * Supply calculation 支給計算.<p>
	 *
	 */
	public boolean prov_calc_flg() {
		return getConstBoolean(offset + 20, $prov_calc_flg);
	}

	/**
	 * Supply calculation 支給計算.<p>
	 *
	 */
	public void prov_calc_flg(boolean value) {
		setConstBoolean(offset + 20, $prov_calc_flg, value);
	}


	/**
	 * Movement calculation 移動計算.<p>
	 *
	 */
	public boolean xfr_calc_flg() {
		return getConstBoolean(offset + 21, $xfr_calc_flg);
	}

	/**
	 * Movement calculation 移動計算.<p>
	 *
	 */
	public void xfr_calc_flg(boolean value) {
		setConstBoolean(offset + 21, $xfr_calc_flg, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 22, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 22, $xrate_cd, value);
	}


	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 23, $xrate_nm);
	}

	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 23, $xrate_nm, value);
	}


	/**
	 * Calculation sequence G 計算順序Ｇ.<p>
	 *
	 */
	public String calc_seq_grp() {
		return getConstString(offset + 24, $calc_seq_grp);
	}

	/**
	 * Calculation sequence G 計算順序Ｇ.<p>
	 *
	 */
	public void calc_seq_grp(String value) {
		setConstString(offset + 24, $calc_seq_grp, value);
	}


	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public MCNumber calc_seq() {
		return getConstNumber(offset + 25, $calc_seq);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(MCNumber value) {
		setConstNumber(offset + 25, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(int value) {
		setConstNumber(offset + 25, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(long value) {
		setConstNumber(offset + 25, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(float value) {
		setConstNumber(offset + 25, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(double value) {
		setConstNumber(offset + 25, $calc_seq, value);
	}


	/**
	 * Execution working group cd. 実行時ワーキンググループＣＤ.<p>
	 *
	 */
	public String runtime_wg_cd() {
		return getConstString(offset + 26, $runtime_wg_cd);
	}

	/**
	 * Execution working group cd. 実行時ワーキンググループＣＤ.<p>
	 *
	 */
	public void runtime_wg_cd(String value) {
		setConstString(offset + 26, $runtime_wg_cd, value);
	}


	/**
	 * Execution working group name 実行時ワーキンググループ名.<p>
	 *
	 */
	public String runtime_wg_nm() {
		return getConstString(offset + 27, $runtime_wg_nm);
	}

	/**
	 * Execution working group name 実行時ワーキンググループ名.<p>
	 *
	 */
	public void runtime_wg_nm(String value) {
		setConstString(offset + 27, $runtime_wg_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 28, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 28, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 29, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 29, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 30, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 30, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 31, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 31, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 32, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 32, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 33, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 33, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 34, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 34, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 35, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 35, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 36, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 37, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 37, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 38, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 38, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 39, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 39, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 40, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 40, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 41, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 41, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 42, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 42, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 43, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 43, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 44, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 44, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 45, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $del_ts, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm_lcl.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($cost_calc_typ_nm.equalsIgnoreCase(name)) {
			return cost_calc_typ_nm();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($eval_typ_nm.equalsIgnoreCase(name)) {
			return eval_typ_nm();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($sa_typ_nm.equalsIgnoreCase(name)) {
			return sa_typ_nm();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($exp_calc_typ_nm.equalsIgnoreCase(name)) {
			return exp_calc_typ_nm();
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ();
		}
		if ($pre_alc_calc_typ_nm.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ_nm();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($alc_calc_typ_nm.equalsIgnoreCase(name)) {
			return alc_calc_typ_nm();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			return calc_seq_grp();
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			return runtime_wg_cd();
		}
		if ($runtime_wg_nm.equalsIgnoreCase(name)) {
			return runtime_wg_nm();
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
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			return calc_cnt();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
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
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			return inpt_calc_flg();
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			return wk_calc_flg();
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			return prov_calc_flg();
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			return xfr_calc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm_lcl.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($cost_calc_typ_nm.equalsIgnoreCase(name)) {
			return cost_calc_typ_nm();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($eval_typ_nm.equalsIgnoreCase(name)) {
			return eval_typ_nm();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($sa_typ_nm.equalsIgnoreCase(name)) {
			return sa_typ_nm();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($exp_calc_typ_nm.equalsIgnoreCase(name)) {
			return exp_calc_typ_nm();
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ();
		}
		if ($pre_alc_calc_typ_nm.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ_nm();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($alc_calc_typ_nm.equalsIgnoreCase(name)) {
			return alc_calc_typ_nm();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			return calc_seq_grp();
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			return runtime_wg_cd();
		}
		if ($runtime_wg_nm.equalsIgnoreCase(name)) {
			return runtime_wg_nm();
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
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			return calc_cnt();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
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
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			return inpt_calc_flg();
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			return wk_calc_flg();
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			return prov_calc_flg();
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			return xfr_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm_lcl.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($cost_calc_typ_nm.equalsIgnoreCase(name)) {
			cost_calc_typ_nm(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($eval_typ_nm.equalsIgnoreCase(name)) {
			eval_typ_nm(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($sa_typ_nm.equalsIgnoreCase(name)) {
			sa_typ_nm(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($exp_calc_typ_nm.equalsIgnoreCase(name)) {
			exp_calc_typ_nm(value);
			return;
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			pre_alc_calc_typ(value);
			return;
		}
		if ($pre_alc_calc_typ_nm.equalsIgnoreCase(name)) {
			pre_alc_calc_typ_nm(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($alc_calc_typ_nm.equalsIgnoreCase(name)) {
			alc_calc_typ_nm(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			calc_seq_grp(value);
			return;
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			runtime_wg_cd(value);
			return;
		}
		if ($runtime_wg_nm.equalsIgnoreCase(name)) {
			runtime_wg_nm(value);
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
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
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
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			inpt_calc_flg(value);
			return;
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			wk_calc_flg(value);
			return;
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			prov_calc_flg(value);
			return;
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			xfr_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm_lcl.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($cost_calc_typ_nm.equalsIgnoreCase(name)) {
			cost_calc_typ_nm(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($eval_typ_nm.equalsIgnoreCase(name)) {
			eval_typ_nm(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($sa_typ_nm.equalsIgnoreCase(name)) {
			sa_typ_nm(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($exp_calc_typ_nm.equalsIgnoreCase(name)) {
			exp_calc_typ_nm(value);
			return;
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			pre_alc_calc_typ(value);
			return;
		}
		if ($pre_alc_calc_typ_nm.equalsIgnoreCase(name)) {
			pre_alc_calc_typ_nm(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($alc_calc_typ_nm.equalsIgnoreCase(name)) {
			alc_calc_typ_nm(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			calc_seq_grp(value);
			return;
		}
		if ($runtime_wg_cd.equalsIgnoreCase(name)) {
			runtime_wg_cd(value);
			return;
		}
		if ($runtime_wg_nm.equalsIgnoreCase(name)) {
			runtime_wg_nm(value);
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
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
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
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			inpt_calc_flg(value);
			return;
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			wk_calc_flg(value);
			return;
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			prov_calc_flg(value);
			return;
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			xfr_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

