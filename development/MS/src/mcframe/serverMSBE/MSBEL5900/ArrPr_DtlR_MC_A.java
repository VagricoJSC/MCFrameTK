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
 * ブロック"ArrPr_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrPr_DtlR_MC_A extends MCConstRow {

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $arr_pr = "arr_pr";

	public static final String $arr_pr_no = $arr_pr + ".arr_pr_no";
	public static final String $trd_cd = $arr_pr + ".trd_cd";
	public static final String $trd_ptn_typ = $arr_pr + ".trd_ptn_typ";
	public static final String $sls_ret_schd_d_no = $arr_pr + ".sls_ret_schd_d_no";
	public static final String $dlv_slip_d_no = $arr_pr + ".dlv_slip_d_no";
	public static final String $iv_d_no = $arr_pr + ".iv_d_no";
	public static final String $po_d_no = $arr_pr + ".po_d_no";
	public static final String $rqst_dpt_cd = $arr_pr + ".rqst_dpt_cd";
	public static final String $rqst_wg_cd = $arr_pr + ".rqst_wg_cd";
	public static final String $rqst_usr_cd = $arr_pr + ".rqst_usr_cd";
	public static final String $cst_cd = $arr_pr + ".cst_cd";
	public static final String $sret_fr_cd = $arr_pr + ".sret_fr_cd";
	public static final String $sppl_cd = $arr_pr + ".sppl_cd";
	public static final String $ret_dlv_slip_d_no = $arr_pr + ".ret_dlv_slip_d_no";
	public static final String $ret_stk_arrv_bp_cd = $arr_pr + ".ret_stk_arrv_bp_cd";
	public static final String $dlv_rqst_tm = $arr_pr + ".dlv_rqst_tm";
	public static final String $prms_rcpt_dt = $arr_pr + ".prms_rcpt_dt";
	public static final String $prms_dlv_dt = $arr_pr + ".prms_dlv_dt";
	public static final String $prms_refl_dt = $arr_pr + ".prms_refl_dt";
	public static final String $dlv_inst_dt = $arr_pr + ".dlv_inst_dt";
	public static final String $dlv_inst_prms_rcpt_dt = $arr_pr + ".dlv_inst_prms_rcpt_dt";
	public static final String $dlv_inst_prms_refl_dt = $arr_pr + ".dlv_inst_prms_refl_dt";
	public static final String $arr_schd_tm = $arr_pr + ".arr_schd_tm";
	public static final String $arr_tm = $arr_pr + ".arr_tm";
	public static final String $purc_dt = $arr_pr + ".purc_dt";
	public static final String $trd_unit_qty = $arr_pr + ".trd_unit_qty";
	public static final String $trd_unit_cd = $arr_pr + ".trd_unit_cd";
	public static final String $prms_rcpt_qty = $arr_pr + ".prms_rcpt_qty";
	public static final String $prms_refl_qty = $arr_pr + ".prms_refl_qty";
	public static final String $dlv_inst_qty = $arr_pr + ".dlv_inst_qty";
	public static final String $dlv_inst_prms_rcpt_qty = $arr_pr + ".dlv_inst_prms_rcpt_qty";
	public static final String $dlv_inst_prms_refl_qty = $arr_pr + ".dlv_inst_prms_refl_qty";
	public static final String $re_arr_schd_qty = $arr_pr + ".re_arr_schd_qty";
	public static final String $rcpt_iv_qty = $arr_pr + ".rcpt_iv_qty";
	public static final String $arr_qty = $arr_pr + ".arr_qty";
	public static final String $purc_qty = $arr_pr + ".purc_qty";
	public static final String $sls_ret_qty = $arr_pr + ".sls_ret_qty";
	public static final String $abort_flg = $arr_pr + ".abort_flg";
	public static final String $arr_schd_abort_qty = $arr_pr + ".arr_schd_abort_qty";
	public static final String $purc_schd_abort_qty = $arr_pr + ".purc_schd_abort_qty";
	public static final String $sls_ret_schd_abort_qty = $arr_pr + ".sls_ret_schd_abort_qty";
	public static final String $std_purc_lt = $arr_pr + ".std_purc_lt";
	public static final String $rsn_cd = $arr_pr + ".rsn_cd";
	public static final String $bd_dpt_cd = $arr_pr + ".bd_dpt_cd";
	public static final String $bd_wg_cd = $arr_pr + ".bd_wg_cd";
	public static final String $purc_ddlv_flg = $arr_pr + ".purc_ddlv_flg";
	public static final String $purc_sts_typ = $arr_pr + ".purc_sts_typ";
	public static final String $prms_dlv_dt_overdue_flg = $arr_pr + ".prms_dlv_dt_overdue_flg";
	public static final String $dlv_rqst_dt_overdue_flg = $arr_pr + ".dlv_rqst_dt_overdue_flg";
	public static final String $arr_schd_split_flg = $arr_pr + ".arr_schd_split_flg";
	public static final String $arr_schd_refl_flg = $arr_pr + ".arr_schd_refl_flg";
	public static final String $arr_cmpl_flg = $arr_pr + ".arr_cmpl_flg";
	public static final String $purc_cmpl_flg = $arr_pr + ".purc_cmpl_flg";
	public static final String $sls_ret_cmpl_flg = $arr_pr + ".sls_ret_cmpl_flg";
	public static final String $arr_cnt_rmrks = $arr_pr + ".arr_cnt_rmrks";
	public static final String $sub_char1 = $arr_pr + ".sub_char1";
	public static final String $sub_char2 = $arr_pr + ".sub_char2";
	public static final String $sub_char3 = $arr_pr + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta arr_pr_META = createInnerRowMeta($arr_pr, mcframe.serverMS.dbc.MST_ARR_PR_R.class);

	protected static final ConstMetaList<ArrPr_DtlR> constMetas = new ConstMetaList<ArrPr_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			arr_pr_META
		},
		new String[][]{
			{
				"arr_pr_no",
				"trd_cd",
				"trd_ptn_typ",
				"sls_ret_schd_d_no",
				"dlv_slip_d_no",
				"iv_d_no",
				"po_d_no",
				"rqst_dpt_cd",
				"rqst_wg_cd",
				"rqst_usr_cd",
				"cst_cd",
				"sret_fr_cd",
				"sppl_cd",
				"ret_dlv_slip_d_no",
				"ret_stk_arrv_bp_cd",
				"dlv_rqst_tm",
				"prms_rcpt_dt",
				"prms_dlv_dt",
				"prms_refl_dt",
				"dlv_inst_dt",
				"dlv_inst_prms_rcpt_dt",
				"dlv_inst_prms_refl_dt",
				"arr_schd_tm",
				"arr_tm",
				"purc_dt",
				"trd_unit_qty",
				"trd_unit_cd",
				"prms_rcpt_qty",
				"prms_refl_qty",
				"dlv_inst_qty",
				"dlv_inst_prms_rcpt_qty",
				"dlv_inst_prms_refl_qty",
				"re_arr_schd_qty",
				"rcpt_iv_qty",
				"arr_qty",
				"purc_qty",
				"sls_ret_qty",
				"abort_flg",
				"arr_schd_abort_qty",
				"purc_schd_abort_qty",
				"sls_ret_schd_abort_qty",
				"std_purc_lt",
				"rsn_cd",
				"bd_dpt_cd",
				"bd_wg_cd",
				"purc_ddlv_flg",
				"purc_sts_typ",
				"prms_dlv_dt_overdue_flg",
				"dlv_rqst_dt_overdue_flg",
				"arr_schd_split_flg",
				"arr_schd_refl_flg",
				"arr_cmpl_flg",
				"purc_cmpl_flg",
				"sls_ret_cmpl_flg",
				"arr_cnt_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$arr_pr_no,
				$trd_cd,
				$trd_ptn_typ,
				$sls_ret_schd_d_no,
				$dlv_slip_d_no,
				$iv_d_no,
				$po_d_no,
				$rqst_dpt_cd,
				$rqst_wg_cd,
				$rqst_usr_cd,
				$cst_cd,
				$sret_fr_cd,
				$sppl_cd,
				$ret_dlv_slip_d_no,
				$ret_stk_arrv_bp_cd,
				$dlv_rqst_tm,
				$prms_rcpt_dt,
				$prms_dlv_dt,
				$prms_refl_dt,
				$dlv_inst_dt,
				$dlv_inst_prms_rcpt_dt,
				$dlv_inst_prms_refl_dt,
				$arr_schd_tm,
				$arr_tm,
				$purc_dt,
				$trd_unit_qty,
				$trd_unit_cd,
				$prms_rcpt_qty,
				$prms_refl_qty,
				$dlv_inst_qty,
				$dlv_inst_prms_rcpt_qty,
				$dlv_inst_prms_refl_qty,
				$re_arr_schd_qty,
				$rcpt_iv_qty,
				$arr_qty,
				$purc_qty,
				$sls_ret_qty,
				$abort_flg,
				$arr_schd_abort_qty,
				$purc_schd_abort_qty,
				$sls_ret_schd_abort_qty,
				$std_purc_lt,
				$rsn_cd,
				$bd_dpt_cd,
				$bd_wg_cd,
				$purc_ddlv_flg,
				$purc_sts_typ,
				$prms_dlv_dt_overdue_flg,
				$dlv_rqst_dt_overdue_flg,
				$arr_schd_split_flg,
				$arr_schd_refl_flg,
				$arr_cmpl_flg,
				$purc_cmpl_flg,
				$sls_ret_cmpl_flg,
				$arr_cnt_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected ArrPr_DtlR_MC_A(ConstMetaList<? extends ArrPr_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrPr_DtlR clone() {
		return (ArrPr_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrPr_DtlR createInstance() {
		return (ArrPr_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrPr_DtlR getValues(String... names) {
		return (ArrPr_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. (Unique) データ紐付けＮＯ（一意）.<p>
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


	public mcframe.serverMS.dbc.MST_ARR_PR_R arr_pr(){
		return (mcframe.serverMS.dbc.MST_ARR_PR_R) getConstInnerRow(offset + 2, $arr_pr);
	}
	
	public void arr_pr(mcframe.serverMS.dbc.MST_ARR_PR_R row){
		setConstInnerRow(offset + 2, $arr_pr, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($arr_pr.equalsIgnoreCase(name)) {
			return arr_pr();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($arr_pr.equalsIgnoreCase(name)) {
			arr_pr(
				((MCContainerMeta) arr_pr_META).castInnerRow(mcframe.serverMS.dbc.MST_ARR_PR_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return arr_pr().arr_pr_no();
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		arr_pr().arr_pr_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return arr_pr().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		arr_pr().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return arr_pr().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		arr_pr().trd_ptn_typ(value);
	}

	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_d_no() {
		return arr_pr().sls_ret_schd_d_no();
	}

	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_d_no(String value) {
		arr_pr().sls_ret_schd_d_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return arr_pr().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		arr_pr().dlv_slip_d_no(value);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return arr_pr().iv_d_no();
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		arr_pr().iv_d_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return arr_pr().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		arr_pr().po_d_no(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return arr_pr().rqst_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		arr_pr().rqst_dpt_cd(value);
	}

	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return arr_pr().rqst_wg_cd();
	}

	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		arr_pr().rqst_wg_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return arr_pr().rqst_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		arr_pr().rqst_usr_cd(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return arr_pr().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		arr_pr().cst_cd(value);
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public String sret_fr_cd() {
		return arr_pr().sret_fr_cd();
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		arr_pr().sret_fr_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return arr_pr().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		arr_pr().sppl_cd(value);
	}

	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public String ret_dlv_slip_d_no() {
		return arr_pr().ret_dlv_slip_d_no();
	}

	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public void ret_dlv_slip_d_no(String value) {
		arr_pr().ret_dlv_slip_d_no(value);
	}

	/**
	 * Return-from inventory arrival destination cd. 返品元在庫着荷先ＣＤ.<p>
	 *
	 */
	public String ret_stk_arrv_bp_cd() {
		return arr_pr().ret_stk_arrv_bp_cd();
	}

	/**
	 * Return-from inventory arrival destination cd. 返品元在庫着荷先ＣＤ.<p>
	 *
	 */
	public void ret_stk_arrv_bp_cd(String value) {
		arr_pr().ret_stk_arrv_bp_cd(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return arr_pr().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		arr_pr().dlv_rqst_tm(value);
	}

	/**
	 * Order promising result received date 納期回答受領日.<p>
	 *
	 */
	public MCDate prms_rcpt_dt() {
		return arr_pr().prms_rcpt_dt();
	}

	/**
	 * Order promising result received date 納期回答受領日.<p>
	 *
	 */
	public void prms_rcpt_dt(MCDate value) {
		arr_pr().prms_rcpt_dt(value);
	}

	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return arr_pr().prms_dlv_dt();
	}

	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		arr_pr().prms_dlv_dt(value);
	}

	/**
	 * Order promising applied date 納期回答反映日.<p>
	 *
	 */
	public MCDate prms_refl_dt() {
		return arr_pr().prms_refl_dt();
	}

	/**
	 * Order promising applied date 納期回答反映日.<p>
	 *
	 */
	public void prms_refl_dt(MCDate value) {
		arr_pr().prms_refl_dt(value);
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return arr_pr().dlv_inst_dt();
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		arr_pr().dlv_inst_dt(value);
	}

	/**
	 * Delivery order replied received date 納入指示回答受領日.<p>
	 *
	 */
	public MCDate dlv_inst_prms_rcpt_dt() {
		return arr_pr().dlv_inst_prms_rcpt_dt();
	}

	/**
	 * Delivery order replied received date 納入指示回答受領日.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_dt(MCDate value) {
		arr_pr().dlv_inst_prms_rcpt_dt(value);
	}

	/**
	 * Delivery order reply applied date 納入指示回答反映日.<p>
	 *
	 */
	public MCDate dlv_inst_prms_refl_dt() {
		return arr_pr().dlv_inst_prms_refl_dt();
	}

	/**
	 * Delivery order reply applied date 納入指示回答反映日.<p>
	 *
	 */
	public void dlv_inst_prms_refl_dt(MCDate value) {
		arr_pr().dlv_inst_prms_refl_dt(value);
	}

	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public MCDate arr_schd_tm() {
		return arr_pr().arr_schd_tm();
	}

	/**
	 * Scheduled receipt date and time 入荷予定日時.<p>
	 *
	 */
	public void arr_schd_tm(MCDate value) {
		arr_pr().arr_schd_tm(value);
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public MCDate arr_tm() {
		return arr_pr().arr_tm();
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		arr_pr().arr_tm(value);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return arr_pr().purc_dt();
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		arr_pr().purc_dt(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return arr_pr().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		arr_pr().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		arr_pr().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		arr_pr().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		arr_pr().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		arr_pr().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return arr_pr().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		arr_pr().trd_unit_cd(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public MCNumber prms_rcpt_qty() {
		return arr_pr().prms_rcpt_qty();
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(MCNumber value) {
		arr_pr().prms_rcpt_qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(int value) {
		arr_pr().prms_rcpt_qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(long value) {
		arr_pr().prms_rcpt_qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(float value) {
		arr_pr().prms_rcpt_qty(value);
	}

	/**
	 * Order promising result received qty. 納期回答受領数量.<p>
	 *
	 */
	public void prms_rcpt_qty(double value) {
		arr_pr().prms_rcpt_qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public MCNumber prms_refl_qty() {
		return arr_pr().prms_refl_qty();
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(MCNumber value) {
		arr_pr().prms_refl_qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(int value) {
		arr_pr().prms_refl_qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(long value) {
		arr_pr().prms_refl_qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(float value) {
		arr_pr().prms_refl_qty(value);
	}

	/**
	 * Order promising applied qty. 納期回答反映済数量.<p>
	 *
	 */
	public void prms_refl_qty(double value) {
		arr_pr().prms_refl_qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return arr_pr().dlv_inst_qty();
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		arr_pr().dlv_inst_qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		arr_pr().dlv_inst_qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		arr_pr().dlv_inst_qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		arr_pr().dlv_inst_qty(value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		arr_pr().dlv_inst_qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public MCNumber dlv_inst_prms_rcpt_qty() {
		return arr_pr().dlv_inst_prms_rcpt_qty();
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(MCNumber value) {
		arr_pr().dlv_inst_prms_rcpt_qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(int value) {
		arr_pr().dlv_inst_prms_rcpt_qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(long value) {
		arr_pr().dlv_inst_prms_rcpt_qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(float value) {
		arr_pr().dlv_inst_prms_rcpt_qty(value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(double value) {
		arr_pr().dlv_inst_prms_rcpt_qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public MCNumber dlv_inst_prms_refl_qty() {
		return arr_pr().dlv_inst_prms_refl_qty();
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(MCNumber value) {
		arr_pr().dlv_inst_prms_refl_qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(int value) {
		arr_pr().dlv_inst_prms_refl_qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(long value) {
		arr_pr().dlv_inst_prms_refl_qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(float value) {
		arr_pr().dlv_inst_prms_refl_qty(value);
	}

	/**
	 * Delivery order reply applied qty. 納入指示回答反映済数量.<p>
	 *
	 */
	public void dlv_inst_prms_refl_qty(double value) {
		arr_pr().dlv_inst_prms_refl_qty(value);
	}

	/**
	 * Scheduled re-receipt qty. 再入荷予定数量.<p>
	 *
	 */
	public MCNumber re_arr_schd_qty() {
		return arr_pr().re_arr_schd_qty();
	}

	/**
	 * Scheduled re-receipt qty. 再入荷予定数量.<p>
	 *
	 */
	public void re_arr_schd_qty(MCNumber value) {
		arr_pr().re_arr_schd_qty(value);
	}

	/**
	 * Scheduled re-receipt qty. 再入荷予定数量.<p>
	 *
	 */
	public void re_arr_schd_qty(int value) {
		arr_pr().re_arr_schd_qty(value);
	}

	/**
	 * Scheduled re-receipt qty. 再入荷予定数量.<p>
	 *
	 */
	public void re_arr_schd_qty(long value) {
		arr_pr().re_arr_schd_qty(value);
	}

	/**
	 * Scheduled re-receipt qty. 再入荷予定数量.<p>
	 *
	 */
	public void re_arr_schd_qty(float value) {
		arr_pr().re_arr_schd_qty(value);
	}

	/**
	 * Scheduled re-receipt qty. 再入荷予定数量.<p>
	 *
	 */
	public void re_arr_schd_qty(double value) {
		arr_pr().re_arr_schd_qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public MCNumber rcpt_iv_qty() {
		return arr_pr().rcpt_iv_qty();
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(MCNumber value) {
		arr_pr().rcpt_iv_qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(int value) {
		arr_pr().rcpt_iv_qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(long value) {
		arr_pr().rcpt_iv_qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(float value) {
		arr_pr().rcpt_iv_qty(value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(double value) {
		arr_pr().rcpt_iv_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return arr_pr().arr_qty();
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		arr_pr().arr_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		arr_pr().arr_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		arr_pr().arr_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		arr_pr().arr_qty(value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		arr_pr().arr_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return arr_pr().purc_qty();
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		arr_pr().purc_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		arr_pr().purc_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		arr_pr().purc_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		arr_pr().purc_qty(value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		arr_pr().purc_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public MCNumber sls_ret_qty() {
		return arr_pr().sls_ret_qty();
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(MCNumber value) {
		arr_pr().sls_ret_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(int value) {
		arr_pr().sls_ret_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(long value) {
		arr_pr().sls_ret_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(float value) {
		arr_pr().sls_ret_qty(value);
	}

	/**
	 * Sales return qty. 売上返品数量.<p>
	 *
	 */
	public void sls_ret_qty(double value) {
		arr_pr().sls_ret_qty(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return arr_pr().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		arr_pr().abort_flg(value);
	}

	/**
	 * Cancelled remaining receipt schedule qty. 入荷予定打切数量.<p>
	 *
	 */
	public MCNumber arr_schd_abort_qty() {
		return arr_pr().arr_schd_abort_qty();
	}

	/**
	 * Cancelled remaining receipt schedule qty. 入荷予定打切数量.<p>
	 *
	 */
	public void arr_schd_abort_qty(MCNumber value) {
		arr_pr().arr_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining receipt schedule qty. 入荷予定打切数量.<p>
	 *
	 */
	public void arr_schd_abort_qty(int value) {
		arr_pr().arr_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining receipt schedule qty. 入荷予定打切数量.<p>
	 *
	 */
	public void arr_schd_abort_qty(long value) {
		arr_pr().arr_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining receipt schedule qty. 入荷予定打切数量.<p>
	 *
	 */
	public void arr_schd_abort_qty(float value) {
		arr_pr().arr_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining receipt schedule qty. 入荷予定打切数量.<p>
	 *
	 */
	public void arr_schd_abort_qty(double value) {
		arr_pr().arr_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining purchase schedule qty. 仕入予定打切数量.<p>
	 *
	 */
	public MCNumber purc_schd_abort_qty() {
		return arr_pr().purc_schd_abort_qty();
	}

	/**
	 * Cancelled remaining purchase schedule qty. 仕入予定打切数量.<p>
	 *
	 */
	public void purc_schd_abort_qty(MCNumber value) {
		arr_pr().purc_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining purchase schedule qty. 仕入予定打切数量.<p>
	 *
	 */
	public void purc_schd_abort_qty(int value) {
		arr_pr().purc_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining purchase schedule qty. 仕入予定打切数量.<p>
	 *
	 */
	public void purc_schd_abort_qty(long value) {
		arr_pr().purc_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining purchase schedule qty. 仕入予定打切数量.<p>
	 *
	 */
	public void purc_schd_abort_qty(float value) {
		arr_pr().purc_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining purchase schedule qty. 仕入予定打切数量.<p>
	 *
	 */
	public void purc_schd_abort_qty(double value) {
		arr_pr().purc_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public MCNumber sls_ret_schd_abort_qty() {
		return arr_pr().sls_ret_schd_abort_qty();
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(MCNumber value) {
		arr_pr().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(int value) {
		arr_pr().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(long value) {
		arr_pr().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(float value) {
		arr_pr().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Cancelled remaining sales return schedule qty. 売上返品予定打切数量.<p>
	 *
	 */
	public void sls_ret_schd_abort_qty(double value) {
		arr_pr().sls_ret_schd_abort_qty(value);
	}

	/**
	 * Standard delivery LT 標準納入ＬＴ.<p>
	 *
	 */
	public MCNumber std_purc_lt() {
		return arr_pr().std_purc_lt();
	}

	/**
	 * Standard delivery LT 標準納入ＬＴ.<p>
	 *
	 */
	public void std_purc_lt(MCNumber value) {
		arr_pr().std_purc_lt(value);
	}

	/**
	 * Standard delivery LT 標準納入ＬＴ.<p>
	 *
	 */
	public void std_purc_lt(int value) {
		arr_pr().std_purc_lt(value);
	}

	/**
	 * Standard delivery LT 標準納入ＬＴ.<p>
	 *
	 */
	public void std_purc_lt(long value) {
		arr_pr().std_purc_lt(value);
	}

	/**
	 * Standard delivery LT 標準納入ＬＴ.<p>
	 *
	 */
	public void std_purc_lt(float value) {
		arr_pr().std_purc_lt(value);
	}

	/**
	 * Standard delivery LT 標準納入ＬＴ.<p>
	 *
	 */
	public void std_purc_lt(double value) {
		arr_pr().std_purc_lt(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return arr_pr().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		arr_pr().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return arr_pr().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		arr_pr().bd_dpt_cd(value);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return arr_pr().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		arr_pr().bd_wg_cd(value);
	}

	/**
	 * Direct delivery 仕入直送.<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return arr_pr().purc_ddlv_flg();
	}

	/**
	 * Direct delivery 仕入直送.<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		arr_pr().purc_ddlv_flg(value);
	}

	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public String purc_sts_typ() {
		return arr_pr().purc_sts_typ();
	}

	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public void purc_sts_typ(String value) {
		arr_pr().purc_sts_typ(value);
	}

	/**
	 * Replied delivery date delayed 回答納入日遅れ.<p>
	 *
	 */
	public boolean prms_dlv_dt_overdue_flg() {
		return arr_pr().prms_dlv_dt_overdue_flg();
	}

	/**
	 * Replied delivery date delayed 回答納入日遅れ.<p>
	 *
	 */
	public void prms_dlv_dt_overdue_flg(boolean value) {
		arr_pr().prms_dlv_dt_overdue_flg(value);
	}

	/**
	 * Desired delivery date delayed 希望納入日遅れ.<p>
	 *
	 */
	public boolean dlv_rqst_dt_overdue_flg() {
		return arr_pr().dlv_rqst_dt_overdue_flg();
	}

	/**
	 * Desired delivery date delayed 希望納入日遅れ.<p>
	 *
	 */
	public void dlv_rqst_dt_overdue_flg(boolean value) {
		arr_pr().dlv_rqst_dt_overdue_flg(value);
	}

	/**
	 * Split receipt schedule 入荷予定分割.<p>
	 *
	 */
	public boolean arr_schd_split_flg() {
		return arr_pr().arr_schd_split_flg();
	}

	/**
	 * Split receipt schedule 入荷予定分割.<p>
	 *
	 */
	public void arr_schd_split_flg(boolean value) {
		arr_pr().arr_schd_split_flg(value);
	}

	/**
	 * Receipt schedule applied 入荷予定反映済.<p>
	 *
	 */
	public boolean arr_schd_refl_flg() {
		return arr_pr().arr_schd_refl_flg();
	}

	/**
	 * Receipt schedule applied 入荷予定反映済.<p>
	 *
	 */
	public void arr_schd_refl_flg(boolean value) {
		arr_pr().arr_schd_refl_flg(value);
	}

	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public boolean arr_cmpl_flg() {
		return arr_pr().arr_cmpl_flg();
	}

	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public void arr_cmpl_flg(boolean value) {
		arr_pr().arr_cmpl_flg(value);
	}

	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return arr_pr().purc_cmpl_flg();
	}

	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		arr_pr().purc_cmpl_flg(value);
	}

	/**
	 * Sales return completed 売上返品完了.<p>
	 *
	 */
	public boolean sls_ret_cmpl_flg() {
		return arr_pr().sls_ret_cmpl_flg();
	}

	/**
	 * Sales return completed 売上返品完了.<p>
	 *
	 */
	public void sls_ret_cmpl_flg(boolean value) {
		arr_pr().sls_ret_cmpl_flg(value);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return arr_pr().arr_cnt_rmrks();
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		arr_pr().arr_cnt_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return arr_pr().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		arr_pr().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return arr_pr().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		arr_pr().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return arr_pr().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		arr_pr().sub_char3(value);
	}

}

