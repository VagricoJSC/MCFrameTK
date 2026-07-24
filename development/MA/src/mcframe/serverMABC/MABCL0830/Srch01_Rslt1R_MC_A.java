package mcframe.serverMABC.MABCL0830;

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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Additional info. key 1 付加情報キー１.<p>
	 *
	 */
	public static final String $attach_info_key1 = "attach_info_key1";
	/**
	 * Additional info. key 2 付加情報キー２.<p>
	 *
	 */
	public static final String $attach_info_key2 = "attach_info_key2";
	/**
	 * Additional info. key 3 付加情報キー３.<p>
	 *
	 */
	public static final String $attach_info_key3 = "attach_info_key3";
	/**
	 * Additional info. key 4 付加情報キー４.<p>
	 *
	 */
	public static final String $attach_info_key4 = "attach_info_key4";
	/**
	 * Additional info. key 5 付加情報キー５.<p>
	 *
	 */
	public static final String $attach_info_key5 = "attach_info_key5";
	/**
	 * Additional info. ID 付加情報ＩＤ.<p>
	 *
	 */
	public static final String $attach_info_id = "attach_info_id";
	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public static final String $attach_info_typ = "attach_info_typ";
	/**
	 * Additional info. type name 付加情報区分名.<p>
	 *
	 */
	public static final String $attach_info_typ_nm = "attach_info_typ_nm";
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public static final String $ext_sys_no_attach = "ext_sys_no_attach";
	/**
	 * Heading 見出し.<p>
	 *
	 */
	public static final String $attach_info_rmrks = "attach_info_rmrks";
	/**
	 * Path パス.<p>
	 *
	 */
	public static final String $attach_info_path = "attach_info_path";
	/**
	 * Binary data バイナリデータ.<p>
	 *
	 */
	public static final String $attach_info_bin = "attach_info_bin";
	/**
	 * Binary data name バイナリデータ名.<p>
	 *
	 */
	public static final String $attach_info_bin_nm = "attach_info_bin_nm";
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


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta attach_info_key1_META = createCommonMeta($attach_info_key1, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY1);
	public static final MCMeta attach_info_key2_META = createCommonMeta($attach_info_key2, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY2);
	public static final MCMeta attach_info_key3_META = createCommonMeta($attach_info_key3, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY3);
	public static final MCMeta attach_info_key4_META = createCommonMeta($attach_info_key4, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY4);
	public static final MCMeta attach_info_key5_META = createCommonMeta($attach_info_key5, mcframe.commonMA.meta.MA_META.ATTACH_INFO_KEY5);
	public static final MCMeta attach_info_id_META = createCommonMeta($attach_info_id, mcframe.commonMA.meta.MA_META.ATTACH_INFO_ID);
	public static final MCMeta attach_info_typ_META = createCommonMeta($attach_info_typ, mcframe.commonMA.meta.MA_META.ATTACH_INFO_TYP);
	public static final MCMeta attach_info_typ_nm_META = createCommonMeta($attach_info_typ_nm, mcframe.commonMA.meta.MA_META.ATTACH_INFO_TYP_NM);
	public static final MCMeta ext_sys_no_attach_META = createCommonMeta($ext_sys_no_attach, mcframe.commonMA.meta.MA_META.EXT_SYS_NO_ATTACH);
	public static final MCMeta attach_info_rmrks_META = createCommonMeta($attach_info_rmrks, mcframe.commonMA.meta.MA_META.ATTACH_INFO_RMRKS);
	public static final MCMeta attach_info_path_META = createCommonMeta($attach_info_path, mcframe.commonMA.meta.MA_META.ATTACH_INFO_PATH);
	public static final MCMeta attach_info_bin_META = createCommonMeta($attach_info_bin, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta attach_info_bin_nm_META = createCommonMeta($attach_info_bin_nm, mcframe.commonMA.meta.MA_META.ATTACH_INFO_BIN_NM);
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

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wg_cd_META,
			attach_info_key1_META,
			attach_info_key2_META,
			attach_info_key3_META,
			attach_info_key4_META,
			attach_info_key5_META,
			attach_info_id_META,
			attach_info_typ_META,
			attach_info_typ_nm_META,
			ext_sys_no_attach_META,
			attach_info_rmrks_META,
			attach_info_path_META,
			attach_info_bin_META,
			attach_info_bin_nm_META,
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
			upd_srv_req_no_META
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
				{$attach_info_typ, "MAC_ATTACH_INFO_TYP"}	// attach_info_typ
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 4, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 4, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 5, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 5, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 6, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 6, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 7, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 7, $sno4, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * Additional info. key 1 付加情報キー１.<p>
	 *
	 */
	public String attach_info_key1() {
		return getConstString(offset + 9, $attach_info_key1);
	}

	/**
	 * Additional info. key 1 付加情報キー１.<p>
	 *
	 */
	public void attach_info_key1(String value) {
		setConstString(offset + 9, $attach_info_key1, value);
	}


	/**
	 * Additional info. key 2 付加情報キー２.<p>
	 *
	 */
	public String attach_info_key2() {
		return getConstString(offset + 10, $attach_info_key2);
	}

	/**
	 * Additional info. key 2 付加情報キー２.<p>
	 *
	 */
	public void attach_info_key2(String value) {
		setConstString(offset + 10, $attach_info_key2, value);
	}


	/**
	 * Additional info. key 3 付加情報キー３.<p>
	 *
	 */
	public String attach_info_key3() {
		return getConstString(offset + 11, $attach_info_key3);
	}

	/**
	 * Additional info. key 3 付加情報キー３.<p>
	 *
	 */
	public void attach_info_key3(String value) {
		setConstString(offset + 11, $attach_info_key3, value);
	}


	/**
	 * Additional info. key 4 付加情報キー４.<p>
	 *
	 */
	public String attach_info_key4() {
		return getConstString(offset + 12, $attach_info_key4);
	}

	/**
	 * Additional info. key 4 付加情報キー４.<p>
	 *
	 */
	public void attach_info_key4(String value) {
		setConstString(offset + 12, $attach_info_key4, value);
	}


	/**
	 * Additional info. key 5 付加情報キー５.<p>
	 *
	 */
	public String attach_info_key5() {
		return getConstString(offset + 13, $attach_info_key5);
	}

	/**
	 * Additional info. key 5 付加情報キー５.<p>
	 *
	 */
	public void attach_info_key5(String value) {
		setConstString(offset + 13, $attach_info_key5, value);
	}


	/**
	 * Additional info. ID 付加情報ＩＤ.<p>
	 *
	 */
	public String attach_info_id() {
		return getConstString(offset + 14, $attach_info_id);
	}

	/**
	 * Additional info. ID 付加情報ＩＤ.<p>
	 *
	 */
	public void attach_info_id(String value) {
		setConstString(offset + 14, $attach_info_id, value);
	}


	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public String attach_info_typ() {
		return getConstString(offset + 15, $attach_info_typ);
	}

	/**
	 * Additional info. type 付加情報区分.<p>
	 *
	 */
	public void attach_info_typ(String value) {
		setConstString(offset + 15, $attach_info_typ, value);
	}


	/**
	 * Additional info. type name 付加情報区分名.<p>
	 *
	 */
	public String attach_info_typ_nm() {
		return getConstString(offset + 16, $attach_info_typ_nm);
	}

	/**
	 * Additional info. type name 付加情報区分名.<p>
	 *
	 */
	public void attach_info_typ_nm(String value) {
		setConstString(offset + 16, $attach_info_typ_nm, value);
	}


	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public String ext_sys_no_attach() {
		return getConstString(offset + 17, $ext_sys_no_attach);
	}

	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public void ext_sys_no_attach(String value) {
		setConstString(offset + 17, $ext_sys_no_attach, value);
	}


	/**
	 * Heading 見出し.<p>
	 *
	 */
	public String attach_info_rmrks() {
		return getConstString(offset + 18, $attach_info_rmrks);
	}

	/**
	 * Heading 見出し.<p>
	 *
	 */
	public void attach_info_rmrks(String value) {
		setConstString(offset + 18, $attach_info_rmrks, value);
	}


	/**
	 * Path パス.<p>
	 *
	 */
	public String attach_info_path() {
		return getConstString(offset + 19, $attach_info_path);
	}

	/**
	 * Path パス.<p>
	 *
	 */
	public void attach_info_path(String value) {
		setConstString(offset + 19, $attach_info_path, value);
	}


	/**
	 * Binary data バイナリデータ.<p>
	 *
	 */
	public MCBinary attach_info_bin() {
		return getConstBinary(offset + 20, $attach_info_bin);
	}

	/**
	 * Binary data バイナリデータ.<p>
	 *
	 */
	public void attach_info_bin(MCBinary value) {
		setConstBinary(offset + 20, $attach_info_bin, value);
	}


	/**
	 * Binary data name バイナリデータ名.<p>
	 *
	 */
	public String attach_info_bin_nm() {
		return getConstString(offset + 21, $attach_info_bin_nm);
	}

	/**
	 * Binary data name バイナリデータ名.<p>
	 *
	 */
	public void attach_info_bin_nm(String value) {
		setConstString(offset + 21, $attach_info_bin_nm, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 22, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 22, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 23, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 23, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 24, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 25, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 25, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 26, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 26, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 27, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 28, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 28, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 29, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 29, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 30, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 31, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 31, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 32, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 32, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 33, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 33, $upd_srv_req_no, value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			return attach_info_key1();
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			return attach_info_key2();
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			return attach_info_key3();
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			return attach_info_key4();
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			return attach_info_key5();
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			return attach_info_id();
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			return attach_info_typ();
		}
		if ($attach_info_typ_nm.equalsIgnoreCase(name)) {
			return attach_info_typ_nm();
		}
		if ($ext_sys_no_attach.equalsIgnoreCase(name)) {
			return ext_sys_no_attach();
		}
		if ($attach_info_rmrks.equalsIgnoreCase(name)) {
			return attach_info_rmrks();
		}
		if ($attach_info_path.equalsIgnoreCase(name)) {
			return attach_info_path();
		}
		if ($attach_info_bin_nm.equalsIgnoreCase(name)) {
			return attach_info_bin_nm();
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
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public MCBinary getBinary(String name) {
		if ($attach_info_bin.equalsIgnoreCase(name)) {
			return attach_info_bin();
		}
		return super.getBinary(name);
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
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			return attach_info_key1();
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			return attach_info_key2();
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			return attach_info_key3();
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			return attach_info_key4();
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			return attach_info_key5();
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			return attach_info_id();
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			return attach_info_typ();
		}
		if ($attach_info_typ_nm.equalsIgnoreCase(name)) {
			return attach_info_typ_nm();
		}
		if ($ext_sys_no_attach.equalsIgnoreCase(name)) {
			return ext_sys_no_attach();
		}
		if ($attach_info_rmrks.equalsIgnoreCase(name)) {
			return attach_info_rmrks();
		}
		if ($attach_info_path.equalsIgnoreCase(name)) {
			return attach_info_path();
		}
		if ($attach_info_bin_nm.equalsIgnoreCase(name)) {
			return attach_info_bin_nm();
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
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($attach_info_bin.equalsIgnoreCase(name)) {
			return attach_info_bin();
		}
		return super.getBinaryNE(name);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			attach_info_key1(value);
			return;
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			attach_info_key2(value);
			return;
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			attach_info_key3(value);
			return;
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			attach_info_key4(value);
			return;
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			attach_info_key5(value);
			return;
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			attach_info_id(value);
			return;
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			attach_info_typ(value);
			return;
		}
		if ($attach_info_typ_nm.equalsIgnoreCase(name)) {
			attach_info_typ_nm(value);
			return;
		}
		if ($ext_sys_no_attach.equalsIgnoreCase(name)) {
			ext_sys_no_attach(value);
			return;
		}
		if ($attach_info_rmrks.equalsIgnoreCase(name)) {
			attach_info_rmrks(value);
			return;
		}
		if ($attach_info_path.equalsIgnoreCase(name)) {
			attach_info_path(value);
			return;
		}
		if ($attach_info_bin_nm.equalsIgnoreCase(name)) {
			attach_info_bin_nm(value);
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
	public void setBinary(String name, MCBinary value) {
		if ($attach_info_bin.equalsIgnoreCase(name)) {
			attach_info_bin(value);
			return;
		}
		super.setBinary(name, value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($attach_info_key1.equalsIgnoreCase(name)) {
			attach_info_key1(value);
			return;
		}
		if ($attach_info_key2.equalsIgnoreCase(name)) {
			attach_info_key2(value);
			return;
		}
		if ($attach_info_key3.equalsIgnoreCase(name)) {
			attach_info_key3(value);
			return;
		}
		if ($attach_info_key4.equalsIgnoreCase(name)) {
			attach_info_key4(value);
			return;
		}
		if ($attach_info_key5.equalsIgnoreCase(name)) {
			attach_info_key5(value);
			return;
		}
		if ($attach_info_id.equalsIgnoreCase(name)) {
			attach_info_id(value);
			return;
		}
		if ($attach_info_typ.equalsIgnoreCase(name)) {
			attach_info_typ(value);
			return;
		}
		if ($attach_info_typ_nm.equalsIgnoreCase(name)) {
			attach_info_typ_nm(value);
			return;
		}
		if ($ext_sys_no_attach.equalsIgnoreCase(name)) {
			ext_sys_no_attach(value);
			return;
		}
		if ($attach_info_rmrks.equalsIgnoreCase(name)) {
			attach_info_rmrks(value);
			return;
		}
		if ($attach_info_path.equalsIgnoreCase(name)) {
			attach_info_path(value);
			return;
		}
		if ($attach_info_bin_nm.equalsIgnoreCase(name)) {
			attach_info_bin_nm(value);
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
	public void setBinaryNE(String name, MCBinary value) {
		if ($attach_info_bin.equalsIgnoreCase(name)) {
			attach_info_bin(value);
			return;
		}
		super.setBinaryNE(name, value);
	}



}

