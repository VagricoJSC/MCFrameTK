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
 * ブロック"PurcPrnt_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcPrnt_Upd01_DtlR_MC_A extends MCConstRow {

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
	public static final String $pdsd = "pdsd";
	/**
	 * Update details flg. 明細更新ＦＬＧ.<p>
	 *
	 */
	public static final String $dtl_upd_flg = "dtl_upd_flg";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";

	public static final String $dlv_slip_mng_d_no = $pdsd + ".dlv_slip_mng_d_no";
	public static final String $dlv_slip_mng_d_seq = $pdsd + ".dlv_slip_mng_d_seq";
	public static final String $dlv_slip_d_no = $pdsd + ".dlv_slip_d_no";
	public static final String $dlv_slip_d_seq = $pdsd + ".dlv_slip_d_seq";
	public static final String $dlv_slip_mng_no = $pdsd + ".dlv_slip_mng_no";
	public static final String $dlv_slip_mng_seq = $pdsd + ".dlv_slip_mng_seq";
	public static final String $itm_cd = $pdsd + ".itm_cd";
	public static final String $itm_sub1 = $pdsd + ".itm_sub1";
	public static final String $itm_sub2 = $pdsd + ".itm_sub2";
	public static final String $itm_sub3 = $pdsd + ".itm_sub3";
	public static final String $itm_nm = $pdsd + ".itm_nm";
	public static final String $sundry_itm_flg = $pdsd + ".sundry_itm_flg";
	public static final String $sno1 = $pdsd + ".sno1";
	public static final String $sno2 = $pdsd + ".sno2";
	public static final String $sno3 = $pdsd + ".sno3";
	public static final String $sno4 = $pdsd + ".sno4";
	public static final String $lot_no = $pdsd + ".lot_no";
	public static final String $sublot_no = $pdsd + ".sublot_no";
	public static final String $str_ln_cd = $pdsd + ".str_ln_cd";
	public static final String $trd_unit_qty = $pdsd + ".trd_unit_qty";
	public static final String $trd_unit_po_qty = $pdsd + ".trd_unit_po_qty";
	public static final String $trd_unit_cd = $pdsd + ".trd_unit_cd";
	public static final String $base_unit_qty = $pdsd + ".base_unit_qty";
	public static final String $base_unit_po_qty = $pdsd + ".base_unit_po_qty";
	public static final String $base_unit_cd = $pdsd + ".base_unit_cd";
	public static final String $interim_flg = $pdsd + ".interim_flg";
	public static final String $pri_prnt_flg = $pdsd + ".pri_prnt_flg";
	public static final String $trd_cur_upri = $pdsd + ".trd_cur_upri";
	public static final String $trd_cur_amt = $pdsd + ".trd_cur_amt";
	public static final String $trd_cur_dscnt_amt = $pdsd + ".trd_cur_dscnt_amt";
	public static final String $trd_cur_tax_amt = $pdsd + ".trd_cur_tax_amt";
	public static final String $tax_cd = $pdsd + ".tax_cd";
	public static final String $wtax_rate = $pdsd + ".wtax_rate";
	public static final String $wtax_amt = $pdsd + ".wtax_amt";
	public static final String $sppl_itm_cd = $pdsd + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $pdsd + ".sppl_itm_nm";
	public static final String $po_d_no = $pdsd + ".po_d_no";
	public static final String $dlv_inst_d_no = $pdsd + ".dlv_inst_d_no";
	public static final String $prms_rcpt_d_no = $pdsd + ".prms_rcpt_d_no";
	public static final String $purc_ddlv_dlv_slip_no = $pdsd + ".purc_ddlv_dlv_slip_no";
	public static final String $purc_ddlv_dlv_slip_seq = $pdsd + ".purc_ddlv_dlv_slip_seq";
	public static final String $purc_ddlv_dlv_slip_d_no = $pdsd + ".purc_ddlv_dlv_slip_d_no";
	public static final String $prov_ddlv_flg = $pdsd + ".prov_ddlv_flg";
	public static final String $purc_ddlv_flg = $pdsd + ".purc_ddlv_flg";
	public static final String $dlv_slip_invalid_flg = $pdsd + ".dlv_slip_invalid_flg";
	public static final String $trd_d_rmrks = $pdsd + ".trd_d_rmrks";
	public static final String $sub_char1 = $pdsd + ".sub_char1";
	public static final String $sub_char2 = $pdsd + ".sub_char2";
	public static final String $sub_char3 = $pdsd + ".sub_char3";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta pdsd_META = createInnerRowMeta($pdsd, mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_D_R.class);
	public static final MCMeta dtl_upd_flg_META = createCommonMeta($dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);

	protected static final ConstMetaList<PurcPrnt_Upd01_DtlR> constMetas = new ConstMetaList<PurcPrnt_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			data_crud_typ_META,
			pdsd_META,
			dtl_upd_flg_META,
			arr_schd_no_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META
		},
		new String[][]{
			{
				"dlv_slip_mng_d_no",
				"dlv_slip_mng_d_seq",
				"dlv_slip_d_no",
				"dlv_slip_d_seq",
				"dlv_slip_mng_no",
				"dlv_slip_mng_seq",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sundry_itm_flg",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"lot_no",
				"sublot_no",
				"str_ln_cd",
				"trd_unit_qty",
				"trd_unit_po_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_po_qty",
				"base_unit_cd",
				"interim_flg",
				"pri_prnt_flg",
				"trd_cur_upri",
				"trd_cur_amt",
				"trd_cur_dscnt_amt",
				"trd_cur_tax_amt",
				"tax_cd",
				"wtax_rate",
				"wtax_amt",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"po_d_no",
				"dlv_inst_d_no",
				"prms_rcpt_d_no",
				"purc_ddlv_dlv_slip_no",
				"purc_ddlv_dlv_slip_seq",
				"purc_ddlv_dlv_slip_d_no",
				"prov_ddlv_flg",
				"purc_ddlv_flg",
				"dlv_slip_invalid_flg",
				"trd_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$dlv_slip_mng_d_no,
				$dlv_slip_mng_d_seq,
				$dlv_slip_d_no,
				$dlv_slip_d_seq,
				$dlv_slip_mng_no,
				$dlv_slip_mng_seq,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sundry_itm_flg,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$lot_no,
				$sublot_no,
				$str_ln_cd,
				$trd_unit_qty,
				$trd_unit_po_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_po_qty,
				$base_unit_cd,
				$interim_flg,
				$pri_prnt_flg,
				$trd_cur_upri,
				$trd_cur_amt,
				$trd_cur_dscnt_amt,
				$trd_cur_tax_amt,
				$tax_cd,
				$wtax_rate,
				$wtax_amt,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$po_d_no,
				$dlv_inst_d_no,
				$prms_rcpt_d_no,
				$purc_ddlv_dlv_slip_no,
				$purc_ddlv_dlv_slip_seq,
				$purc_ddlv_dlv_slip_d_no,
				$prov_ddlv_flg,
				$purc_ddlv_flg,
				$dlv_slip_invalid_flg,
				$trd_d_rmrks,
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
	protected PurcPrnt_Upd01_DtlR_MC_A(ConstMetaList<? extends PurcPrnt_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Upd01_DtlR clone() {
		return (PurcPrnt_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Upd01_DtlR createInstance() {
		return (PurcPrnt_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcPrnt_Upd01_DtlR getValues(String... names) {
		return (PurcPrnt_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
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


	public mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_D_R pdsd(){
		return (mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_D_R) getConstInnerRow(offset + 2, $pdsd);
	}
	
	public void pdsd(mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_D_R row){
		setConstInnerRow(offset + 2, $pdsd, row);
	}


	/**
	 * Update details flg. 明細更新ＦＬＧ.<p>
	 *
	 */
	public boolean dtl_upd_flg() {
		return getConstBoolean(offset + 3, $dtl_upd_flg);
	}

	/**
	 * Update details flg. 明細更新ＦＬＧ.<p>
	 *
	 */
	public void dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 3, $dtl_upd_flg, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 4, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 4, $arr_schd_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 5, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 5, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 6, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 6, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 6, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 6, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 6, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 6, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 7, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 7, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 7, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 7, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 7, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 7, $dlv_slip_rev, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($dtl_upd_flg.equalsIgnoreCase(name)) {
			return dtl_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dtl_upd_flg.equalsIgnoreCase(name)) {
			return dtl_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dtl_upd_flg.equalsIgnoreCase(name)) {
			dtl_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dtl_upd_flg.equalsIgnoreCase(name)) {
			dtl_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pdsd.equalsIgnoreCase(name)) {
			return pdsd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pdsd.equalsIgnoreCase(name)) {
			pdsd(
				((MCContainerMeta) pdsd_META).castInnerRow(mcframe.serverMS.dbc.MST_PURC_DLV_SLIP_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Delivery note details management No. 納品書明細管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_d_no() {
		return pdsd().dlv_slip_mng_d_no();
	}

	/**
	 * Delivery note details management No. 納品書明細管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_d_no(String value) {
		pdsd().dlv_slip_mng_d_no(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_d_seq() {
		return pdsd().dlv_slip_mng_d_seq();
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(MCNumber value) {
		pdsd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(int value) {
		pdsd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(long value) {
		pdsd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(float value) {
		pdsd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details management sequence number 納品書明細管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_d_seq(double value) {
		pdsd().dlv_slip_mng_d_seq(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return pdsd().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		pdsd().dlv_slip_d_no(value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public MCNumber dlv_slip_d_seq() {
		return pdsd().dlv_slip_d_seq();
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(MCNumber value) {
		pdsd().dlv_slip_d_seq(value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(int value) {
		pdsd().dlv_slip_d_seq(value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(long value) {
		pdsd().dlv_slip_d_seq(value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(float value) {
		pdsd().dlv_slip_d_seq(value);
	}

	/**
	 * Delivery note details serial number 納品書明細連番.<p>
	 *
	 */
	public void dlv_slip_d_seq(double value) {
		pdsd().dlv_slip_d_seq(value);
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return pdsd().dlv_slip_mng_no();
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		pdsd().dlv_slip_mng_no(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return pdsd().dlv_slip_mng_seq();
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		pdsd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		pdsd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		pdsd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		pdsd().dlv_slip_mng_seq(value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		pdsd().dlv_slip_mng_seq(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return pdsd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		pdsd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return pdsd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		pdsd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return pdsd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		pdsd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return pdsd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		pdsd().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return pdsd().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		pdsd().itm_nm(value);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return pdsd().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		pdsd().sundry_itm_flg(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return pdsd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		pdsd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return pdsd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		pdsd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return pdsd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		pdsd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return pdsd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		pdsd().sno4(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return pdsd().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		pdsd().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return pdsd().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		pdsd().sublot_no(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return pdsd().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		pdsd().str_ln_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return pdsd().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		pdsd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		pdsd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		pdsd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		pdsd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		pdsd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit PO qty. 取引単位発注数量.<p>
	 *
	 */
	public MCNumber trd_unit_po_qty() {
		return pdsd().trd_unit_po_qty();
	}

	/**
	 * Transaction unit PO qty. 取引単位発注数量.<p>
	 *
	 */
	public void trd_unit_po_qty(MCNumber value) {
		pdsd().trd_unit_po_qty(value);
	}

	/**
	 * Transaction unit PO qty. 取引単位発注数量.<p>
	 *
	 */
	public void trd_unit_po_qty(int value) {
		pdsd().trd_unit_po_qty(value);
	}

	/**
	 * Transaction unit PO qty. 取引単位発注数量.<p>
	 *
	 */
	public void trd_unit_po_qty(long value) {
		pdsd().trd_unit_po_qty(value);
	}

	/**
	 * Transaction unit PO qty. 取引単位発注数量.<p>
	 *
	 */
	public void trd_unit_po_qty(float value) {
		pdsd().trd_unit_po_qty(value);
	}

	/**
	 * Transaction unit PO qty. 取引単位発注数量.<p>
	 *
	 */
	public void trd_unit_po_qty(double value) {
		pdsd().trd_unit_po_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return pdsd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		pdsd().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return pdsd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		pdsd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		pdsd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		pdsd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		pdsd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		pdsd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. PO qty. 基準単位数量発注数量.<p>
	 *
	 */
	public MCNumber base_unit_po_qty() {
		return pdsd().base_unit_po_qty();
	}

	/**
	 * Base unit qty. PO qty. 基準単位数量発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(MCNumber value) {
		pdsd().base_unit_po_qty(value);
	}

	/**
	 * Base unit qty. PO qty. 基準単位数量発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(int value) {
		pdsd().base_unit_po_qty(value);
	}

	/**
	 * Base unit qty. PO qty. 基準単位数量発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(long value) {
		pdsd().base_unit_po_qty(value);
	}

	/**
	 * Base unit qty. PO qty. 基準単位数量発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(float value) {
		pdsd().base_unit_po_qty(value);
	}

	/**
	 * Base unit qty. PO qty. 基準単位数量発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(double value) {
		pdsd().base_unit_po_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return pdsd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		pdsd().base_unit_cd(value);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return pdsd().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		pdsd().interim_flg(value);
	}

	/**
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return pdsd().pri_prnt_flg();
	}

	/**
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		pdsd().pri_prnt_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return pdsd().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		pdsd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		pdsd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		pdsd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		pdsd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		pdsd().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return pdsd().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		pdsd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		pdsd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		pdsd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		pdsd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		pdsd().trd_cur_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return pdsd().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		pdsd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		pdsd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		pdsd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		pdsd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		pdsd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return pdsd().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		pdsd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		pdsd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		pdsd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		pdsd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		pdsd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return pdsd().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		pdsd().tax_cd(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return pdsd().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		pdsd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		pdsd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		pdsd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		pdsd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		pdsd().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return pdsd().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		pdsd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		pdsd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		pdsd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		pdsd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		pdsd().wtax_amt(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return pdsd().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		pdsd().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return pdsd().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		pdsd().sppl_itm_nm(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return pdsd().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		pdsd().po_d_no(value);
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return pdsd().dlv_inst_d_no();
	}

	/**
	 * Delivery order details No. 納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		pdsd().dlv_inst_d_no(value);
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_d_no() {
		return pdsd().prms_rcpt_d_no();
	}

	/**
	 * Order promising result received details No. 納期回答受領明細ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_d_no(String value) {
		pdsd().prms_rcpt_d_no(value);
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_no() {
		return pdsd().purc_ddlv_dlv_slip_no();
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_no(String value) {
		pdsd().purc_ddlv_dlv_slip_no(value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public MCNumber purc_ddlv_dlv_slip_seq() {
		return pdsd().purc_ddlv_dlv_slip_seq();
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(MCNumber value) {
		pdsd().purc_ddlv_dlv_slip_seq(value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(int value) {
		pdsd().purc_ddlv_dlv_slip_seq(value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(long value) {
		pdsd().purc_ddlv_dlv_slip_seq(value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(float value) {
		pdsd().purc_ddlv_dlv_slip_seq(value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(double value) {
		pdsd().purc_ddlv_dlv_slip_seq(value);
	}

	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_d_no() {
		return pdsd().purc_ddlv_dlv_slip_d_no();
	}

	/**
	 * Direct delivery delivery note details No. 仕入直送納品書明細ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_d_no(String value) {
		pdsd().purc_ddlv_dlv_slip_d_no(value);
	}

	/**
	 * Direct supply flg. 支給直送ＦＬＧ.<p>
	 *
	 */
	public boolean prov_ddlv_flg() {
		return pdsd().prov_ddlv_flg();
	}

	/**
	 * Direct supply flg. 支給直送ＦＬＧ.<p>
	 *
	 */
	public void prov_ddlv_flg(boolean value) {
		pdsd().prov_ddlv_flg(value);
	}

	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public boolean purc_ddlv_flg() {
		return pdsd().purc_ddlv_flg();
	}

	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public void purc_ddlv_flg(boolean value) {
		pdsd().purc_ddlv_flg(value);
	}

	/**
	 * Not to output delivery note flg. 納品書出力対象外ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_slip_invalid_flg() {
		return pdsd().dlv_slip_invalid_flg();
	}

	/**
	 * Not to output delivery note flg. 納品書出力対象外ＦＬＧ.<p>
	 *
	 */
	public void dlv_slip_invalid_flg(boolean value) {
		pdsd().dlv_slip_invalid_flg(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return pdsd().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		pdsd().trd_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return pdsd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		pdsd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return pdsd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		pdsd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return pdsd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		pdsd().sub_char3(value);
	}

}

