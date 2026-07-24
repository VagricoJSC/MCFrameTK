package mcframe.serverMSBD.MSBDL5200;

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
 * ブロック"PurcPrnt_Upd01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcPrnt_Upd01_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $dlv_slip_prnt_flg = "dlv_slip_prnt_flg";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	public static final String $pds = "pds";
	/**
	 * (Before change) Delivery note management sequence number （変更前）納品書管理連番.<p>
	 *
	 */
	public static final String $old_dlv_slip_mng_seq = "old_dlv_slip_mng_seq";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Header update flg. ヘッダ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $hdr_upd_flg = "hdr_upd_flg";
	/**
	 * Direct supply flg. 支給直送ＦＬＧ.<p>
	 *
	 */
	public static final String $prov_ddlv_flg = "prov_ddlv_flg";
	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_ddlv_flg = "purc_ddlv_flg";

	public static final String $dlv_slip_mng_no = $pds + ".dlv_slip_mng_no";
	public static final String $dlv_slip_mng_seq = $pds + ".dlv_slip_mng_seq";
	public static final String $dlv_slip_no = $pds + ".dlv_slip_no";
	public static final String $dlv_slip_seq = $pds + ".dlv_slip_seq";
	public static final String $dlv_slip_rev = $pds + ".dlv_slip_rev";
	public static final String $slip_sts_typ = $pds + ".slip_sts_typ";
	public static final String $po_no = $pds + ".po_no";
	public static final String $po_rev = $pds + ".po_rev";
	public static final String $last_po_rev = $pds + ".last_po_rev";
	public static final String $dlv_inst_grp_no = $pds + ".dlv_inst_grp_no";
	public static final String $prms_rcpt_grp_no = $pds + ".prms_rcpt_grp_no";
	public static final String $purc_dlv_slip_src_typ = $pds + ".purc_dlv_slip_src_typ";
	public static final String $dpt_cd = $pds + ".dpt_cd";
	public static final String $usr_cd = $pds + ".usr_cd";
	public static final String $dlv_rqst_tm = $pds + ".dlv_rqst_tm";
	public static final String $trd_cd = $pds + ".trd_cd";
	public static final String $trd_ptn_typ = $pds + ".trd_ptn_typ";
	public static final String $trd_cur_cd = $pds + ".trd_cur_cd";
	public static final String $trd_cur_nm = $pds + ".trd_cur_nm";
	public static final String $trd_cur_amt = $pds + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $pds + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $pds + ".trd_cur_dscnt_amt";
	public static final String $base_cur_amt = $pds + ".base_cur_amt";
	public static final String $base_cur_tax_amt = $pds + ".base_cur_tax_amt";
	public static final String $base_cur_dscnt_amt = $pds + ".base_cur_dscnt_amt";
	public static final String $xrate = $pds + ".xrate";
	public static final String $ptax_xrate = $pds + ".ptax_xrate";
	public static final String $slip_line_max = $pds + ".slip_line_max";
	public static final String $bp_cd = $pds + ".bp_cd";
	public static final String $arr_loc_cd = $pds + ".arr_loc_cd";
	public static final String $arr_loc_nm = $pds + ".arr_loc_nm";
	public static final String $arr_loc_zip_cd = $pds + ".arr_loc_zip_cd";
	public static final String $arr_loc_addr1 = $pds + ".arr_loc_addr1";
	public static final String $arr_loc_addr2 = $pds + ".arr_loc_addr2";
	public static final String $arr_loc_addr3 = $pds + ".arr_loc_addr3";
	public static final String $arr_loc_addr4 = $pds + ".arr_loc_addr4";
	public static final String $bp_cntct_dpt = $pds + ".bp_cntct_dpt";
	public static final String $bp_cntct_psn = $pds + ".bp_cntct_psn";
	public static final String $arr_loc_tel = $pds + ".arr_loc_tel";
	public static final String $arr_loc_fax = $pds + ".arr_loc_fax";
	public static final String $sppl_id_typ = $pds + ".sppl_id_typ";
	public static final String $sppl_id_cd = $pds + ".sppl_id_cd";
	public static final String $sppl_id_nm = $pds + ".sppl_id_nm";
	public static final String $sppl_sundry_flg = $pds + ".sppl_sundry_flg";
	public static final String $sppl_zip_cd = $pds + ".sppl_zip_cd";
	public static final String $sppl_addr1 = $pds + ".sppl_addr1";
	public static final String $sppl_addr2 = $pds + ".sppl_addr2";
	public static final String $sppl_addr3 = $pds + ".sppl_addr3";
	public static final String $sppl_addr4 = $pds + ".sppl_addr4";
	public static final String $sppl_cntct_dpt = $pds + ".sppl_cntct_dpt";
	public static final String $sppl_cntct_psn = $pds + ".sppl_cntct_psn";
	public static final String $sppl_tel = $pds + ".sppl_tel";
	public static final String $sppl_fax = $pds + ".sppl_fax";
	public static final String $wg_cd = $pds + ".wg_cd";
	public static final String $trd_rmrks = $pds + ".trd_rmrks";
	public static final String $slip_prnt_flg = $pds + ".slip_prnt_flg";
	public static final String $sub_char1 = $pds + ".sub_char1";
	public static final String $sub_char2 = $pds + ".sub_char2";
	public static final String $sub_char3 = $pds + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta dlv_slip_prnt_flg_META = createCommonMeta($dlv_slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta pds_META = createInnerRowMeta($pds, mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_R.class);
	public static final MCMeta old_dlv_slip_mng_seq_META = createCommonMeta($old_dlv_slip_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta hdr_upd_flg_META = createCommonMeta($hdr_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_ddlv_flg_META = createCommonMeta($prov_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_flg_META = createCommonMeta($purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PurcPrnt_Upd01_HdrR> constMetas = new ConstMetaList<PurcPrnt_Upd01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			hdr_peg_no_META,
			data_crud_typ_META,
			dlv_slip_prnt_flg_META,
			po_d_no_META,
			pds_META,
			old_dlv_slip_mng_seq_META,
			arr_schd_no_META,
			hdr_upd_flg_META,
			prov_ddlv_flg_META,
			purc_ddlv_flg_META
		},
		new String[][]{
			{
				"dlv_slip_mng_no",
				"dlv_slip_mng_seq",
				"dlv_slip_no",
				"dlv_slip_seq",
				"dlv_slip_rev",
				"slip_sts_typ",
				"po_no",
				"po_rev",
				"last_po_rev",
				"dlv_inst_grp_no",
				"prms_rcpt_grp_no",
				"purc_dlv_slip_src_typ",
				"dpt_cd",
				"usr_cd",
				"dlv_rqst_tm",
				"trd_cd",
				"trd_ptn_typ",
				"trd_cur_cd",
				"trd_cur_nm",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_dscnt_amt",
				"xrate",
				"ptax_xrate",
				"slip_line_max",
				"bp_cd",
				"arr_loc_cd",
				"arr_loc_nm",
				"arr_loc_zip_cd",
				"arr_loc_addr1",
				"arr_loc_addr2",
				"arr_loc_addr3",
				"arr_loc_addr4",
				"bp_cntct_dpt",
				"bp_cntct_psn",
				"arr_loc_tel",
				"arr_loc_fax",
				"sppl_id_typ",
				"sppl_id_cd",
				"sppl_id_nm",
				"sppl_sundry_flg",
				"sppl_zip_cd",
				"sppl_addr1",
				"sppl_addr2",
				"sppl_addr3",
				"sppl_addr4",
				"sppl_cntct_dpt",
				"sppl_cntct_psn",
				"sppl_tel",
				"sppl_fax",
				"wg_cd",
				"trd_rmrks",
				"slip_prnt_flg",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$dlv_slip_mng_no,
				$dlv_slip_mng_seq,
				$dlv_slip_no,
				$dlv_slip_seq,
				$dlv_slip_rev,
				$slip_sts_typ,
				$po_no,
				$po_rev,
				$last_po_rev,
				$dlv_inst_grp_no,
				$prms_rcpt_grp_no,
				$purc_dlv_slip_src_typ,
				$dpt_cd,
				$usr_cd,
				$dlv_rqst_tm,
				$trd_cd,
				$trd_ptn_typ,
				$trd_cur_cd,
				$trd_cur_nm,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_dscnt_amt,
				$xrate,
				$ptax_xrate,
				$slip_line_max,
				$bp_cd,
				$arr_loc_cd,
				$arr_loc_nm,
				$arr_loc_zip_cd,
				$arr_loc_addr1,
				$arr_loc_addr2,
				$arr_loc_addr3,
				$arr_loc_addr4,
				$bp_cntct_dpt,
				$bp_cntct_psn,
				$arr_loc_tel,
				$arr_loc_fax,
				$sppl_id_typ,
				$sppl_id_cd,
				$sppl_id_nm,
				$sppl_sundry_flg,
				$sppl_zip_cd,
				$sppl_addr1,
				$sppl_addr2,
				$sppl_addr3,
				$sppl_addr4,
				$sppl_cntct_dpt,
				$sppl_cntct_psn,
				$sppl_tel,
				$sppl_fax,
				$wg_cd,
				$trd_rmrks,
				$slip_prnt_flg,
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
	protected PurcPrnt_Upd01_HdrR_MC_A(ConstMetaList<? extends PurcPrnt_Upd01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Upd01_HdrR clone() {
		return (PurcPrnt_Upd01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Upd01_HdrR createInstance() {
		return (PurcPrnt_Upd01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Upd01_HdrR getValues(String... names) {
		return (PurcPrnt_Upd01_HdrR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 2, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 2, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 2, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 2, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 2, $hdr_peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean dlv_slip_prnt_flg() {
		return getConstBoolean(offset + 4, $dlv_slip_prnt_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void dlv_slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $dlv_slip_prnt_flg, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 5, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 5, $po_d_no, value);
	}


	public mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_R pds(){
		return (mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_R) getConstInnerRow(offset + 6, $pds);
	}
	
	public void pds(mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_R row){
		setConstInnerRow(offset + 6, $pds, row);
	}


	/**
	 * (Before change) Delivery note management sequence number （変更前）納品書管理連番.<p>
	 *
	 */
	public MCNumber old_dlv_slip_mng_seq() {
		return getConstNumber(offset + 7, $old_dlv_slip_mng_seq);
	}

	/**
	 * (Before change) Delivery note management sequence number （変更前）納品書管理連番.<p>
	 *
	 */
	public void old_dlv_slip_mng_seq(MCNumber value) {
		setConstNumber(offset + 7, $old_dlv_slip_mng_seq, value);
	}

	/**
	 * (Before change) Delivery note management sequence number （変更前）納品書管理連番.<p>
	 *
	 */
	public void old_dlv_slip_mng_seq(int value) {
		setConstNumber(offset + 7, $old_dlv_slip_mng_seq, value);
	}

	/**
	 * (Before change) Delivery note management sequence number （変更前）納品書管理連番.<p>
	 *
	 */
	public void old_dlv_slip_mng_seq(long value) {
		setConstNumber(offset + 7, $old_dlv_slip_mng_seq, value);
	}

	/**
	 * (Before change) Delivery note management sequence number （変更前）納品書管理連番.<p>
	 *
	 */
	public void old_dlv_slip_mng_seq(float value) {
		setConstNumber(offset + 7, $old_dlv_slip_mng_seq, value);
	}

	/**
	 * (Before change) Delivery note management sequence number （変更前）納品書管理連番.<p>
	 *
	 */
	public void old_dlv_slip_mng_seq(double value) {
		setConstNumber(offset + 7, $old_dlv_slip_mng_seq, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 8, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 8, $arr_schd_no, value);
	}


	/**
	 * Header update flg. ヘッダ更新ＦＬＧ.<p>
	 *
	 */
	public boolean hdr_upd_flg() {
		return getConstBoolean(offset + 9, $hdr_upd_flg);
	}

	/**
	 * Header update flg. ヘッダ更新ＦＬＧ.<p>
	 *
	 */
	public void hdr_upd_flg(boolean value) {
		setConstBoolean(offset + 9, $hdr_upd_flg, value);
	}


	/**
	 * Direct supply flg. 支給直送ＦＬＧ.<p>
	 *
	 */
	public boolean prov_ddlv_flg() {
		return getConstBoolean(offset + 10, $prov_ddlv_flg);
	}

	/**
	 * Direct supply flg. 支給直送ＦＬＧ.<p>
	 *
	 */
	public void prov_ddlv_flg(boolean value) {
		setConstBoolean(offset + 10, $prov_ddlv_flg, value);
	}


	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return getConstBoolean(offset + 11, $purc_ddlv_flg);
	}

	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 11, $purc_ddlv_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return old_dlv_slip_mng_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($hdr_upd_flg.equalsIgnoreCase(name)) {
			return hdr_upd_flg();
		}
		if ($prov_ddlv_flg.equalsIgnoreCase(name)) {
			return prov_ddlv_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return old_dlv_slip_mng_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($hdr_upd_flg.equalsIgnoreCase(name)) {
			return hdr_upd_flg();
		}
		if ($prov_ddlv_flg.equalsIgnoreCase(name)) {
			return prov_ddlv_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($hdr_upd_flg.equalsIgnoreCase(name)) {
			hdr_upd_flg(value);
			return;
		}
		if ($prov_ddlv_flg.equalsIgnoreCase(name)) {
			prov_ddlv_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($old_dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			old_dlv_slip_mng_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($hdr_upd_flg.equalsIgnoreCase(name)) {
			hdr_upd_flg(value);
			return;
		}
		if ($prov_ddlv_flg.equalsIgnoreCase(name)) {
			prov_ddlv_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pds.equalsIgnoreCase(name)) {
			return pds();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pds.equalsIgnoreCase(name)) {
			pds(
				((MCContainerMeta) pds_META).castInnerRow(mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return pds().dlv_slip_mng_no();
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		pds().dlv_slip_mng_no(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return pds().dlv_slip_mng_seq();
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		pds().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		pds().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		pds().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		pds().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		pds().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return pds().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		pds().dlv_slip_no(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return pds().dlv_slip_seq();
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		pds().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		pds().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		pds().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		pds().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		pds().dlv_slip_seq(value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return pds().dlv_slip_rev();
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		pds().dlv_slip_rev(value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		pds().dlv_slip_rev(value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		pds().dlv_slip_rev(value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		pds().dlv_slip_rev(value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		pds().dlv_slip_rev(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return pds().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		pds().slip_sts_typ(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return pds().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		pds().po_no(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return pds().po_rev();
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		pds().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		pds().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		pds().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		pds().po_rev(value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		pds().po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public MCNumber last_po_rev() {
		return pds().last_po_rev();
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(MCNumber value) {
		pds().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(int value) {
		pds().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(long value) {
		pds().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(float value) {
		pds().last_po_rev(value);
	}

	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public void last_po_rev(double value) {
		pds().last_po_rev(value);
	}

	/**
	 * Delivery order G No. 納入指示ＧＮＯ.<p>
	 *
	 */
	public String dlv_inst_grp_no() {
		return pds().dlv_inst_grp_no();
	}

	/**
	 * Delivery order G No. 納入指示ＧＮＯ.<p>
	 *
	 */
	public void dlv_inst_grp_no(String value) {
		pds().dlv_inst_grp_no(value);
	}

	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public String prms_rcpt_grp_no() {
		return pds().prms_rcpt_grp_no();
	}

	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public void prms_rcpt_grp_no(String value) {
		pds().prms_rcpt_grp_no(value);
	}

	/**
	 * Purchase delivery note creating source type 購買納品書作成元区分.<p>
	 *
	 */
	public String purc_dlv_slip_src_typ() {
		return pds().purc_dlv_slip_src_typ();
	}

	/**
	 * Purchase delivery note creating source type 購買納品書作成元区分.<p>
	 *
	 */
	public void purc_dlv_slip_src_typ(String value) {
		pds().purc_dlv_slip_src_typ(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return pds().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		pds().dpt_cd(value);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return pds().usr_cd();
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		pds().usr_cd(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return pds().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		pds().dlv_rqst_tm(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return pds().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		pds().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return pds().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		pds().trd_ptn_typ(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return pds().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		pds().trd_cur_cd(value);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return pds().trd_cur_nm();
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		pds().trd_cur_nm(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return pds().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		pds().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		pds().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		pds().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		pds().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		pds().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return pds().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		pds().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		pds().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		pds().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		pds().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		pds().trd_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return pds().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		pds().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		pds().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		pds().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		pds().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		pds().trd_cur_dscnt_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return pds().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		pds().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		pds().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		pds().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		pds().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		pds().base_cur_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return pds().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		pds().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		pds().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		pds().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		pds().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		pds().base_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return pds().base_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		pds().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		pds().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		pds().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		pds().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		pds().base_cur_dscnt_amt(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return pds().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		pds().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		pds().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		pds().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		pds().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		pds().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return pds().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		pds().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		pds().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		pds().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		pds().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		pds().ptax_xrate(value);
	}

	/**
	 * Slip rows max number 伝票行数最大値.<p>
	 *
	 */
	public MCNumber slip_line_max() {
		return pds().slip_line_max();
	}

	/**
	 * Slip rows max number 伝票行数最大値.<p>
	 *
	 */
	public void slip_line_max(MCNumber value) {
		pds().slip_line_max(value);
	}

	/**
	 * Slip rows max number 伝票行数最大値.<p>
	 *
	 */
	public void slip_line_max(int value) {
		pds().slip_line_max(value);
	}

	/**
	 * Slip rows max number 伝票行数最大値.<p>
	 *
	 */
	public void slip_line_max(long value) {
		pds().slip_line_max(value);
	}

	/**
	 * Slip rows max number 伝票行数最大値.<p>
	 *
	 */
	public void slip_line_max(float value) {
		pds().slip_line_max(value);
	}

	/**
	 * Slip rows max number 伝票行数最大値.<p>
	 *
	 */
	public void slip_line_max(double value) {
		pds().slip_line_max(value);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return pds().bp_cd();
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		pds().bp_cd(value);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return pds().arr_loc_cd();
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		pds().arr_loc_cd(value);
	}

	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public String arr_loc_nm() {
		return pds().arr_loc_nm();
	}

	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public void arr_loc_nm(String value) {
		pds().arr_loc_nm(value);
	}

	/**
	 * Receipt location zip code 入荷場所郵便番号.<p>
	 *
	 */
	public String arr_loc_zip_cd() {
		return pds().arr_loc_zip_cd();
	}

	/**
	 * Receipt location zip code 入荷場所郵便番号.<p>
	 *
	 */
	public void arr_loc_zip_cd(String value) {
		pds().arr_loc_zip_cd(value);
	}

	/**
	 * Receipt location address 1 入荷場所住所１.<p>
	 *
	 */
	public String arr_loc_addr1() {
		return pds().arr_loc_addr1();
	}

	/**
	 * Receipt location address 1 入荷場所住所１.<p>
	 *
	 */
	public void arr_loc_addr1(String value) {
		pds().arr_loc_addr1(value);
	}

	/**
	 * Receipt location address 2 入荷場所住所２.<p>
	 *
	 */
	public String arr_loc_addr2() {
		return pds().arr_loc_addr2();
	}

	/**
	 * Receipt location address 2 入荷場所住所２.<p>
	 *
	 */
	public void arr_loc_addr2(String value) {
		pds().arr_loc_addr2(value);
	}

	/**
	 * Receipt location address 3 入荷場所住所３.<p>
	 *
	 */
	public String arr_loc_addr3() {
		return pds().arr_loc_addr3();
	}

	/**
	 * Receipt location address 3 入荷場所住所３.<p>
	 *
	 */
	public void arr_loc_addr3(String value) {
		pds().arr_loc_addr3(value);
	}

	/**
	 * Receipt location address 4 入荷場所住所４.<p>
	 *
	 */
	public String arr_loc_addr4() {
		return pds().arr_loc_addr4();
	}

	/**
	 * Receipt location address 4 入荷場所住所４.<p>
	 *
	 */
	public void arr_loc_addr4(String value) {
		pds().arr_loc_addr4(value);
	}

	/**
	 * BP dept. 取引先部署.<p>
	 *
	 */
	public String bp_cntct_dpt() {
		return pds().bp_cntct_dpt();
	}

	/**
	 * BP dept. 取引先部署.<p>
	 *
	 */
	public void bp_cntct_dpt(String value) {
		pds().bp_cntct_dpt(value);
	}

	/**
	 * BP PIC 取引先担当者.<p>
	 *
	 */
	public String bp_cntct_psn() {
		return pds().bp_cntct_psn();
	}

	/**
	 * BP PIC 取引先担当者.<p>
	 *
	 */
	public void bp_cntct_psn(String value) {
		pds().bp_cntct_psn(value);
	}

	/**
	 * Receipt location TEL 入荷場所ＴＥＬ.<p>
	 *
	 */
	public String arr_loc_tel() {
		return pds().arr_loc_tel();
	}

	/**
	 * Receipt location TEL 入荷場所ＴＥＬ.<p>
	 *
	 */
	public void arr_loc_tel(String value) {
		pds().arr_loc_tel(value);
	}

	/**
	 * Receipt location FAX 入荷場所ＦＡＸ.<p>
	 *
	 */
	public String arr_loc_fax() {
		return pds().arr_loc_fax();
	}

	/**
	 * Receipt location FAX 入荷場所ＦＡＸ.<p>
	 *
	 */
	public void arr_loc_fax(String value) {
		pds().arr_loc_fax(value);
	}

	/**
	 * Supplier identification type 発注先識別区分.<p>
	 *
	 */
	public String sppl_id_typ() {
		return pds().sppl_id_typ();
	}

	/**
	 * Supplier identification type 発注先識別区分.<p>
	 *
	 */
	public void sppl_id_typ(String value) {
		pds().sppl_id_typ(value);
	}

	/**
	 * Supplier identification cd. 発注先識別ＣＤ.<p>
	 *
	 */
	public String sppl_id_cd() {
		return pds().sppl_id_cd();
	}

	/**
	 * Supplier identification cd. 発注先識別ＣＤ.<p>
	 *
	 */
	public void sppl_id_cd(String value) {
		pds().sppl_id_cd(value);
	}

	/**
	 * Supplier identification name 発注先識別名.<p>
	 *
	 */
	public String sppl_id_nm() {
		return pds().sppl_id_nm();
	}

	/**
	 * Supplier identification name 発注先識別名.<p>
	 *
	 */
	public void sppl_id_nm(String value) {
		pds().sppl_id_nm(value);
	}

	/**
	 * Miscellaneous supplier flg. 発注先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_sundry_flg() {
		return pds().sppl_sundry_flg();
	}

	/**
	 * Miscellaneous supplier flg. 発注先諸口ＦＬＧ.<p>
	 *
	 */
	public void sppl_sundry_flg(boolean value) {
		pds().sppl_sundry_flg(value);
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return pds().sppl_zip_cd();
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		pds().sppl_zip_cd(value);
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return pds().sppl_addr1();
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		pds().sppl_addr1(value);
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return pds().sppl_addr2();
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		pds().sppl_addr2(value);
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return pds().sppl_addr3();
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		pds().sppl_addr3(value);
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return pds().sppl_addr4();
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		pds().sppl_addr4(value);
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return pds().sppl_cntct_dpt();
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		pds().sppl_cntct_dpt(value);
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return pds().sppl_cntct_psn();
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		pds().sppl_cntct_psn(value);
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public String sppl_tel() {
		return pds().sppl_tel();
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public void sppl_tel(String value) {
		pds().sppl_tel(value);
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public String sppl_fax() {
		return pds().sppl_fax();
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public void sppl_fax(String value) {
		pds().sppl_fax(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return pds().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		pds().wg_cd(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return pds().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		pds().trd_rmrks(value);
	}

	/**
	 * Slip issued flg. 伝票発行済ＦＬＧ.<p>
	 *
	 */
	public boolean slip_prnt_flg() {
		return pds().slip_prnt_flg();
	}

	/**
	 * Slip issued flg. 伝票発行済ＦＬＧ.<p>
	 *
	 */
	public void slip_prnt_flg(boolean value) {
		pds().slip_prnt_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return pds().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pds().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pds().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pds().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pds().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pds().sub_char3(value);
	}

}

