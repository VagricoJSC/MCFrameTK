package mcframe.serverMSBG.MSBGL5030;

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
 * ブロック"BillCl_Upd03_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BillCl_Upd03_CndR_MC_A extends MCConstRow {

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public static final String $bill_cl_dt = "bill_cl_dt";
	/**
	 * Date 対象日.<p>
	 *
	 */
	public static final String $tgt_dt = "tgt_dt";


	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tgt_dt_META = createCommonMeta($tgt_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<BillCl_Upd03_CndR> constMetas = new ConstMetaList<BillCl_Upd03_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bcst_cd_META,
			bill_cl_dt_META,
			tgt_dt_META
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
	protected BillCl_Upd03_CndR_MC_A(ConstMetaList<? extends BillCl_Upd03_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillCl_Upd03_CndR clone() {
		return (BillCl_Upd03_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillCl_Upd03_CndR createInstance() {
		return (BillCl_Upd03_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillCl_Upd03_CndR getValues(String... names) {
		return (BillCl_Upd03_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 0, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 0, $bcst_cd, value);
	}


	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 1, $bill_cl_dt);
	}

	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 1, $bill_cl_dt, value);
	}


	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDate tgt_dt() {
		return getConstDate(offset + 2, $tgt_dt);
	}

	/**
	 * Date 対象日.<p>
	 *
	 */
	public void tgt_dt(MCDate value) {
		setConstDate(offset + 2, $tgt_dt, value);
	}


	public String getString(String name) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($tgt_dt.equalsIgnoreCase(name)) {
			tgt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($tgt_dt.equalsIgnoreCase(name)) {
			tgt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

