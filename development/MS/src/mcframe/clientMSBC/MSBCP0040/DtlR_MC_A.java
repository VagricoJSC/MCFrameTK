package mcframe.clientMSBC.MSBCP0040;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public static final String $oper_ord_sts_typ = "oper_ord_sts_typ";
	/**
	 * Operation order status type name 工程オーダ状況区分名.<p>
	 *
	 */
	public static final String $oper_ord_sts_typ_nm = "oper_ord_sts_typ_nm";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mst_mfg_loc_cd = "mst_mfg_loc_cd";
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	public static final String $oper_schd_qty_p = "oper_schd_qty_p";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_dec_place = "base_dec_place";
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $unit_conv_rnd_typ = "unit_conv_rnd_typ";
	public static final String $oper_conv_schd_qty_p = "oper_conv_schd_qty_p";
	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	public static final String $st_tm_p = "st_tm_p";
	public static final String $end_tm_p = "end_tm_p";
	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public static final String $oper_lt = "oper_lt";
	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public static final String $oper_offst_typ = "oper_offst_typ";
	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public static final String $oper_offst_typ_nm = "oper_offst_typ_nm";
	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public static final String $oper_offst = "oper_offst";
	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public static final String $oper_rsrc = "oper_rsrc";
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
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public static final String $ext_oper_ord_no = "ext_oper_ord_no";
	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public static final String $scheduler_frozen_flg = "scheduler_frozen_flg";
	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public static final String $radd_flg = "radd_flg";

	public static final String $oper_schd_qty = $oper_schd_qty_p + ".qty";
	public static final String $oper_conv_schd_qty = $oper_conv_schd_qty_p + ".qty";
	public static final String $st_schd_dt = $st_tm_p + ".ymd";
	public static final String $st_schd_hm = $st_tm_p + ".hm";
	public static final String $end_schd_dt = $end_tm_p + ".ymd";
	public static final String $end_schd_hm = $end_tm_p + ".hm";

	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta oper_ord_sts_typ_META = createCommonMeta($oper_ord_sts_typ, mcframe.commonMS.meta.MS_META.OPER_ORD_STS_TYP);
	public static final MCMeta oper_ord_sts_typ_nm_META = createCommonMeta($oper_ord_sts_typ_nm, mcframe.commonMS.meta.MS_META.OPER_ORD_STS_TYP_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta mst_mfg_loc_cd_META = createCommonMeta($mst_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_schd_qty_p_META = createInnerRowMeta($oper_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unit_conv_rnd_typ_META = createCommonMeta($unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta oper_conv_schd_qty_p_META = createInnerRowMeta($oper_conv_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_tm_p_META = createInnerRowMeta($st_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_tm_p_META = createInnerRowMeta($end_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta oper_lt_META = createCommonMeta($oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta oper_offst_typ_META = createCommonMeta($oper_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta oper_offst_typ_nm_META = createCommonMeta($oper_offst_typ_nm, mcframe.commonMA.meta.MA_META.OFFST_TYP_NM);
	public static final MCMeta oper_offst_META = createCommonMeta($oper_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta oper_rsrc_META = createCommonMeta($oper_rsrc, mcframe.commonMA.meta.MA_META.OPER_RSRC);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.OORDER_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR3);
	public static final MCMeta ext_oper_ord_no_META = createCommonMeta($ext_oper_ord_no, mcframe.commonMA.meta.MA_META.EXT_OPER_ORD_NO);
	public static final MCMeta scheduler_frozen_flg_META = createCommonMeta($scheduler_frozen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta radd_flg_META = createCommonMeta($radd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_ord_no_META,
			oper_ord_sts_typ_META,
			oper_ord_sts_typ_nm_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			mst_mfg_loc_cd_META,
			loc_cd_META,
			loc_nm_META,
			disp_seq_META,
			oper_schd_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_dec_place_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			dec_place_META,
			unit_conv_rnd_typ_META,
			oper_conv_schd_qty_p_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			yield_oper_flg_META,
			st_tm_p_META,
			end_tm_p_META,
			oper_lt_META,
			oper_offst_typ_META,
			oper_offst_typ_nm_META,
			oper_offst_META,
			oper_rsrc_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ext_oper_ord_no_META,
			scheduler_frozen_flg_META,
			radd_flg_META
		},
		new String[][]{
			{
				"oper_schd_qty",
				"oper_conv_schd_qty",
				"st_schd_dt",
				"st_schd_hm",
				"end_schd_dt",
				"end_schd_hm"
			},
			{
				$oper_schd_qty,
				$oper_conv_schd_qty,
				$st_schd_dt,
				$st_schd_hm,
				$end_schd_dt,
				$end_schd_hm
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 0, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 0, $oper_ord_no, value);
	}


	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return getConstString(offset + 1, $oper_ord_sts_typ);
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		setConstString(offset + 1, $oper_ord_sts_typ, value);
	}


	/**
	 * Operation order status type name 工程オーダ状況区分名.<p>
	 *
	 */
	public String oper_ord_sts_typ_nm() {
		return getConstString(offset + 2, $oper_ord_sts_typ_nm);
	}

	/**
	 * Operation order status type name 工程オーダ状況区分名.<p>
	 *
	 */
	public void oper_ord_sts_typ_nm(String value) {
		setConstString(offset + 2, $oper_ord_sts_typ_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 3, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 3, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 4, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 4, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 5, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 5, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 5, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 5, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 5, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 5, $oper_seq, value);
	}


	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public String mst_mfg_loc_cd() {
		return getConstString(offset + 6, $mst_mfg_loc_cd);
	}

	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public void mst_mfg_loc_cd(String value) {
		setConstString(offset + 6, $mst_mfg_loc_cd, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 7, $loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 7, $loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 8, $loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 8, $loc_nm, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 9, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 9, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 9, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 9, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 9, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 9, $disp_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $oper_schd_qty_p);
	}
	
	public void oper_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $oper_schd_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 11, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 11, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 12, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 12, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 13, $base_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 13, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 13, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 13, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 13, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 13, $base_dec_place, value);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 14, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 14, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 14, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 14, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 14, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 14, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 15, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 15, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 15, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 15, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 15, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 15, $oper_conv_qty, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 16, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 16, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 16, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 16, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 16, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 16, $dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String unit_conv_rnd_typ() {
		return getConstString(offset + 17, $unit_conv_rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void unit_conv_rnd_typ(String value) {
		setConstString(offset + 17, $unit_conv_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_conv_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $oper_conv_schd_qty_p);
	}
	
	public void oper_conv_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $oper_conv_schd_qty_p, row);
	}


	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 19, $oper_unit_cd);
	}

	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 19, $oper_unit_cd, value);
	}


	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 20, $oper_unit_nm);
	}

	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 20, $oper_unit_nm, value);
	}


	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 21, $yield_oper_flg);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 21, $yield_oper_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 22, $st_tm_p);
	}
	
	public void st_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 22, $st_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 23, $end_tm_p);
	}
	
	public void end_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 23, $end_tm_p, row);
	}


	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 24, $oper_lt);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}

	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 24, $oper_lt, value);
	}


	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 25, $oper_offst_typ);
	}

	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 25, $oper_offst_typ, value);
	}


	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public String oper_offst_typ_nm() {
		return getConstString(offset + 26, $oper_offst_typ_nm);
	}

	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public void oper_offst_typ_nm(String value) {
		setConstString(offset + 26, $oper_offst_typ_nm, value);
	}


	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return getConstNumber(offset + 27, $oper_offst);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(int value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(long value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(float value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}

	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public void oper_offst(double value) {
		setConstNumber(offset + 27, $oper_offst, value);
	}


	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return getConstString(offset + 28, $oper_rsrc);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		setConstString(offset + 28, $oper_rsrc, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 29, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 29, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 30, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 30, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 31, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 31, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 32, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 32, $sub_char3, value);
	}


	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public String ext_oper_ord_no() {
		return getConstString(offset + 33, $ext_oper_ord_no);
	}

	/**
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public void ext_oper_ord_no(String value) {
		setConstString(offset + 33, $ext_oper_ord_no, value);
	}


	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public boolean scheduler_frozen_flg() {
		return getConstBoolean(offset + 34, $scheduler_frozen_flg);
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public void scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 34, $scheduler_frozen_flg, value);
	}


	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public boolean radd_flg() {
		return getConstBoolean(offset + 35, $radd_flg);
	}

	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public void radd_flg(boolean value) {
		setConstBoolean(offset + 35, $radd_flg, value);
	}


	public String getString(String name) {
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ();
		}
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			return mst_mfg_loc_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			return oper_offst_typ_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
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
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			return ext_oper_ord_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
		}
		if ($radd_flg.equalsIgnoreCase(name)) {
			return radd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ();
		}
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			return mst_mfg_loc_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unit_conv_rnd_typ();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			return oper_offst_typ_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
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
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			return ext_oper_ord_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
		}
		if ($radd_flg.equalsIgnoreCase(name)) {
			return radd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			oper_ord_sts_typ(value);
			return;
		}
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_ord_sts_typ_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			mst_mfg_loc_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			oper_offst_typ_nm(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
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
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			ext_oper_ord_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		if ($radd_flg.equalsIgnoreCase(name)) {
			radd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			oper_ord_sts_typ(value);
			return;
		}
		if ($oper_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_ord_sts_typ_nm(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($mst_mfg_loc_cd.equalsIgnoreCase(name)) {
			mst_mfg_loc_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			oper_offst_typ_nm(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
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
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			ext_oper_ord_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		if ($radd_flg.equalsIgnoreCase(name)) {
			radd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($oper_schd_qty_p.equalsIgnoreCase(name)) {
			return oper_schd_qty_p();
		}
		if ($oper_conv_schd_qty_p.equalsIgnoreCase(name)) {
			return oper_conv_schd_qty_p();
		}
		if ($st_tm_p.equalsIgnoreCase(name)) {
			return st_tm_p();
		}
		if ($end_tm_p.equalsIgnoreCase(name)) {
			return end_tm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($oper_schd_qty_p.equalsIgnoreCase(name)) {
			oper_schd_qty_p(
				((MCContainerMeta) oper_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_conv_schd_qty_p.equalsIgnoreCase(name)) {
			oper_conv_schd_qty_p(
				((MCContainerMeta) oper_conv_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($st_tm_p.equalsIgnoreCase(name)) {
			st_tm_p(
				((MCContainerMeta) st_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_tm_p.equalsIgnoreCase(name)) {
			end_tm_p(
				((MCContainerMeta) end_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public MCNumber oper_schd_qty() {
		return oper_schd_qty_p().qty();
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(MCNumber value) {
		oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(int value) {
		oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(long value) {
		oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(float value) {
		oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation order scheduled qty. 工程指図予定数量.<p>
	 *
	 */
	public void oper_schd_qty(double value) {
		oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_schd_qty() {
		return oper_conv_schd_qty_p().qty();
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_conv_schd_qty(MCNumber value) {
		oper_conv_schd_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_conv_schd_qty(int value) {
		oper_conv_schd_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_conv_schd_qty(long value) {
		oper_conv_schd_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_conv_schd_qty(float value) {
		oper_conv_schd_qty_p().qty(value);
	}

	/**
	 * Operation management unit qty. 工程管理単位数量.<p>
	 *
	 */
	public void oper_conv_schd_qty(double value) {
		oper_conv_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return st_tm_p().ymd();
	}

	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		st_tm_p().ymd(value);
	}

	/**
	 * Scheduled operation start time 工程着手予定時刻.<p>
	 *
	 */
	public MCDate st_schd_hm() {
		return st_tm_p().hm();
	}

	/**
	 * Scheduled operation start time 工程着手予定時刻.<p>
	 *
	 */
	public void st_schd_hm(MCDate value) {
		st_tm_p().hm(value);
	}

	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return end_tm_p().ymd();
	}

	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		end_tm_p().ymd(value);
	}

	/**
	 * Scheduled operation end time 工程終了予定時刻.<p>
	 *
	 */
	public MCDate end_schd_hm() {
		return end_tm_p().hm();
	}

	/**
	 * Scheduled operation end time 工程終了予定時刻.<p>
	 *
	 */
	public void end_schd_hm(MCDate value) {
		end_tm_p().hm(value);
	}

}

