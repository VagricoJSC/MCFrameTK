package mcframe.clientMSBB.MSBBP0110;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $usr_ym = "usr_ym";
	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $usr_spln_ym_fr = "usr_spln_ym_fr";
	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public static final String $usr_spln_ym_to = "usr_spln_ym_to";
	/**
	 * PIC 担当者.<p>
	 *
	 */
	public static final String $usr_usr_cd = "usr_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_usr_nm = "usr_usr_nm";
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public static final String $usr_edited_flg = "usr_edited_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $usr_intr_rmrks = "usr_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $usr_sub_char1 = "usr_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $usr_sub_char2 = "usr_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $usr_sub_char3 = "usr_sub_char3";
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $sum_ym = "sum_ym";
	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $sum_spln_ym_fr = "sum_spln_ym_fr";
	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public static final String $sum_spln_ym_to = "sum_spln_ym_to";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $sum_dpt_cd = "sum_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $sum_dpt_nm = "sum_dpt_nm";
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $sum_dpt_lvl_cd = "sum_dpt_lvl_cd";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $sum_cst_cd = "sum_cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $sum_cst_nm = "sum_cst_nm";
	public static final String $sum_wrk_no_p = "sum_wrk_no_p";
	/**
	 * Version バージョン.<p>
	 *
	 */
	public static final String $sum_spln_vers = "sum_spln_vers";
	/**
	 * Edited 編集済.<p>
	 *
	 */
	public static final String $sum_edited_flg = "sum_edited_flg";
	/**
	 * Adopt 採用.<p>
	 *
	 */
	public static final String $sum_adopted_flg = "sum_adopted_flg";
	/**
	 * Uncorrectable 訂正不可.<p>
	 *
	 */
	public static final String $sum_locked_flg = "sum_locked_flg";
	/**
	 * Uncorrectable (Before change) 訂正不可（変更前）.<p>
	 *
	 */
	public static final String $sum_old_locked_flg = "sum_old_locked_flg";
	/**
	 * Aggregation PIC cd. 集計担当者ＣＤ.<p>
	 *
	 */
	public static final String $sum_usr_cd = "sum_usr_cd";
	/**
	 * Aggregation PIC name 集計担当者名.<p>
	 *
	 */
	public static final String $sum_usr_nm = "sum_usr_nm";
	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public static final String $sum_ref_vers = "sum_ref_vers";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $sum_intr_rmrks = "sum_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sum_sub_char1 = "sum_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sum_sub_char2 = "sum_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sum_sub_char3 = "sum_sub_char3";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";

	public static final String $sum_wrk_no = $sum_wrk_no_p + ".wrk_no";
	public static final String $sum_wrk_nm = $sum_wrk_no_p + ".wrk_nm";

	public static final MCMeta usr_ym_META = createCommonMeta($usr_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_spln_ym_fr_META = createCommonMeta($usr_spln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_spln_ym_to_META = createCommonMeta($usr_spln_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta usr_usr_cd_META = createCommonMeta($usr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_usr_nm_META = createCommonMeta($usr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_edited_flg_META = createCommonMeta($usr_edited_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_intr_rmrks_META = createCommonMeta($usr_intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_USR_INTR_RMRKS);
	public static final MCMeta usr_sub_char1_META = createCommonMeta($usr_sub_char1, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR1);
	public static final MCMeta usr_sub_char2_META = createCommonMeta($usr_sub_char2, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR2);
	public static final MCMeta usr_sub_char3_META = createCommonMeta($usr_sub_char3, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR3);
	public static final MCMeta sum_ym_META = createCommonMeta($sum_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_spln_ym_fr_META = createCommonMeta($sum_spln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_spln_ym_to_META = createCommonMeta($sum_spln_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sum_dpt_cd_META = createCommonMeta($sum_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sum_dpt_nm_META = createCommonMeta($sum_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sum_dpt_lvl_cd_META = createCommonMeta($sum_dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta sum_cst_cd_META = createCommonMeta($sum_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sum_cst_nm_META = createCommonMeta($sum_cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sum_wrk_no_p_META = createInnerRowMeta($sum_wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta sum_spln_vers_META = createCommonMeta($sum_spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta sum_edited_flg_META = createCommonMeta($sum_edited_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_adopted_flg_META = createCommonMeta($sum_adopted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_locked_flg_META = createCommonMeta($sum_locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_old_locked_flg_META = createCommonMeta($sum_old_locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum_usr_cd_META = createCommonMeta($sum_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sum_usr_nm_META = createCommonMeta($sum_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sum_ref_vers_META = createCommonMeta($sum_ref_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta sum_intr_rmrks_META = createCommonMeta($sum_intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_SUM_INTR_RMRKS);
	public static final MCMeta sum_sub_char1_META = createCommonMeta($sum_sub_char1, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR1);
	public static final MCMeta sum_sub_char2_META = createCommonMeta($sum_sub_char2, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR2);
	public static final MCMeta sum_sub_char3_META = createCommonMeta($sum_sub_char3, mcframe.commonMS.meta.MS_META.SPLN_SUM_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			usr_ym_META,
			usr_spln_ym_fr_META,
			usr_spln_ym_to_META,
			usr_usr_cd_META,
			usr_usr_nm_META,
			usr_edited_flg_META,
			usr_intr_rmrks_META,
			usr_sub_char1_META,
			usr_sub_char2_META,
			usr_sub_char3_META,
			sum_ym_META,
			sum_spln_ym_fr_META,
			sum_spln_ym_to_META,
			sum_dpt_cd_META,
			sum_dpt_nm_META,
			sum_dpt_lvl_cd_META,
			sum_cst_cd_META,
			sum_cst_nm_META,
			sum_wrk_no_p_META,
			sum_spln_vers_META,
			sum_edited_flg_META,
			sum_adopted_flg_META,
			sum_locked_flg_META,
			sum_old_locked_flg_META,
			sum_usr_cd_META,
			sum_usr_nm_META,
			sum_ref_vers_META,
			sum_intr_rmrks_META,
			sum_sub_char1_META,
			sum_sub_char2_META,
			sum_sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META
		},
		new String[][]{
			{
				"sum_wrk_no",
				"sum_wrk_nm"
			},
			{
				$sum_wrk_no,
				$sum_wrk_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$sum_usr_cd, "usr_nm"}	// sum_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sum_ref_vers, "sum_ym;sum_dpt_cd;sum_cst_cd;sum_wrk_no;sum_spln_vers"}	// sum_ref_vers
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sum_ref_vers, "ym;dpt_cd;cst_cd;wrk_no;excluded_vers"}	// sum_ref_vers
			}
		)),
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate usr_ym() {
		return getConstDate(offset + 0, $usr_ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void usr_ym(MCDate value) {
		setConstDate(offset + 0, $usr_ym, value);
	}


	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate usr_spln_ym_fr() {
		return getConstDate(offset + 1, $usr_spln_ym_fr);
	}

	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public void usr_spln_ym_fr(MCDate value) {
		setConstDate(offset + 1, $usr_spln_ym_fr, value);
	}


	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public MCDate usr_spln_ym_to() {
		return getConstDate(offset + 2, $usr_spln_ym_to);
	}

	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public void usr_spln_ym_to(MCDate value) {
		setConstDate(offset + 2, $usr_spln_ym_to, value);
	}


	/**
	 * PIC 担当者.<p>
	 *
	 */
	public String usr_usr_cd() {
		return getConstString(offset + 3, $usr_usr_cd);
	}

	/**
	 * PIC 担当者.<p>
	 *
	 */
	public void usr_usr_cd(String value) {
		setConstString(offset + 3, $usr_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_usr_nm() {
		return getConstString(offset + 4, $usr_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_usr_nm(String value) {
		setConstString(offset + 4, $usr_usr_nm, value);
	}


	/**
	 * Edited 編集済.<p>
	 *
	 */
	public boolean usr_edited_flg() {
		return getConstBoolean(offset + 5, $usr_edited_flg);
	}

	/**
	 * Edited 編集済.<p>
	 *
	 */
	public void usr_edited_flg(boolean value) {
		setConstBoolean(offset + 5, $usr_edited_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String usr_intr_rmrks() {
		return getConstString(offset + 6, $usr_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void usr_intr_rmrks(String value) {
		setConstString(offset + 6, $usr_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String usr_sub_char1() {
		return getConstString(offset + 7, $usr_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void usr_sub_char1(String value) {
		setConstString(offset + 7, $usr_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String usr_sub_char2() {
		return getConstString(offset + 8, $usr_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void usr_sub_char2(String value) {
		setConstString(offset + 8, $usr_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String usr_sub_char3() {
		return getConstString(offset + 9, $usr_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void usr_sub_char3(String value) {
		setConstString(offset + 9, $usr_sub_char3, value);
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate sum_ym() {
		return getConstDate(offset + 10, $sum_ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void sum_ym(MCDate value) {
		setConstDate(offset + 10, $sum_ym, value);
	}


	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate sum_spln_ym_fr() {
		return getConstDate(offset + 11, $sum_spln_ym_fr);
	}

	/**
	 * Sale month FROM 販売年月ＦＲＯＭ.<p>
	 *
	 */
	public void sum_spln_ym_fr(MCDate value) {
		setConstDate(offset + 11, $sum_spln_ym_fr, value);
	}


	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public MCDate sum_spln_ym_to() {
		return getConstDate(offset + 12, $sum_spln_ym_to);
	}

	/**
	 * Sale month TO 販売年月ＴＯ.<p>
	 *
	 */
	public void sum_spln_ym_to(MCDate value) {
		setConstDate(offset + 12, $sum_spln_ym_to, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String sum_dpt_cd() {
		return getConstString(offset + 13, $sum_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void sum_dpt_cd(String value) {
		setConstString(offset + 13, $sum_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String sum_dpt_nm() {
		return getConstString(offset + 14, $sum_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void sum_dpt_nm(String value) {
		setConstString(offset + 14, $sum_dpt_nm, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String sum_dpt_lvl_cd() {
		return getConstString(offset + 15, $sum_dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void sum_dpt_lvl_cd(String value) {
		setConstString(offset + 15, $sum_dpt_lvl_cd, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String sum_cst_cd() {
		return getConstString(offset + 16, $sum_cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void sum_cst_cd(String value) {
		setConstString(offset + 16, $sum_cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String sum_cst_nm() {
		return getConstString(offset + 17, $sum_cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void sum_cst_nm(String value) {
		setConstString(offset + 17, $sum_cst_nm, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR sum_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 18, $sum_wrk_no_p);
	}
	
	public void sum_wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 18, $sum_wrk_no_p, row);
	}


	/**
	 * Version バージョン.<p>
	 *
	 */
	public String sum_spln_vers() {
		return getConstString(offset + 19, $sum_spln_vers);
	}

	/**
	 * Version バージョン.<p>
	 *
	 */
	public void sum_spln_vers(String value) {
		setConstString(offset + 19, $sum_spln_vers, value);
	}


	/**
	 * Edited 編集済.<p>
	 *
	 */
	public boolean sum_edited_flg() {
		return getConstBoolean(offset + 20, $sum_edited_flg);
	}

	/**
	 * Edited 編集済.<p>
	 *
	 */
	public void sum_edited_flg(boolean value) {
		setConstBoolean(offset + 20, $sum_edited_flg, value);
	}


	/**
	 * Adopt 採用.<p>
	 *
	 */
	public boolean sum_adopted_flg() {
		return getConstBoolean(offset + 21, $sum_adopted_flg);
	}

	/**
	 * Adopt 採用.<p>
	 *
	 */
	public void sum_adopted_flg(boolean value) {
		setConstBoolean(offset + 21, $sum_adopted_flg, value);
	}


	/**
	 * Uncorrectable 訂正不可.<p>
	 *
	 */
	public boolean sum_locked_flg() {
		return getConstBoolean(offset + 22, $sum_locked_flg);
	}

	/**
	 * Uncorrectable 訂正不可.<p>
	 *
	 */
	public void sum_locked_flg(boolean value) {
		setConstBoolean(offset + 22, $sum_locked_flg, value);
	}


	/**
	 * Uncorrectable (Before change) 訂正不可（変更前）.<p>
	 *
	 */
	public boolean sum_old_locked_flg() {
		return getConstBoolean(offset + 23, $sum_old_locked_flg);
	}

	/**
	 * Uncorrectable (Before change) 訂正不可（変更前）.<p>
	 *
	 */
	public void sum_old_locked_flg(boolean value) {
		setConstBoolean(offset + 23, $sum_old_locked_flg, value);
	}


	/**
	 * Aggregation PIC cd. 集計担当者ＣＤ.<p>
	 *
	 */
	public String sum_usr_cd() {
		return getConstString(offset + 24, $sum_usr_cd);
	}

	/**
	 * Aggregation PIC cd. 集計担当者ＣＤ.<p>
	 *
	 */
	public void sum_usr_cd(String value) {
		setConstString(offset + 24, $sum_usr_cd, value);
	}


	/**
	 * Aggregation PIC name 集計担当者名.<p>
	 *
	 */
	public String sum_usr_nm() {
		return getConstString(offset + 25, $sum_usr_nm);
	}

	/**
	 * Aggregation PIC name 集計担当者名.<p>
	 *
	 */
	public void sum_usr_nm(String value) {
		setConstString(offset + 25, $sum_usr_nm, value);
	}


	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public String sum_ref_vers() {
		return getConstString(offset + 26, $sum_ref_vers);
	}

	/**
	 * Comparison version 比較バージョン.<p>
	 *
	 */
	public void sum_ref_vers(String value) {
		setConstString(offset + 26, $sum_ref_vers, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String sum_intr_rmrks() {
		return getConstString(offset + 27, $sum_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void sum_intr_rmrks(String value) {
		setConstString(offset + 27, $sum_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sum_sub_char1() {
		return getConstString(offset + 28, $sum_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sum_sub_char1(String value) {
		setConstString(offset + 28, $sum_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sum_sub_char2() {
		return getConstString(offset + 29, $sum_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sum_sub_char2(String value) {
		setConstString(offset + 29, $sum_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sum_sub_char3() {
		return getConstString(offset + 30, $sum_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sum_sub_char3(String value) {
		setConstString(offset + 30, $sum_sub_char3, value);
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
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 33, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 33, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 34, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 34, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 35, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 35, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 36, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 36, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 37, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 37, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 38, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 38, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 39, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 39, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 40, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 41, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 41, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 42, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			return usr_usr_cd();
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			return usr_usr_nm();
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			return usr_intr_rmrks();
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			return usr_sub_char1();
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			return usr_sub_char2();
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			return usr_sub_char3();
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			return sum_dpt_cd();
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			return sum_dpt_nm();
		}
		if ($sum_dpt_lvl_cd.equalsIgnoreCase(name)) {
			return sum_dpt_lvl_cd();
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			return sum_cst_cd();
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			return sum_cst_nm();
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			return sum_spln_vers();
		}
		if ($sum_usr_cd.equalsIgnoreCase(name)) {
			return sum_usr_cd();
		}
		if ($sum_usr_nm.equalsIgnoreCase(name)) {
			return sum_usr_nm();
		}
		if ($sum_ref_vers.equalsIgnoreCase(name)) {
			return sum_ref_vers();
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			return sum_intr_rmrks();
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			return sum_sub_char1();
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			return sum_sub_char2();
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			return sum_sub_char3();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($usr_ym.equalsIgnoreCase(name)) {
			return usr_ym();
		}
		if ($usr_spln_ym_fr.equalsIgnoreCase(name)) {
			return usr_spln_ym_fr();
		}
		if ($usr_spln_ym_to.equalsIgnoreCase(name)) {
			return usr_spln_ym_to();
		}
		if ($sum_ym.equalsIgnoreCase(name)) {
			return sum_ym();
		}
		if ($sum_spln_ym_fr.equalsIgnoreCase(name)) {
			return sum_spln_ym_fr();
		}
		if ($sum_spln_ym_to.equalsIgnoreCase(name)) {
			return sum_spln_ym_to();
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
		if ($usr_edited_flg.equalsIgnoreCase(name)) {
			return usr_edited_flg();
		}
		if ($sum_edited_flg.equalsIgnoreCase(name)) {
			return sum_edited_flg();
		}
		if ($sum_adopted_flg.equalsIgnoreCase(name)) {
			return sum_adopted_flg();
		}
		if ($sum_locked_flg.equalsIgnoreCase(name)) {
			return sum_locked_flg();
		}
		if ($sum_old_locked_flg.equalsIgnoreCase(name)) {
			return sum_old_locked_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			return usr_usr_cd();
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			return usr_usr_nm();
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			return usr_intr_rmrks();
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			return usr_sub_char1();
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			return usr_sub_char2();
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			return usr_sub_char3();
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			return sum_dpt_cd();
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			return sum_dpt_nm();
		}
		if ($sum_dpt_lvl_cd.equalsIgnoreCase(name)) {
			return sum_dpt_lvl_cd();
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			return sum_cst_cd();
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			return sum_cst_nm();
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			return sum_spln_vers();
		}
		if ($sum_usr_cd.equalsIgnoreCase(name)) {
			return sum_usr_cd();
		}
		if ($sum_usr_nm.equalsIgnoreCase(name)) {
			return sum_usr_nm();
		}
		if ($sum_ref_vers.equalsIgnoreCase(name)) {
			return sum_ref_vers();
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			return sum_intr_rmrks();
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			return sum_sub_char1();
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			return sum_sub_char2();
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			return sum_sub_char3();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($usr_ym.equalsIgnoreCase(name)) {
			return usr_ym();
		}
		if ($usr_spln_ym_fr.equalsIgnoreCase(name)) {
			return usr_spln_ym_fr();
		}
		if ($usr_spln_ym_to.equalsIgnoreCase(name)) {
			return usr_spln_ym_to();
		}
		if ($sum_ym.equalsIgnoreCase(name)) {
			return sum_ym();
		}
		if ($sum_spln_ym_fr.equalsIgnoreCase(name)) {
			return sum_spln_ym_fr();
		}
		if ($sum_spln_ym_to.equalsIgnoreCase(name)) {
			return sum_spln_ym_to();
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
		if ($usr_edited_flg.equalsIgnoreCase(name)) {
			return usr_edited_flg();
		}
		if ($sum_edited_flg.equalsIgnoreCase(name)) {
			return sum_edited_flg();
		}
		if ($sum_adopted_flg.equalsIgnoreCase(name)) {
			return sum_adopted_flg();
		}
		if ($sum_locked_flg.equalsIgnoreCase(name)) {
			return sum_locked_flg();
		}
		if ($sum_old_locked_flg.equalsIgnoreCase(name)) {
			return sum_old_locked_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			usr_usr_cd(value);
			return;
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			usr_usr_nm(value);
			return;
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			usr_intr_rmrks(value);
			return;
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			usr_sub_char1(value);
			return;
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			usr_sub_char2(value);
			return;
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			usr_sub_char3(value);
			return;
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			sum_dpt_cd(value);
			return;
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			sum_dpt_nm(value);
			return;
		}
		if ($sum_dpt_lvl_cd.equalsIgnoreCase(name)) {
			sum_dpt_lvl_cd(value);
			return;
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			sum_cst_cd(value);
			return;
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			sum_cst_nm(value);
			return;
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			sum_spln_vers(value);
			return;
		}
		if ($sum_usr_cd.equalsIgnoreCase(name)) {
			sum_usr_cd(value);
			return;
		}
		if ($sum_usr_nm.equalsIgnoreCase(name)) {
			sum_usr_nm(value);
			return;
		}
		if ($sum_ref_vers.equalsIgnoreCase(name)) {
			sum_ref_vers(value);
			return;
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			sum_intr_rmrks(value);
			return;
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			sum_sub_char1(value);
			return;
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			sum_sub_char2(value);
			return;
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			sum_sub_char3(value);
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
	public void setDate(String name, MCDate value) {
		if ($usr_ym.equalsIgnoreCase(name)) {
			usr_ym(value);
			return;
		}
		if ($usr_spln_ym_fr.equalsIgnoreCase(name)) {
			usr_spln_ym_fr(value);
			return;
		}
		if ($usr_spln_ym_to.equalsIgnoreCase(name)) {
			usr_spln_ym_to(value);
			return;
		}
		if ($sum_ym.equalsIgnoreCase(name)) {
			sum_ym(value);
			return;
		}
		if ($sum_spln_ym_fr.equalsIgnoreCase(name)) {
			sum_spln_ym_fr(value);
			return;
		}
		if ($sum_spln_ym_to.equalsIgnoreCase(name)) {
			sum_spln_ym_to(value);
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
		if ($usr_edited_flg.equalsIgnoreCase(name)) {
			usr_edited_flg(value);
			return;
		}
		if ($sum_edited_flg.equalsIgnoreCase(name)) {
			sum_edited_flg(value);
			return;
		}
		if ($sum_adopted_flg.equalsIgnoreCase(name)) {
			sum_adopted_flg(value);
			return;
		}
		if ($sum_locked_flg.equalsIgnoreCase(name)) {
			sum_locked_flg(value);
			return;
		}
		if ($sum_old_locked_flg.equalsIgnoreCase(name)) {
			sum_old_locked_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_usr_cd.equalsIgnoreCase(name)) {
			usr_usr_cd(value);
			return;
		}
		if ($usr_usr_nm.equalsIgnoreCase(name)) {
			usr_usr_nm(value);
			return;
		}
		if ($usr_intr_rmrks.equalsIgnoreCase(name)) {
			usr_intr_rmrks(value);
			return;
		}
		if ($usr_sub_char1.equalsIgnoreCase(name)) {
			usr_sub_char1(value);
			return;
		}
		if ($usr_sub_char2.equalsIgnoreCase(name)) {
			usr_sub_char2(value);
			return;
		}
		if ($usr_sub_char3.equalsIgnoreCase(name)) {
			usr_sub_char3(value);
			return;
		}
		if ($sum_dpt_cd.equalsIgnoreCase(name)) {
			sum_dpt_cd(value);
			return;
		}
		if ($sum_dpt_nm.equalsIgnoreCase(name)) {
			sum_dpt_nm(value);
			return;
		}
		if ($sum_dpt_lvl_cd.equalsIgnoreCase(name)) {
			sum_dpt_lvl_cd(value);
			return;
		}
		if ($sum_cst_cd.equalsIgnoreCase(name)) {
			sum_cst_cd(value);
			return;
		}
		if ($sum_cst_nm.equalsIgnoreCase(name)) {
			sum_cst_nm(value);
			return;
		}
		if ($sum_spln_vers.equalsIgnoreCase(name)) {
			sum_spln_vers(value);
			return;
		}
		if ($sum_usr_cd.equalsIgnoreCase(name)) {
			sum_usr_cd(value);
			return;
		}
		if ($sum_usr_nm.equalsIgnoreCase(name)) {
			sum_usr_nm(value);
			return;
		}
		if ($sum_ref_vers.equalsIgnoreCase(name)) {
			sum_ref_vers(value);
			return;
		}
		if ($sum_intr_rmrks.equalsIgnoreCase(name)) {
			sum_intr_rmrks(value);
			return;
		}
		if ($sum_sub_char1.equalsIgnoreCase(name)) {
			sum_sub_char1(value);
			return;
		}
		if ($sum_sub_char2.equalsIgnoreCase(name)) {
			sum_sub_char2(value);
			return;
		}
		if ($sum_sub_char3.equalsIgnoreCase(name)) {
			sum_sub_char3(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($usr_ym.equalsIgnoreCase(name)) {
			usr_ym(value);
			return;
		}
		if ($usr_spln_ym_fr.equalsIgnoreCase(name)) {
			usr_spln_ym_fr(value);
			return;
		}
		if ($usr_spln_ym_to.equalsIgnoreCase(name)) {
			usr_spln_ym_to(value);
			return;
		}
		if ($sum_ym.equalsIgnoreCase(name)) {
			sum_ym(value);
			return;
		}
		if ($sum_spln_ym_fr.equalsIgnoreCase(name)) {
			sum_spln_ym_fr(value);
			return;
		}
		if ($sum_spln_ym_to.equalsIgnoreCase(name)) {
			sum_spln_ym_to(value);
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
		if ($usr_edited_flg.equalsIgnoreCase(name)) {
			usr_edited_flg(value);
			return;
		}
		if ($sum_edited_flg.equalsIgnoreCase(name)) {
			sum_edited_flg(value);
			return;
		}
		if ($sum_adopted_flg.equalsIgnoreCase(name)) {
			sum_adopted_flg(value);
			return;
		}
		if ($sum_locked_flg.equalsIgnoreCase(name)) {
			sum_locked_flg(value);
			return;
		}
		if ($sum_old_locked_flg.equalsIgnoreCase(name)) {
			sum_old_locked_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sum_wrk_no_p.equalsIgnoreCase(name)) {
			return sum_wrk_no_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sum_wrk_no_p.equalsIgnoreCase(name)) {
			sum_wrk_no_p(
				((MCContainerMeta) sum_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String sum_wrk_no() {
		return sum_wrk_no_p().wrk_no();
	}

	public void sum_wrk_no(String value) {
		sum_wrk_no_p().wrk_no(value);
	}

	public String sum_wrk_nm() {
		return sum_wrk_no_p().wrk_nm();
	}

	public void sum_wrk_nm(String value) {
		sum_wrk_no_p().wrk_nm(value);
	}

}

