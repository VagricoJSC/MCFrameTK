package mcframe.serverMSBE.MSBEL5900;

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
 * ブロック"ArrSchd_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrSchd_DtlR_MC_A extends MCConstRow {

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public static final String $peg_d_no = "peg_d_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $arr_schd = "arr_schd";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
	/**
	 * Caller subcontractor mfg. service 呼出元外注製造サービス.<p>
	 *
	 */
	public static final String $is_src_outsrc_srv_flg = "is_src_outsrc_srv_flg";
	/**
	 * Caller receipt result service 呼出元入荷実績サービス.<p>
	 *
	 */
	public static final String $is_src_arract_srv_flg = "is_src_arract_srv_flg";
	/**
	 * Caller purchase result service 呼出元仕入実績サービス.<p>
	 *
	 */
	public static final String $is_src_purcact_srv_flg = "is_src_purcact_srv_flg";
	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public static final String $no_cred_upd_flg = "no_cred_upd_flg";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	public static final String $bp_lot_upd_flg = "bp_lot_upd_flg";
	public static final String $is_src_purcdlvadjst_flg = "is_src_purcdlvadjst_flg";
	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public static final String $rem_abort_flg = "rem_abort_flg";
	/**
	 * Caller purchase invoice entry service 呼出元受領インボイス登録サービス.<p>
	 *
	 */
	public static final String $is_src_rcptivreg_srv_flg = "is_src_rcptivreg_srv_flg";

	public static final String $arr_schd_no = $arr_schd + ".arr_schd_no";
	public static final String $arr_pr_no = $arr_schd + ".arr_pr_no";
	public static final String $prms_rcpt_d_no = $arr_schd + ".prms_rcpt_d_no";
	public static final String $dlv_inst_d_no = $arr_schd + ".dlv_inst_d_no";
	public static final String $purc_act_d_no = $arr_schd + ".purc_act_d_no";
	public static final String $rcpt_iv_no = $arr_schd + ".rcpt_iv_no";
	public static final String $rcpt_iv_mng_no = $arr_schd + ".rcpt_iv_mng_no";
	public static final String $pr_sts_typ = $arr_schd + ".pr_sts_typ";
	public static final String $wg_cd = $arr_schd + ".wg_cd";
	public static final String $dlv_slip_no = $arr_schd + ".dlv_slip_no";
	public static final String $dlv_slip_mng_no = $arr_schd + ".dlv_slip_mng_no";
	public static final String $dlv_slip_mng_seq = $arr_schd + ".dlv_slip_mng_seq";
	public static final String $dlv_slip_mng_d_no = $arr_schd + ".dlv_slip_mng_d_no";
	public static final String $dlv_slip_mng_d_seq = $arr_schd + ".dlv_slip_mng_d_seq";
	public static final String $iv_no = $arr_schd + ".iv_no";
	public static final String $arr_ptn_typ = $arr_schd + ".arr_ptn_typ";
	public static final String $arr_schd_tm = $arr_schd + ".arr_schd_tm";
	public static final String $itm_cd = $arr_schd + ".itm_cd";
	public static final String $itm_sub1 = $arr_schd + ".itm_sub1";
	public static final String $itm_sub2 = $arr_schd + ".itm_sub2";
	public static final String $itm_sub3 = $arr_schd + ".itm_sub3";
	public static final String $itm_nm = $arr_schd + ".itm_nm";
	public static final String $rcpt_iv_itm_nm = $arr_schd + ".rcpt_iv_itm_nm";
	public static final String $sundry_itm_flg = $arr_schd + ".sundry_itm_flg";
	public static final String $purc_id_typ = $arr_schd + ".purc_id_typ";
	public static final String $sno1 = $arr_schd + ".sno1";
	public static final String $sno2 = $arr_schd + ".sno2";
	public static final String $sno3 = $arr_schd + ".sno3";
	public static final String $sno4 = $arr_schd + ".sno4";
	public static final String $lot_no = $arr_schd + ".lot_no";
	public static final String $sublot_no = $arr_schd + ".sublot_no";
	public static final String $ver_no = $arr_schd + ".ver_no";
	public static final String $stk_arrv_bp_cd = $arr_schd + ".stk_arrv_bp_cd";
	public static final String $gd_cd = $arr_schd + ".gd_cd";
	public static final String $quality_typ = $arr_schd + ".quality_typ";
	public static final String $stk_insp_typ = $arr_schd + ".stk_insp_typ";
	public static final String $stk_id_typ = $arr_schd + ".stk_id_typ";
	public static final String $stk_bp_cd = $arr_schd + ".stk_bp_cd";
	public static final String $ret_gd_cd = $arr_schd + ".ret_gd_cd";
	public static final String $ret_loc_cd = $arr_schd + ".ret_loc_cd";
	public static final String $ret_str_ln_cd = $arr_schd + ".ret_str_ln_cd";
	public static final String $sppl_itm_cd = $arr_schd + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $arr_schd + ".sppl_itm_nm";
	public static final String $maker_cd = $arr_schd + ".maker_cd";
	public static final String $bp_lot_no = $arr_schd + ".bp_lot_no";
	public static final String $arr_loc_cd = $arr_schd + ".arr_loc_cd";
	public static final String $str_ln_cd = $arr_schd + ".str_ln_cd";
	public static final String $trd_unit_qty = $arr_schd + ".trd_unit_qty";
	public static final String $trd_unit_cd = $arr_schd + ".trd_unit_cd";
	public static final String $base_unit_qty = $arr_schd + ".base_unit_qty";
	public static final String $base_unit_cd = $arr_schd + ".base_unit_cd";
	public static final String $arr_qty = $arr_schd + ".arr_qty";
	public static final String $purc_qty = $arr_schd + ".purc_qty";
	public static final String $sls_ret_qty = $arr_schd + ".sls_ret_qty";
	public static final String $abort_qty = $arr_schd + ".abort_qty";
	public static final String $abort_flg = $arr_schd + ".abort_flg";
	public static final String $sls_ret_schd_abort_flg = $arr_schd + ".sls_ret_schd_abort_flg";
	public static final String $sls_ret_schd_abort_qty = $arr_schd + ".sls_ret_schd_abort_qty";
	public static final String $sync_flg = $arr_schd + ".sync_flg";
	public static final String $cmpl_flg = $arr_schd + ".cmpl_flg";
	public static final String $sls_ret_schd_cmpl_flg = $arr_schd + ".sls_ret_schd_cmpl_flg";
	public static final String $arr_skip_flg = $arr_schd + ".arr_skip_flg";
	public static final String $re_arr_schd_flg = $arr_schd + ".re_arr_schd_flg";
	public static final String $outsrc_flg = $arr_schd + ".outsrc_flg";
	public static final String $mfg_inst_no = $arr_schd + ".mfg_inst_no";
	public static final String $pre_outsrc_act_flg = $arr_schd + ".pre_outsrc_act_flg";
	public static final String $pre_mfg_act_no = $arr_schd + ".pre_mfg_act_no";
	public static final String $intr_rmrks = $arr_schd + ".intr_rmrks";
	public static final String $trd_rmrks = $arr_schd + ".trd_rmrks";
	public static final String $trd_d_rmrks = $arr_schd + ".trd_d_rmrks";
	public static final String $dlv_slip_d_rmrks = $arr_schd + ".dlv_slip_d_rmrks";
	public static final String $arr_cnt_rmrks = $arr_schd + ".arr_cnt_rmrks";
	public static final String $io_schd_pr_no = $arr_schd + ".io_schd_pr_no";
	public static final String $sub_char1 = $arr_schd + ".sub_char1";
	public static final String $sub_char2 = $arr_schd + ".sub_char2";
	public static final String $sub_char3 = $arr_schd + ".sub_char3";
	public static final String $wms_flg = $arr_schd + ".wms_flg";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_d_no_META = createCommonMeta($peg_d_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta arr_schd_META = createInnerRowMeta($arr_schd, mcframe.serverMS.dbc.MST_ARR_SCHD_R.class);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_outsrc_srv_flg_META = createCommonMeta($is_src_outsrc_srv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_arract_srv_flg_META = createCommonMeta($is_src_arract_srv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_purcact_srv_flg_META = createCommonMeta($is_src_purcact_srv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_cred_upd_flg_META = createCommonMeta($no_cred_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_lot_upd_flg_META = createCommonMeta($bp_lot_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_purcdlvadjst_flg_META = createCommonMeta($is_src_purcdlvadjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_abort_flg_META = createCommonMeta($rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_rcptivreg_srv_flg_META = createCommonMeta($is_src_rcptivreg_srv_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ArrSchd_DtlR> constMetas = new ConstMetaList<ArrSchd_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			peg_d_no_META,
			data_crud_typ_META,
			arr_schd_META,
			purc_schd_no_META,
			accpt_schd_dt_META,
			trd_cd_META,
			trd_ptn_typ_META,
			crt_lot_flg_META,
			is_src_outsrc_srv_flg_META,
			is_src_arract_srv_flg_META,
			is_src_purcact_srv_flg_META,
			no_cred_upd_flg_META,
			dlv_slip_d_no_META,
			prov_typ_META,
			prov_basis_typ_META,
			xrate_META,
			ptax_xrate_META,
			trd_cur_cd_META,
			tax_cd_META,
			trd_cur_upri_META,
			err_flg_META,
			bp_lot_upd_flg_META,
			is_src_purcdlvadjst_flg_META,
			rem_abort_flg_META,
			is_src_rcptivreg_srv_flg_META
		},
		new String[][]{
			{
				"arr_schd_no",
				"arr_pr_no",
				"prms_rcpt_d_no",
				"dlv_inst_d_no",
				"purc_act_d_no",
				"rcpt_iv_no",
				"rcpt_iv_mng_no",
				"pr_sts_typ",
				"wg_cd",
				"dlv_slip_no",
				"dlv_slip_mng_no",
				"dlv_slip_mng_seq",
				"dlv_slip_mng_d_no",
				"dlv_slip_mng_d_seq",
				"iv_no",
				"arr_ptn_typ",
				"arr_schd_tm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"rcpt_iv_itm_nm",
				"sundry_itm_flg",
				"purc_id_typ",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"lot_no",
				"sublot_no",
				"ver_no",
				"stk_arrv_bp_cd",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"ret_gd_cd",
				"ret_loc_cd",
				"ret_str_ln_cd",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"maker_cd",
				"bp_lot_no",
				"arr_loc_cd",
				"str_ln_cd",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"arr_qty",
				"purc_qty",
				"sls_ret_qty",
				"abort_qty",
				"abort_flg",
				"sls_ret_schd_abort_flg",
				"sls_ret_schd_abort_qty",
				"sync_flg",
				"cmpl_flg",
				"sls_ret_schd_cmpl_flg",
				"arr_skip_flg",
				"re_arr_schd_flg",
				"outsrc_flg",
				"mfg_inst_no",
				"pre_outsrc_act_flg",
				"pre_mfg_act_no",
				"intr_rmrks",
				"trd_rmrks",
				"trd_d_rmrks",
				"dlv_slip_d_rmrks",
				"arr_cnt_rmrks",
				"io_schd_pr_no",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"wms_flg"
			},
			{
				$arr_schd_no,
				$arr_pr_no,
				$prms_rcpt_d_no,
				$dlv_inst_d_no,
				$purc_act_d_no,
				$rcpt_iv_no,
				$rcpt_iv_mng_no,
				$pr_sts_typ,
				$wg_cd,
				$dlv_slip_no,
				$dlv_slip_mng_no,
				$dlv_slip_mng_seq,
				$dlv_slip_mng_d_no,
				$dlv_slip_mng_d_seq,
				$iv_no,
				$arr_ptn_typ,
				$arr_schd_tm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$rcpt_iv_itm_nm,
				$sundry_itm_flg,
				$purc_id_typ,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$lot_no,
				$sublot_no,
				$ver_no,
				$stk_arrv_bp_cd,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$ret_gd_cd,
				$ret_loc_cd,
				$ret_str_ln_cd,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$maker_cd,
				$bp_lot_no,
				$arr_loc_cd,
				$str_ln_cd,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$arr_qty,
				$purc_qty,
				$sls_ret_qty,
				$abort_qty,
				$abort_flg,
				$sls_ret_schd_abort_flg,
				$sls_ret_schd_abort_qty,
				$sync_flg,
				$cmpl_flg,
				$sls_ret_schd_cmpl_flg,
				$arr_skip_flg,
				$re_arr_schd_flg,
				$outsrc_flg,
				$mfg_inst_no,
				$pre_outsrc_act_flg,
				$pre_mfg_act_no,
				$intr_rmrks,
				$trd_rmrks,
				$trd_d_rmrks,
				$dlv_slip_d_rmrks,
				$arr_cnt_rmrks,
				$io_schd_pr_no,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$wms_flg
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
	protected ArrSchd_DtlR_MC_A(ConstMetaList<? extends ArrSchd_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrSchd_DtlR clone() {
		return (ArrSchd_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrSchd_DtlR createInstance() {
		return (ArrSchd_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrSchd_DtlR getValues(String... names) {
		return (ArrSchd_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public MCNumber peg_d_no() {
		return getConstNumber(offset + 1, $peg_d_no);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_d_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_d_no, value);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_d_no(int value) {
		setConstNumber(offset + 1, $peg_d_no, value);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_d_no(long value) {
		setConstNumber(offset + 1, $peg_d_no, value);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_d_no(float value) {
		setConstNumber(offset + 1, $peg_d_no, value);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_d_no(double value) {
		setConstNumber(offset + 1, $peg_d_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	public mcframe.serverMS.dbc.MST_ARR_SCHD_R arr_schd(){
		return (mcframe.serverMS.dbc.MST_ARR_SCHD_R) getConstInnerRow(offset + 3, $arr_schd);
	}
	
	public void arr_schd(mcframe.serverMS.dbc.MST_ARR_SCHD_R row){
		setConstInnerRow(offset + 3, $arr_schd, row);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 4, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 4, $purc_schd_no, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 5, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 5, $accpt_schd_dt, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 6, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 6, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 7, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 7, $trd_ptn_typ, value);
	}


	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 8, $crt_lot_flg);
	}

	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 8, $crt_lot_flg, value);
	}


	/**
	 * Caller subcontractor mfg. service 呼出元外注製造サービス.<p>
	 *
	 */
	public boolean is_src_outsrc_srv_flg() {
		return getConstBoolean(offset + 9, $is_src_outsrc_srv_flg);
	}

	/**
	 * Caller subcontractor mfg. service 呼出元外注製造サービス.<p>
	 *
	 */
	public void is_src_outsrc_srv_flg(boolean value) {
		setConstBoolean(offset + 9, $is_src_outsrc_srv_flg, value);
	}


	/**
	 * Caller receipt result service 呼出元入荷実績サービス.<p>
	 *
	 */
	public boolean is_src_arract_srv_flg() {
		return getConstBoolean(offset + 10, $is_src_arract_srv_flg);
	}

	/**
	 * Caller receipt result service 呼出元入荷実績サービス.<p>
	 *
	 */
	public void is_src_arract_srv_flg(boolean value) {
		setConstBoolean(offset + 10, $is_src_arract_srv_flg, value);
	}


	/**
	 * Caller purchase result service 呼出元仕入実績サービス.<p>
	 *
	 */
	public boolean is_src_purcact_srv_flg() {
		return getConstBoolean(offset + 11, $is_src_purcact_srv_flg);
	}

	/**
	 * Caller purchase result service 呼出元仕入実績サービス.<p>
	 *
	 */
	public void is_src_purcact_srv_flg(boolean value) {
		setConstBoolean(offset + 11, $is_src_purcact_srv_flg, value);
	}


	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public boolean no_cred_upd_flg() {
		return getConstBoolean(offset + 12, $no_cred_upd_flg);
	}

	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public void no_cred_upd_flg(boolean value) {
		setConstBoolean(offset + 12, $no_cred_upd_flg, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 13, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 13, $dlv_slip_d_no, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 14, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 14, $prov_typ, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 15, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 15, $prov_basis_typ, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 16, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 16, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 16, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 16, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 16, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 16, $xrate, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 17, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 17, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 17, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 17, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 17, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 17, $ptax_xrate, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 18, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 18, $trd_cur_cd, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 19, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 19, $tax_cd, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 20, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 20, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 20, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 20, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 20, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 20, $trd_cur_upri, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 21, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 21, $err_flg, value);
	}


	public boolean bp_lot_upd_flg() {
		return getConstBoolean(offset + 22, $bp_lot_upd_flg);
	}

	public void bp_lot_upd_flg(boolean value) {
		setConstBoolean(offset + 22, $bp_lot_upd_flg, value);
	}


	public boolean is_src_purcdlvadjst_flg() {
		return getConstBoolean(offset + 23, $is_src_purcdlvadjst_flg);
	}

	public void is_src_purcdlvadjst_flg(boolean value) {
		setConstBoolean(offset + 23, $is_src_purcdlvadjst_flg, value);
	}


	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public boolean rem_abort_flg() {
		return getConstBoolean(offset + 24, $rem_abort_flg);
	}

	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public void rem_abort_flg(boolean value) {
		setConstBoolean(offset + 24, $rem_abort_flg, value);
	}


	/**
	 * Caller purchase invoice entry service 呼出元受領インボイス登録サービス.<p>
	 *
	 */
	public boolean is_src_rcptivreg_srv_flg() {
		return getConstBoolean(offset + 25, $is_src_rcptivreg_srv_flg);
	}

	/**
	 * Caller purchase invoice entry service 呼出元受領インボイス登録サービス.<p>
	 *
	 */
	public void is_src_rcptivreg_srv_flg(boolean value) {
		setConstBoolean(offset + 25, $is_src_rcptivreg_srv_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			return peg_d_no();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			return is_src_outsrc_srv_flg();
		}
		if ($is_src_arract_srv_flg.equalsIgnoreCase(name)) {
			return is_src_arract_srv_flg();
		}
		if ($is_src_purcact_srv_flg.equalsIgnoreCase(name)) {
			return is_src_purcact_srv_flg();
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			return no_cred_upd_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($bp_lot_upd_flg.equalsIgnoreCase(name)) {
			return bp_lot_upd_flg();
		}
		if ($is_src_purcdlvadjst_flg.equalsIgnoreCase(name)) {
			return is_src_purcdlvadjst_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		if ($is_src_rcptivreg_srv_flg.equalsIgnoreCase(name)) {
			return is_src_rcptivreg_srv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			return peg_d_no();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			return is_src_outsrc_srv_flg();
		}
		if ($is_src_arract_srv_flg.equalsIgnoreCase(name)) {
			return is_src_arract_srv_flg();
		}
		if ($is_src_purcact_srv_flg.equalsIgnoreCase(name)) {
			return is_src_purcact_srv_flg();
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			return no_cred_upd_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($bp_lot_upd_flg.equalsIgnoreCase(name)) {
			return bp_lot_upd_flg();
		}
		if ($is_src_purcdlvadjst_flg.equalsIgnoreCase(name)) {
			return is_src_purcdlvadjst_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		if ($is_src_rcptivreg_srv_flg.equalsIgnoreCase(name)) {
			return is_src_rcptivreg_srv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			is_src_outsrc_srv_flg(value);
			return;
		}
		if ($is_src_arract_srv_flg.equalsIgnoreCase(name)) {
			is_src_arract_srv_flg(value);
			return;
		}
		if ($is_src_purcact_srv_flg.equalsIgnoreCase(name)) {
			is_src_purcact_srv_flg(value);
			return;
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			no_cred_upd_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($bp_lot_upd_flg.equalsIgnoreCase(name)) {
			bp_lot_upd_flg(value);
			return;
		}
		if ($is_src_purcdlvadjst_flg.equalsIgnoreCase(name)) {
			is_src_purcdlvadjst_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		if ($is_src_rcptivreg_srv_flg.equalsIgnoreCase(name)) {
			is_src_rcptivreg_srv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($peg_d_no.equalsIgnoreCase(name)) {
			peg_d_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			is_src_outsrc_srv_flg(value);
			return;
		}
		if ($is_src_arract_srv_flg.equalsIgnoreCase(name)) {
			is_src_arract_srv_flg(value);
			return;
		}
		if ($is_src_purcact_srv_flg.equalsIgnoreCase(name)) {
			is_src_purcact_srv_flg(value);
			return;
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			no_cred_upd_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($bp_lot_upd_flg.equalsIgnoreCase(name)) {
			bp_lot_upd_flg(value);
			return;
		}
		if ($is_src_purcdlvadjst_flg.equalsIgnoreCase(name)) {
			is_src_purcdlvadjst_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		if ($is_src_rcptivreg_srv_flg.equalsIgnoreCase(name)) {
			is_src_rcptivreg_srv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($arr_schd.equalsIgnoreCase(name)) {
			return arr_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($arr_schd.equalsIgnoreCase(name)) {
			arr_schd(
				((MCContainerMeta) arr_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_ARR_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return arr_schd().arr_schd_no();
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		arr_schd().arr_schd_no(value);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return arr_schd().arr_pr_no();
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		arr_schd().arr_pr_no(value);
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_d_no() {
		return arr_schd().prms_rcpt_d_no();
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_d_no(String value) {
		arr_schd().prms_rcpt_d_no(value);
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return arr_schd().dlv_inst_d_no();
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		arr_schd().dlv_inst_d_no(value);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return arr_schd().purc_act_d_no();
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		arr_schd().purc_act_d_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return arr_schd().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		arr_schd().rcpt_iv_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return arr_schd().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		arr_schd().rcpt_iv_mng_no(value);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return arr_schd().pr_sts_typ();
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		arr_schd().pr_sts_typ(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return arr_schd().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		arr_schd().wg_cd(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return arr_schd().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		arr_schd().dlv_slip_no(value);
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return arr_schd().dlv_slip_mng_no();
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		arr_schd().dlv_slip_mng_no(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return arr_schd().dlv_slip_mng_seq();
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		arr_schd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		arr_schd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		arr_schd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		arr_schd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		arr_schd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note details management No. 納品書明細管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_d_no() {
		return arr_schd().dlv_slip_mng_d_no();
	}

	/**
	 * Delivery note details management No. 納品書明細管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_d_no(String value) {
		arr_schd().dlv_slip_mng_d_no(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_d_seq() {
		return arr_schd().dlv_slip_mng_d_seq();
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(MCNumber value) {
		arr_schd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(int value) {
		arr_schd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(long value) {
		arr_schd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(float value) {
		arr_schd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(double value) {
		arr_schd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return arr_schd().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		arr_schd().iv_no(value);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return arr_schd().arr_ptn_typ();
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		arr_schd().arr_ptn_typ(value);
	}

	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public MCDate arr_schd_tm() {
		return arr_schd().arr_schd_tm();
	}

	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public void arr_schd_tm(MCDate value) {
		arr_schd().arr_schd_tm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return arr_schd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		arr_schd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return arr_schd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		arr_schd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return arr_schd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		arr_schd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return arr_schd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		arr_schd().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return arr_schd().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		arr_schd().itm_nm(value);
	}

	/**
	 * Item name for purchase invoice 受領インボイス表記品名.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return arr_schd().rcpt_iv_itm_nm();
	}

	/**
	 * Item name for purchase invoice 受領インボイス表記品名.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		arr_schd().rcpt_iv_itm_nm(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return arr_schd().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		arr_schd().sundry_itm_flg(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return arr_schd().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		arr_schd().purc_id_typ(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return arr_schd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		arr_schd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return arr_schd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		arr_schd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return arr_schd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		arr_schd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return arr_schd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		arr_schd().sno4(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return arr_schd().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		arr_schd().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return arr_schd().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		arr_schd().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return arr_schd().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		arr_schd().ver_no(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return arr_schd().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		arr_schd().stk_arrv_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return arr_schd().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		arr_schd().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return arr_schd().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		arr_schd().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return arr_schd().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		arr_schd().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return arr_schd().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		arr_schd().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return arr_schd().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		arr_schd().stk_bp_cd(value);
	}

	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public String ret_gd_cd() {
		return arr_schd().ret_gd_cd();
	}

	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public void ret_gd_cd(String value) {
		arr_schd().ret_gd_cd(value);
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public String ret_loc_cd() {
		return arr_schd().ret_loc_cd();
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public void ret_loc_cd(String value) {
		arr_schd().ret_loc_cd(value);
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public String ret_str_ln_cd() {
		return arr_schd().ret_str_ln_cd();
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public void ret_str_ln_cd(String value) {
		arr_schd().ret_str_ln_cd(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return arr_schd().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		arr_schd().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return arr_schd().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		arr_schd().sppl_itm_nm(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return arr_schd().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		arr_schd().maker_cd(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return arr_schd().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		arr_schd().bp_lot_no(value);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return arr_schd().arr_loc_cd();
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		arr_schd().arr_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return arr_schd().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		arr_schd().str_ln_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return arr_schd().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		arr_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		arr_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		arr_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		arr_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		arr_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return arr_schd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		arr_schd().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return arr_schd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		arr_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		arr_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		arr_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		arr_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		arr_schd().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return arr_schd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		arr_schd().base_unit_cd(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return arr_schd().arr_qty();
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		arr_schd().arr_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		arr_schd().arr_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		arr_schd().arr_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		arr_schd().arr_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		arr_schd().arr_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return arr_schd().purc_qty();
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		arr_schd().purc_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		arr_schd().purc_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		arr_schd().purc_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		arr_schd().purc_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		arr_schd().purc_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public MCNumber sls_ret_qty() {
		return arr_schd().sls_ret_qty();
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(MCNumber value) {
		arr_schd().sls_ret_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(int value) {
		arr_schd().sls_ret_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(long value) {
		arr_schd().sls_ret_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(float value) {
		arr_schd().sls_ret_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(double value) {
		arr_schd().sls_ret_qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public MCNumber abort_qty() {
		return arr_schd().abort_qty();
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(MCNumber value) {
		arr_schd().abort_qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(int value) {
		arr_schd().abort_qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(long value) {
		arr_schd().abort_qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(float value) {
		arr_schd().abort_qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(double value) {
		arr_schd().abort_qty(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return arr_schd().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		arr_schd().abort_flg(value);
	}

	/**
	 * Cancel remaining sales return schedule 売上返品予定打切.<p>
	 *
	 */
	public boolean sls_ret_schd_abort_flg() {
		return arr_schd().sls_ret_schd_abort_flg();
	}

	/**
	 * Cancel remaining sales return schedule 売上返品予定打切.<p>
	 *
	 */
	public void sls_ret_schd_abort_flg(boolean value) {
		arr_schd().sls_ret_schd_abort_flg(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public MCNumber sls_ret_schd_abort_qty() {
		return arr_schd().sls_ret_schd_abort_qty();
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(MCNumber value) {
		arr_schd().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(int value) {
		arr_schd().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(long value) {
		arr_schd().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(float value) {
		arr_schd().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(double value) {
		arr_schd().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return arr_schd().sync_flg();
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		arr_schd().sync_flg(value);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return arr_schd().cmpl_flg();
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		arr_schd().cmpl_flg(value);
	}

	/**
	 * Sales return schedule completed 売上返品予定完了.<p>
	 *
	 */
	public boolean sls_ret_schd_cmpl_flg() {
		return arr_schd().sls_ret_schd_cmpl_flg();
	}

	/**
	 * Sales return schedule completed 売上返品予定完了.<p>
	 *
	 */
	public void sls_ret_schd_cmpl_flg(boolean value) {
		arr_schd().sls_ret_schd_cmpl_flg(value);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return arr_schd().arr_skip_flg();
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		arr_schd().arr_skip_flg(value);
	}

	/**
	 * Scheduled re-receipt 再入荷予定.<p>
	 *
	 */
	public boolean re_arr_schd_flg() {
		return arr_schd().re_arr_schd_flg();
	}

	/**
	 * Scheduled re-receipt 再入荷予定.<p>
	 *
	 */
	public void re_arr_schd_flg(boolean value) {
		arr_schd().re_arr_schd_flg(value);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return arr_schd().outsrc_flg();
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		arr_schd().outsrc_flg(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return arr_schd().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		arr_schd().mfg_inst_no(value);
	}

	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return arr_schd().pre_outsrc_act_flg();
	}

	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		arr_schd().pre_outsrc_act_flg(value);
	}

	/**
	 * Prior mfg. result No. 先行製造実績ＮＯ.<p>
	 *
	 */
	public String pre_mfg_act_no() {
		return arr_schd().pre_mfg_act_no();
	}

	/**
	 * Prior mfg. result No. 先行製造実績ＮＯ.<p>
	 *
	 */
	public void pre_mfg_act_no(String value) {
		arr_schd().pre_mfg_act_no(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return arr_schd().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		arr_schd().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return arr_schd().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		arr_schd().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return arr_schd().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		arr_schd().trd_d_rmrks(value);
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return arr_schd().dlv_slip_d_rmrks();
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		arr_schd().dlv_slip_d_rmrks(value);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return arr_schd().arr_cnt_rmrks();
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		arr_schd().arr_cnt_rmrks(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return arr_schd().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		arr_schd().io_schd_pr_no(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return arr_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		arr_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return arr_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		arr_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return arr_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		arr_schd().sub_char3(value);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return arr_schd().wms_flg();
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		arr_schd().wms_flg(value);
	}

}

