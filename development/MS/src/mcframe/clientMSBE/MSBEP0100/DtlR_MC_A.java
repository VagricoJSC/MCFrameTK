package mcframe.clientMSBE.MSBEP0100;

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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public static final String $trd_ptn_typ_nm = "trd_ptn_typ_nm";
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public static final String $io_act_typ_nm = "io_act_typ_nm";
	public static final String $base_unit_gr_qty_p = "base_unit_gr_qty_p";
	public static final String $base_unit_gi_qty_p = "base_unit_gi_qty_p";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
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
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	public static final String $pack_unit_gr_qty_p = "pack_unit_gr_qty_p";
	public static final String $pack_unit_gi_qty_p = "pack_unit_gi_qty_p";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	public static final String $str_ln_p = "str_ln_p";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Movement/transport destination/source location cd. 移動・移送先／元場所ＣＤ.<p>
	 *
	 */
	public static final String $xfr_loc_cd = "xfr_loc_cd";
	/**
	 * Movement/transport destination/source location name 移動・移送先／元場所名.<p>
	 *
	 */
	public static final String $xfr_loc_nm = "xfr_loc_nm";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	public static final String $par_itm_p = "par_itm_p";
	/**
	 * Parent/charged lot No. 親／負担ロットＮＯ.<p>
	 *
	 */
	public static final String $par_lot_no = "par_lot_no";
	/**
	 * Parent/charged sublot No. 親／負担サブロットＮＯ.<p>
	 *
	 */
	public static final String $par_sublot_no = "par_sublot_no";
	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public static final String $io_typ = "io_typ";
	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public static final String $io_typ_nm = "io_typ_nm";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public static final String $slip_no = "slip_no";
	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public static final String $slip_seq_no = "slip_seq_no";
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public static final String $trn_typ = "trn_typ";
	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public static final String $trn_typ_nm = "trn_typ_nm";
	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public static final String $srt_no = "srt_no";

	public static final String $base_unit_gr_qty = $base_unit_gr_qty_p + ".qty";
	public static final String $base_unit_gi_qty = $base_unit_gi_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $pack_unit_gr_qty = $pack_unit_gr_qty_p + ".qty";
	public static final String $pack_unit_gi_qty = $pack_unit_gi_qty_p + ".qty";
	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_ptn_typ_nm_META = createCommonMeta($trd_ptn_typ_nm, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP_NM);
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta io_act_typ_nm_META = createCommonMeta($io_act_typ_nm, mcframe.commonMS.meta.MS_META.IO_ACT_TYP_NM);
	public static final MCMeta base_unit_gr_qty_p_META = createInnerRowMeta($base_unit_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_gi_qty_p_META = createInnerRowMeta($base_unit_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_gr_qty_p_META = createInnerRowMeta($pack_unit_gr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_unit_gi_qty_p_META = createInnerRowMeta($pack_unit_gi_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_p_META = createInnerRowMeta($str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta xfr_loc_cd_META = createCommonMeta($xfr_loc_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta xfr_loc_nm_META = createCommonMeta($xfr_loc_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta par_lot_no_META = createCommonMeta($par_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_sublot_no_META = createCommonMeta($par_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta io_typ_META = createCommonMeta($io_typ, mcframe.commonMS.meta.MS_META.IO_TYP);
	public static final MCMeta io_typ_nm_META = createCommonMeta($io_typ_nm, mcframe.commonMS.meta.MS_META.IO_TYP_NM);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slip_no_META = createCommonMeta($slip_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta slip_seq_no_META = createCommonMeta($slip_seq_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta trn_typ_META = createCommonMeta($trn_typ, mcframe.commonMS.meta.MS_META.TRN_TYP);
	public static final MCMeta trn_typ_nm_META = createCommonMeta($trn_typ_nm, mcframe.commonMS.meta.MS_META.TRN_TYP_NM);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta srt_no_META = createCommonMeta($srt_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			act_dt_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			trd_ptn_typ_nm_META,
			io_act_typ_META,
			io_act_typ_nm_META,
			base_unit_gr_qty_p_META,
			base_unit_gi_qty_p_META,
			base_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			pack_unit_gr_qty_p_META,
			pack_unit_gi_qty_p_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_p_META,
			dlv_cd_META,
			dlv_nm_META,
			tdlv_cd_META,
			tdlv_nm_META,
			cst_cd_META,
			cst_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			xfr_loc_cd_META,
			xfr_loc_nm_META,
			sno_wrk_no_p_META,
			sublot_no_META,
			par_itm_p_META,
			par_lot_no_META,
			par_sublot_no_META,
			rsn_cd_META,
			rsn_nm_META,
			ac_dt_META,
			io_typ_META,
			io_typ_nm_META,
			mfg_inst_no_META,
			slo_no_META,
			po_no_META,
			slip_no_META,
			slip_seq_no_META,
			trn_typ_META,
			trn_typ_nm_META,
			act_no_META,
			act_d_no_META,
			srt_no_META
		},
		new String[][]{
			{
				"base_unit_gr_qty",
				"base_unit_gi_qty",
				"base_unit_qty",
				"pack_unit_gr_qty",
				"pack_unit_gi_qty",
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm"
			},
			{
				$base_unit_gr_qty,
				$base_unit_gi_qty,
				$base_unit_qty,
				$pack_unit_gr_qty,
				$pack_unit_gi_qty,
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm
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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 1, $act_dt);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 1, $act_dt, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 2, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 2, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 3, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 3, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 4, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 4, $trd_ptn_typ, value);
	}


	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public String trd_ptn_typ_nm() {
		return getConstString(offset + 5, $trd_ptn_typ_nm);
	}

	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public void trd_ptn_typ_nm(String value) {
		setConstString(offset + 5, $trd_ptn_typ_nm, value);
	}


	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 6, $io_act_typ);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 6, $io_act_typ, value);
	}


	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public String io_act_typ_nm() {
		return getConstString(offset + 7, $io_act_typ_nm);
	}

	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public void io_act_typ_nm(String value) {
		setConstString(offset + 7, $io_act_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 8, $base_unit_gr_qty_p);
	}
	
	public void base_unit_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 8, $base_unit_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 9, $base_unit_gi_qty_p);
	}
	
	public void base_unit_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 9, $base_unit_gi_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $base_unit_qty_p, row);
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
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 13, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 13, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_unit_gr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 14, $pack_unit_gr_qty_p);
	}
	
	public void pack_unit_gr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 14, $pack_unit_gr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_unit_gi_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 15, $pack_unit_gi_qty_p);
	}
	
	public void pack_unit_gi_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 15, $pack_unit_gi_qty_p, row);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 16, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 16, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 17, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 17, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 18, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 18, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 18, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 18, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 18, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 18, $pack_unit_dec_place, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 19, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 19, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 20, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 20, $loc_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 21, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 21, $str_ln_p, row);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 22, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 22, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 23, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 23, $dlv_nm, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 24, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 24, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 25, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 25, $tdlv_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 26, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 26, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 27, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 27, $cst_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 28, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 28, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 29, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 29, $sppl_nm, value);
	}


	/**
	 * Movement/transport destination/source location cd. 移動・移送先／元場所ＣＤ.<p>
	 *
	 */
	public String xfr_loc_cd() {
		return getConstString(offset + 30, $xfr_loc_cd);
	}

	/**
	 * Movement/transport destination/source location cd. 移動・移送先／元場所ＣＤ.<p>
	 *
	 */
	public void xfr_loc_cd(String value) {
		setConstString(offset + 30, $xfr_loc_cd, value);
	}


	/**
	 * Movement/transport destination/source location name 移動・移送先／元場所名.<p>
	 *
	 */
	public String xfr_loc_nm() {
		return getConstString(offset + 31, $xfr_loc_nm);
	}

	/**
	 * Movement/transport destination/source location name 移動・移送先／元場所名.<p>
	 *
	 */
	public void xfr_loc_nm(String value) {
		setConstString(offset + 31, $xfr_loc_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 32, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 32, $sno_wrk_no_p, row);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 33, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 33, $sublot_no, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 34, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 34, $par_itm_p, row);
	}


	/**
	 * Parent/charged lot No. 親／負担ロットＮＯ.<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 35, $par_lot_no);
	}

	/**
	 * Parent/charged lot No. 親／負担ロットＮＯ.<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 35, $par_lot_no, value);
	}


	/**
	 * Parent/charged sublot No. 親／負担サブロットＮＯ.<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 36, $par_sublot_no);
	}

	/**
	 * Parent/charged sublot No. 親／負担サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 36, $par_sublot_no, value);
	}


	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 37, $rsn_cd);
	}

	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 37, $rsn_cd, value);
	}


	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 38, $rsn_nm);
	}

	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 38, $rsn_nm, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 39, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 39, $ac_dt, value);
	}


	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public String io_typ() {
		return getConstString(offset + 40, $io_typ);
	}

	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public void io_typ(String value) {
		setConstString(offset + 40, $io_typ, value);
	}


	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public String io_typ_nm() {
		return getConstString(offset + 41, $io_typ_nm);
	}

	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public void io_typ_nm(String value) {
		setConstString(offset + 41, $io_typ_nm, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 42, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 42, $mfg_inst_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 43, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 43, $slo_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 44, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 44, $po_no, value);
	}


	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public String slip_no() {
		return getConstString(offset + 45, $slip_no);
	}

	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public void slip_no(String value) {
		setConstString(offset + 45, $slip_no, value);
	}


	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public MCNumber slip_seq_no() {
		return getConstNumber(offset + 46, $slip_seq_no);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(MCNumber value) {
		setConstNumber(offset + 46, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(int value) {
		setConstNumber(offset + 46, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(long value) {
		setConstNumber(offset + 46, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(float value) {
		setConstNumber(offset + 46, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(double value) {
		setConstNumber(offset + 46, $slip_seq_no, value);
	}


	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 47, $trn_typ);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 47, $trn_typ, value);
	}


	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public String trn_typ_nm() {
		return getConstString(offset + 48, $trn_typ_nm);
	}

	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public void trn_typ_nm(String value) {
		setConstString(offset + 48, $trn_typ_nm, value);
	}


	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 49, $act_no);
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 49, $act_no, value);
	}


	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 50, $act_d_no);
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 50, $act_d_no, value);
	}


	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCNumber srt_no() {
		return getConstNumber(offset + 51, $srt_no);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(MCNumber value) {
		setConstNumber(offset + 51, $srt_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(int value) {
		setConstNumber(offset + 51, $srt_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(long value) {
		setConstNumber(offset + 51, $srt_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(float value) {
		setConstNumber(offset + 51, $srt_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(double value) {
		setConstNumber(offset + 51, $srt_no, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			return io_act_typ_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($xfr_loc_cd.equalsIgnoreCase(name)) {
			return xfr_loc_cd();
		}
		if ($xfr_loc_nm.equalsIgnoreCase(name)) {
			return xfr_loc_nm();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			return io_typ_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			return trn_typ_nm();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			return srt_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			return io_act_typ_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($xfr_loc_cd.equalsIgnoreCase(name)) {
			return xfr_loc_cd();
		}
		if ($xfr_loc_nm.equalsIgnoreCase(name)) {
			return xfr_loc_nm();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			return io_typ_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			return trn_typ_nm();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			return srt_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			io_act_typ_nm(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($xfr_loc_cd.equalsIgnoreCase(name)) {
			xfr_loc_cd(value);
			return;
		}
		if ($xfr_loc_nm.equalsIgnoreCase(name)) {
			xfr_loc_nm(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
			return;
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			io_typ_nm(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			trn_typ_nm(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			io_act_typ_nm(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($xfr_loc_cd.equalsIgnoreCase(name)) {
			xfr_loc_cd(value);
			return;
		}
		if ($xfr_loc_nm.equalsIgnoreCase(name)) {
			xfr_loc_nm(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
			return;
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			io_typ_nm(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			trn_typ_nm(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($base_unit_gr_qty_p.equalsIgnoreCase(name)) {
			return base_unit_gr_qty_p();
		}
		if ($base_unit_gi_qty_p.equalsIgnoreCase(name)) {
			return base_unit_gi_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($pack_unit_gr_qty_p.equalsIgnoreCase(name)) {
			return pack_unit_gr_qty_p();
		}
		if ($pack_unit_gi_qty_p.equalsIgnoreCase(name)) {
			return pack_unit_gi_qty_p();
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($base_unit_gr_qty_p.equalsIgnoreCase(name)) {
			base_unit_gr_qty_p(
				((MCContainerMeta) base_unit_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_gi_qty_p.equalsIgnoreCase(name)) {
			base_unit_gi_qty_p(
				((MCContainerMeta) base_unit_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_unit_gr_qty_p.equalsIgnoreCase(name)) {
			pack_unit_gr_qty_p(
				((MCContainerMeta) pack_unit_gr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_unit_gi_qty_p.equalsIgnoreCase(name)) {
			pack_unit_gi_qty_p(
				((MCContainerMeta) pack_unit_gi_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			str_ln_p(
				((MCContainerMeta) str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Base unit GR qty. 基準単位入庫数量.<p>
	 *
	 */
	public MCNumber base_unit_gr_qty() {
		return base_unit_gr_qty_p().qty();
	}

	/**
	 * Base unit GR qty. 基準単位入庫数量.<p>
	 *
	 */
	public void base_unit_gr_qty(MCNumber value) {
		base_unit_gr_qty_p().qty(value);
	}

	/**
	 * Base unit GR qty. 基準単位入庫数量.<p>
	 *
	 */
	public void base_unit_gr_qty(int value) {
		base_unit_gr_qty_p().qty(value);
	}

	/**
	 * Base unit GR qty. 基準単位入庫数量.<p>
	 *
	 */
	public void base_unit_gr_qty(long value) {
		base_unit_gr_qty_p().qty(value);
	}

	/**
	 * Base unit GR qty. 基準単位入庫数量.<p>
	 *
	 */
	public void base_unit_gr_qty(float value) {
		base_unit_gr_qty_p().qty(value);
	}

	/**
	 * Base unit GR qty. 基準単位入庫数量.<p>
	 *
	 */
	public void base_unit_gr_qty(double value) {
		base_unit_gr_qty_p().qty(value);
	}

	/**
	 * Base unit GI qty. 基準単位出庫数量.<p>
	 *
	 */
	public MCNumber base_unit_gi_qty() {
		return base_unit_gi_qty_p().qty();
	}

	/**
	 * Base unit GI qty. 基準単位出庫数量.<p>
	 *
	 */
	public void base_unit_gi_qty(MCNumber value) {
		base_unit_gi_qty_p().qty(value);
	}

	/**
	 * Base unit GI qty. 基準単位出庫数量.<p>
	 *
	 */
	public void base_unit_gi_qty(int value) {
		base_unit_gi_qty_p().qty(value);
	}

	/**
	 * Base unit GI qty. 基準単位出庫数量.<p>
	 *
	 */
	public void base_unit_gi_qty(long value) {
		base_unit_gi_qty_p().qty(value);
	}

	/**
	 * Base unit GI qty. 基準単位出庫数量.<p>
	 *
	 */
	public void base_unit_gi_qty(float value) {
		base_unit_gi_qty_p().qty(value);
	}

	/**
	 * Base unit GI qty. 基準単位出庫数量.<p>
	 *
	 */
	public void base_unit_gi_qty(double value) {
		base_unit_gi_qty_p().qty(value);
	}

	/**
	 * Base unit inventory qty. 基準単位在庫数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit inventory qty. 基準単位在庫数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit inventory qty. 基準単位在庫数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit inventory qty. 基準単位在庫数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit inventory qty. 基準単位在庫数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit inventory qty. 基準単位在庫数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * SKU GR qty. 荷姿単位入庫数量.<p>
	 *
	 */
	public MCNumber pack_unit_gr_qty() {
		return pack_unit_gr_qty_p().qty();
	}

	/**
	 * SKU GR qty. 荷姿単位入庫数量.<p>
	 *
	 */
	public void pack_unit_gr_qty(MCNumber value) {
		pack_unit_gr_qty_p().qty(value);
	}

	/**
	 * SKU GR qty. 荷姿単位入庫数量.<p>
	 *
	 */
	public void pack_unit_gr_qty(int value) {
		pack_unit_gr_qty_p().qty(value);
	}

	/**
	 * SKU GR qty. 荷姿単位入庫数量.<p>
	 *
	 */
	public void pack_unit_gr_qty(long value) {
		pack_unit_gr_qty_p().qty(value);
	}

	/**
	 * SKU GR qty. 荷姿単位入庫数量.<p>
	 *
	 */
	public void pack_unit_gr_qty(float value) {
		pack_unit_gr_qty_p().qty(value);
	}

	/**
	 * SKU GR qty. 荷姿単位入庫数量.<p>
	 *
	 */
	public void pack_unit_gr_qty(double value) {
		pack_unit_gr_qty_p().qty(value);
	}

	/**
	 * SKU GI qty. 荷姿単位出庫数量.<p>
	 *
	 */
	public MCNumber pack_unit_gi_qty() {
		return pack_unit_gi_qty_p().qty();
	}

	/**
	 * SKU GI qty. 荷姿単位出庫数量.<p>
	 *
	 */
	public void pack_unit_gi_qty(MCNumber value) {
		pack_unit_gi_qty_p().qty(value);
	}

	/**
	 * SKU GI qty. 荷姿単位出庫数量.<p>
	 *
	 */
	public void pack_unit_gi_qty(int value) {
		pack_unit_gi_qty_p().qty(value);
	}

	/**
	 * SKU GI qty. 荷姿単位出庫数量.<p>
	 *
	 */
	public void pack_unit_gi_qty(long value) {
		pack_unit_gi_qty_p().qty(value);
	}

	/**
	 * SKU GI qty. 荷姿単位出庫数量.<p>
	 *
	 */
	public void pack_unit_gi_qty(float value) {
		pack_unit_gi_qty_p().qty(value);
	}

	/**
	 * SKU GI qty. 荷姿単位出庫数量.<p>
	 *
	 */
	public void pack_unit_gi_qty(double value) {
		pack_unit_gi_qty_p().qty(value);
	}

	public String str_ln_cd() {
		return str_ln_p().str_ln_cd();
	}

	public void str_ln_cd(String value) {
		str_ln_p().str_ln_cd(value);
	}

	public String str_ln_nm() {
		return str_ln_p().str_ln_nm();
	}

	public void str_ln_nm(String value) {
		str_ln_p().str_ln_nm(value);
	}

	public boolean str_ln_cd_none_flg() {
		return str_ln_p().str_ln_cd_none_flg();
	}

	public void str_ln_cd_none_flg(boolean value) {
		str_ln_p().str_ln_cd_none_flg(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Parent/charged item cd. 親／負担品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent/charged item cd. 親／負担品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent/charged branch No. 1 親／負担枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent/charged branch No. 1 親／負担枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent/charged branch No. 2 親／負担枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent/charged branch No. 2 親／負担枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent/charged branch No. 3 親／負担枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent/charged branch No. 3 親／負担枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent/charged lot name 親／負担品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent/charged lot name 親／負担品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

}

