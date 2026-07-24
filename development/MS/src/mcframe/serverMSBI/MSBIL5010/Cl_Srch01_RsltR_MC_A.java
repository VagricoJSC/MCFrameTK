package mcframe.serverMSBI.MSBIL5010;

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
 * ブロック"Cl_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Cl_Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Fiscal month 年月度.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Final closing 本締.<p>
	 *
	 */
	public static final String $cl_flg = "cl_flg";
	/**
	 * Release final closing 本締解除.<p>
	 *
	 */
	public static final String $rel_cl_flg = "rel_cl_flg";
	/**
	 * Temporary closing 仮締.<p>
	 *
	 */
	public static final String $pre_cl_flg = "pre_cl_flg";
	/**
	 * Release temporary closing 仮締解除.<p>
	 *
	 */
	public static final String $rel_pre_cl_flg = "rel_pre_cl_flg";
	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public static final String $sls_cl_flg = "sls_cl_flg";
	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public static final String $rcv_cl_flg = "rcv_cl_flg";
	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public static final String $purc_cl_flg = "purc_cl_flg";
	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public static final String $pay_cl_flg = "pay_cl_flg";
	/**
	 * Inventory closing 在庫締.<p>
	 *
	 */
	public static final String $stk_cl_flg = "stk_cl_flg";
	/**
	 * Sales closing month 売上締年月.<p>
	 *
	 */
	public static final String $sls_cl_ym = "sls_cl_ym";
	/**
	 * Payment received closing month 入金締年月.<p>
	 *
	 */
	public static final String $rcv_cl_ym = "rcv_cl_ym";
	/**
	 * Purchase closing month 仕入締年月.<p>
	 *
	 */
	public static final String $purc_cl_ym = "purc_cl_ym";
	/**
	 * Payment closing month 支払締年月.<p>
	 *
	 */
	public static final String $pay_cl_ym = "pay_cl_ym";
	/**
	 * Inventory closing month 在庫締年月.<p>
	 *
	 */
	public static final String $stk_cl_ym = "stk_cl_ym";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta cl_flg_META = createCommonMeta($cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rel_cl_flg_META = createCommonMeta($rel_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_cl_flg_META = createCommonMeta($pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rel_pre_cl_flg_META = createCommonMeta($rel_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cl_flg_META = createCommonMeta($sls_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_cl_flg_META = createCommonMeta($rcv_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cl_flg_META = createCommonMeta($purc_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_cl_flg_META = createCommonMeta($pay_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_cl_flg_META = createCommonMeta($stk_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cl_ym_META = createCommonMeta($sls_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta rcv_cl_ym_META = createCommonMeta($rcv_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta purc_cl_ym_META = createCommonMeta($purc_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pay_cl_ym_META = createCommonMeta($pay_cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta stk_cl_ym_META = createCommonMeta($stk_cl_ym, mcframe.commonMA.meta.MA_META.YM);

	protected static final ConstMetaList<Cl_Srch01_RsltR> constMetas = new ConstMetaList<Cl_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			cl_flg_META,
			rel_cl_flg_META,
			pre_cl_flg_META,
			rel_pre_cl_flg_META,
			sls_cl_flg_META,
			rcv_cl_flg_META,
			purc_cl_flg_META,
			pay_cl_flg_META,
			stk_cl_flg_META,
			sls_cl_ym_META,
			rcv_cl_ym_META,
			purc_cl_ym_META,
			pay_cl_ym_META,
			stk_cl_ym_META
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
	protected Cl_Srch01_RsltR_MC_A(ConstMetaList<? extends Cl_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cl_Srch01_RsltR clone() {
		return (Cl_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cl_Srch01_RsltR createInstance() {
		return (Cl_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cl_Srch01_RsltR getValues(String... names) {
		return (Cl_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Fiscal month 年月度.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Fiscal month 年月度.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * Final closing 本締.<p>
	 *
	 */
	public boolean cl_flg() {
		return getConstBoolean(offset + 1, $cl_flg);
	}

	/**
	 * Final closing 本締.<p>
	 *
	 */
	public void cl_flg(boolean value) {
		setConstBoolean(offset + 1, $cl_flg, value);
	}


	/**
	 * Release final closing 本締解除.<p>
	 *
	 */
	public boolean rel_cl_flg() {
		return getConstBoolean(offset + 2, $rel_cl_flg);
	}

	/**
	 * Release final closing 本締解除.<p>
	 *
	 */
	public void rel_cl_flg(boolean value) {
		setConstBoolean(offset + 2, $rel_cl_flg, value);
	}


	/**
	 * Temporary closing 仮締.<p>
	 *
	 */
	public boolean pre_cl_flg() {
		return getConstBoolean(offset + 3, $pre_cl_flg);
	}

	/**
	 * Temporary closing 仮締.<p>
	 *
	 */
	public void pre_cl_flg(boolean value) {
		setConstBoolean(offset + 3, $pre_cl_flg, value);
	}


	/**
	 * Release temporary closing 仮締解除.<p>
	 *
	 */
	public boolean rel_pre_cl_flg() {
		return getConstBoolean(offset + 4, $rel_pre_cl_flg);
	}

	/**
	 * Release temporary closing 仮締解除.<p>
	 *
	 */
	public void rel_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 4, $rel_pre_cl_flg, value);
	}


	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public boolean sls_cl_flg() {
		return getConstBoolean(offset + 5, $sls_cl_flg);
	}

	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public void sls_cl_flg(boolean value) {
		setConstBoolean(offset + 5, $sls_cl_flg, value);
	}


	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public boolean rcv_cl_flg() {
		return getConstBoolean(offset + 6, $rcv_cl_flg);
	}

	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public void rcv_cl_flg(boolean value) {
		setConstBoolean(offset + 6, $rcv_cl_flg, value);
	}


	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public boolean purc_cl_flg() {
		return getConstBoolean(offset + 7, $purc_cl_flg);
	}

	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public void purc_cl_flg(boolean value) {
		setConstBoolean(offset + 7, $purc_cl_flg, value);
	}


	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public boolean pay_cl_flg() {
		return getConstBoolean(offset + 8, $pay_cl_flg);
	}

	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public void pay_cl_flg(boolean value) {
		setConstBoolean(offset + 8, $pay_cl_flg, value);
	}


	/**
	 * Inventory closing 在庫締.<p>
	 *
	 */
	public boolean stk_cl_flg() {
		return getConstBoolean(offset + 9, $stk_cl_flg);
	}

	/**
	 * Inventory closing 在庫締.<p>
	 *
	 */
	public void stk_cl_flg(boolean value) {
		setConstBoolean(offset + 9, $stk_cl_flg, value);
	}


	/**
	 * Sales closing month 売上締年月.<p>
	 *
	 */
	public MCDate sls_cl_ym() {
		return getConstDate(offset + 10, $sls_cl_ym);
	}

	/**
	 * Sales closing month 売上締年月.<p>
	 *
	 */
	public void sls_cl_ym(MCDate value) {
		setConstDate(offset + 10, $sls_cl_ym, value);
	}


	/**
	 * Payment received closing month 入金締年月.<p>
	 *
	 */
	public MCDate rcv_cl_ym() {
		return getConstDate(offset + 11, $rcv_cl_ym);
	}

	/**
	 * Payment received closing month 入金締年月.<p>
	 *
	 */
	public void rcv_cl_ym(MCDate value) {
		setConstDate(offset + 11, $rcv_cl_ym, value);
	}


	/**
	 * Purchase closing month 仕入締年月.<p>
	 *
	 */
	public MCDate purc_cl_ym() {
		return getConstDate(offset + 12, $purc_cl_ym);
	}

	/**
	 * Purchase closing month 仕入締年月.<p>
	 *
	 */
	public void purc_cl_ym(MCDate value) {
		setConstDate(offset + 12, $purc_cl_ym, value);
	}


	/**
	 * Payment closing month 支払締年月.<p>
	 *
	 */
	public MCDate pay_cl_ym() {
		return getConstDate(offset + 13, $pay_cl_ym);
	}

	/**
	 * Payment closing month 支払締年月.<p>
	 *
	 */
	public void pay_cl_ym(MCDate value) {
		setConstDate(offset + 13, $pay_cl_ym, value);
	}


	/**
	 * Inventory closing month 在庫締年月.<p>
	 *
	 */
	public MCDate stk_cl_ym() {
		return getConstDate(offset + 14, $stk_cl_ym);
	}

	/**
	 * Inventory closing month 在庫締年月.<p>
	 *
	 */
	public void stk_cl_ym(MCDate value) {
		setConstDate(offset + 14, $stk_cl_ym, value);
	}


	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			return sls_cl_ym();
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			return rcv_cl_ym();
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			return purc_cl_ym();
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			return pay_cl_ym();
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			return stk_cl_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			return cl_flg();
		}
		if ($rel_cl_flg.equalsIgnoreCase(name)) {
			return rel_cl_flg();
		}
		if ($pre_cl_flg.equalsIgnoreCase(name)) {
			return pre_cl_flg();
		}
		if ($rel_pre_cl_flg.equalsIgnoreCase(name)) {
			return rel_pre_cl_flg();
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			return stk_cl_flg();
		}
		return super.getBoolean(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			return sls_cl_ym();
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			return rcv_cl_ym();
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			return purc_cl_ym();
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			return pay_cl_ym();
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			return stk_cl_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			return cl_flg();
		}
		if ($rel_cl_flg.equalsIgnoreCase(name)) {
			return rel_cl_flg();
		}
		if ($pre_cl_flg.equalsIgnoreCase(name)) {
			return pre_cl_flg();
		}
		if ($rel_pre_cl_flg.equalsIgnoreCase(name)) {
			return rel_pre_cl_flg();
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			return stk_cl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			sls_cl_ym(value);
			return;
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			rcv_cl_ym(value);
			return;
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			purc_cl_ym(value);
			return;
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			pay_cl_ym(value);
			return;
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			stk_cl_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			cl_flg(value);
			return;
		}
		if ($rel_cl_flg.equalsIgnoreCase(name)) {
			rel_cl_flg(value);
			return;
		}
		if ($pre_cl_flg.equalsIgnoreCase(name)) {
			pre_cl_flg(value);
			return;
		}
		if ($rel_pre_cl_flg.equalsIgnoreCase(name)) {
			rel_pre_cl_flg(value);
			return;
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			stk_cl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($sls_cl_ym.equalsIgnoreCase(name)) {
			sls_cl_ym(value);
			return;
		}
		if ($rcv_cl_ym.equalsIgnoreCase(name)) {
			rcv_cl_ym(value);
			return;
		}
		if ($purc_cl_ym.equalsIgnoreCase(name)) {
			purc_cl_ym(value);
			return;
		}
		if ($pay_cl_ym.equalsIgnoreCase(name)) {
			pay_cl_ym(value);
			return;
		}
		if ($stk_cl_ym.equalsIgnoreCase(name)) {
			stk_cl_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			cl_flg(value);
			return;
		}
		if ($rel_cl_flg.equalsIgnoreCase(name)) {
			rel_cl_flg(value);
			return;
		}
		if ($pre_cl_flg.equalsIgnoreCase(name)) {
			pre_cl_flg(value);
			return;
		}
		if ($rel_pre_cl_flg.equalsIgnoreCase(name)) {
			rel_pre_cl_flg(value);
			return;
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			stk_cl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

