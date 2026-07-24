package mcframe.serverMSBE.MSBEL5710;

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
 * ブロック"ExAct_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ExAct_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $iv_mng_no = "iv_mng_no";
	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public static final String $iv_rev = "iv_rev";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public static final String $cmpl_dt = "cmpl_dt";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public static final String $arr_schd_dt = "arr_schd_dt";
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public static final String $sls_schd_dt = "sls_schd_dt";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public static final String $bl_no = "bl_no";
	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public static final String $bl_dt = "bl_dt";
	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public static final String $bl_rmrks = "bl_rmrks";


	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta iv_mng_no_META = createCommonMeta($iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta iv_rev_META = createCommonMeta($iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta cmpl_dt_META = createCommonMeta($cmpl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_dt_META = createCommonMeta($arr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_schd_dt_META = createCommonMeta($sls_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bl_no_META = createCommonMeta($bl_no, mcframe.commonMA.meta.MA_META.BL_NO);
	public static final MCMeta bl_dt_META = createCommonMeta($bl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bl_rmrks_META = createCommonMeta($bl_rmrks, mcframe.commonMS.meta.MS_META.BL_RMRKS);

	protected static final ConstMetaList<ExAct_Upd01_DtlR> constMetas = new ConstMetaList<ExAct_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_ptn_typ_META,
			iv_mng_no_META,
			iv_rev_META,
			iv_no_META,
			cmpl_dt_META,
			ac_dt_META,
			can_ac_dt_META,
			arr_schd_dt_META,
			sls_schd_dt_META,
			bill_basis_dt_META,
			rcv_schd_dt_META,
			bl_no_META,
			bl_dt_META,
			bl_rmrks_META
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
	protected ExAct_Upd01_DtlR_MC_A(ConstMetaList<? extends ExAct_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExAct_Upd01_DtlR clone() {
		return (ExAct_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExAct_Upd01_DtlR createInstance() {
		return (ExAct_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExAct_Upd01_DtlR getValues(String... names) {
		return (ExAct_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 0, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 0, $trd_ptn_typ, value);
	}


	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public String iv_mng_no() {
		return getConstString(offset + 1, $iv_mng_no);
	}

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public void iv_mng_no(String value) {
		setConstString(offset + 1, $iv_mng_no, value);
	}


	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public MCNumber iv_rev() {
		return getConstNumber(offset + 2, $iv_rev);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(MCNumber value) {
		setConstNumber(offset + 2, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(int value) {
		setConstNumber(offset + 2, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(long value) {
		setConstNumber(offset + 2, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(float value) {
		setConstNumber(offset + 2, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(double value) {
		setConstNumber(offset + 2, $iv_rev, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 3, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 3, $iv_no, value);
	}


	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCDate cmpl_dt() {
		return getConstDate(offset + 4, $cmpl_dt);
	}

	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public void cmpl_dt(MCDate value) {
		setConstDate(offset + 4, $cmpl_dt, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 5, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 5, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 6, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 6, $can_ac_dt, value);
	}


	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCDate arr_schd_dt() {
		return getConstDate(offset + 7, $arr_schd_dt);
	}

	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public void arr_schd_dt(MCDate value) {
		setConstDate(offset + 7, $arr_schd_dt, value);
	}


	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCDate sls_schd_dt() {
		return getConstDate(offset + 8, $sls_schd_dt);
	}

	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public void sls_schd_dt(MCDate value) {
		setConstDate(offset + 8, $sls_schd_dt, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 9, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 9, $bill_basis_dt, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 10, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 10, $rcv_schd_dt, value);
	}


	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public String bl_no() {
		return getConstString(offset + 11, $bl_no);
	}

	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public void bl_no(String value) {
		setConstString(offset + 11, $bl_no, value);
	}


	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCDate bl_dt() {
		return getConstDate(offset + 12, $bl_dt);
	}

	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public void bl_dt(MCDate value) {
		setConstDate(offset + 12, $bl_dt, value);
	}


	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public String bl_rmrks() {
		return getConstString(offset + 13, $bl_rmrks);
	}

	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public void bl_rmrks(String value) {
		setConstString(offset + 13, $bl_rmrks, value);
	}


	public String getString(String name) {
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

