package mcframe.serverMSBE.MSBEL1730;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public static final String $srch_tgt_typ = "srch_tgt_typ";
	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public static final String $srch_tgt_no = "srch_tgt_no";
	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public static final String $srch_tgt_rev = "srch_tgt_rev";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Reference type 参照種別.<p>
	 *
	 */
	public static final String $ref_ope_flg = "ref_ope_flg";
	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $iv_mng_no = "iv_mng_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Latest invoice management No. 最新インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $latest_iv_mng_no = "latest_iv_mng_no";
	/**
	 * Latest invoice rev. number 最新インボイス改訂番号.<p>
	 *
	 */
	public static final String $latest_iv_rev = "latest_iv_rev";


	public static final MCMeta srch_tgt_typ_META = createCommonMeta($srch_tgt_typ, mcframe.commonMS.meta.MS_META.STK_SRCH_TGT_TYP);
	public static final MCMeta srch_tgt_no_META = createCommonMeta($srch_tgt_no, mcframe.commonMS.meta.MS_META.SRCH_TGT_NO);
	public static final MCMeta srch_tgt_rev_META = createCommonMeta($srch_tgt_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_ope_flg_META = createCommonMeta($ref_ope_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_mng_no_META = createCommonMeta($iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta latest_iv_mng_no_META = createCommonMeta($latest_iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta latest_iv_rev_META = createCommonMeta($latest_iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			srch_tgt_typ_META,
			srch_tgt_no_META,
			srch_tgt_rev_META,
			latest_flg_META,
			ref_ope_flg_META,
			iv_mng_no_META,
			rcpt_iv_mng_no_META,
			can_flg_META,
			latest_iv_mng_no_META,
			latest_iv_rev_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public String srch_tgt_typ() {
		return getConstString(offset + 0, $srch_tgt_typ);
	}

	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public void srch_tgt_typ(String value) {
		setConstString(offset + 0, $srch_tgt_typ, value);
	}


	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public String srch_tgt_no() {
		return getConstString(offset + 1, $srch_tgt_no);
	}

	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public void srch_tgt_no(String value) {
		setConstString(offset + 1, $srch_tgt_no, value);
	}


	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public MCNumber srch_tgt_rev() {
		return getConstNumber(offset + 2, $srch_tgt_rev);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(MCNumber value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(int value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(long value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(float value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(double value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 3, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 3, $latest_flg, value);
	}


	/**
	 * Reference type 参照種別.<p>
	 *
	 */
	public boolean ref_ope_flg() {
		return getConstBoolean(offset + 4, $ref_ope_flg);
	}

	/**
	 * Reference type 参照種別.<p>
	 *
	 */
	public void ref_ope_flg(boolean value) {
		setConstBoolean(offset + 4, $ref_ope_flg, value);
	}


	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public String iv_mng_no() {
		return getConstString(offset + 5, $iv_mng_no);
	}

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public void iv_mng_no(String value) {
		setConstString(offset + 5, $iv_mng_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 6, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 6, $rcpt_iv_mng_no, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 7, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 7, $can_flg, value);
	}


	/**
	 * Latest invoice management No. 最新インボイス管理ＮＯ.<p>
	 *
	 */
	public String latest_iv_mng_no() {
		return getConstString(offset + 8, $latest_iv_mng_no);
	}

	/**
	 * Latest invoice management No. 最新インボイス管理ＮＯ.<p>
	 *
	 */
	public void latest_iv_mng_no(String value) {
		setConstString(offset + 8, $latest_iv_mng_no, value);
	}


	/**
	 * Latest invoice rev. number 最新インボイス改訂番号.<p>
	 *
	 */
	public MCNumber latest_iv_rev() {
		return getConstNumber(offset + 9, $latest_iv_rev);
	}

	/**
	 * Latest invoice rev. number 最新インボイス改訂番号.<p>
	 *
	 */
	public void latest_iv_rev(MCNumber value) {
		setConstNumber(offset + 9, $latest_iv_rev, value);
	}

	/**
	 * Latest invoice rev. number 最新インボイス改訂番号.<p>
	 *
	 */
	public void latest_iv_rev(int value) {
		setConstNumber(offset + 9, $latest_iv_rev, value);
	}

	/**
	 * Latest invoice rev. number 最新インボイス改訂番号.<p>
	 *
	 */
	public void latest_iv_rev(long value) {
		setConstNumber(offset + 9, $latest_iv_rev, value);
	}

	/**
	 * Latest invoice rev. number 最新インボイス改訂番号.<p>
	 *
	 */
	public void latest_iv_rev(float value) {
		setConstNumber(offset + 9, $latest_iv_rev, value);
	}

	/**
	 * Latest invoice rev. number 最新インボイス改訂番号.<p>
	 *
	 */
	public void latest_iv_rev(double value) {
		setConstNumber(offset + 9, $latest_iv_rev, value);
	}


	public String getString(String name) {
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			return srch_tgt_typ();
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			return srch_tgt_no();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($latest_iv_mng_no.equalsIgnoreCase(name)) {
			return latest_iv_mng_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			return srch_tgt_rev();
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			return latest_iv_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($ref_ope_flg.equalsIgnoreCase(name)) {
			return ref_ope_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			return srch_tgt_typ();
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			return srch_tgt_no();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($latest_iv_mng_no.equalsIgnoreCase(name)) {
			return latest_iv_mng_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			return srch_tgt_rev();
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			return latest_iv_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($ref_ope_flg.equalsIgnoreCase(name)) {
			return ref_ope_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			srch_tgt_typ(value);
			return;
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			srch_tgt_no(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($latest_iv_mng_no.equalsIgnoreCase(name)) {
			latest_iv_mng_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($ref_ope_flg.equalsIgnoreCase(name)) {
			ref_ope_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			srch_tgt_typ(value);
			return;
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			srch_tgt_no(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($latest_iv_mng_no.equalsIgnoreCase(name)) {
			latest_iv_mng_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		if ($latest_iv_rev.equalsIgnoreCase(name)) {
			latest_iv_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($ref_ope_flg.equalsIgnoreCase(name)) {
			ref_ope_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

