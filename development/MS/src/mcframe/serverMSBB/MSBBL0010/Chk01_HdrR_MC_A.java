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
 * ブロック"Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_HdrR_MC_A extends MCConstRow {

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
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Import file ファイル入力.<p>
	 *
	 */
	public static final String $file_imp_flg = "file_imp_flg";
	public static final String $hdr = "hdr";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $frcst_usr_nm = "frcst_usr_nm";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public static final String $frcst_dpt_nm = "frcst_dpt_nm";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public static final String $can_rsn_nm = "can_rsn_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";

	public static final String $cst_frcst_no = $hdr + ".cst_frcst_no";
	public static final String $cst_frcst_prnt_dt = $hdr + ".cst_frcst_prnt_dt";
	public static final String $cst_frcst_slip_no = $hdr + ".cst_frcst_slip_no";
	public static final String $cst_cd = $hdr + ".cst_cd";
	public static final String $dlv_cd = $hdr + ".dlv_cd";
	public static final String $frcst_usr_cd = $hdr + ".frcst_usr_cd";
	public static final String $frcst_dpt_cd = $hdr + ".frcst_dpt_cd";
	public static final String $wrk_no = $hdr + ".wrk_no";
	public static final String $rcpt_dt = $hdr + ".rcpt_dt";
	public static final String $can_flg = $hdr + ".can_flg";
	public static final String $can_rsn_cd = $hdr + ".can_rsn_cd";
	public static final String $can_rmrks = $hdr + ".can_rmrks";
	public static final String $intr_rmrks = $hdr + ".intr_rmrks";
	public static final String $sub_char1 = $hdr + ".sub_char1";
	public static final String $sub_char2 = $hdr + ".sub_char2";
	public static final String $sub_char3 = $hdr + ".sub_char3";
	public static final String $ins_usr_id = $hdr + ".ins_usr_id";
	public static final String $ins_usr_nm = $hdr + ".ins_usr_nm";
	public static final String $ins_ts = $hdr + ".ins_ts";
	public static final String $ins_func_id = $hdr + ".ins_func_id";
	public static final String $upd_cntr = $hdr + ".upd_cntr";
	public static final String $upd_usr_id = $hdr + ".upd_usr_id";
	public static final String $upd_usr_nm = $hdr + ".upd_usr_nm";
	public static final String $upd_ts = $hdr + ".upd_ts";
	public static final String $upd_func_id = $hdr + ".upd_func_id";
	public static final String $upd_srv_req_no = $hdr + ".upd_srv_req_no";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta file_imp_flg_META = createCommonMeta($file_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_META = createInnerRowMeta($hdr, mcframe.serverMS.dbc.MST_CST_FRCST_H_R.class);
	public static final MCMeta frcst_usr_nm_META = createCommonMeta($frcst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta frcst_dpt_nm_META = createCommonMeta($frcst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta can_rsn_nm_META = createCommonMeta($can_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final ConstMetaList<Chk01_HdrR> constMetas = new ConstMetaList<Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			file_imp_flg_META,
			hdr_META,
			frcst_usr_nm_META,
			cst_nm_META,
			dlv_nm_META,
			frcst_dpt_nm_META,
			wrk_nm_META,
			can_rsn_nm_META,
			wg_cd_META
		},
		new String[][]{
			{
				"cst_frcst_no",
				"cst_frcst_prnt_dt",
				"cst_frcst_slip_no",
				"cst_cd",
				"dlv_cd",
				"frcst_usr_cd",
				"frcst_dpt_cd",
				"wrk_no",
				"rcpt_dt",
				"can_flg",
				"can_rsn_cd",
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
				"upd_srv_req_no"
			},
			{
				$cst_frcst_no,
				$cst_frcst_prnt_dt,
				$cst_frcst_slip_no,
				$cst_cd,
				$dlv_cd,
				$frcst_usr_cd,
				$frcst_dpt_cd,
				$wrk_no,
				$rcpt_dt,
				$can_flg,
				$can_rsn_cd,
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
				$upd_srv_req_no
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$hdr + ".cst_frcst_no", "E"}	// hdr.cst_frcst_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$hdr + ".cst_frcst_prnt_dt", "E"},	// hdr.cst_frcst_prnt_dt
				{$hdr + ".cst_cd", "E"},	// hdr.cst_cd
				{$hdr + ".frcst_dpt_cd", "E"},	// hdr.frcst_dpt_cd
				{$hdr + ".rcpt_dt", "E"}	// hdr.rcpt_dt
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$hdr + ".cst_cd", "MA.MAUAL0010.Bp"},	// hdr.cst_cd
				{$hdr + ".dlv_cd", "MA.MAUAL0010.Bp"},	// hdr.dlv_cd
				{$hdr + ".frcst_usr_cd", "MA.MAUAL0010.Usr"},	// hdr.frcst_usr_cd
				{$hdr + ".frcst_dpt_cd", "MA.MAUAL0010.Dpt"},	// hdr.frcst_dpt_cd
				{$hdr + ".wrk_no", "MS.MSUAL0030.WrkNo"},	// hdr.wrk_no
				{$hdr + ".can_rsn_cd", "MS.MSUAL0030.SloCanRsn"}	// hdr.can_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$hdr + ".cst_cd", "cst_nm"},	// hdr.cst_cd
				{$hdr + ".dlv_cd", "dlv_nm"},	// hdr.dlv_cd
				{$hdr + ".frcst_usr_cd", "frcst_usr_nm"},	// hdr.frcst_usr_cd
				{$hdr + ".frcst_dpt_cd", "frcst_dpt_nm;wg_cd"},	// hdr.frcst_dpt_cd
				{$hdr + ".wrk_no", "wrk_nm"}	// hdr.wrk_no
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$hdr + ".cst_cd", "bp_nm"},	// hdr.cst_cd
				{$hdr + ".dlv_cd", "bp_nm"},	// hdr.dlv_cd
				{$hdr + ".frcst_usr_cd", "usr_nm"},	// hdr.frcst_usr_cd
				{$hdr + ".frcst_dpt_cd", "dpt_nm;wg_cd"}	// hdr.frcst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$hdr + ".cst_cd", "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY"},	// hdr.cst_cd
				{$hdr + ".dlv_cd", "MAC_BP_IS_SRCH_TYP.DLV"},	// hdr.dlv_cd
				{$hdr + ".frcst_dpt_cd", "cst_frcst_prnt_dt;MAC_DPT_IS_SRCH_TYP.SLS"}	// hdr.frcst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$hdr + ".cst_cd", "bp_is_srch_typ"},	// hdr.cst_cd
				{$hdr + ".dlv_cd", "bp_is_srch_typ"},	// hdr.dlv_cd
				{$hdr + ".frcst_dpt_cd", "dt;dpt_is_srch_typ"}	// hdr.frcst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Chk01_HdrR_MC_A(ConstMetaList<? extends Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR clone() {
		return (Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR createInstance() {
		return (Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR getValues(String... names) {
		return (Chk01_HdrR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Import file ファイル入力.<p>
	 *
	 */
	public boolean file_imp_flg() {
		return getConstBoolean(offset + 3, $file_imp_flg);
	}

	/**
	 * Import file ファイル入力.<p>
	 *
	 */
	public void file_imp_flg(boolean value) {
		setConstBoolean(offset + 3, $file_imp_flg, value);
	}


	public mcframe.serverMS.dbc.MST_CST_FRCST_H_R hdr(){
		return (mcframe.serverMS.dbc.MST_CST_FRCST_H_R) getConstInnerRow(offset + 4, $hdr);
	}
	
	public void hdr(mcframe.serverMS.dbc.MST_CST_FRCST_H_R row){
		setConstInnerRow(offset + 4, $hdr, row);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String frcst_usr_nm() {
		return getConstString(offset + 5, $frcst_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void frcst_usr_nm(String value) {
		setConstString(offset + 5, $frcst_usr_nm, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 6, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 6, $cst_nm, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 7, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 7, $dlv_nm, value);
	}


	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public String frcst_dpt_nm() {
		return getConstString(offset + 8, $frcst_dpt_nm);
	}

	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public void frcst_dpt_nm(String value) {
		setConstString(offset + 8, $frcst_dpt_nm, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 9, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 9, $wrk_nm, value);
	}


	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public String can_rsn_nm() {
		return getConstString(offset + 10, $can_rsn_nm);
	}

	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public void can_rsn_nm(String value) {
		setConstString(offset + 10, $can_rsn_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 11, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 11, $wg_cd, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			return frcst_usr_nm();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			return frcst_dpt_nm();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			return can_rsn_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($file_imp_flg.equalsIgnoreCase(name)) {
			return file_imp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			return frcst_usr_nm();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			return frcst_dpt_nm();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			return can_rsn_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($file_imp_flg.equalsIgnoreCase(name)) {
			return file_imp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			frcst_usr_nm(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			frcst_dpt_nm(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			can_rsn_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($file_imp_flg.equalsIgnoreCase(name)) {
			file_imp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			frcst_usr_nm(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			frcst_dpt_nm(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			can_rsn_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($file_imp_flg.equalsIgnoreCase(name)) {
			file_imp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($hdr.equalsIgnoreCase(name)) {
			return hdr();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hdr.equalsIgnoreCase(name)) {
			hdr(
				((MCContainerMeta) hdr_META).castInnerRow(mcframe.serverMS.dbc.MST_CST_FRCST_H_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
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

}

