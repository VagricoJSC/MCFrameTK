package mcframe.serverMSBB.MSBBL0010;

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
 * ブロック"Imp01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Imp01_DtlR_MC_A extends MCConstRow {

	public static final String $hdr = "hdr";
	public static final String $dtl = "dtl";

	public static final String $data_crud_typ = $hdr + ".data_crud_typ";
	public static final String $err_flg = $hdr + ".err_flg";
	public static final String $file_imp_flg = $hdr + ".file_imp_flg";
	public static final String $cst_frcst_no = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$cst_frcst_no + "";
	public static final String $cst_frcst_prnt_dt = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$cst_frcst_prnt_dt + "";
	public static final String $cst_frcst_slip_no = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$cst_frcst_slip_no + "";
	public static final String $cst_cd = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$cst_cd + "";
	public static final String $cst_nm = $hdr + ".cst_nm";
	public static final String $dlv_cd = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$dlv_cd + "";
	public static final String $dlv_nm = $hdr + ".dlv_nm";
	public static final String $frcst_usr_cd = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$frcst_usr_cd + "";
	public static final String $frcst_usr_nm = $hdr + ".frcst_usr_nm";
	public static final String $frcst_dpt_cd = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$frcst_dpt_cd + "";
	public static final String $frcst_dpt_nm = $hdr + ".frcst_dpt_nm";
	public static final String $wrk_no = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$wrk_no + "";
	public static final String $wrk_nm = $hdr + ".wrk_nm";
	public static final String $rcpt_dt = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$rcpt_dt + "";
	public static final String $can_flg = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$can_flg + "";
	public static final String $can_rsn_cd = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$can_rsn_cd + "";
	public static final String $can_rsn_nm = $hdr + ".can_rsn_nm";
	public static final String $can_rmrks = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$can_rmrks + "";
	public static final String $intr_rmrks = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$intr_rmrks + "";
	public static final String $sub_char1 = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$sub_char1 + "";
	public static final String $sub_char2 = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$sub_char2 + "";
	public static final String $sub_char3 = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$sub_char3 + "";
	public static final String $ins_usr_id = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$ins_usr_id + "";
	public static final String $ins_usr_nm = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$ins_usr_nm + "";
	public static final String $ins_ts = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$ins_ts + "";
	public static final String $ins_func_id = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$ins_func_id + "";
	public static final String $upd_cntr = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$upd_cntr + "";
	public static final String $upd_usr_id = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$upd_usr_id + "";
	public static final String $upd_usr_nm = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$upd_usr_nm + "";
	public static final String $upd_ts = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$upd_ts + "";
	public static final String $upd_func_id = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$upd_func_id + "";
	public static final String $upd_srv_req_no = $hdr + "." + mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.$upd_srv_req_no + "";
	public static final String $peg_no = $dtl + ".peg_no";
	public static final String $cst_frcst_d_no = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_frcst_d_no + "";
	public static final String $fix_flg = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$fix_flg + "";
	public static final String $itm_cd = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_cd + "";
	public static final String $itm_sub1 = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub1 + "";
	public static final String $itm_sub2 = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub2 + "";
	public static final String $itm_sub3 = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$itm_sub3 + "";
	public static final String $itm_nm = $dtl + ".itm_nm";
	public static final String $frcst_period_typ = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_period_typ + "";
	public static final String $frcst_period_typ_nm = $dtl + ".frcst_period_typ_nm";
	public static final String $frcst_st_dt = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_st_dt + "";
	public static final String $frcst_end_dt = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_end_dt + "";
	public static final String $frcst_dt = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_dt + "";
	public static final String $trd_unit_qty = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$trd_unit_qty + "";
	public static final String $trd_unit_cd = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$trd_unit_cd + "";
	public static final String $trd_unit_nm = $dtl + ".trd_unit_nm";
	public static final String $trd_unit_dec_place = $dtl + ".trd_unit_dec_place";
	public static final String $trd_unit_conv_base_qty = $dtl + ".trd_unit_conv_base_qty";
	public static final String $trd_unit_conv_qty = $dtl + ".trd_unit_conv_qty";
	public static final String $trd_unit_rnd_typ = $dtl + ".trd_unit_rnd_typ";
	public static final String $base_unit_qty = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$base_unit_qty + "";
	public static final String $base_unit_cd = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$base_unit_cd + "";
	public static final String $base_unit_nm = $dtl + ".base_unit_nm";
	public static final String $base_unit_dec_place = $dtl + ".base_unit_dec_place";
	public static final String $base_unit_rnd_typ = $dtl + ".base_unit_rnd_typ";
	public static final String $gi_loc_cd = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$gi_loc_cd + "";
	public static final String $gi_loc_nm = $dtl + ".gi_loc_nm";
	public static final String $cst_itm_cd = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_itm_cd + "";
	public static final String $cst_itm_nm = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_itm_nm + "";
	public static final String $cst_frcst_slip_d_no = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$cst_frcst_slip_d_no + "";
	public static final String $disp_seq = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$disp_seq + "";
	public static final String $prms_qty = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$prms_qty + "";
	public static final String $frcst_stop_flg = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$frcst_stop_flg + "";
	public static final String $dtl_intr_rmrks = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_intr_rmrks + "";
	public static final String $dtl_sub_char1 = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char1 + "";
	public static final String $dtl_sub_char2 = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char2 + "";
	public static final String $dtl_sub_char3 = $dtl + "." + mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.$dtl_sub_char3 + "";
	public static final String $rtn_sts_typ = $dtl + ".rtn_sts_typ";

	public static final MCMeta hdr_META = createInnerRowMeta($hdr, mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.class);
	public static final MCMeta dtl_META = createInnerRowMeta($dtl, mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);

	protected static final ConstMetaList<Imp01_DtlR> constMetas = new ConstMetaList<Imp01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_META,
			dtl_META
		},
		new String[][]{
			{
				"data_crud_typ",
				"err_flg",
				"file_imp_flg",
				"cst_frcst_no",
				"cst_frcst_prnt_dt",
				"cst_frcst_slip_no",
				"cst_cd",
				"cst_nm",
				"dlv_cd",
				"dlv_nm",
				"frcst_usr_cd",
				"frcst_usr_nm",
				"frcst_dpt_cd",
				"frcst_dpt_nm",
				"wrk_no",
				"wrk_nm",
				"rcpt_dt",
				"can_flg",
				"can_rsn_cd",
				"can_rsn_nm",
				"can_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"ins_usr_id",
				"ins_usr_nm",
				"ins_ts",
				"ins_func_id",
				"upd_cntr",
				"upd_usr_id",
				"upd_usr_nm",
				"upd_ts",
				"upd_func_id",
				"upd_srv_req_no",
				"peg_no",
				"cst_frcst_d_no",
				"fix_flg",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"frcst_period_typ",
				"frcst_period_typ_nm",
				"frcst_st_dt",
				"frcst_end_dt",
				"frcst_dt",
				"trd_unit_qty",
				"trd_unit_cd",
				"trd_unit_nm",
				"trd_unit_dec_place",
				"trd_unit_conv_base_qty",
				"trd_unit_conv_qty",
				"trd_unit_rnd_typ",
				"base_unit_qty",
				"base_unit_cd",
				"base_unit_nm",
				"base_unit_dec_place",
				"base_unit_rnd_typ",
				"gi_loc_cd",
				"gi_loc_nm",
				"cst_itm_cd",
				"cst_itm_nm",
				"cst_frcst_slip_d_no",
				"disp_seq",
				"prms_qty",
				"frcst_stop_flg",
				"dtl_intr_rmrks",
				"dtl_sub_char1",
				"dtl_sub_char2",
				"dtl_sub_char3",
				"rtn_sts_typ"
			},
			{
				$data_crud_typ,
				$err_flg,
				$file_imp_flg,
				$cst_frcst_no,
				$cst_frcst_prnt_dt,
				$cst_frcst_slip_no,
				$cst_cd,
				$cst_nm,
				$dlv_cd,
				$dlv_nm,
				$frcst_usr_cd,
				$frcst_usr_nm,
				$frcst_dpt_cd,
				$frcst_dpt_nm,
				$wrk_no,
				$wrk_nm,
				$rcpt_dt,
				$can_flg,
				$can_rsn_cd,
				$can_rsn_nm,
				$can_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$ins_usr_id,
				$ins_usr_nm,
				$ins_ts,
				$ins_func_id,
				$upd_cntr,
				$upd_usr_id,
				$upd_usr_nm,
				$upd_ts,
				$upd_func_id,
				$upd_srv_req_no,
				$peg_no,
				$cst_frcst_d_no,
				$fix_flg,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$frcst_period_typ,
				$frcst_period_typ_nm,
				$frcst_st_dt,
				$frcst_end_dt,
				$frcst_dt,
				$trd_unit_qty,
				$trd_unit_cd,
				$trd_unit_nm,
				$trd_unit_dec_place,
				$trd_unit_conv_base_qty,
				$trd_unit_conv_qty,
				$trd_unit_rnd_typ,
				$base_unit_qty,
				$base_unit_cd,
				$base_unit_nm,
				$base_unit_dec_place,
				$base_unit_rnd_typ,
				$gi_loc_cd,
				$gi_loc_nm,
				$cst_itm_cd,
				$cst_itm_nm,
				$cst_frcst_slip_d_no,
				$disp_seq,
				$prms_qty,
				$frcst_stop_flg,
				$dtl_intr_rmrks,
				$dtl_sub_char1,
				$dtl_sub_char2,
				$dtl_sub_char3,
				$rtn_sts_typ
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
	protected Imp01_DtlR_MC_A(ConstMetaList<? extends Imp01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Imp01_DtlR clone() {
		return (Imp01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Imp01_DtlR createInstance() {
		return (Imp01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Imp01_DtlR getValues(String... names) {
		return (Imp01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR hdr(){
		return (mcframe.serverMSBB.MSBBL0010.Chk01_HdrR) getConstInnerRow(offset + 0, $hdr);
	}
	
	public void hdr(mcframe.serverMSBB.MSBBL0010.Chk01_HdrR row){
		setConstInnerRow(offset + 0, $hdr, row);
	}


	public mcframe.serverMSBB.MSBBL0010.Chk01_DtlR dtl(){
		return (mcframe.serverMSBB.MSBBL0010.Chk01_DtlR) getConstInnerRow(offset + 1, $dtl);
	}
	
	public void dtl(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR row){
		setConstInnerRow(offset + 1, $dtl, row);
	}






	public MCRow getInnerRow(String name) {
		if ($hdr.equalsIgnoreCase(name)) {
			return hdr();
		}
		if ($dtl.equalsIgnoreCase(name)) {
			return dtl();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hdr.equalsIgnoreCase(name)) {
			hdr(
				((MCContainerMeta) hdr_META).castInnerRow(mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.class, value)
			);
			return;
		}
		if ($dtl.equalsIgnoreCase(name)) {
			dtl(
				((MCContainerMeta) dtl_META).castInnerRow(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return hdr().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		hdr().data_crud_typ(value);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return hdr().err_flg();
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		hdr().err_flg(value);
	}

	/**
	 * Import file ファイル入力.<p>
	 *
	 */
	public boolean file_imp_flg() {
		return hdr().file_imp_flg();
	}

	/**
	 * Import file ファイル入力.<p>
	 *
	 */
	public void file_imp_flg(boolean value) {
		hdr().file_imp_flg(value);
	}

	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public String cst_frcst_no() {
		return hdr().cst_frcst_no();
	}

	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public void cst_frcst_no(String value) {
		hdr().cst_frcst_no(value);
	}

	/**
	 * Customer forecast list issue date 得意先内示書発行日.<p>
	 *
	 */
	public MCDate cst_frcst_prnt_dt() {
		return hdr().cst_frcst_prnt_dt();
	}

	/**
	 * Customer forecast list issue date 得意先内示書発行日.<p>
	 *
	 */
	public void cst_frcst_prnt_dt(MCDate value) {
		hdr().cst_frcst_prnt_dt(value);
	}

	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public String cst_frcst_slip_no() {
		return hdr().cst_frcst_slip_no();
	}

	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public void cst_frcst_slip_no(String value) {
		hdr().cst_frcst_slip_no(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return hdr().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		hdr().cst_cd(value);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return hdr().cst_nm();
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		hdr().cst_nm(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return hdr().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		hdr().dlv_cd(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return hdr().dlv_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		hdr().dlv_nm(value);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String frcst_usr_cd() {
		return hdr().frcst_usr_cd();
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void frcst_usr_cd(String value) {
		hdr().frcst_usr_cd(value);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String frcst_usr_nm() {
		return hdr().frcst_usr_nm();
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void frcst_usr_nm(String value) {
		hdr().frcst_usr_nm(value);
	}

	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public String frcst_dpt_cd() {
		return hdr().frcst_dpt_cd();
	}

	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public void frcst_dpt_cd(String value) {
		hdr().frcst_dpt_cd(value);
	}

	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public String frcst_dpt_nm() {
		return hdr().frcst_dpt_nm();
	}

	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public void frcst_dpt_nm(String value) {
		hdr().frcst_dpt_nm(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return hdr().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		hdr().wrk_no(value);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return hdr().wrk_nm();
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		hdr().wrk_nm(value);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return hdr().rcpt_dt();
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		hdr().rcpt_dt(value);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return hdr().can_flg();
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		hdr().can_flg(value);
	}

	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public String can_rsn_cd() {
		return hdr().can_rsn_cd();
	}

	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		hdr().can_rsn_cd(value);
	}

	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public String can_rsn_nm() {
		return hdr().can_rsn_nm();
	}

	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public void can_rsn_nm(String value) {
		hdr().can_rsn_nm(value);
	}

	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public String can_rmrks() {
		return hdr().can_rmrks();
	}

	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public void can_rmrks(String value) {
		hdr().can_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return hdr().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		hdr().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return hdr().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		hdr().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return hdr().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		hdr().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return hdr().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		hdr().sub_char3(value);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return hdr().ins_usr_id();
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		hdr().ins_usr_id(value);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return hdr().ins_usr_nm();
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		hdr().ins_usr_nm(value);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return hdr().ins_ts();
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		hdr().ins_ts(value);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return hdr().ins_func_id();
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		hdr().ins_func_id(value);
	}

	/**
	 * Sales forecast header update counter 顧客期間内示ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return hdr().upd_cntr();
	}

	/**
	 * Sales forecast header update counter 顧客期間内示ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		hdr().upd_cntr(value);
	}

	/**
	 * Sales forecast header update counter 顧客期間内示ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		hdr().upd_cntr(value);
	}

	/**
	 * Sales forecast header update counter 顧客期間内示ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		hdr().upd_cntr(value);
	}

	/**
	 * Sales forecast header update counter 顧客期間内示ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		hdr().upd_cntr(value);
	}

	/**
	 * Sales forecast header update counter 顧客期間内示ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		hdr().upd_cntr(value);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return hdr().upd_usr_id();
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		hdr().upd_usr_id(value);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return hdr().upd_usr_nm();
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		hdr().upd_usr_nm(value);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return hdr().upd_ts();
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		hdr().upd_ts(value);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return hdr().upd_func_id();
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		hdr().upd_func_id(value);
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return hdr().upd_srv_req_no();
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		hdr().upd_srv_req_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return dtl().peg_no();
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		dtl().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		dtl().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		dtl().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		dtl().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		dtl().peg_no(value);
	}

	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public String cst_frcst_d_no() {
		return dtl().cst_frcst_d_no();
	}

	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public void cst_frcst_d_no(String value) {
		dtl().cst_frcst_d_no(value);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return dtl().fix_flg();
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		dtl().fix_flg(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return dtl().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		dtl().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return dtl().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		dtl().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return dtl().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		dtl().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return dtl().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		dtl().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return dtl().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		dtl().itm_nm(value);
	}

	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public String frcst_period_typ() {
		return dtl().frcst_period_typ();
	}

	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public void frcst_period_typ(String value) {
		dtl().frcst_period_typ(value);
	}

	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public String frcst_period_typ_nm() {
		return dtl().frcst_period_typ_nm();
	}

	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public void frcst_period_typ_nm(String value) {
		dtl().frcst_period_typ_nm(value);
	}

	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCDate frcst_st_dt() {
		return dtl().frcst_st_dt();
	}

	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public void frcst_st_dt(MCDate value) {
		dtl().frcst_st_dt(value);
	}

	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCDate frcst_end_dt() {
		return dtl().frcst_end_dt();
	}

	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public void frcst_end_dt(MCDate value) {
		dtl().frcst_end_dt(value);
	}

	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public MCDate frcst_dt() {
		return dtl().frcst_dt();
	}

	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public void frcst_dt(MCDate value) {
		dtl().frcst_dt(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return dtl().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		dtl().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return dtl().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		dtl().trd_unit_cd(value);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return dtl().trd_unit_nm();
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		dtl().trd_unit_nm(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return dtl().trd_unit_dec_place();
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		dtl().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		dtl().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		dtl().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		dtl().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		dtl().trd_unit_dec_place(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return dtl().trd_unit_conv_base_qty();
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		dtl().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		dtl().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		dtl().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		dtl().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		dtl().trd_unit_conv_base_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return dtl().trd_unit_conv_qty();
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		dtl().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		dtl().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		dtl().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		dtl().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		dtl().trd_unit_conv_qty(value);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return dtl().trd_unit_rnd_typ();
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		dtl().trd_unit_rnd_typ(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return dtl().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		dtl().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return dtl().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		dtl().base_unit_cd(value);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return dtl().base_unit_nm();
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		dtl().base_unit_nm(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return dtl().base_unit_dec_place();
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		dtl().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		dtl().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		dtl().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		dtl().base_unit_dec_place(value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		dtl().base_unit_dec_place(value);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return dtl().base_unit_rnd_typ();
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		dtl().base_unit_rnd_typ(value);
	}

	/**
	 * GI source location cd. 出庫元場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return dtl().gi_loc_cd();
	}

	/**
	 * GI source location cd. 出庫元場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		dtl().gi_loc_cd(value);
	}

	/**
	 * GI source location name 出庫元場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return dtl().gi_loc_nm();
	}

	/**
	 * GI source location name 出庫元場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		dtl().gi_loc_nm(value);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return dtl().cst_itm_cd();
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		dtl().cst_itm_cd(value);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return dtl().cst_itm_nm();
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		dtl().cst_itm_nm(value);
	}

	/**
	 * Customer forecast list details No. 得意先内示書明細ＮＯ.<p>
	 *
	 */
	public String cst_frcst_slip_d_no() {
		return dtl().cst_frcst_slip_d_no();
	}

	/**
	 * Customer forecast list details No. 得意先内示書明細ＮＯ.<p>
	 *
	 */
	public void cst_frcst_slip_d_no(String value) {
		dtl().cst_frcst_slip_d_no(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return dtl().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		dtl().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		dtl().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		dtl().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		dtl().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		dtl().disp_seq(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public MCNumber prms_qty() {
		return dtl().prms_qty();
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(MCNumber value) {
		dtl().prms_qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(int value) {
		dtl().prms_qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(long value) {
		dtl().prms_qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(float value) {
		dtl().prms_qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(double value) {
		dtl().prms_qty(value);
	}

	/**
	 * Lower priority 下位優先.<p>
	 *
	 */
	public boolean frcst_stop_flg() {
		return dtl().frcst_stop_flg();
	}

	/**
	 * Lower priority 下位優先.<p>
	 *
	 */
	public void frcst_stop_flg(boolean value) {
		dtl().frcst_stop_flg(value);
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return dtl().dtl_intr_rmrks();
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		dtl().dtl_intr_rmrks(value);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return dtl().dtl_sub_char1();
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		dtl().dtl_sub_char1(value);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return dtl().dtl_sub_char2();
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		dtl().dtl_sub_char2(value);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return dtl().dtl_sub_char3();
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		dtl().dtl_sub_char3(value);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return dtl().rtn_sts_typ();
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		dtl().rtn_sts_typ(value);
	}

}

