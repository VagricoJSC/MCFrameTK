package mcframe.serverMSBE.MSBEL5550;

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
 * ブロック"ShipRprt_Upd01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipRprt_Upd01_HdrR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付ＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Header pegged sequence number ヘッダ紐付連番.<p>
	 *
	 */
	public static final String $hdr_peg_seq = "hdr_peg_seq";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Related order No. 関連指図ＮＯ.<p>
	 *
	 */
	public static final String $r_inst_no = "r_inst_no";
	/**
	 * Split slip 伝票分割.<p>
	 *
	 */
	public static final String $split_flg = "split_flg";
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $dlv_slip_prnt_flg = "dlv_slip_prnt_flg";
	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public static final String $ship_adv_prnt_flg = "ship_adv_prnt_flg";
	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public static final String $slip_form_cd = "slip_form_cd";
	public static final String $ds = "ds";
	/**
	 * Customer inventory shipment 預り出荷.<p>
	 *
	 */
	public static final String $cststk_ship_flg = "cststk_ship_flg";

	public static final String $dlv_slip_no = $ds + ".dlv_slip_no";
	public static final String $ac_dt = $ds + ".ac_dt";
	public static final String $slo_no = $ds + ".slo_no";
	public static final String $trn_typ = $ds + ".trn_typ";
	public static final String $dlv_slip_inst_no = $ds + ".dlv_slip_inst_no";
	public static final String $dlv_slip_act_no = $ds + ".dlv_slip_act_no";
	public static final String $dpt_cd = $ds + ".dpt_cd";
	public static final String $usr_cd = $ds + ".usr_cd";
	public static final String $ship_tm = $ds + ".ship_tm";
	public static final String $dlv_tm = $ds + ".dlv_tm";
	public static final String $trd_cd = $ds + ".trd_cd";
	public static final String $trd_ptn_typ = $ds + ".trd_ptn_typ";
	public static final String $cst_po_no = $ds + ".cst_po_no";
	public static final String $pri_prnt_flg = $ds + ".pri_prnt_flg";
	public static final String $trd_cur_cd = $ds + ".trd_cur_cd";
	public static final String $xrate = $ds + ".xrate";
	public static final String $ptax_xrate = $ds + ".ptax_xrate";
	public static final String $bp_cd = $ds + ".bp_cd";
	public static final String $dlv_id_typ = $ds + ".dlv_id_typ";
	public static final String $dlv_id_cd = $ds + ".dlv_id_cd";
	public static final String $dlv_id_nm = $ds + ".dlv_id_nm";
	public static final String $dlv_zip_cd = $ds + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $ds + ".dlv_addr1";
	public static final String $dlv_addr2 = $ds + ".dlv_addr2";
	public static final String $dlv_addr3 = $ds + ".dlv_addr3";
	public static final String $dlv_addr4 = $ds + ".dlv_addr4";
	public static final String $dlv_cntct_dpt = $ds + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $ds + ".dlv_cntct_psn";
	public static final String $dlv_tel = $ds + ".dlv_tel";
	public static final String $dlv_fax = $ds + ".dlv_fax";
	public static final String $dlv_sundry_flg = $ds + ".dlv_sundry_flg";
	public static final String $xfr_loc_cd = $ds + ".xfr_loc_cd";
	public static final String $ship_fr_lg_grp_cd = $ds + ".ship_fr_lg_grp_cd";
	public static final String $wg_cd = $ds + ".wg_cd";
	public static final String $trd_rmrks = $ds + ".trd_rmrks";
	public static final String $sync_flg = $ds + ".sync_flg";
	public static final String $adjst_slip_flg = $ds + ".adjst_slip_flg";
	public static final String $sub_char1 = $ds + ".sub_char1";
	public static final String $sub_char2 = $ds + ".sub_char2";
	public static final String $sub_char3 = $ds + ".sub_char3";
	public static final String $ship_dlv_slip_no = $ds + ".ship_dlv_slip_no";
	public static final String $sls_basis_typ = $ds + ".sls_basis_typ";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_seq_META = createCommonMeta($hdr_peg_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta r_inst_no_META = createCommonMeta($r_inst_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_INST_NO);
	public static final MCMeta split_flg_META = createCommonMeta($split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_prnt_flg_META = createCommonMeta($dlv_slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnt_flg_META = createCommonMeta($ship_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_form_cd_META = createCommonMeta($slip_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta ds_META = createInnerRowMeta($ds, mcframe.serverMS.dbc.MST_DLV_SLIP_R.class);
	public static final MCMeta cststk_ship_flg_META = createCommonMeta($cststk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ShipRprt_Upd01_HdrR> constMetas = new ConstMetaList<ShipRprt_Upd01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			hdr_peg_seq_META,
			data_crud_typ_META,
			can_ac_dt_META,
			r_inst_no_META,
			split_flg_META,
			dlv_slip_prnt_flg_META,
			ship_adv_prnt_flg_META,
			slip_form_cd_META,
			ds_META,
			cststk_ship_flg_META
		},
		new String[][]{
			{
				"dlv_slip_no",
				"ac_dt",
				"slo_no",
				"trn_typ",
				"dlv_slip_inst_no",
				"dlv_slip_act_no",
				"dpt_cd",
				"usr_cd",
				"ship_tm",
				"dlv_tm",
				"trd_cd",
				"trd_ptn_typ",
				"cst_po_no",
				"pri_prnt_flg",
				"trd_cur_cd",
				"xrate",
				"ptax_xrate",
				"bp_cd",
				"dlv_id_typ",
				"dlv_id_cd",
				"dlv_id_nm",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_tel",
				"dlv_fax",
				"dlv_sundry_flg",
				"xfr_loc_cd",
				"ship_fr_lg_grp_cd",
				"wg_cd",
				"trd_rmrks",
				"sync_flg",
				"adjst_slip_flg",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"ship_dlv_slip_no",
				"sls_basis_typ"
			},
			{
				$dlv_slip_no,
				$ac_dt,
				$slo_no,
				$trn_typ,
				$dlv_slip_inst_no,
				$dlv_slip_act_no,
				$dpt_cd,
				$usr_cd,
				$ship_tm,
				$dlv_tm,
				$trd_cd,
				$trd_ptn_typ,
				$cst_po_no,
				$pri_prnt_flg,
				$trd_cur_cd,
				$xrate,
				$ptax_xrate,
				$bp_cd,
				$dlv_id_typ,
				$dlv_id_cd,
				$dlv_id_nm,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_tel,
				$dlv_fax,
				$dlv_sundry_flg,
				$xfr_loc_cd,
				$ship_fr_lg_grp_cd,
				$wg_cd,
				$trd_rmrks,
				$sync_flg,
				$adjst_slip_flg,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$ship_dlv_slip_no,
				$sls_basis_typ
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
	protected ShipRprt_Upd01_HdrR_MC_A(ConstMetaList<? extends ShipRprt_Upd01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipRprt_Upd01_HdrR clone() {
		return (ShipRprt_Upd01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipRprt_Upd01_HdrR createInstance() {
		return (ShipRprt_Upd01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipRprt_Upd01_HdrR getValues(String... names) {
		return (ShipRprt_Upd01_HdrR) super.getValues(names);
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
	 * Header pegged sequence number ヘッダ紐付連番.<p>
	 *
	 */
	public MCNumber hdr_peg_seq() {
		return getConstNumber(offset + 1, $hdr_peg_seq);
	}

	/**
	 * Header pegged sequence number ヘッダ紐付連番.<p>
	 *
	 */
	public void hdr_peg_seq(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_seq, value);
	}

	/**
	 * Header pegged sequence number ヘッダ紐付連番.<p>
	 *
	 */
	public void hdr_peg_seq(int value) {
		setConstNumber(offset + 1, $hdr_peg_seq, value);
	}

	/**
	 * Header pegged sequence number ヘッダ紐付連番.<p>
	 *
	 */
	public void hdr_peg_seq(long value) {
		setConstNumber(offset + 1, $hdr_peg_seq, value);
	}

	/**
	 * Header pegged sequence number ヘッダ紐付連番.<p>
	 *
	 */
	public void hdr_peg_seq(float value) {
		setConstNumber(offset + 1, $hdr_peg_seq, value);
	}

	/**
	 * Header pegged sequence number ヘッダ紐付連番.<p>
	 *
	 */
	public void hdr_peg_seq(double value) {
		setConstNumber(offset + 1, $hdr_peg_seq, value);
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


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 3, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 3, $can_ac_dt, value);
	}


	/**
	 * Related order No. 関連指図ＮＯ.<p>
	 *
	 */
	public String r_inst_no() {
		return getConstString(offset + 4, $r_inst_no);
	}

	/**
	 * Related order No. 関連指図ＮＯ.<p>
	 *
	 */
	public void r_inst_no(String value) {
		setConstString(offset + 4, $r_inst_no, value);
	}


	/**
	 * Split slip 伝票分割.<p>
	 *
	 */
	public boolean split_flg() {
		return getConstBoolean(offset + 5, $split_flg);
	}

	/**
	 * Split slip 伝票分割.<p>
	 *
	 */
	public void split_flg(boolean value) {
		setConstBoolean(offset + 5, $split_flg, value);
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean dlv_slip_prnt_flg() {
		return getConstBoolean(offset + 6, $dlv_slip_prnt_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void dlv_slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 6, $dlv_slip_prnt_flg, value);
	}


	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public boolean ship_adv_prnt_flg() {
		return getConstBoolean(offset + 7, $ship_adv_prnt_flg);
	}

	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public void ship_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 7, $ship_adv_prnt_flg, value);
	}


	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String slip_form_cd() {
		return getConstString(offset + 8, $slip_form_cd);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void slip_form_cd(String value) {
		setConstString(offset + 8, $slip_form_cd, value);
	}


	public mcframe.serverMS.dbc.MST_DLV_SLIP_R ds(){
		return (mcframe.serverMS.dbc.MST_DLV_SLIP_R) getConstInnerRow(offset + 9, $ds);
	}
	
	public void ds(mcframe.serverMS.dbc.MST_DLV_SLIP_R row){
		setConstInnerRow(offset + 9, $ds, row);
	}


	/**
	 * Customer inventory shipment 預り出荷.<p>
	 *
	 */
	public boolean cststk_ship_flg() {
		return getConstBoolean(offset + 10, $cststk_ship_flg);
	}

	/**
	 * Customer inventory shipment 預り出荷.<p>
	 *
	 */
	public void cststk_ship_flg(boolean value) {
		setConstBoolean(offset + 10, $cststk_ship_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($r_inst_no.equalsIgnoreCase(name)) {
			return r_inst_no();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			return hdr_peg_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($split_flg.equalsIgnoreCase(name)) {
			return split_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($cststk_ship_flg.equalsIgnoreCase(name)) {
			return cststk_ship_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($r_inst_no.equalsIgnoreCase(name)) {
			return r_inst_no();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			return hdr_peg_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($split_flg.equalsIgnoreCase(name)) {
			return split_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($cststk_ship_flg.equalsIgnoreCase(name)) {
			return cststk_ship_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($r_inst_no.equalsIgnoreCase(name)) {
			r_inst_no(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($split_flg.equalsIgnoreCase(name)) {
			split_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($cststk_ship_flg.equalsIgnoreCase(name)) {
			cststk_ship_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($r_inst_no.equalsIgnoreCase(name)) {
			r_inst_no(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($hdr_peg_seq.equalsIgnoreCase(name)) {
			hdr_peg_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($split_flg.equalsIgnoreCase(name)) {
			split_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($cststk_ship_flg.equalsIgnoreCase(name)) {
			cststk_ship_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ds.equalsIgnoreCase(name)) {
			return ds();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ds.equalsIgnoreCase(name)) {
			ds(
				((MCContainerMeta) ds_META).castInnerRow(mcframe.serverMS.dbc.MST_DLV_SLIP_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return ds().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		ds().dlv_slip_no(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ds().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ds().ac_dt(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return ds().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		ds().slo_no(value);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return ds().trn_typ();
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		ds().trn_typ(value);
	}

	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public String dlv_slip_inst_no() {
		return ds().dlv_slip_inst_no();
	}

	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public void dlv_slip_inst_no(String value) {
		ds().dlv_slip_inst_no(value);
	}

	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public String dlv_slip_act_no() {
		return ds().dlv_slip_act_no();
	}

	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public void dlv_slip_act_no(String value) {
		ds().dlv_slip_act_no(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return ds().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		ds().dpt_cd(value);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return ds().usr_cd();
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		ds().usr_cd(value);
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public MCDate ship_tm() {
		return ds().ship_tm();
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		ds().ship_tm(value);
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public MCDate dlv_tm() {
		return ds().dlv_tm();
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public void dlv_tm(MCDate value) {
		ds().dlv_tm(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return ds().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		ds().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return ds().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		ds().trd_ptn_typ(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return ds().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		ds().cst_po_no(value);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return ds().pri_prnt_flg();
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		ds().pri_prnt_flg(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return ds().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		ds().trd_cur_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return ds().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		ds().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		ds().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		ds().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		ds().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		ds().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return ds().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		ds().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		ds().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		ds().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		ds().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		ds().ptax_xrate(value);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return ds().bp_cd();
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		ds().bp_cd(value);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return ds().dlv_id_typ();
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		ds().dlv_id_typ(value);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return ds().dlv_id_cd();
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		ds().dlv_id_cd(value);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return ds().dlv_id_nm();
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		ds().dlv_id_nm(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return ds().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		ds().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return ds().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		ds().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return ds().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		ds().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return ds().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		ds().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return ds().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		ds().dlv_addr4(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return ds().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		ds().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return ds().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		ds().dlv_cntct_psn(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return ds().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		ds().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return ds().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		ds().dlv_fax(value);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return ds().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		ds().dlv_sundry_flg(value);
	}

	/**
	 * Transfer location cd. 振替場所ＣＤ.<p>
	 *
	 */
	public String xfr_loc_cd() {
		return ds().xfr_loc_cd();
	}

	/**
	 * Transfer location cd. 振替場所ＣＤ.<p>
	 *
	 */
	public void xfr_loc_cd(String value) {
		ds().xfr_loc_cd(value);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return ds().ship_fr_lg_grp_cd();
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		ds().ship_fr_lg_grp_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ds().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ds().wg_cd(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return ds().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		ds().trd_rmrks(value);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return ds().sync_flg();
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		ds().sync_flg(value);
	}

	/**
	 * Adjustment slip 調整伝票.<p>
	 *
	 */
	public boolean adjst_slip_flg() {
		return ds().adjst_slip_flg();
	}

	/**
	 * Adjustment slip 調整伝票.<p>
	 *
	 */
	public void adjst_slip_flg(boolean value) {
		ds().adjst_slip_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return ds().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		ds().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return ds().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		ds().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return ds().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		ds().sub_char3(value);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return ds().ship_dlv_slip_no();
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		ds().ship_dlv_slip_no(value);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return ds().sls_basis_typ();
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		ds().sls_basis_typ(value);
	}

}

