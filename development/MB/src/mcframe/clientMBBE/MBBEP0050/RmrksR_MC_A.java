package mcframe.clientMBBE.MBBEP0050;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rmrks"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RmrksR_MC_A extends MCConstRow {

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public static final String $biz_dat_rmrks1 = "biz_dat_rmrks1";
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public static final String $biz_dat_rmrks2 = "biz_dat_rmrks2";
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public static final String $biz_dat_rmrks3 = "biz_dat_rmrks3";


	public static final MCMeta biz_dat_rmrks1_META = createCommonMeta($biz_dat_rmrks1, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks2_META = createCommonMeta($biz_dat_rmrks2, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks3_META = createCommonMeta($biz_dat_rmrks3, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);

	protected static final ConstMetaList<RmrksR> constMetas = new ConstMetaList<RmrksR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_dat_rmrks1_META,
			biz_dat_rmrks2_META,
			biz_dat_rmrks3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected RmrksR_MC_A(ConstMetaList<? extends RmrksR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RmrksR clone() {
		return (RmrksR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RmrksR createInstance() {
		return (RmrksR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RmrksR getValues(String... names) {
		return (RmrksR) super.getValues(names);
	}



	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String biz_dat_rmrks1() {
		return getConstString(offset + 0, $biz_dat_rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void biz_dat_rmrks1(String value) {
		setConstString(offset + 0, $biz_dat_rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String biz_dat_rmrks2() {
		return getConstString(offset + 1, $biz_dat_rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void biz_dat_rmrks2(String value) {
		setConstString(offset + 1, $biz_dat_rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String biz_dat_rmrks3() {
		return getConstString(offset + 2, $biz_dat_rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void biz_dat_rmrks3(String value) {
		setConstString(offset + 2, $biz_dat_rmrks3, value);
	}


	public String getString(String name) {
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

