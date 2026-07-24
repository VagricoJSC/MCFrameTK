package mcframe.serverMSBD.MSBDL5100;

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
 * ブロック"Po_Ins01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Po_Ins01_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Total amount (Transaction currency) 取引通貨合計金額.<p>
	 *
	 */
	public static final String $trd_cur_ttl_amt = "trd_cur_ttl_amt";
	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public static final String $bef_po_rev = "bef_po_rev";
	/**
	 * Issue PO sheet 注文書発行.<p>
	 *
	 */
	public static final String $prnt_po_flg = "prnt_po_flg";
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $prnt_dlv_flg = "prnt_dlv_flg";
	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public static final String $prnt_purc_ddlv_dlv_flg = "prnt_purc_ddlv_dlv_flg";
	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";
	/**
	 * Approval withdraw flg. 承認引戻ＦＬＧ.<p>
	 *
	 */
	public static final String $aprv_rvrs_flg = "aprv_rvrs_flg";
	/**
	 * Last approval No. 前回承認ＮＯ.<p>
	 *
	 */
	public static final String $bef_aprv_no = "bef_aprv_no";
	/**
	 * Last approval status type 前回承認状況区分.<p>
	 *
	 */
	public static final String $bef_aprv_sts_typ = "bef_aprv_sts_typ";
	/**
	 * Last PO sheet issued flg. 前回注文書発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $bef_po_print_flg = "bef_po_print_flg";
	/**
	 * Last EDI 前回ＥＤＩ.<p>
	 *
	 */
	public static final String $bef_edi_flg = "bef_edi_flg";
	public static final String $po = "po";
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";

	public static final String $po_no = $po + ".po_no";
	public static final String $po_rev = $po + ".po_rev";
	public static final String $trd_cd = $po + ".trd_cd";
	public static final String $trd_ptn_typ = $po + ".trd_ptn_typ";
	public static final String $purc_dpt_cd = $po + ".purc_dpt_cd";
	public static final String $wg_cd = $po + ".wg_cd";
	public static final String $purc_usr_cd = $po + ".purc_usr_cd";
	public static final String $sppl_cd = $po + ".sppl_cd";
	public static final String $sppl_cntct_dpt = $po + ".sppl_cntct_dpt";
	public static final String $sppl_cntct_psn = $po + ".sppl_cntct_psn";
	public static final String $sppl_zip_cd = $po + ".sppl_zip_cd";
	public static final String $sppl_addr1 = $po + ".sppl_addr1";
	public static final String $sppl_addr2 = $po + ".sppl_addr2";
	public static final String $sppl_addr3 = $po + ".sppl_addr3";
	public static final String $sppl_addr4 = $po + ".sppl_addr4";
	public static final String $sppl_tel = $po + ".sppl_tel";
	public static final String $sppl_fax = $po + ".sppl_fax";
	public static final String $po_dt = $po + ".po_dt";
	public static final String $upd_po_print_schd_dt = $po + ".upd_po_print_schd_dt";
	public static final String $po_print_flg = $po + ".po_print_flg";
	public static final String $last_po_rev = $po + ".last_po_rev";
	public static final String $trd_cur_cd = $po + ".trd_cur_cd";
	public static final String $xrate = $po + ".xrate";
	public static final String $xrate_inpt_flg = $po + ".xrate_inpt_flg";
	public static final String $ptax_xrate = $po + ".ptax_xrate";
	public static final String $ptax_xrate_inpt_flg = $po + ".ptax_xrate_inpt_flg";
	public static final String $crct_rsn_cd = $po + ".crct_rsn_cd";
	public static final String $po_print_cd = $po + ".po_print_cd";
	public static final String $wrk_no = $po + ".wrk_no";
	public static final String $tterm_cd1 = $po + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $po + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $po + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $po + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $po + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $po + ".tterm_rmrks3";
	public static final String $can_flg = $po + ".can_flg";
	public static final String $edi_flg = $po + ".edi_flg";
	public static final String $aprv_flg = $po + ".aprv_flg";
	public static final String $aprv_no = $po + ".aprv_no";
	public static final String $aprv_sts_typ = $po + ".aprv_sts_typ";
	public static final String $trd_rmrks = $po + ".trd_rmrks";
	public static final String $intr_rmrks = $po + ".intr_rmrks";
	public static final String $po_print_rmrks = $po + ".po_print_rmrks";
	public static final String $dlv_slip_rmrks = $po + ".dlv_slip_rmrks";
	public static final String $sub_char1 = $po + ".sub_char1";
	public static final String $sub_char2 = $po + ".sub_char2";
	public static final String $sub_char3 = $po + ".sub_char3";
	public static final String $edi_sub_char1 = $po + ".edi_sub_char1";
	public static final String $edi_sub_char2 = $po + ".edi_sub_char2";
	public static final String $edi_sub_char3 = $po + ".edi_sub_char3";
	public static final String $edi_sub_char4 = $po + ".edi_sub_char4";
	public static final String $edi_sub_char5 = $po + ".edi_sub_char5";
	public static final String $edi_sub_num1 = $po + ".edi_sub_num1";
	public static final String $edi_sub_dt1 = $po + ".edi_sub_dt1";
	public static final String $purc_if_flg = $po + ".purc_if_flg";
	public static final String $ext_sys_cd = $po + ".ext_sys_cd";
	public static final String $ext_po_no = $po + ".ext_po_no";
	public static final String $dlv_slip_form_cd = $po + ".dlv_slip_form_cd";
	public static final String $sgl_form_flg = $po + ".sgl_form_flg";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_ttl_amt_META = createCommonMeta($trd_cur_ttl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bef_po_rev_META = createCommonMeta($bef_po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta prnt_po_flg_META = createCommonMeta($prnt_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_dlv_flg_META = createCommonMeta($prnt_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_purc_ddlv_dlv_flg_META = createCommonMeta($prnt_purc_ddlv_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta aprv_rvrs_flg_META = createCommonMeta($aprv_rvrs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_aprv_no_META = createCommonMeta($bef_aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta bef_aprv_sts_typ_META = createCommonMeta($bef_aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta bef_po_print_flg_META = createCommonMeta($bef_po_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_edi_flg_META = createCommonMeta($bef_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_META = createInnerRowMeta($po, mcframe.serverMS.dbc.MST_PO_R.class);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Po_Ins01_HdrR> constMetas = new ConstMetaList<Po_Ins01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			trd_cur_ttl_amt_META,
			bef_po_rev_META,
			prnt_po_flg_META,
			prnt_dlv_flg_META,
			prnt_purc_ddlv_dlv_flg_META,
			sppl_ship_form_cd_META,
			aprv_rvrs_flg_META,
			bef_aprv_no_META,
			bef_aprv_sts_typ_META,
			bef_po_print_flg_META,
			bef_edi_flg_META,
			po_META,
			indiv_prnt_flg_META
		},
		new String[][]{
			{
				"po_no",
				"po_rev",
				"trd_cd",
				"trd_ptn_typ",
				"purc_dpt_cd",
				"wg_cd",
				"purc_usr_cd",
				"sppl_cd",
				"sppl_cntct_dpt",
				"sppl_cntct_psn",
				"sppl_zip_cd",
				"sppl_addr1",
				"sppl_addr2",
				"sppl_addr3",
				"sppl_addr4",
				"sppl_tel",
				"sppl_fax",
				"po_dt",
				"upd_po_print_schd_dt",
				"po_print_flg",
				"last_po_rev",
				"trd_cur_cd",
				"xrate",
				"xrate_inpt_flg",
				"ptax_xrate",
				"ptax_xrate_inpt_flg",
				"crct_rsn_cd",
				"po_print_cd",
				"wrk_no",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"can_flg",
				"edi_flg",
				"aprv_flg",
				"aprv_no",
				"aprv_sts_typ",
				"trd_rmrks",
				"intr_rmrks",
				"po_print_rmrks",
				"dlv_slip_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"edi_sub_char1",
				"edi_sub_char2",
				"edi_sub_char3",
				"edi_sub_char4",
				"edi_sub_char5",
				"edi_sub_num1",
				"edi_sub_dt1",
				"purc_if_flg",
				"ext_sys_cd",
				"ext_po_no",
				"dlv_slip_form_cd",
				"sgl_form_flg"
			},
			{
				$po_no,
				$po_rev,
				$trd_cd,
				$trd_ptn_typ,
				$purc_dpt_cd,
				$wg_cd,
				$purc_usr_cd,
				$sppl_cd,
				$sppl_cntct_dpt,
				$sppl_cntct_psn,
				$sppl_zip_cd,
				$sppl_addr1,
				$sppl_addr2,
				$sppl_addr3,
				$sppl_addr4,
				$sppl_tel,
				$sppl_fax,
				$po_dt,
				$upd_po_print_schd_dt,
				$po_print_flg,
				$last_po_rev,
				$trd_cur_cd,
				$xrate,
				$xrate_inpt_flg,
				$ptax_xrate,
				$ptax_xrate_inpt_flg,
				$crct_rsn_cd,
				$po_print_cd,
				$wrk_no,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$can_flg,
				$edi_flg,
				$aprv_flg,
				$aprv_no,
				$aprv_sts_typ,
				$trd_rmrks,
				$intr_rmrks,
				$po_print_rmrks,
				$dlv_slip_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$edi_sub_char1,
				$edi_sub_char2,
				$edi_sub_char3,
				$edi_sub_char4,
				$edi_sub_char5,
				$edi_sub_num1,
				$edi_sub_dt1,
				$purc_if_flg,
				$ext_sys_cd,
				$ext_po_no,
				$dlv_slip_form_cd,
				$sgl_form_flg
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
	protected Po_Ins01_HdrR_MC_A(ConstMetaList<? extends Po_Ins01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Po_Ins01_HdrR clone() {
		return (Po_Ins01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Po_Ins01_HdrR createInstance() {
		return (Po_Ins01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Po_Ins01_HdrR getValues(String... names) {
		return (Po_Ins01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Total amount (Transaction currency) 取引通貨合計金額.<p>
	 *
	 */
	public MCNumber trd_cur_ttl_amt() {
		return getConstNumber(offset + 3, $trd_cur_ttl_amt);
	}

	/**
	 * Total amount (Transaction currency) 取引通貨合計金額.<p>
	 *
	 */
	public void trd_cur_ttl_amt(MCNumber value) {
		setConstNumber(offset + 3, $trd_cur_ttl_amt, value);
	}

	/**
	 * Total amount (Transaction currency) 取引通貨合計金額.<p>
	 *
	 */
	public void trd_cur_ttl_amt(int value) {
		setConstNumber(offset + 3, $trd_cur_ttl_amt, value);
	}

	/**
	 * Total amount (Transaction currency) 取引通貨合計金額.<p>
	 *
	 */
	public void trd_cur_ttl_amt(long value) {
		setConstNumber(offset + 3, $trd_cur_ttl_amt, value);
	}

	/**
	 * Total amount (Transaction currency) 取引通貨合計金額.<p>
	 *
	 */
	public void trd_cur_ttl_amt(float value) {
		setConstNumber(offset + 3, $trd_cur_ttl_amt, value);
	}

	/**
	 * Total amount (Transaction currency) 取引通貨合計金額.<p>
	 *
	 */
	public void trd_cur_ttl_amt(double value) {
		setConstNumber(offset + 3, $trd_cur_ttl_amt, value);
	}


	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public MCNumber bef_po_rev() {
		return getConstNumber(offset + 4, $bef_po_rev);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(MCNumber value) {
		setConstNumber(offset + 4, $bef_po_rev, value);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(int value) {
		setConstNumber(offset + 4, $bef_po_rev, value);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(long value) {
		setConstNumber(offset + 4, $bef_po_rev, value);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(float value) {
		setConstNumber(offset + 4, $bef_po_rev, value);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(double value) {
		setConstNumber(offset + 4, $bef_po_rev, value);
	}


	/**
	 * Issue PO sheet 注文書発行.<p>
	 *
	 */
	public boolean prnt_po_flg() {
		return getConstBoolean(offset + 5, $prnt_po_flg);
	}

	/**
	 * Issue PO sheet 注文書発行.<p>
	 *
	 */
	public void prnt_po_flg(boolean value) {
		setConstBoolean(offset + 5, $prnt_po_flg, value);
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean prnt_dlv_flg() {
		return getConstBoolean(offset + 6, $prnt_dlv_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void prnt_dlv_flg(boolean value) {
		setConstBoolean(offset + 6, $prnt_dlv_flg, value);
	}


	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public boolean prnt_purc_ddlv_dlv_flg() {
		return getConstBoolean(offset + 7, $prnt_purc_ddlv_dlv_flg);
	}

	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public void prnt_purc_ddlv_dlv_flg(boolean value) {
		setConstBoolean(offset + 7, $prnt_purc_ddlv_dlv_flg, value);
	}


	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 8, $sppl_ship_form_cd);
	}

	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 8, $sppl_ship_form_cd, value);
	}


	/**
	 * Approval withdraw flg. 承認引戻ＦＬＧ.<p>
	 *
	 */
	public boolean aprv_rvrs_flg() {
		return getConstBoolean(offset + 9, $aprv_rvrs_flg);
	}

	/**
	 * Approval withdraw flg. 承認引戻ＦＬＧ.<p>
	 *
	 */
	public void aprv_rvrs_flg(boolean value) {
		setConstBoolean(offset + 9, $aprv_rvrs_flg, value);
	}


	/**
	 * Last approval No. 前回承認ＮＯ.<p>
	 *
	 */
	public String bef_aprv_no() {
		return getConstString(offset + 10, $bef_aprv_no);
	}

	/**
	 * Last approval No. 前回承認ＮＯ.<p>
	 *
	 */
	public void bef_aprv_no(String value) {
		setConstString(offset + 10, $bef_aprv_no, value);
	}


	/**
	 * Last approval status type 前回承認状況区分.<p>
	 *
	 */
	public String bef_aprv_sts_typ() {
		return getConstString(offset + 11, $bef_aprv_sts_typ);
	}

	/**
	 * Last approval status type 前回承認状況区分.<p>
	 *
	 */
	public void bef_aprv_sts_typ(String value) {
		setConstString(offset + 11, $bef_aprv_sts_typ, value);
	}


	/**
	 * Last PO sheet issued flg. 前回注文書発行済ＦＬＧ.<p>
	 *
	 */
	public boolean bef_po_print_flg() {
		return getConstBoolean(offset + 12, $bef_po_print_flg);
	}

	/**
	 * Last PO sheet issued flg. 前回注文書発行済ＦＬＧ.<p>
	 *
	 */
	public void bef_po_print_flg(boolean value) {
		setConstBoolean(offset + 12, $bef_po_print_flg, value);
	}


	/**
	 * Last EDI 前回ＥＤＩ.<p>
	 *
	 */
	public boolean bef_edi_flg() {
		return getConstBoolean(offset + 13, $bef_edi_flg);
	}

	/**
	 * Last EDI 前回ＥＤＩ.<p>
	 *
	 */
	public void bef_edi_flg(boolean value) {
		setConstBoolean(offset + 13, $bef_edi_flg, value);
	}


	public mcframe.serverMS.dbc.MST_PO_R po(){
		return (mcframe.serverMS.dbc.MST_PO_R) getConstInnerRow(offset + 14, $po);
	}
	
	public void po(mcframe.serverMS.dbc.MST_PO_R row){
		setConstInnerRow(offset + 14, $po, row);
	}


	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 15, $indiv_prnt_flg);
	}

	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 15, $indiv_prnt_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($bef_aprv_no.equalsIgnoreCase(name)) {
			return bef_aprv_no();
		}
		if ($bef_aprv_sts_typ.equalsIgnoreCase(name)) {
			return bef_aprv_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			return trd_cur_ttl_amt();
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			return bef_po_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			return prnt_po_flg();
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_dlv_flg();
		}
		if ($prnt_purc_ddlv_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_purc_ddlv_dlv_flg();
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			return aprv_rvrs_flg();
		}
		if ($bef_po_print_flg.equalsIgnoreCase(name)) {
			return bef_po_print_flg();
		}
		if ($bef_edi_flg.equalsIgnoreCase(name)) {
			return bef_edi_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($bef_aprv_no.equalsIgnoreCase(name)) {
			return bef_aprv_no();
		}
		if ($bef_aprv_sts_typ.equalsIgnoreCase(name)) {
			return bef_aprv_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			return trd_cur_ttl_amt();
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			return bef_po_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			return prnt_po_flg();
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_dlv_flg();
		}
		if ($prnt_purc_ddlv_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_purc_ddlv_dlv_flg();
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			return aprv_rvrs_flg();
		}
		if ($bef_po_print_flg.equalsIgnoreCase(name)) {
			return bef_po_print_flg();
		}
		if ($bef_edi_flg.equalsIgnoreCase(name)) {
			return bef_edi_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($bef_aprv_no.equalsIgnoreCase(name)) {
			bef_aprv_no(value);
			return;
		}
		if ($bef_aprv_sts_typ.equalsIgnoreCase(name)) {
			bef_aprv_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			prnt_po_flg(value);
			return;
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			prnt_dlv_flg(value);
			return;
		}
		if ($prnt_purc_ddlv_dlv_flg.equalsIgnoreCase(name)) {
			prnt_purc_ddlv_dlv_flg(value);
			return;
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			aprv_rvrs_flg(value);
			return;
		}
		if ($bef_po_print_flg.equalsIgnoreCase(name)) {
			bef_po_print_flg(value);
			return;
		}
		if ($bef_edi_flg.equalsIgnoreCase(name)) {
			bef_edi_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($bef_aprv_no.equalsIgnoreCase(name)) {
			bef_aprv_no(value);
			return;
		}
		if ($bef_aprv_sts_typ.equalsIgnoreCase(name)) {
			bef_aprv_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_ttl_amt.equalsIgnoreCase(name)) {
			trd_cur_ttl_amt(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			prnt_po_flg(value);
			return;
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			prnt_dlv_flg(value);
			return;
		}
		if ($prnt_purc_ddlv_dlv_flg.equalsIgnoreCase(name)) {
			prnt_purc_ddlv_dlv_flg(value);
			return;
		}
		if ($aprv_rvrs_flg.equalsIgnoreCase(name)) {
			aprv_rvrs_flg(value);
			return;
		}
		if ($bef_po_print_flg.equalsIgnoreCase(name)) {
			bef_po_print_flg(value);
			return;
		}
		if ($bef_edi_flg.equalsIgnoreCase(name)) {
			bef_edi_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($po.equalsIgnoreCase(name)) {
			return po();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($po.equalsIgnoreCase(name)) {
			po(
				((MCContainerMeta) po_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return po().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		po().po_no(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return po().po_rev();
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		po().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		po().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		po().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		po().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		po().po_rev(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return po().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		po().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return po().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		po().trd_ptn_typ(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return po().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		po().purc_dpt_cd(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return po().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		po().wg_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return po().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		po().purc_usr_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return po().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		po().sppl_cd(value);
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return po().sppl_cntct_dpt();
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		po().sppl_cntct_dpt(value);
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return po().sppl_cntct_psn();
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		po().sppl_cntct_psn(value);
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return po().sppl_zip_cd();
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		po().sppl_zip_cd(value);
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return po().sppl_addr1();
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		po().sppl_addr1(value);
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return po().sppl_addr2();
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		po().sppl_addr2(value);
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return po().sppl_addr3();
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		po().sppl_addr3(value);
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return po().sppl_addr4();
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		po().sppl_addr4(value);
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public String sppl_tel() {
		return po().sppl_tel();
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public void sppl_tel(String value) {
		po().sppl_tel(value);
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public String sppl_fax() {
		return po().sppl_fax();
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public void sppl_fax(String value) {
		po().sppl_fax(value);
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public MCDate po_dt() {
		return po().po_dt();
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		po().po_dt(value);
	}

	/**
	 * Scheduled change PO sheet issue date after change 変更注文書発行予定日.<p>
	 *
	 */
	public MCDate upd_po_print_schd_dt() {
		return po().upd_po_print_schd_dt();
	}

	/**
	 * Scheduled change PO sheet issue date after change 変更注文書発行予定日.<p>
	 *
	 */
	public void upd_po_print_schd_dt(MCDate value) {
		po().upd_po_print_schd_dt(value);
	}

	/**
	 * PO sheet issued flg. 注文書発行済ＦＬＧ.<p>
	 *
	 */
	public boolean po_print_flg() {
		return po().po_print_flg();
	}

	/**
	 * PO sheet issued flg. 注文書発行済ＦＬＧ.<p>
	 *
	 */
	public void po_print_flg(boolean value) {
		po().po_print_flg(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public MCNumber last_po_rev() {
		return po().last_po_rev();
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(MCNumber value) {
		po().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(int value) {
		po().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(long value) {
		po().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(float value) {
		po().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(double value) {
		po().last_po_rev(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return po().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		po().trd_cur_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return po().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		po().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		po().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		po().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		po().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		po().xrate(value);
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return po().xrate_inpt_flg();
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		po().xrate_inpt_flg(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return po().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		po().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		po().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		po().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		po().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		po().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return po().ptax_xrate_inpt_flg();
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		po().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Correction reason cd. 訂正理由ＣＤ.<p>
	 *
	 */
	public String crct_rsn_cd() {
		return po().crct_rsn_cd();
	}

	/**
	 * Correction reason cd. 訂正理由ＣＤ.<p>
	 *
	 */
	public void crct_rsn_cd(String value) {
		po().crct_rsn_cd(value);
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return po().po_print_cd();
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		po().po_print_cd(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return po().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		po().wrk_no(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return po().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		po().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return po().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		po().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return po().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		po().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return po().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		po().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return po().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		po().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return po().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		po().tterm_rmrks3(value);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return po().can_flg();
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		po().can_flg(value);
	}

	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return po().edi_flg();
	}

	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		po().edi_flg(value);
	}

	/**
	 * For approval flg. 承認対象ＦＬＧ.<p>
	 *
	 */
	public boolean aprv_flg() {
		return po().aprv_flg();
	}

	/**
	 * For approval flg. 承認対象ＦＬＧ.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		po().aprv_flg(value);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return po().aprv_no();
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		po().aprv_no(value);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return po().aprv_sts_typ();
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		po().aprv_sts_typ(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return po().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		po().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return po().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		po().intr_rmrks(value);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return po().po_print_rmrks();
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		po().po_print_rmrks(value);
	}

	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public String dlv_slip_rmrks() {
		return po().dlv_slip_rmrks();
	}

	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public void dlv_slip_rmrks(String value) {
		po().dlv_slip_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return po().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		po().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return po().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		po().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return po().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		po().sub_char3(value);
	}

	/**
	 * EDI spare character string 1 ＥＤＩ予備文字列１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return po().edi_sub_char1();
	}

	/**
	 * EDI spare character string 1 ＥＤＩ予備文字列１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		po().edi_sub_char1(value);
	}

	/**
	 * EDI spare character string 2 ＥＤＩ予備文字列２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return po().edi_sub_char2();
	}

	/**
	 * EDI spare character string 2 ＥＤＩ予備文字列２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		po().edi_sub_char2(value);
	}

	/**
	 * EDI spare character string 3 ＥＤＩ予備文字列３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return po().edi_sub_char3();
	}

	/**
	 * EDI spare character string 3 ＥＤＩ予備文字列３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		po().edi_sub_char3(value);
	}

	/**
	 * EDI spare character string 4 ＥＤＩ予備文字列４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return po().edi_sub_char4();
	}

	/**
	 * EDI spare character string 4 ＥＤＩ予備文字列４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		po().edi_sub_char4(value);
	}

	/**
	 * EDI spare character string 5 ＥＤＩ予備文字列５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return po().edi_sub_char5();
	}

	/**
	 * EDI spare character string 5 ＥＤＩ予備文字列５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		po().edi_sub_char5(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return po().edi_sub_num1();
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		po().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		po().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		po().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		po().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		po().edi_sub_num1(value);
	}

	/**
	 * EDI spare date ＥＤＩ予備日付.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return po().edi_sub_dt1();
	}

	/**
	 * EDI spare date ＥＤＩ予備日付.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		po().edi_sub_dt1(value);
	}

	/**
	 * Purchasing IF 購買ＩＦ.<p>
	 *
	 */
	public boolean purc_if_flg() {
		return po().purc_if_flg();
	}

	/**
	 * Purchasing IF 購買ＩＦ.<p>
	 *
	 */
	public void purc_if_flg(boolean value) {
		po().purc_if_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return po().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		po().ext_sys_cd(value);
	}

	/**
	 * External PO No. 外部発注ＮＯ.<p>
	 *
	 */
	public String ext_po_no() {
		return po().ext_po_no();
	}

	/**
	 * External PO No. 外部発注ＮＯ.<p>
	 *
	 */
	public void ext_po_no(String value) {
		po().ext_po_no(value);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String dlv_slip_form_cd() {
		return po().dlv_slip_form_cd();
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void dlv_slip_form_cd(String value) {
		po().dlv_slip_form_cd(value);
	}

	/**
	 * Single slip flg. 単票ＦＬＧ.<p>
	 *
	 */
	public boolean sgl_form_flg() {
		return po().sgl_form_flg();
	}

	/**
	 * Single slip flg. 単票ＦＬＧ.<p>
	 *
	 */
	public void sgl_form_flg(boolean value) {
		po().sgl_form_flg(value);
	}

}

