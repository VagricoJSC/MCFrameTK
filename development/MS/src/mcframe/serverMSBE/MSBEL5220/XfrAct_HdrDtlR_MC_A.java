package mcframe.serverMSBE.MSBEL5220;

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
 * ブロック"XfrAct_HdrDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrAct_HdrDtlR_MC_A extends MCConstRow {

	public static final String $xauh = "xauh";
	public static final String $xaud = "xaud";

	public static final String $xfr_act_no = $xauh + ".xah.xfr_act_no";
	public static final String $xfr_inst_no = $xauh + "." + mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.$xfr_inst_no + "";
	public static final String $trd_cd = $xauh + ".xah.trd_cd";
	public static final String $trd_ptn_typ = $xauh + ".xah.trd_ptn_typ";
	public static final String $wg_cd = $xauh + ".xah.wg_cd";
	public static final String $lg_grp_cd = $xauh + ".xah.lg_grp_cd";
	public static final String $gr_loc_cd = $xauh + ".xah.gr_loc_cd";
	public static final String $gr_stk_arrv_bp_cd = $xauh + ".xah.gr_stk_arrv_bp_cd";
	public static final String $xfr_dt = $xauh + ".xah.xfr_dt";
	public static final String $ac_dt = $xauh + ".xah.ac_dt";
	public static final String $act_usr_cd = $xauh + ".xah.act_usr_cd";
	public static final String $act_dpt_cd = $xauh + ".xah.act_dpt_cd";
	public static final String $dlv_prnt_flg = $xauh + ".xah.dlv_prnt_flg";
	public static final String $dlv_prnt_tm = $xauh + ".xah.dlv_prnt_tm";
	public static final String $intr_rmrks = $xauh + ".xah.intr_rmrks";
	public static final String $trd_rmrks = $xauh + ".xah.trd_rmrks";
	public static final String $sub_char1 = $xauh + ".xah.sub_char1";
	public static final String $sub_char2 = $xauh + ".xah.sub_char2";
	public static final String $sub_char3 = $xauh + ".xah.sub_char3";
	public static final String $immd_dlv_prnt_flg = $xauh + ".immd_dlv_prnt_flg";
	public static final String $can_ac_dt = $xauh + ".can_ac_dt";
	public static final String $slo_no = $xauh + ".slo_no";
	public static final String $peg_no = $xaud + ".peg_no";
	public static final String $data_crud_typ = $xaud + ".data_crud_typ";
	public static final String $xfr_act_d_no = $xaud + ".xad.xfr_act_d_no";
	public static final String $xfr_act_no_dtl = $xaud + ".xad.xfr_act_no";
	public static final String $xfr_alloc_sts_no = $xaud + ".xad.xfr_alloc_sts_no";
	public static final String $xfr_inst_d_no = $xaud + ".xad.xfr_inst_d_no";
	public static final String $gi_loc_cd = $xaud + ".xad.gi_loc_cd";
	public static final String $gi_str_ln_cd = $xaud + ".xad.gi_str_ln_cd";
	public static final String $gi_stk_arrv_bp_cd = $xaud + ".xad.gi_stk_arrv_bp_cd";
	public static final String $gr_str_ln_cd = $xaud + ".xad.gr_str_ln_cd";
	public static final String $itm_cd = $xaud + ".xad.itm_cd";
	public static final String $itm_sub1 = $xaud + ".xad.itm_sub1";
	public static final String $itm_sub2 = $xaud + ".xad.itm_sub2";
	public static final String $itm_sub3 = $xaud + ".xad.itm_sub3";
	public static final String $lot_no = $xaud + ".xad.lot_no";
	public static final String $sublot_no = $xaud + ".xad.sublot_no";
	public static final String $sno1 = $xaud + ".xad.sno1";
	public static final String $sno2 = $xaud + ".xad.sno2";
	public static final String $sno3 = $xaud + ".xad.sno3";
	public static final String $sno4 = $xaud + ".xad.sno4";
	public static final String $gd_cd = $xaud + ".xad.gd_cd";
	public static final String $quality_typ = $xaud + ".xad.quality_typ";
	public static final String $stk_insp_typ = $xaud + ".xad.stk_insp_typ";
	public static final String $stk_id_typ = $xaud + ".xad.stk_id_typ";
	public static final String $stk_bp_cd = $xaud + ".xad.stk_bp_cd";
	public static final String $trd_unit_cd = $xaud + ".xad.trd_unit_cd";
	public static final String $trd_unit_qty = $xaud + ".xad.trd_unit_qty";
	public static final String $base_unit_cd = $xaud + ".xad.base_unit_cd";
	public static final String $base_unit_qty = $xaud + ".xad.base_unit_qty";
	public static final String $skip_chk_ship_flg = $xaud + "." + mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.$skip_chk_ship_flg + "";
	public static final String $rsn_cd = $xaud + ".xad.rsn_cd";
	public static final String $bd_dpt_cd = $xaud + ".xad.bd_dpt_cd";
	public static final String $dlv_slip_no = $xaud + ".xad.dlv_slip_no";
	public static final String $dlv_slip_seq = $xaud + ".xad.dlv_slip_seq";
	public static final String $dlv_slip_d_no = $xaud + ".xad.dlv_slip_d_no";
	public static final String $io_schd_pr_no = $xaud + ".xad.io_schd_pr_no";
	public static final String $base_dlv_slip_no = $xaud + ".xad.base_dlv_slip_no";
	public static final String $base_prov_act_no = $xaud + ".xad.base_prov_act_no";
	public static final String $base_ac_dt = $xaud + ".xad.base_ac_dt";
	public static final String $disp_seq = $xaud + ".xad.disp_seq";
	public static final String $intr_d_rmrks = $xaud + ".xad.intr_d_rmrks";
	public static final String $trd_d_rmrks = $xaud + ".xad.trd_d_rmrks";
	public static final String $sub_char1_dtl = $xaud + ".xad.sub_char1";
	public static final String $sub_char2_dtl = $xaud + ".xad.sub_char2";
	public static final String $sub_char3_dtl = $xaud + ".xad.sub_char3";
	public static final String $wms_flg = $xaud + ".xad.wms_flg";
	public static final String $ext_sys_cd = $xaud + "." + mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.$ext_sys_cd + "";
	public static final String $ext_xfr_act_no = $xaud + ".xad.ext_xfr_act_no";
	public static final String $abort_flg = $xaud + ".abort_flg";
	public static final String $prov_schd_no = $xaud + ".prov_schd_no";
	public static final String $prov_act_no = $xaud + ".prov_act_no";
	public static final String $prov_typ = $xaud + ".prov_typ";
	public static final String $ret_prov_schd_no = $xaud + ".ret_prov_schd_no";
	public static final String $ret_prov_act_no = $xaud + ".ret_prov_act_no";
	public static final String $ret_prov_typ = $xaud + ".ret_prov_typ";
	public static final String $gi_sppl_cd = $xaud + ".gi_sppl_cd";
	public static final String $io_stk_arrv_bp_cd = $xaud + ".io_stk_arrv_bp_cd";
	public static final String $io_stk_id_typ = $xaud + ".io_stk_id_typ";
	public static final String $io_stk_bp_cd = $xaud + ".io_stk_bp_cd";

	public static final MCMeta xauh_META = createInnerRowMeta($xauh, mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.class);
	public static final MCMeta xaud_META = createInnerRowMeta($xaud, mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class);

	protected static final ConstMetaList<XfrAct_HdrDtlR> constMetas = new ConstMetaList<XfrAct_HdrDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xauh_META,
			xaud_META
		},
		new String[][]{
			{
				"xfr_act_no",
				"xfr_inst_no",
				"trd_cd",
				"trd_ptn_typ",
				"wg_cd",
				"lg_grp_cd",
				"gr_loc_cd",
				"gr_stk_arrv_bp_cd",
				"xfr_dt",
				"ac_dt",
				"act_usr_cd",
				"act_dpt_cd",
				"dlv_prnt_flg",
				"dlv_prnt_tm",
				"intr_rmrks",
				"trd_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"immd_dlv_prnt_flg",
				"can_ac_dt",
				"slo_no",
				"peg_no",
				"data_crud_typ",
				"xfr_act_d_no",
				"xfr_act_no_dtl",
				"xfr_alloc_sts_no",
				"xfr_inst_d_no",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_stk_arrv_bp_cd",
				"gr_str_ln_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"skip_chk_ship_flg",
				"rsn_cd",
				"bd_dpt_cd",
				"dlv_slip_no",
				"dlv_slip_seq",
				"dlv_slip_d_no",
				"io_schd_pr_no",
				"base_dlv_slip_no",
				"base_prov_act_no",
				"base_ac_dt",
				"disp_seq",
				"intr_d_rmrks",
				"trd_d_rmrks",
				"sub_char1_dtl",
				"sub_char2_dtl",
				"sub_char3_dtl",
				"wms_flg",
				"ext_sys_cd",
				"ext_xfr_act_no",
				"abort_flg",
				"prov_schd_no",
				"prov_act_no",
				"prov_typ",
				"ret_prov_schd_no",
				"ret_prov_act_no",
				"ret_prov_typ",
				"gi_sppl_cd",
				"io_stk_arrv_bp_cd",
				"io_stk_id_typ",
				"io_stk_bp_cd"
			},
			{
				$xfr_act_no,
				$xfr_inst_no,
				$trd_cd,
				$trd_ptn_typ,
				$wg_cd,
				$lg_grp_cd,
				$gr_loc_cd,
				$gr_stk_arrv_bp_cd,
				$xfr_dt,
				$ac_dt,
				$act_usr_cd,
				$act_dpt_cd,
				$dlv_prnt_flg,
				$dlv_prnt_tm,
				$intr_rmrks,
				$trd_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$immd_dlv_prnt_flg,
				$can_ac_dt,
				$slo_no,
				$peg_no,
				$data_crud_typ,
				$xfr_act_d_no,
				$xfr_act_no_dtl,
				$xfr_alloc_sts_no,
				$xfr_inst_d_no,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_stk_arrv_bp_cd,
				$gr_str_ln_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$skip_chk_ship_flg,
				$rsn_cd,
				$bd_dpt_cd,
				$dlv_slip_no,
				$dlv_slip_seq,
				$dlv_slip_d_no,
				$io_schd_pr_no,
				$base_dlv_slip_no,
				$base_prov_act_no,
				$base_ac_dt,
				$disp_seq,
				$intr_d_rmrks,
				$trd_d_rmrks,
				$sub_char1_dtl,
				$sub_char2_dtl,
				$sub_char3_dtl,
				$wms_flg,
				$ext_sys_cd,
				$ext_xfr_act_no,
				$abort_flg,
				$prov_schd_no,
				$prov_act_no,
				$prov_typ,
				$ret_prov_schd_no,
				$ret_prov_act_no,
				$ret_prov_typ,
				$gi_sppl_cd,
				$io_stk_arrv_bp_cd,
				$io_stk_id_typ,
				$io_stk_bp_cd
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
	protected XfrAct_HdrDtlR_MC_A(ConstMetaList<? extends XfrAct_HdrDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrAct_HdrDtlR clone() {
		return (XfrAct_HdrDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrAct_HdrDtlR createInstance() {
		return (XfrAct_HdrDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrAct_HdrDtlR getValues(String... names) {
		return (XfrAct_HdrDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR xauh(){
		return (mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR) getConstInnerRow(offset + 0, $xauh);
	}
	
	public void xauh(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR row){
		setConstInnerRow(offset + 0, $xauh, row);
	}


	public mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR xaud(){
		return (mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR) getConstInnerRow(offset + 1, $xaud);
	}
	
	public void xaud(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR row){
		setConstInnerRow(offset + 1, $xaud, row);
	}






	public MCRow getInnerRow(String name) {
		if ($xauh.equalsIgnoreCase(name)) {
			return xauh();
		}
		if ($xaud.equalsIgnoreCase(name)) {
			return xaud();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xauh.equalsIgnoreCase(name)) {
			xauh(
				((MCContainerMeta) xauh_META).castInnerRow(mcframe.serverMSBE.MSBEL5220.XfrAct_HdrR.class, value)
			);
			return;
		}
		if ($xaud.equalsIgnoreCase(name)) {
			xaud(
				((MCContainerMeta) xaud_META).castInnerRow(mcframe.serverMSBE.MSBEL5220.XfrAct_DtlR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no() {
		return xauh().xah().xfr_act_no();
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no(String value) {
		xauh().xah().xfr_act_no(value);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return xauh().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		xauh().xfr_inst_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return xauh().xah().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		xauh().xah().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return xauh().xah().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		xauh().xah().trd_ptn_typ(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return xauh().xah().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		xauh().xah().wg_cd(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return xauh().xah().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		xauh().xah().lg_grp_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return xauh().xah().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		xauh().xah().gr_loc_cd(value);
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return xauh().xah().gr_stk_arrv_bp_cd();
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		xauh().xah().gr_stk_arrv_bp_cd(value);
	}

	/**
	 * Movement day 移動日.<p>
	 *
	 */
	public MCDate xfr_dt() {
		return xauh().xah().xfr_dt();
	}

	/**
	 * Movement day 移動日.<p>
	 *
	 */
	public void xfr_dt(MCDate value) {
		xauh().xah().xfr_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return xauh().xah().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		xauh().xah().ac_dt(value);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return xauh().xah().act_usr_cd();
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		xauh().xah().act_usr_cd(value);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return xauh().xah().act_dpt_cd();
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		xauh().xah().act_dpt_cd(value);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return xauh().xah().dlv_prnt_flg();
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		xauh().xah().dlv_prnt_flg(value);
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public MCDate dlv_prnt_tm() {
		return xauh().xah().dlv_prnt_tm();
	}

	/**
	 * Delivery note issue date and time 納品書発行日時.<p>
	 *
	 */
	public void dlv_prnt_tm(MCDate value) {
		xauh().xah().dlv_prnt_tm(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return xauh().xah().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		xauh().xah().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return xauh().xah().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		xauh().xah().trd_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return xauh().xah().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		xauh().xah().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return xauh().xah().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		xauh().xah().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return xauh().xah().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		xauh().xah().sub_char3(value);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean immd_dlv_prnt_flg() {
		return xauh().immd_dlv_prnt_flg();
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void immd_dlv_prnt_flg(boolean value) {
		xauh().immd_dlv_prnt_flg(value);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return xauh().can_ac_dt();
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		xauh().can_ac_dt(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return xauh().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		xauh().slo_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return xaud().peg_no();
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		xaud().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		xaud().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		xaud().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		xaud().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		xaud().peg_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return xaud().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		xaud().data_crud_typ(value);
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public String xfr_act_d_no() {
		return xaud().xad().xfr_act_d_no();
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public void xfr_act_d_no(String value) {
		xaud().xad().xfr_act_d_no(value);
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no_dtl() {
		return xaud().xad().xfr_act_no();
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no_dtl(String value) {
		xaud().xad().xfr_act_no(value);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return xaud().xad().xfr_alloc_sts_no();
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		xaud().xad().xfr_alloc_sts_no(value);
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return xaud().xad().xfr_inst_d_no();
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		xaud().xad().xfr_inst_d_no(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return xaud().xad().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		xaud().xad().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return xaud().xad().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		xaud().xad().gi_str_ln_cd(value);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return xaud().xad().gi_stk_arrv_bp_cd();
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		xaud().xad().gi_stk_arrv_bp_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return xaud().xad().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		xaud().xad().gr_str_ln_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return xaud().xad().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		xaud().xad().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return xaud().xad().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		xaud().xad().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return xaud().xad().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		xaud().xad().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return xaud().xad().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		xaud().xad().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return xaud().xad().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		xaud().xad().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return xaud().xad().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		xaud().xad().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return xaud().xad().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		xaud().xad().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return xaud().xad().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		xaud().xad().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return xaud().xad().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		xaud().xad().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return xaud().xad().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		xaud().xad().sno4(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return xaud().xad().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		xaud().xad().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return xaud().xad().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		xaud().xad().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return xaud().xad().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		xaud().xad().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return xaud().xad().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		xaud().xad().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return xaud().xad().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		xaud().xad().stk_bp_cd(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return xaud().xad().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		xaud().xad().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return xaud().xad().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		xaud().xad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		xaud().xad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		xaud().xad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		xaud().xad().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		xaud().xad().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return xaud().xad().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		xaud().xad().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return xaud().xad().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		xaud().xad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		xaud().xad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		xaud().xad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		xaud().xad().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		xaud().xad().base_unit_qty(value);
	}

	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return xaud().skip_chk_ship_flg();
	}

	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		xaud().skip_chk_ship_flg(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return xaud().xad().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		xaud().xad().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return xaud().xad().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		xaud().xad().bd_dpt_cd(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return xaud().xad().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		xaud().xad().dlv_slip_no(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return xaud().xad().dlv_slip_seq();
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		xaud().xad().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		xaud().xad().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		xaud().xad().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		xaud().xad().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		xaud().xad().dlv_slip_seq(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return xaud().xad().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		xaud().xad().dlv_slip_d_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return xaud().xad().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		xaud().xad().io_schd_pr_no(value);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return xaud().xad().base_dlv_slip_no();
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		xaud().xad().base_dlv_slip_no(value);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return xaud().xad().base_prov_act_no();
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		xaud().xad().base_prov_act_no(value);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return xaud().xad().base_ac_dt();
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		xaud().xad().base_ac_dt(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return xaud().xad().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		xaud().xad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		xaud().xad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		xaud().xad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		xaud().xad().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		xaud().xad().disp_seq(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return xaud().xad().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		xaud().xad().intr_d_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return xaud().xad().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		xaud().xad().trd_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1_dtl() {
		return xaud().xad().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1_dtl(String value) {
		xaud().xad().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2_dtl() {
		return xaud().xad().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2_dtl(String value) {
		xaud().xad().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3_dtl() {
		return xaud().xad().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3_dtl(String value) {
		xaud().xad().sub_char3(value);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return xaud().xad().wms_flg();
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		xaud().xad().wms_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return xaud().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		xaud().ext_sys_cd(value);
	}

	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public String ext_xfr_act_no() {
		return xaud().xad().ext_xfr_act_no();
	}

	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public void ext_xfr_act_no(String value) {
		xaud().xad().ext_xfr_act_no(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return xaud().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		xaud().abort_flg(value);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return xaud().prov_schd_no();
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		xaud().prov_schd_no(value);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return xaud().prov_act_no();
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		xaud().prov_act_no(value);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return xaud().prov_typ();
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		xaud().prov_typ(value);
	}

	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public String ret_prov_schd_no() {
		return xaud().ret_prov_schd_no();
	}

	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public void ret_prov_schd_no(String value) {
		xaud().ret_prov_schd_no(value);
	}

	/**
	 * Supply result No. (Return) 支給実績ＮＯ（返品）.<p>
	 *
	 */
	public String ret_prov_act_no() {
		return xaud().ret_prov_act_no();
	}

	/**
	 * Supply result No. (Return) 支給実績ＮＯ（返品）.<p>
	 *
	 */
	public void ret_prov_act_no(String value) {
		xaud().ret_prov_act_no(value);
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return xaud().ret_prov_typ();
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		xaud().ret_prov_typ(value);
	}

	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public String gi_sppl_cd() {
		return xaud().gi_sppl_cd();
	}

	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public void gi_sppl_cd(String value) {
		xaud().gi_sppl_cd(value);
	}

	/**
	 * Inventory arriving point cd. for GR/GI result 受払実績用在庫着荷先ＣＤ.<p>
	 *
	 */
	public String io_stk_arrv_bp_cd() {
		return xaud().io_stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. for GR/GI result 受払実績用在庫着荷先ＣＤ.<p>
	 *
	 */
	public void io_stk_arrv_bp_cd(String value) {
		xaud().io_stk_arrv_bp_cd(value);
	}

	/**
	 * Inventory identification type for GR/GI result 受払実績用在庫識別区分.<p>
	 *
	 */
	public String io_stk_id_typ() {
		return xaud().io_stk_id_typ();
	}

	/**
	 * Inventory identification type for GR/GI result 受払実績用在庫識別区分.<p>
	 *
	 */
	public void io_stk_id_typ(String value) {
		xaud().io_stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. for GR/GI result 受払実績用在庫取引先ＣＤ.<p>
	 *
	 */
	public String io_stk_bp_cd() {
		return xaud().io_stk_bp_cd();
	}

	/**
	 * Inventory BP cd. for GR/GI result 受払実績用在庫取引先ＣＤ.<p>
	 *
	 */
	public void io_stk_bp_cd(String value) {
		xaud().io_stk_bp_cd(value);
	}

}

