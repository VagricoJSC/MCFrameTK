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
 * ブロック"Csv"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CsvR_MC_A extends MCConstRow {

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $spln_itm_cd = "spln_itm_cd";
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public static final String $spln_itm_nm = "spln_itm_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Enter 入力.<p>
	 *
	 */
	public static final String $inpt_str = "inpt_str";
	/**
	 * Details type 明細区分.<p>
	 *
	 */
	public static final String $spln_set_typ = "spln_set_typ";
	/**
	 * Details 明細.<p>
	 *
	 */
	public static final String $spln_set_typ_nm = "spln_set_typ_nm";
	/**
	 * Start month 開始年月.<p>
	 *
	 */
	public static final String $spln_ym_st = "spln_ym_st";
	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public static final String $qty01 = "qty01";
	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public static final String $qty02 = "qty02";
	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public static final String $qty03 = "qty03";
	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public static final String $qty04 = "qty04";
	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public static final String $qty05 = "qty05";
	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public static final String $qty06 = "qty06";
	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public static final String $qty07 = "qty07";
	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public static final String $qty08 = "qty08";
	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public static final String $qty09 = "qty09";
	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public static final String $qty10 = "qty10";
	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public static final String $qty11 = "qty11";
	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public static final String $qty12 = "qty12";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Version バージョン.<p>
	 *
	 */
	public static final String $spln_vers = "spln_vers";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta grp_peg_no_META = createCommonMeta($grp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta spln_itm_cd_META = createCommonMeta($spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta spln_itm_nm_META = createCommonMeta($spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta inpt_str_META = createStringMeta($inpt_str);
	public static final MCMeta spln_set_typ_META = createCommonMeta($spln_set_typ, mcframe.commonMA.meta.MA_META.SPLN_SET_TYP);
	public static final MCMeta spln_set_typ_nm_META = createCommonMeta($spln_set_typ_nm, mcframe.commonMA.meta.MA_META.SPLN_SET_TYP_NM);
	public static final MCMeta spln_ym_st_META = createCommonMeta($spln_ym_st, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta qty01_META = createCommonMeta($qty01, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty02_META = createCommonMeta($qty02, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty03_META = createCommonMeta($qty03, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty04_META = createCommonMeta($qty04, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty05_META = createCommonMeta($qty05, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty06_META = createCommonMeta($qty06, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty07_META = createCommonMeta($qty07, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty08_META = createCommonMeta($qty08, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty09_META = createCommonMeta($qty09, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty10_META = createCommonMeta($qty10, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty11_META = createCommonMeta($qty11, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta qty12_META = createCommonMeta($qty12, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_vers_META = createCommonMeta($spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SPLN_USR_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SPLN_USR_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<CsvR> constMetas = new ConstMetaList<CsvR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			grp_peg_no_META,
			dpt_cd_META,
			dpt_nm_META,
			cst_cd_META,
			cst_nm_META,
			wrk_no_META,
			wrk_nm_META,
			spln_itm_cd_META,
			spln_itm_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			inpt_str_META,
			spln_set_typ_META,
			spln_set_typ_nm_META,
			spln_ym_st_META,
			qty01_META,
			qty02_META,
			qty03_META,
			qty04_META,
			qty05_META,
			qty06_META,
			qty07_META,
			qty08_META,
			qty09_META,
			qty10_META,
			qty11_META,
			qty12_META,
			cur_cd_META,
			cur_nm_META,
			unit_cd_META,
			unit_nm_META,
			usr_cd_META,
			usr_nm_META,
			ym_META,
			spln_vers_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
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
				{$wrk_no, "WRK"},	// wrk_no
				{$wrk_nm, "WRK"}	// wrk_nm
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
	protected CsvR_MC_A(ConstMetaList<? extends CsvR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CsvR clone() {
		return (CsvR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CsvR createInstance() {
		return (CsvR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CsvR getValues(String... names) {
		return (CsvR) super.getValues(names);
	}



	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 0, $grp_peg_no);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(double value) {
		setConstNumber(offset + 0, $grp_peg_no, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 1, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 1, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 2, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 2, $dpt_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 3, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 3, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 4, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 4, $cst_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 5, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 5, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 6, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 6, $wrk_nm, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String spln_itm_cd() {
		return getConstString(offset + 7, $spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void spln_itm_cd(String value) {
		setConstString(offset + 7, $spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public String spln_itm_nm() {
		return getConstString(offset + 8, $spln_itm_nm);
	}

	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public void spln_itm_nm(String value) {
		setConstString(offset + 8, $spln_itm_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 9, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 9, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 10, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 10, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 11, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 11, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 12, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 12, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 13, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 13, $itm_nm, value);
	}


	/**
	 * Enter 入力.<p>
	 *
	 */
	public String inpt_str() {
		return getConstString(offset + 14, $inpt_str);
	}

	/**
	 * Enter 入力.<p>
	 *
	 */
	public void inpt_str(String value) {
		setConstString(offset + 14, $inpt_str, value);
	}


	/**
	 * Details type 明細区分.<p>
	 *
	 */
	public String spln_set_typ() {
		return getConstString(offset + 15, $spln_set_typ);
	}

	/**
	 * Details type 明細区分.<p>
	 *
	 */
	public void spln_set_typ(String value) {
		setConstString(offset + 15, $spln_set_typ, value);
	}


	/**
	 * Details 明細.<p>
	 *
	 */
	public String spln_set_typ_nm() {
		return getConstString(offset + 16, $spln_set_typ_nm);
	}

	/**
	 * Details 明細.<p>
	 *
	 */
	public void spln_set_typ_nm(String value) {
		setConstString(offset + 16, $spln_set_typ_nm, value);
	}


	/**
	 * Start month 開始年月.<p>
	 *
	 */
	public MCDate spln_ym_st() {
		return getConstDate(offset + 17, $spln_ym_st);
	}

	/**
	 * Start month 開始年月.<p>
	 *
	 */
	public void spln_ym_st(MCDate value) {
		setConstDate(offset + 17, $spln_ym_st, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber qty01() {
		return getConstNumber(offset + 18, $qty01);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(MCNumber value) {
		setConstNumber(offset + 18, $qty01, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(int value) {
		setConstNumber(offset + 18, $qty01, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(long value) {
		setConstNumber(offset + 18, $qty01, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(float value) {
		setConstNumber(offset + 18, $qty01, value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(double value) {
		setConstNumber(offset + 18, $qty01, value);
	}


	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber qty02() {
		return getConstNumber(offset + 19, $qty02);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(MCNumber value) {
		setConstNumber(offset + 19, $qty02, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(int value) {
		setConstNumber(offset + 19, $qty02, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(long value) {
		setConstNumber(offset + 19, $qty02, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(float value) {
		setConstNumber(offset + 19, $qty02, value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(double value) {
		setConstNumber(offset + 19, $qty02, value);
	}


	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber qty03() {
		return getConstNumber(offset + 20, $qty03);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(MCNumber value) {
		setConstNumber(offset + 20, $qty03, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(int value) {
		setConstNumber(offset + 20, $qty03, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(long value) {
		setConstNumber(offset + 20, $qty03, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(float value) {
		setConstNumber(offset + 20, $qty03, value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(double value) {
		setConstNumber(offset + 20, $qty03, value);
	}


	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber qty04() {
		return getConstNumber(offset + 21, $qty04);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(MCNumber value) {
		setConstNumber(offset + 21, $qty04, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(int value) {
		setConstNumber(offset + 21, $qty04, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(long value) {
		setConstNumber(offset + 21, $qty04, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(float value) {
		setConstNumber(offset + 21, $qty04, value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(double value) {
		setConstNumber(offset + 21, $qty04, value);
	}


	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber qty05() {
		return getConstNumber(offset + 22, $qty05);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(MCNumber value) {
		setConstNumber(offset + 22, $qty05, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(int value) {
		setConstNumber(offset + 22, $qty05, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(long value) {
		setConstNumber(offset + 22, $qty05, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(float value) {
		setConstNumber(offset + 22, $qty05, value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(double value) {
		setConstNumber(offset + 22, $qty05, value);
	}


	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber qty06() {
		return getConstNumber(offset + 23, $qty06);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(MCNumber value) {
		setConstNumber(offset + 23, $qty06, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(int value) {
		setConstNumber(offset + 23, $qty06, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(long value) {
		setConstNumber(offset + 23, $qty06, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(float value) {
		setConstNumber(offset + 23, $qty06, value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(double value) {
		setConstNumber(offset + 23, $qty06, value);
	}


	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber qty07() {
		return getConstNumber(offset + 24, $qty07);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(MCNumber value) {
		setConstNumber(offset + 24, $qty07, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(int value) {
		setConstNumber(offset + 24, $qty07, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(long value) {
		setConstNumber(offset + 24, $qty07, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(float value) {
		setConstNumber(offset + 24, $qty07, value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(double value) {
		setConstNumber(offset + 24, $qty07, value);
	}


	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber qty08() {
		return getConstNumber(offset + 25, $qty08);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(MCNumber value) {
		setConstNumber(offset + 25, $qty08, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(int value) {
		setConstNumber(offset + 25, $qty08, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(long value) {
		setConstNumber(offset + 25, $qty08, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(float value) {
		setConstNumber(offset + 25, $qty08, value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(double value) {
		setConstNumber(offset + 25, $qty08, value);
	}


	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber qty09() {
		return getConstNumber(offset + 26, $qty09);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(MCNumber value) {
		setConstNumber(offset + 26, $qty09, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(int value) {
		setConstNumber(offset + 26, $qty09, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(long value) {
		setConstNumber(offset + 26, $qty09, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(float value) {
		setConstNumber(offset + 26, $qty09, value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(double value) {
		setConstNumber(offset + 26, $qty09, value);
	}


	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber qty10() {
		return getConstNumber(offset + 27, $qty10);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(MCNumber value) {
		setConstNumber(offset + 27, $qty10, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(int value) {
		setConstNumber(offset + 27, $qty10, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(long value) {
		setConstNumber(offset + 27, $qty10, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(float value) {
		setConstNumber(offset + 27, $qty10, value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(double value) {
		setConstNumber(offset + 27, $qty10, value);
	}


	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public MCNumber qty11() {
		return getConstNumber(offset + 28, $qty11);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(MCNumber value) {
		setConstNumber(offset + 28, $qty11, value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(int value) {
		setConstNumber(offset + 28, $qty11, value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(long value) {
		setConstNumber(offset + 28, $qty11, value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(float value) {
		setConstNumber(offset + 28, $qty11, value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(double value) {
		setConstNumber(offset + 28, $qty11, value);
	}


	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public MCNumber qty12() {
		return getConstNumber(offset + 29, $qty12);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(MCNumber value) {
		setConstNumber(offset + 29, $qty12, value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(int value) {
		setConstNumber(offset + 29, $qty12, value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(long value) {
		setConstNumber(offset + 29, $qty12, value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(float value) {
		setConstNumber(offset + 29, $qty12, value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(double value) {
		setConstNumber(offset + 29, $qty12, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 30, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 30, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 31, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 31, $cur_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 32, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 32, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 33, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 33, $unit_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 34, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 34, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 35, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 35, $usr_nm, value);
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 36, $ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 36, $ym, value);
	}


	/**
	 * Version バージョン.<p>
	 *
	 */
	public String spln_vers() {
		return getConstString(offset + 37, $spln_vers);
	}

	/**
	 * Version バージョン.<p>
	 *
	 */
	public void spln_vers(String value) {
		setConstString(offset + 37, $spln_vers, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 38, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 38, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 39, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 39, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 40, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 40, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 41, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 41, $sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 42, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 42, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 43, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 43, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 44, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 44, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 45, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 45, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 46, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 46, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 47, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 47, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 48, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 48, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 49, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 49, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 50, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 50, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 51, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 52, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 52, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($inpt_str.equalsIgnoreCase(name)) {
			return inpt_str();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		if ($spln_set_typ_nm.equalsIgnoreCase(name)) {
			return spln_set_typ_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($qty01.equalsIgnoreCase(name)) {
			return qty01();
		}
		if ($qty02.equalsIgnoreCase(name)) {
			return qty02();
		}
		if ($qty03.equalsIgnoreCase(name)) {
			return qty03();
		}
		if ($qty04.equalsIgnoreCase(name)) {
			return qty04();
		}
		if ($qty05.equalsIgnoreCase(name)) {
			return qty05();
		}
		if ($qty06.equalsIgnoreCase(name)) {
			return qty06();
		}
		if ($qty07.equalsIgnoreCase(name)) {
			return qty07();
		}
		if ($qty08.equalsIgnoreCase(name)) {
			return qty08();
		}
		if ($qty09.equalsIgnoreCase(name)) {
			return qty09();
		}
		if ($qty10.equalsIgnoreCase(name)) {
			return qty10();
		}
		if ($qty11.equalsIgnoreCase(name)) {
			return qty11();
		}
		if ($qty12.equalsIgnoreCase(name)) {
			return qty12();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($spln_ym_st.equalsIgnoreCase(name)) {
			return spln_ym_st();
		}
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($inpt_str.equalsIgnoreCase(name)) {
			return inpt_str();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		if ($spln_set_typ_nm.equalsIgnoreCase(name)) {
			return spln_set_typ_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
		}
		if ($qty01.equalsIgnoreCase(name)) {
			return qty01();
		}
		if ($qty02.equalsIgnoreCase(name)) {
			return qty02();
		}
		if ($qty03.equalsIgnoreCase(name)) {
			return qty03();
		}
		if ($qty04.equalsIgnoreCase(name)) {
			return qty04();
		}
		if ($qty05.equalsIgnoreCase(name)) {
			return qty05();
		}
		if ($qty06.equalsIgnoreCase(name)) {
			return qty06();
		}
		if ($qty07.equalsIgnoreCase(name)) {
			return qty07();
		}
		if ($qty08.equalsIgnoreCase(name)) {
			return qty08();
		}
		if ($qty09.equalsIgnoreCase(name)) {
			return qty09();
		}
		if ($qty10.equalsIgnoreCase(name)) {
			return qty10();
		}
		if ($qty11.equalsIgnoreCase(name)) {
			return qty11();
		}
		if ($qty12.equalsIgnoreCase(name)) {
			return qty12();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($spln_ym_st.equalsIgnoreCase(name)) {
			return spln_ym_st();
		}
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($inpt_str.equalsIgnoreCase(name)) {
			inpt_str(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		if ($spln_set_typ_nm.equalsIgnoreCase(name)) {
			spln_set_typ_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($spln_ym_st.equalsIgnoreCase(name)) {
			spln_ym_st(value);
			return;
		}
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($inpt_str.equalsIgnoreCase(name)) {
			inpt_str(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		if ($spln_set_typ_nm.equalsIgnoreCase(name)) {
			spln_set_typ_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
			return;
		}
		if ($qty01.equalsIgnoreCase(name)) {
			qty01(value);
			return;
		}
		if ($qty02.equalsIgnoreCase(name)) {
			qty02(value);
			return;
		}
		if ($qty03.equalsIgnoreCase(name)) {
			qty03(value);
			return;
		}
		if ($qty04.equalsIgnoreCase(name)) {
			qty04(value);
			return;
		}
		if ($qty05.equalsIgnoreCase(name)) {
			qty05(value);
			return;
		}
		if ($qty06.equalsIgnoreCase(name)) {
			qty06(value);
			return;
		}
		if ($qty07.equalsIgnoreCase(name)) {
			qty07(value);
			return;
		}
		if ($qty08.equalsIgnoreCase(name)) {
			qty08(value);
			return;
		}
		if ($qty09.equalsIgnoreCase(name)) {
			qty09(value);
			return;
		}
		if ($qty10.equalsIgnoreCase(name)) {
			qty10(value);
			return;
		}
		if ($qty11.equalsIgnoreCase(name)) {
			qty11(value);
			return;
		}
		if ($qty12.equalsIgnoreCase(name)) {
			qty12(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($spln_ym_st.equalsIgnoreCase(name)) {
			spln_ym_st(value);
			return;
		}
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

