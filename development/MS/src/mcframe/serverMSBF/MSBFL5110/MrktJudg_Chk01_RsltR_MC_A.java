package mcframe.serverMSBF.MSBFL5110;

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
 * ブロック"MrktJudg_Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MrktJudg_Chk01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * From market release decision screen flg. 市場出荷判定画面からＦＬＧ.<p>
	 *
	 */
	public static final String $fromScrFlg = "fromScrFlg";
	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public static final String $mrkt_judg_no = "mrkt_judg_no";
	/**
	 * Shipping approval result type from mfg. site 製造所出荷承認結果区分.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ = "mfg_so_aprv_typ";
	/**
	 * Inspection management result type 品質管理結果区分.<p>
	 *
	 */
	public static final String $quality_mng_typ = "quality_mng_typ";
	/**
	 * Mfg. management result type 製造管理結果区分.<p>
	 *
	 */
	public static final String $mfg_mng_typ = "mfg_mng_typ";
	/**
	 * Deviation type 逸脱区分.<p>
	 *
	 */
	public static final String $deviant_typ = "deviant_typ";
	/**
	 * Deviation measure type 逸脱措置区分.<p>
	 *
	 */
	public static final String $deviant_msr_typ = "deviant_msr_typ";
	/**
	 * Product quality info. type 製品品質情報区分.<p>
	 *
	 */
	public static final String $prod_itm_info_typ = "prod_itm_info_typ";
	/**
	 * Raw material quality info. type 原材料品質情報区分.<p>
	 *
	 */
	public static final String $chd_itm_info_typ = "chd_itm_info_typ";
	/**
	 * Update date 更新日.<p>
	 *
	 */
	public static final String $upd_dt = "upd_dt";
	/**
	 * Updater cd. 更新者ＣＤ.<p>
	 *
	 */
	public static final String $upd_usr_cd = "upd_usr_cd";
	/**
	 * Update dept. cd. 更新部門ＣＤ.<p>
	 *
	 */
	public static final String $upd_dpt_cd = "upd_dpt_cd";
	/**
	 * Item 品目.<p>
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Do not allow source cancel flg. 作成元取消不可ＦＬＧ.<p>
	 *
	 */
	public static final String $no_del_flg = "no_del_flg";
	/**
	 * Add flg. 追加ＦＬＧ.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";
	/**
	 * Market release decision internal remarks 市場出荷判定内部備考.<p>
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
	 * Market release decision making based type 市場出荷判定作成元区分.<p>
	 *
	 */
	public static final String $mrkt_judg_src_typ = "mrkt_judg_src_typ";
	/**
	 * Market release decision making based No. 市場出荷判定作成元ＮＯ.<p>
	 *
	 */
	public static final String $mrkt_judg_src_no = "mrkt_judg_src_no";
	/**
	 * Market release decision making based No. (For deletion) 市場出荷判定作成元ＮＯ（削除用）.<p>
	 *
	 */
	public static final String $mrkt_judg_src_no_del = "mrkt_judg_src_no_del";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public static final String $mrkt_judg_flg = "mrkt_judg_flg";
	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $no_mrkt_judg_flg = "no_mrkt_judg_flg";
	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_upd_role_cd = "mrkt_judg_upd_role_cd";
	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_role_cd = "mrkt_judg_role_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta fromScrFlg_META = createCommonMeta($fromScrFlg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_no_META = createCommonMeta($mrkt_judg_no, mcframe.commonMA.meta.MA_META.MRKT_JUDG_NO);
	public static final MCMeta mfg_so_aprv_typ_META = createCommonMeta($mfg_so_aprv_typ, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP);
	public static final MCMeta quality_mng_typ_META = createCommonMeta($quality_mng_typ, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP);
	public static final MCMeta mfg_mng_typ_META = createCommonMeta($mfg_mng_typ, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP);
	public static final MCMeta deviant_typ_META = createCommonMeta($deviant_typ, mcframe.commonMS.meta.MS_META.DEVIANT_TYP);
	public static final MCMeta deviant_msr_typ_META = createCommonMeta($deviant_msr_typ, mcframe.commonMS.meta.MS_META.DEVIANT_MSR_TYP);
	public static final MCMeta prod_itm_info_typ_META = createCommonMeta($prod_itm_info_typ, mcframe.commonMS.meta.MS_META.PROD_ITM_INFO_TYP);
	public static final MCMeta chd_itm_info_typ_META = createCommonMeta($chd_itm_info_typ, mcframe.commonMS.meta.MS_META.CHD_ITM_INFO_TYP);
	public static final MCMeta upd_dt_META = createCommonMeta($upd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_usr_cd_META = createCommonMeta($upd_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta upd_dpt_cd_META = createCommonMeta($upd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta no_del_flg_META = createCommonMeta($no_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MRKT_JUDG_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR3);
	public static final MCMeta mrkt_judg_src_typ_META = createCommonMeta($mrkt_judg_src_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SRC_TYP);
	public static final MCMeta mrkt_judg_src_no_META = createCommonMeta($mrkt_judg_src_no, mcframe.commonMA.meta.MA_META.MRKT_JUDG_SRC_NO);
	public static final MCMeta mrkt_judg_src_no_del_META = createCommonMeta($mrkt_judg_src_no_del, mcframe.commonMA.meta.MA_META.MRKT_JUDG_SRC_NO);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta mrkt_judg_flg_META = createCommonMeta($mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_mrkt_judg_flg_META = createCommonMeta($no_mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_upd_role_cd_META = createCommonMeta($mrkt_judg_upd_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mrkt_judg_role_cd_META = createCommonMeta($mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);

	protected static final ConstMetaList<MrktJudg_Chk01_RsltR> constMetas = new ConstMetaList<MrktJudg_Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			fromScrFlg_META,
			mrkt_judg_no_META,
			mfg_so_aprv_typ_META,
			quality_mng_typ_META,
			mfg_mng_typ_META,
			deviant_typ_META,
			deviant_msr_typ_META,
			prod_itm_info_typ_META,
			chd_itm_info_typ_META,
			upd_dt_META,
			upd_usr_cd_META,
			upd_dpt_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			site_cd_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			from_site_cd_META,
			loc_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			no_del_flg_META,
			add_flg_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			mrkt_judg_src_typ_META,
			mrkt_judg_src_no_META,
			mrkt_judg_src_no_del_META,
			err_flg_META,
			vld_dt_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			mrkt_judg_flg_META,
			no_mrkt_judg_flg_META,
			mrkt_judg_upd_role_cd_META,
			mrkt_judg_role_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected MrktJudg_Chk01_RsltR_MC_A(ConstMetaList<? extends MrktJudg_Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MrktJudg_Chk01_RsltR clone() {
		return (MrktJudg_Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MrktJudg_Chk01_RsltR createInstance() {
		return (MrktJudg_Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MrktJudg_Chk01_RsltR getValues(String... names) {
		return (MrktJudg_Chk01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * From market release decision screen flg. 市場出荷判定画面からＦＬＧ.<p>
	 *
	 */
	public boolean fromScrFlg() {
		return getConstBoolean(offset + 2, $fromScrFlg);
	}

	/**
	 * From market release decision screen flg. 市場出荷判定画面からＦＬＧ.<p>
	 *
	 */
	public void fromScrFlg(boolean value) {
		setConstBoolean(offset + 2, $fromScrFlg, value);
	}


	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public String mrkt_judg_no() {
		return getConstString(offset + 3, $mrkt_judg_no);
	}

	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public void mrkt_judg_no(String value) {
		setConstString(offset + 3, $mrkt_judg_no, value);
	}


	/**
	 * Shipping approval result type from mfg. site 製造所出荷承認結果区分.<p>
	 *
	 */
	public String mfg_so_aprv_typ() {
		return getConstString(offset + 4, $mfg_so_aprv_typ);
	}

	/**
	 * Shipping approval result type from mfg. site 製造所出荷承認結果区分.<p>
	 *
	 */
	public void mfg_so_aprv_typ(String value) {
		setConstString(offset + 4, $mfg_so_aprv_typ, value);
	}


	/**
	 * Inspection management result type 品質管理結果区分.<p>
	 *
	 */
	public String quality_mng_typ() {
		return getConstString(offset + 5, $quality_mng_typ);
	}

	/**
	 * Inspection management result type 品質管理結果区分.<p>
	 *
	 */
	public void quality_mng_typ(String value) {
		setConstString(offset + 5, $quality_mng_typ, value);
	}


	/**
	 * Mfg. management result type 製造管理結果区分.<p>
	 *
	 */
	public String mfg_mng_typ() {
		return getConstString(offset + 6, $mfg_mng_typ);
	}

	/**
	 * Mfg. management result type 製造管理結果区分.<p>
	 *
	 */
	public void mfg_mng_typ(String value) {
		setConstString(offset + 6, $mfg_mng_typ, value);
	}


	/**
	 * Deviation type 逸脱区分.<p>
	 *
	 */
	public String deviant_typ() {
		return getConstString(offset + 7, $deviant_typ);
	}

	/**
	 * Deviation type 逸脱区分.<p>
	 *
	 */
	public void deviant_typ(String value) {
		setConstString(offset + 7, $deviant_typ, value);
	}


	/**
	 * Deviation measure type 逸脱措置区分.<p>
	 *
	 */
	public String deviant_msr_typ() {
		return getConstString(offset + 8, $deviant_msr_typ);
	}

	/**
	 * Deviation measure type 逸脱措置区分.<p>
	 *
	 */
	public void deviant_msr_typ(String value) {
		setConstString(offset + 8, $deviant_msr_typ, value);
	}


	/**
	 * Product quality info. type 製品品質情報区分.<p>
	 *
	 */
	public String prod_itm_info_typ() {
		return getConstString(offset + 9, $prod_itm_info_typ);
	}

	/**
	 * Product quality info. type 製品品質情報区分.<p>
	 *
	 */
	public void prod_itm_info_typ(String value) {
		setConstString(offset + 9, $prod_itm_info_typ, value);
	}


	/**
	 * Raw material quality info. type 原材料品質情報区分.<p>
	 *
	 */
	public String chd_itm_info_typ() {
		return getConstString(offset + 10, $chd_itm_info_typ);
	}

	/**
	 * Raw material quality info. type 原材料品質情報区分.<p>
	 *
	 */
	public void chd_itm_info_typ(String value) {
		setConstString(offset + 10, $chd_itm_info_typ, value);
	}


	/**
	 * Update date 更新日.<p>
	 *
	 */
	public MCDate upd_dt() {
		return getConstDate(offset + 11, $upd_dt);
	}

	/**
	 * Update date 更新日.<p>
	 *
	 */
	public void upd_dt(MCDate value) {
		setConstDate(offset + 11, $upd_dt, value);
	}


	/**
	 * Updater cd. 更新者ＣＤ.<p>
	 *
	 */
	public String upd_usr_cd() {
		return getConstString(offset + 12, $upd_usr_cd);
	}

	/**
	 * Updater cd. 更新者ＣＤ.<p>
	 *
	 */
	public void upd_usr_cd(String value) {
		setConstString(offset + 12, $upd_usr_cd, value);
	}


	/**
	 * Update dept. cd. 更新部門ＣＤ.<p>
	 *
	 */
	public String upd_dpt_cd() {
		return getConstString(offset + 13, $upd_dpt_cd);
	}

	/**
	 * Update dept. cd. 更新部門ＣＤ.<p>
	 *
	 */
	public void upd_dpt_cd(String value) {
		setConstString(offset + 13, $upd_dpt_cd, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 14, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 14, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 15, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 15, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 16, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 16, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 17, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 17, $itm_sub3, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 18, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 18, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 19, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 19, $sublot_no, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 20, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 20, $site_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 21, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 21, $mfg_loc_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 22, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 22, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 23, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 23, $maker_cd, value);
	}


	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 24, $from_site_cd);
	}

	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 24, $from_site_cd, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 25, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 25, $loc_cd, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 26, $base_unit_qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 26, $base_unit_qty, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 27, $base_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 27, $base_unit_cd, value);
	}


	/**
	 * Do not allow source cancel flg. 作成元取消不可ＦＬＧ.<p>
	 *
	 */
	public boolean no_del_flg() {
		return getConstBoolean(offset + 28, $no_del_flg);
	}

	/**
	 * Do not allow source cancel flg. 作成元取消不可ＦＬＧ.<p>
	 *
	 */
	public void no_del_flg(boolean value) {
		setConstBoolean(offset + 28, $no_del_flg, value);
	}


	/**
	 * Add flg. 追加ＦＬＧ.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 29, $add_flg);
	}

	/**
	 * Add flg. 追加ＦＬＧ.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 29, $add_flg, value);
	}


	/**
	 * Market release decision internal remarks 市場出荷判定内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 30, $intr_rmrks);
	}

	/**
	 * Market release decision internal remarks 市場出荷判定内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 30, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 31, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 31, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 32, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 32, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 33, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 33, $sub_char3, value);
	}


	/**
	 * Market release decision making based type 市場出荷判定作成元区分.<p>
	 *
	 */
	public String mrkt_judg_src_typ() {
		return getConstString(offset + 34, $mrkt_judg_src_typ);
	}

	/**
	 * Market release decision making based type 市場出荷判定作成元区分.<p>
	 *
	 */
	public void mrkt_judg_src_typ(String value) {
		setConstString(offset + 34, $mrkt_judg_src_typ, value);
	}


	/**
	 * Market release decision making based No. 市場出荷判定作成元ＮＯ.<p>
	 *
	 */
	public String mrkt_judg_src_no() {
		return getConstString(offset + 35, $mrkt_judg_src_no);
	}

	/**
	 * Market release decision making based No. 市場出荷判定作成元ＮＯ.<p>
	 *
	 */
	public void mrkt_judg_src_no(String value) {
		setConstString(offset + 35, $mrkt_judg_src_no, value);
	}


	/**
	 * Market release decision making based No. (For deletion) 市場出荷判定作成元ＮＯ（削除用）.<p>
	 *
	 */
	public String mrkt_judg_src_no_del() {
		return getConstString(offset + 36, $mrkt_judg_src_no_del);
	}

	/**
	 * Market release decision making based No. (For deletion) 市場出荷判定作成元ＮＯ（削除用）.<p>
	 *
	 */
	public void mrkt_judg_src_no_del(String value) {
		setConstString(offset + 36, $mrkt_judg_src_no_del, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 37, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 37, $err_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 38, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 38, $vld_dt, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 39, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 39, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 40, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 40, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public boolean mrkt_judg_flg() {
		return getConstBoolean(offset + 41, $mrkt_judg_flg);
	}

	/**
	 * For market release decision flg. 市場出荷判定対象ＦＬＧ.<p>
	 *
	 */
	public void mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 41, $mrkt_judg_flg, value);
	}


	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public boolean no_mrkt_judg_flg() {
		return getConstBoolean(offset + 42, $no_mrkt_judg_flg);
	}

	/**
	 * Not for market release decision flg. 市場出荷判定対象外ＦＬＧ.<p>
	 *
	 */
	public void no_mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 42, $no_mrkt_judg_flg, value);
	}


	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_upd_role_cd() {
		return getConstString(offset + 43, $mrkt_judg_upd_role_cd);
	}

	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_upd_role_cd(String value) {
		setConstString(offset + 43, $mrkt_judg_upd_role_cd, value);
	}


	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_role_cd() {
		return getConstString(offset + 44, $mrkt_judg_role_cd);
	}

	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_role_cd(String value) {
		setConstString(offset + 44, $mrkt_judg_role_cd, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($upd_usr_cd.equalsIgnoreCase(name)) {
			return upd_usr_cd();
		}
		if ($upd_dpt_cd.equalsIgnoreCase(name)) {
			return upd_dpt_cd();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
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
		if ($mrkt_judg_src_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_src_typ();
		}
		if ($mrkt_judg_src_no.equalsIgnoreCase(name)) {
			return mrkt_judg_src_no();
		}
		if ($mrkt_judg_src_no_del.equalsIgnoreCase(name)) {
			return mrkt_judg_src_no_del();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_cd();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($upd_dt.equalsIgnoreCase(name)) {
			return upd_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fromScrFlg.equalsIgnoreCase(name)) {
			return fromScrFlg();
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			return no_del_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return no_mrkt_judg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($upd_usr_cd.equalsIgnoreCase(name)) {
			return upd_usr_cd();
		}
		if ($upd_dpt_cd.equalsIgnoreCase(name)) {
			return upd_dpt_cd();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
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
		if ($mrkt_judg_src_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_src_typ();
		}
		if ($mrkt_judg_src_no.equalsIgnoreCase(name)) {
			return mrkt_judg_src_no();
		}
		if ($mrkt_judg_src_no_del.equalsIgnoreCase(name)) {
			return mrkt_judg_src_no_del();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_upd_role_cd();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($upd_dt.equalsIgnoreCase(name)) {
			return upd_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fromScrFlg.equalsIgnoreCase(name)) {
			return fromScrFlg();
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			return no_del_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			return no_mrkt_judg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($upd_usr_cd.equalsIgnoreCase(name)) {
			upd_usr_cd(value);
			return;
		}
		if ($upd_dpt_cd.equalsIgnoreCase(name)) {
			upd_dpt_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
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
		if ($mrkt_judg_src_typ.equalsIgnoreCase(name)) {
			mrkt_judg_src_typ(value);
			return;
		}
		if ($mrkt_judg_src_no.equalsIgnoreCase(name)) {
			mrkt_judg_src_no(value);
			return;
		}
		if ($mrkt_judg_src_no_del.equalsIgnoreCase(name)) {
			mrkt_judg_src_no_del(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($upd_dt.equalsIgnoreCase(name)) {
			upd_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fromScrFlg.equalsIgnoreCase(name)) {
			fromScrFlg(value);
			return;
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			no_del_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			no_mrkt_judg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($upd_usr_cd.equalsIgnoreCase(name)) {
			upd_usr_cd(value);
			return;
		}
		if ($upd_dpt_cd.equalsIgnoreCase(name)) {
			upd_dpt_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
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
		if ($mrkt_judg_src_typ.equalsIgnoreCase(name)) {
			mrkt_judg_src_typ(value);
			return;
		}
		if ($mrkt_judg_src_no.equalsIgnoreCase(name)) {
			mrkt_judg_src_no(value);
			return;
		}
		if ($mrkt_judg_src_no_del.equalsIgnoreCase(name)) {
			mrkt_judg_src_no_del(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($mrkt_judg_upd_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_upd_role_cd(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($upd_dt.equalsIgnoreCase(name)) {
			upd_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fromScrFlg.equalsIgnoreCase(name)) {
			fromScrFlg(value);
			return;
		}
		if ($no_del_flg.equalsIgnoreCase(name)) {
			no_del_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($no_mrkt_judg_flg.equalsIgnoreCase(name)) {
			no_mrkt_judg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

