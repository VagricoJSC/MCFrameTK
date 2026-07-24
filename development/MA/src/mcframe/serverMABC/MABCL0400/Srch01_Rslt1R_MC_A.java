package mcframe.serverMABC.MABCL0400;

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
	 * Release リリース.<p>
	 *
	 */
	public static final String $release_flg = "release_flg";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * For sales 販売対象.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public static final String $sls_input_flg = "sls_input_flg";
	/**
	 * For mfg. 製造対象.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Mfg. configured 製造設定済.<p>
	 *
	 */
	public static final String $mfg_input_flg = "mfg_input_flg";
	/**
	 * For purchasing 購買対象.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public static final String $purc_input_flg = "purc_input_flg";
	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public static final String $purc_upri = "purc_upri";
	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public static final String $cst_upri = "cst_upri";
	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public static final String $itm_upri = "itm_upri";
	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public static final String $prov_upri = "prov_upri";
	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public static final String $proc_upri = "proc_upri";
	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public static final String $insp_flg = "insp_flg";
	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public static final String $insp_input_flg = "insp_input_flg";
	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public static final String $memo1_c = "memo1_c";
	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public static final String $memo2_c = "memo2_c";
	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public static final String $memo3_c = "memo3_c";
	/**
	 * Release PIC name cd. リリース担当者ＣＤ.<p>
	 *
	 */
	public static final String $release_usr_cd = "release_usr_cd";
	/**
	 * Release PIC name リリース担当者名.<p>
	 *
	 */
	public static final String $release_usr_nm = "release_usr_nm";
	/**
	 * Release date and time リリース日時.<p>
	 *
	 */
	public static final String $release_tm = "release_tm";
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";


	public static final MCMeta release_flg_META = createCommonMeta($release_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_input_flg_META = createCommonMeta($sls_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_input_flg_META = createCommonMeta($mfg_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_input_flg_META = createCommonMeta($purc_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_upri_META = createCommonMeta($purc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cst_upri_META = createCommonMeta($cst_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta itm_upri_META = createCommonMeta($itm_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prov_upri_META = createCommonMeta($prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta proc_upri_META = createCommonMeta($proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta insp_flg_META = createCommonMeta($insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_input_flg_META = createCommonMeta($insp_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_c_META = createCommonMeta($memo1_c, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_c_META = createCommonMeta($memo2_c, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_c_META = createCommonMeta($memo3_c, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta release_usr_cd_META = createCommonMeta($release_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta release_usr_nm_META = createCommonMeta($release_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta release_tm_META = createCommonMeta($release_tm, mcframe.commonMA.meta.MA_META.TM);
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
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			release_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			sls_flg_META,
			sls_input_flg_META,
			mfg_flg_META,
			mfg_input_flg_META,
			purc_flg_META,
			purc_input_flg_META,
			purc_upri_META,
			cst_upri_META,
			itm_upri_META,
			std_upri_META,
			prov_upri_META,
			proc_upri_META,
			insp_flg_META,
			insp_input_flg_META,
			memo1_c_META,
			memo2_c_META,
			memo3_c_META,
			release_usr_cd_META,
			release_usr_nm_META,
			release_tm_META,
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
			stk_mng_typ_META,
			asset_mng_typ_META
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
				{$itm_typ, "MAC_ITM_TYP"}	// itm_typ
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
	 * Release リリース.<p>
	 *
	 */
	public boolean release_flg() {
		return getConstBoolean(offset + 0, $release_flg);
	}

	/**
	 * Release リリース.<p>
	 *
	 */
	public void release_flg(boolean value) {
		setConstBoolean(offset + 0, $release_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 6, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 6, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 7, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 7, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 8, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 8, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 9, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 9, $itm_typ_d_nm, value);
	}


	/**
	 * For sales 販売対象.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 10, $sls_flg);
	}

	/**
	 * For sales 販売対象.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 10, $sls_flg, value);
	}


	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public boolean sls_input_flg() {
		return getConstBoolean(offset + 11, $sls_input_flg);
	}

	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public void sls_input_flg(boolean value) {
		setConstBoolean(offset + 11, $sls_input_flg, value);
	}


	/**
	 * For mfg. 製造対象.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 12, $mfg_flg);
	}

	/**
	 * For mfg. 製造対象.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 12, $mfg_flg, value);
	}


	/**
	 * Mfg. configured 製造設定済.<p>
	 *
	 */
	public boolean mfg_input_flg() {
		return getConstBoolean(offset + 13, $mfg_input_flg);
	}

	/**
	 * Mfg. configured 製造設定済.<p>
	 *
	 */
	public void mfg_input_flg(boolean value) {
		setConstBoolean(offset + 13, $mfg_input_flg, value);
	}


	/**
	 * For purchasing 購買対象.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 14, $purc_flg);
	}

	/**
	 * For purchasing 購買対象.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 14, $purc_flg, value);
	}


	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public boolean purc_input_flg() {
		return getConstBoolean(offset + 15, $purc_input_flg);
	}

	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public void purc_input_flg(boolean value) {
		setConstBoolean(offset + 15, $purc_input_flg, value);
	}


	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public MCNumber purc_upri() {
		return getConstNumber(offset + 16, $purc_upri);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(MCNumber value) {
		setConstNumber(offset + 16, $purc_upri, value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(int value) {
		setConstNumber(offset + 16, $purc_upri, value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(long value) {
		setConstNumber(offset + 16, $purc_upri, value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(float value) {
		setConstNumber(offset + 16, $purc_upri, value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void purc_upri(double value) {
		setConstNumber(offset + 16, $purc_upri, value);
	}


	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public MCNumber cst_upri() {
		return getConstNumber(offset + 17, $cst_upri);
	}

	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public void cst_upri(MCNumber value) {
		setConstNumber(offset + 17, $cst_upri, value);
	}

	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public void cst_upri(int value) {
		setConstNumber(offset + 17, $cst_upri, value);
	}

	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public void cst_upri(long value) {
		setConstNumber(offset + 17, $cst_upri, value);
	}

	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public void cst_upri(float value) {
		setConstNumber(offset + 17, $cst_upri, value);
	}

	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public void cst_upri(double value) {
		setConstNumber(offset + 17, $cst_upri, value);
	}


	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public MCNumber itm_upri() {
		return getConstNumber(offset + 18, $itm_upri);
	}

	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public void itm_upri(MCNumber value) {
		setConstNumber(offset + 18, $itm_upri, value);
	}

	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public void itm_upri(int value) {
		setConstNumber(offset + 18, $itm_upri, value);
	}

	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public void itm_upri(long value) {
		setConstNumber(offset + 18, $itm_upri, value);
	}

	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public void itm_upri(float value) {
		setConstNumber(offset + 18, $itm_upri, value);
	}

	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public void itm_upri(double value) {
		setConstNumber(offset + 18, $itm_upri, value);
	}


	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 19, $std_upri);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 19, $std_upri, value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 19, $std_upri, value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 19, $std_upri, value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 19, $std_upri, value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 19, $std_upri, value);
	}


	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public MCNumber prov_upri() {
		return getConstNumber(offset + 20, $prov_upri);
	}

	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public void prov_upri(MCNumber value) {
		setConstNumber(offset + 20, $prov_upri, value);
	}

	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public void prov_upri(int value) {
		setConstNumber(offset + 20, $prov_upri, value);
	}

	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public void prov_upri(long value) {
		setConstNumber(offset + 20, $prov_upri, value);
	}

	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public void prov_upri(float value) {
		setConstNumber(offset + 20, $prov_upri, value);
	}

	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public void prov_upri(double value) {
		setConstNumber(offset + 20, $prov_upri, value);
	}


	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public MCNumber proc_upri() {
		return getConstNumber(offset + 21, $proc_upri);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(MCNumber value) {
		setConstNumber(offset + 21, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(int value) {
		setConstNumber(offset + 21, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(long value) {
		setConstNumber(offset + 21, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(float value) {
		setConstNumber(offset + 21, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(double value) {
		setConstNumber(offset + 21, $proc_upri, value);
	}


	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public boolean insp_flg() {
		return getConstBoolean(offset + 22, $insp_flg);
	}

	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public void insp_flg(boolean value) {
		setConstBoolean(offset + 22, $insp_flg, value);
	}


	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public boolean insp_input_flg() {
		return getConstBoolean(offset + 23, $insp_input_flg);
	}

	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public void insp_input_flg(boolean value) {
		setConstBoolean(offset + 23, $insp_input_flg, value);
	}


	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public String memo1_c() {
		return getConstString(offset + 24, $memo1_c);
	}

	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public void memo1_c(String value) {
		setConstString(offset + 24, $memo1_c, value);
	}


	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public String memo2_c() {
		return getConstString(offset + 25, $memo2_c);
	}

	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public void memo2_c(String value) {
		setConstString(offset + 25, $memo2_c, value);
	}


	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public String memo3_c() {
		return getConstString(offset + 26, $memo3_c);
	}

	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public void memo3_c(String value) {
		setConstString(offset + 26, $memo3_c, value);
	}


	/**
	 * Release PIC name cd. リリース担当者ＣＤ.<p>
	 *
	 */
	public String release_usr_cd() {
		return getConstString(offset + 27, $release_usr_cd);
	}

	/**
	 * Release PIC name cd. リリース担当者ＣＤ.<p>
	 *
	 */
	public void release_usr_cd(String value) {
		setConstString(offset + 27, $release_usr_cd, value);
	}


	/**
	 * Release PIC name リリース担当者名.<p>
	 *
	 */
	public String release_usr_nm() {
		return getConstString(offset + 28, $release_usr_nm);
	}

	/**
	 * Release PIC name リリース担当者名.<p>
	 *
	 */
	public void release_usr_nm(String value) {
		setConstString(offset + 28, $release_usr_nm, value);
	}


	/**
	 * Release date and time リリース日時.<p>
	 *
	 */
	public MCDate release_tm() {
		return getConstDate(offset + 29, $release_tm);
	}

	/**
	 * Release date and time リリース日時.<p>
	 *
	 */
	public void release_tm(MCDate value) {
		setConstDate(offset + 29, $release_tm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 30, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 30, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 31, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 31, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 32, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 32, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 33, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 33, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 34, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 34, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 35, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 36, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 36, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 37, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 37, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 38, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 39, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 39, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 40, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 40, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 41, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 41, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 42, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 42, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 43, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 43, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 44, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 44, $upd_srv_req_no, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 45, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 45, $stk_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 46, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 46, $asset_mng_typ, value);
	}


	public String getString(String name) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			return memo1_c();
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			return memo2_c();
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			return memo3_c();
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			return release_usr_cd();
		}
		if ($release_usr_nm.equalsIgnoreCase(name)) {
			return release_usr_nm();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			return purc_upri();
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			return cst_upri();
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			return itm_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			return prov_upri();
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			return proc_upri();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($release_tm.equalsIgnoreCase(name)) {
			return release_tm();
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
		if ($release_flg.equalsIgnoreCase(name)) {
			return release_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			return sls_input_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			return mfg_input_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			return purc_input_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			return memo1_c();
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			return memo2_c();
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			return memo3_c();
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			return release_usr_cd();
		}
		if ($release_usr_nm.equalsIgnoreCase(name)) {
			return release_usr_nm();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			return purc_upri();
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			return cst_upri();
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			return itm_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			return prov_upri();
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			return proc_upri();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($release_tm.equalsIgnoreCase(name)) {
			return release_tm();
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
		if ($release_flg.equalsIgnoreCase(name)) {
			return release_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			return sls_input_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			return mfg_input_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			return purc_input_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			memo1_c(value);
			return;
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			memo2_c(value);
			return;
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			memo3_c(value);
			return;
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			release_usr_cd(value);
			return;
		}
		if ($release_usr_nm.equalsIgnoreCase(name)) {
			release_usr_nm(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($release_tm.equalsIgnoreCase(name)) {
			release_tm(value);
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
		if ($release_flg.equalsIgnoreCase(name)) {
			release_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			sls_input_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			mfg_input_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			purc_input_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($memo1_c.equalsIgnoreCase(name)) {
			memo1_c(value);
			return;
		}
		if ($memo2_c.equalsIgnoreCase(name)) {
			memo2_c(value);
			return;
		}
		if ($memo3_c.equalsIgnoreCase(name)) {
			memo3_c(value);
			return;
		}
		if ($release_usr_cd.equalsIgnoreCase(name)) {
			release_usr_cd(value);
			return;
		}
		if ($release_usr_nm.equalsIgnoreCase(name)) {
			release_usr_nm(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_upri.equalsIgnoreCase(name)) {
			purc_upri(value);
			return;
		}
		if ($cst_upri.equalsIgnoreCase(name)) {
			cst_upri(value);
			return;
		}
		if ($itm_upri.equalsIgnoreCase(name)) {
			itm_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($prov_upri.equalsIgnoreCase(name)) {
			prov_upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($release_tm.equalsIgnoreCase(name)) {
			release_tm(value);
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
		if ($release_flg.equalsIgnoreCase(name)) {
			release_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_input_flg.equalsIgnoreCase(name)) {
			sls_input_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($mfg_input_flg.equalsIgnoreCase(name)) {
			mfg_input_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($purc_input_flg.equalsIgnoreCase(name)) {
			purc_input_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

