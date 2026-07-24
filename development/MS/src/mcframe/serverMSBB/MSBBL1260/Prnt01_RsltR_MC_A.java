package mcframe.serverMSBB.MSBBL1260;

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
 * ブロック"Prnt01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prnt01_RsltR_MC_A extends MCConstRow {

	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public static final String $slo_prms_rev = "slo_prms_rev";
	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_no = "slo_prms_no";
	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_h_no = "slo_prms_h_no";
	/**
	 * Process result 処理結果.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";


	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_prms_rev_META = createCommonMeta($slo_prms_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta slo_prms_no_META = createCommonMeta($slo_prms_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_NO);
	public static final MCMeta slo_prms_h_no_META = createCommonMeta($slo_prms_h_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_H_NO);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);

	protected static final ConstMetaList<Prnt01_RsltR> constMetas = new ConstMetaList<Prnt01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			err_flg_META,
			slo_no_META,
			slo_d_no_META,
			slo_prms_rev_META,
			slo_prms_no_META,
			slo_prms_h_no_META,
			rtn_sts_typ_META
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
	protected Prnt01_RsltR_MC_A(ConstMetaList<? extends Prnt01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltR clone() {
		return (Prnt01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltR createInstance() {
		return (Prnt01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltR getValues(String... names) {
		return (Prnt01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 0, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 0, $err_flg, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 1, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 1, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 2, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 2, $slo_d_no, value);
	}


	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public MCNumber slo_prms_rev() {
		return getConstNumber(offset + 3, $slo_prms_rev);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(MCNumber value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(int value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(long value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(float value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(double value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}


	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public String slo_prms_no() {
		return getConstString(offset + 4, $slo_prms_no);
	}

	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public void slo_prms_no(String value) {
		setConstString(offset + 4, $slo_prms_no, value);
	}


	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public String slo_prms_h_no() {
		return getConstString(offset + 5, $slo_prms_h_no);
	}

	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public void slo_prms_h_no(String value) {
		setConstString(offset + 5, $slo_prms_h_no, value);
	}


	/**
	 * Process result 処理結果.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 6, $rtn_sts_typ);
	}

	/**
	 * Process result 処理結果.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 6, $rtn_sts_typ, value);
	}


	public String getString(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			return slo_prms_h_no();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			return slo_prms_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			return slo_prms_h_no();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			return slo_prms_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			slo_prms_h_no(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			slo_prms_h_no(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

