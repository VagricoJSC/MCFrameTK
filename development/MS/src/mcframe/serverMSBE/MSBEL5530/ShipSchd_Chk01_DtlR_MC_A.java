package mcframe.serverMSBE.MSBEL5530;

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
 * ブロック"ShipSchd_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipSchd_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public static final String $tmp_inst_d_no = "tmp_inst_d_no";
	public static final String $sp = "sp";
	public static final String $ss = "ss";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public static final String $iv_trd_flg = "iv_trd_flg";
	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public static final String $hs_cd = "hs_cd";
	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public static final String $hdr_dtl_peg = "hdr_dtl_peg";

	public static final String $ship_pr_no = $sp + ".ship_pr_no";
	public static final String $cst_cd = $sp + ".cst_cd";
	public static final String $ship_schd_no = $ss + ".ship_schd_no";

	public static final MCMeta tmp_inst_d_no_META = createCommonMeta($tmp_inst_d_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sp_META = createInnerRowMeta($sp, mcframe.serverMS.dbc.MST_SHIP_PR_R.class);
	public static final MCMeta ss_META = createInnerRowMeta($ss, mcframe.serverMS.dbc.MST_SHIP_SCHD_R.class);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_trd_flg_META = createCommonMeta($iv_trd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta hs_cd_META = createCommonMeta($hs_cd, mcframe.commonMA.meta.MA_META.HS_CD);
	public static final MCMeta hdr_dtl_peg_META = createCommonMeta($hdr_dtl_peg, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<ShipSchd_Chk01_DtlR> constMetas = new ConstMetaList<ShipSchd_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			tmp_inst_d_no_META,
			sp_META,
			ss_META,
			cst_iv_flg_META,
			iv_trd_flg_META,
			dlv_lg_grp_cd_META,
			dlv_cntry_cd_META,
			hs_cd_META,
			hdr_dtl_peg_META
		},
		new String[][]{
			{
				"ship_pr_no",
				"cst_cd",
				"ship_schd_no"
			},
			{
				$ship_pr_no,
				$cst_cd,
				$ship_schd_no
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected ShipSchd_Chk01_DtlR_MC_A(ConstMetaList<? extends ShipSchd_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Chk01_DtlR clone() {
		return (ShipSchd_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Chk01_DtlR createInstance() {
		return (ShipSchd_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipSchd_Chk01_DtlR getValues(String... names) {
		return (ShipSchd_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public MCNumber tmp_inst_d_no() {
		return getConstNumber(offset + 0, $tmp_inst_d_no);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(MCNumber value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(int value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(long value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(float value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(double value) {
		setConstNumber(offset + 0, $tmp_inst_d_no, value);
	}


	public mcframe.serverMS.dbc.MST_SHIP_PR_R sp(){
		return (mcframe.serverMS.dbc.MST_SHIP_PR_R) getConstInnerRow(offset + 1, $sp);
	}
	
	public void sp(mcframe.serverMS.dbc.MST_SHIP_PR_R row){
		setConstInnerRow(offset + 1, $sp, row);
	}


	public mcframe.serverMS.dbc.MST_SHIP_SCHD_R ss(){
		return (mcframe.serverMS.dbc.MST_SHIP_SCHD_R) getConstInnerRow(offset + 2, $ss);
	}
	
	public void ss(mcframe.serverMS.dbc.MST_SHIP_SCHD_R row){
		setConstInnerRow(offset + 2, $ss, row);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 3, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 3, $cst_iv_flg, value);
	}


	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public boolean iv_trd_flg() {
		return getConstBoolean(offset + 4, $iv_trd_flg);
	}

	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public void iv_trd_flg(boolean value) {
		setConstBoolean(offset + 4, $iv_trd_flg, value);
	}


	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 5, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 5, $dlv_lg_grp_cd, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 6, $dlv_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 6, $dlv_cntry_cd, value);
	}


	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public String hs_cd() {
		return getConstString(offset + 7, $hs_cd);
	}

	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public void hs_cd(String value) {
		setConstString(offset + 7, $hs_cd, value);
	}


	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg() {
		return getConstNumber(offset + 8, $hdr_dtl_peg);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(MCNumber value) {
		setConstNumber(offset + 8, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(int value) {
		setConstNumber(offset + 8, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(long value) {
		setConstNumber(offset + 8, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(float value) {
		setConstNumber(offset + 8, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(double value) {
		setConstNumber(offset + 8, $hdr_dtl_peg, value);
	}


	public String getString(String name) {
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			return tmp_inst_d_no();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			return tmp_inst_d_no();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sp.equalsIgnoreCase(name)) {
			return sp();
		}
		if ($ss.equalsIgnoreCase(name)) {
			return ss();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sp.equalsIgnoreCase(name)) {
			sp(
				((MCContainerMeta) sp_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_PR_R.class, value)
			);
			return;
		}
		if ($ss.equalsIgnoreCase(name)) {
			ss(
				((MCContainerMeta) ss_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return sp().ship_pr_no();
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		sp().ship_pr_no(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return sp().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		sp().cst_cd(value);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return ss().ship_schd_no();
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		ss().ship_schd_no(value);
	}

}

