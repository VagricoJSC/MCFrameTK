package mcframe.serverMSBE.MSBEL5720;

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
 * ブロック"ExRpt_Prnt02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ExRpt_Prnt02_CndR_MC_A extends MCConstRow {

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public static final String $ship_rqst_id_nm = "ship_rqst_id_nm";
	/**
	 * Customer alias name 1 得意先別名１.<p>
	 *
	 */
	public static final String $ship_rqst_id_alt_nm1 = "ship_rqst_id_alt_nm1";
	/**
	 * Customer alias name 2 得意先別名２.<p>
	 *
	 */
	public static final String $ship_rqst_id_alt_nm2 = "ship_rqst_id_alt_nm2";
	/**
	 * Customer alias name 3 得意先別名３.<p>
	 *
	 */
	public static final String $ship_rqst_id_alt_nm3 = "ship_rqst_id_alt_nm3";
	/**
	 * Customer alias name 4 得意先別名４.<p>
	 *
	 */
	public static final String $ship_rqst_id_alt_nm4 = "ship_rqst_id_alt_nm4";
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 * Delivery destination alias name 1 納品先別名１.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm1 = "dlv_id_alt_nm1";
	/**
	 * Delivery destination alias name 2 納品先別名２.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm2 = "dlv_id_alt_nm2";
	/**
	 * Delivery destination alias name 3 納品先別名３.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm3 = "dlv_id_alt_nm3";
	/**
	 * Delivery destination alias name 4 納品先別名４.<p>
	 *
	 */
	public static final String $dlv_id_alt_nm4 = "dlv_id_alt_nm4";
	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public static final String $pl_prnt_flg = "pl_prnt_flg";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta ship_rqst_id_alt_nm1_META = createCommonMeta($ship_rqst_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta ship_rqst_id_alt_nm2_META = createCommonMeta($ship_rqst_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta ship_rqst_id_alt_nm3_META = createCommonMeta($ship_rqst_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta ship_rqst_id_alt_nm4_META = createCommonMeta($ship_rqst_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_id_alt_nm1_META = createCommonMeta($dlv_id_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_id_alt_nm2_META = createCommonMeta($dlv_id_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_id_alt_nm3_META = createCommonMeta($dlv_id_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_id_alt_nm4_META = createCommonMeta($dlv_id_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta pl_prnt_flg_META = createCommonMeta($pl_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ExRpt_Prnt02_CndR> constMetas = new ConstMetaList<ExRpt_Prnt02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			iv_no_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			ship_rqst_id_alt_nm1_META,
			ship_rqst_id_alt_nm2_META,
			ship_rqst_id_alt_nm3_META,
			ship_rqst_id_alt_nm4_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_id_alt_nm1_META,
			dlv_id_alt_nm2_META,
			dlv_id_alt_nm3_META,
			dlv_id_alt_nm4_META,
			pl_prnt_flg_META,
			prnt_lcl_cd_META,
			err_flg_META
		},
		new String[][]{
			{
			},
			{
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
	protected ExRpt_Prnt02_CndR_MC_A(ConstMetaList<? extends ExRpt_Prnt02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExRpt_Prnt02_CndR clone() {
		return (ExRpt_Prnt02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExRpt_Prnt02_CndR createInstance() {
		return (ExRpt_Prnt02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExRpt_Prnt02_CndR getValues(String... names) {
		return (ExRpt_Prnt02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 0, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 0, $iv_no, value);
	}


	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 1, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 1, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 2, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 2, $ship_rqst_id_nm, value);
	}


	/**
	 * Customer alias name 1 得意先別名１.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm1() {
		return getConstString(offset + 3, $ship_rqst_id_alt_nm1);
	}

	/**
	 * Customer alias name 1 得意先別名１.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm1(String value) {
		setConstString(offset + 3, $ship_rqst_id_alt_nm1, value);
	}


	/**
	 * Customer alias name 2 得意先別名２.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm2() {
		return getConstString(offset + 4, $ship_rqst_id_alt_nm2);
	}

	/**
	 * Customer alias name 2 得意先別名２.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm2(String value) {
		setConstString(offset + 4, $ship_rqst_id_alt_nm2, value);
	}


	/**
	 * Customer alias name 3 得意先別名３.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm3() {
		return getConstString(offset + 5, $ship_rqst_id_alt_nm3);
	}

	/**
	 * Customer alias name 3 得意先別名３.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm3(String value) {
		setConstString(offset + 5, $ship_rqst_id_alt_nm3, value);
	}


	/**
	 * Customer alias name 4 得意先別名４.<p>
	 *
	 */
	public String ship_rqst_id_alt_nm4() {
		return getConstString(offset + 6, $ship_rqst_id_alt_nm4);
	}

	/**
	 * Customer alias name 4 得意先別名４.<p>
	 *
	 */
	public void ship_rqst_id_alt_nm4(String value) {
		setConstString(offset + 6, $ship_rqst_id_alt_nm4, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 7, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 7, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 8, $dlv_id_nm);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 8, $dlv_id_nm, value);
	}


	/**
	 * Delivery destination alias name 1 納品先別名１.<p>
	 *
	 */
	public String dlv_id_alt_nm1() {
		return getConstString(offset + 9, $dlv_id_alt_nm1);
	}

	/**
	 * Delivery destination alias name 1 納品先別名１.<p>
	 *
	 */
	public void dlv_id_alt_nm1(String value) {
		setConstString(offset + 9, $dlv_id_alt_nm1, value);
	}


	/**
	 * Delivery destination alias name 2 納品先別名２.<p>
	 *
	 */
	public String dlv_id_alt_nm2() {
		return getConstString(offset + 10, $dlv_id_alt_nm2);
	}

	/**
	 * Delivery destination alias name 2 納品先別名２.<p>
	 *
	 */
	public void dlv_id_alt_nm2(String value) {
		setConstString(offset + 10, $dlv_id_alt_nm2, value);
	}


	/**
	 * Delivery destination alias name 3 納品先別名３.<p>
	 *
	 */
	public String dlv_id_alt_nm3() {
		return getConstString(offset + 11, $dlv_id_alt_nm3);
	}

	/**
	 * Delivery destination alias name 3 納品先別名３.<p>
	 *
	 */
	public void dlv_id_alt_nm3(String value) {
		setConstString(offset + 11, $dlv_id_alt_nm3, value);
	}


	/**
	 * Delivery destination alias name 4 納品先別名４.<p>
	 *
	 */
	public String dlv_id_alt_nm4() {
		return getConstString(offset + 12, $dlv_id_alt_nm4);
	}

	/**
	 * Delivery destination alias name 4 納品先別名４.<p>
	 *
	 */
	public void dlv_id_alt_nm4(String value) {
		setConstString(offset + 12, $dlv_id_alt_nm4, value);
	}


	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public boolean pl_prnt_flg() {
		return getConstBoolean(offset + 13, $pl_prnt_flg);
	}

	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public void pl_prnt_flg(boolean value) {
		setConstBoolean(offset + 13, $pl_prnt_flg, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 14, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 14, $prnt_lcl_cd, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 15, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 15, $err_flg, value);
	}


	public String getString(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
		}
		if ($ship_rqst_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm1();
		}
		if ($ship_rqst_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm2();
		}
		if ($ship_rqst_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm3();
		}
		if ($ship_rqst_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm4();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm1();
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm2();
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm3();
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm4();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			return pl_prnt_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
		}
		if ($ship_rqst_id_alt_nm1.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm1();
		}
		if ($ship_rqst_id_alt_nm2.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm2();
		}
		if ($ship_rqst_id_alt_nm3.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm3();
		}
		if ($ship_rqst_id_alt_nm4.equalsIgnoreCase(name)) {
			return ship_rqst_id_alt_nm4();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm1();
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm2();
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm3();
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_id_alt_nm4();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			return pl_prnt_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
			return;
		}
		if ($ship_rqst_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm1(value);
			return;
		}
		if ($ship_rqst_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm2(value);
			return;
		}
		if ($ship_rqst_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm3(value);
			return;
		}
		if ($ship_rqst_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm4(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			dlv_id_alt_nm1(value);
			return;
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			dlv_id_alt_nm2(value);
			return;
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			dlv_id_alt_nm3(value);
			return;
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			dlv_id_alt_nm4(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			pl_prnt_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
			return;
		}
		if ($ship_rqst_id_alt_nm1.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm1(value);
			return;
		}
		if ($ship_rqst_id_alt_nm2.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm2(value);
			return;
		}
		if ($ship_rqst_id_alt_nm3.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm3(value);
			return;
		}
		if ($ship_rqst_id_alt_nm4.equalsIgnoreCase(name)) {
			ship_rqst_id_alt_nm4(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_id_alt_nm1.equalsIgnoreCase(name)) {
			dlv_id_alt_nm1(value);
			return;
		}
		if ($dlv_id_alt_nm2.equalsIgnoreCase(name)) {
			dlv_id_alt_nm2(value);
			return;
		}
		if ($dlv_id_alt_nm3.equalsIgnoreCase(name)) {
			dlv_id_alt_nm3(value);
			return;
		}
		if ($dlv_id_alt_nm4.equalsIgnoreCase(name)) {
			dlv_id_alt_nm4(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			pl_prnt_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

