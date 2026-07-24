package mcframe.clientMABC.MABCP0300;

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
 * ブロック"Row"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RowR_MC_A extends MCConstRow {

	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public static final String $lcl_cd = "lcl_cd";
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public static final String $lcl_nm = "lcl_nm";
	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public static final String $hs_grp_cd = "hs_grp_cd";
	/**
	 * HS classification name ＨＳ分類名.<p>
	 *
	 */
	public static final String $hs_grp_nm = "hs_grp_nm";
	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public static final String $hs_cd = "hs_cd";
	/**
	 * HS content ＨＳ内容.<p>
	 *
	 */
	public static final String $hs_nm = "hs_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";


	public static final MCMeta lcl_cd_META = createCommonMeta($lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta lcl_nm_META = createCommonMeta($lcl_nm, mcframe.commonMA.meta.MA_META.LCL_NM);
	public static final MCMeta hs_grp_cd_META = createCommonMeta($hs_grp_cd, mcframe.commonMA.meta.MA_META.HS_GRP_CD);
	public static final MCMeta hs_grp_nm_META = createCommonMeta($hs_grp_nm, mcframe.commonMA.meta.MA_META.HS_GRP_NM);
	public static final MCMeta hs_cd_META = createCommonMeta($hs_cd, mcframe.commonMA.meta.MA_META.HS_CD);
	public static final MCMeta hs_nm_META = createCommonMeta($hs_nm, mcframe.commonMA.meta.MA_META.HS_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final ConstMetaList<RowR> constMetas = new ConstMetaList<RowR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lcl_cd_META,
			lcl_nm_META,
			hs_grp_cd_META,
			hs_grp_nm_META,
			hs_cd_META,
			hs_nm_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	protected RowR_MC_A(ConstMetaList<? extends RowR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR clone() {
		return (RowR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR createInstance() {
		return (RowR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR getValues(String... names) {
		return (RowR) super.getValues(names);
	}



	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public String lcl_cd() {
		return getConstString(offset + 0, $lcl_cd);
	}

	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public void lcl_cd(String value) {
		setConstString(offset + 0, $lcl_cd, value);
	}


	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public String lcl_nm() {
		return getConstString(offset + 1, $lcl_nm);
	}

	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public void lcl_nm(String value) {
		setConstString(offset + 1, $lcl_nm, value);
	}


	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public String hs_grp_cd() {
		return getConstString(offset + 2, $hs_grp_cd);
	}

	/**
	 * HS classification cd. ＨＳ分類ＣＤ.<p>
	 *
	 */
	public void hs_grp_cd(String value) {
		setConstString(offset + 2, $hs_grp_cd, value);
	}


	/**
	 * HS classification name ＨＳ分類名.<p>
	 *
	 */
	public String hs_grp_nm() {
		return getConstString(offset + 3, $hs_grp_nm);
	}

	/**
	 * HS classification name ＨＳ分類名.<p>
	 *
	 */
	public void hs_grp_nm(String value) {
		setConstString(offset + 3, $hs_grp_nm, value);
	}


	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public String hs_cd() {
		return getConstString(offset + 4, $hs_cd);
	}

	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public void hs_cd(String value) {
		setConstString(offset + 4, $hs_cd, value);
	}


	/**
	 * HS content ＨＳ内容.<p>
	 *
	 */
	public String hs_nm() {
		return getConstString(offset + 5, $hs_nm);
	}

	/**
	 * HS content ＨＳ内容.<p>
	 *
	 */
	public void hs_nm(String value) {
		setConstString(offset + 5, $hs_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 6, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 6, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 7, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 7, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 8, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 8, $memo3, value);
	}


	public String getString(String name) {
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			return lcl_nm();
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			return hs_grp_cd();
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			return hs_grp_nm();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($hs_nm.equalsIgnoreCase(name)) {
			return hs_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			return lcl_nm();
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			return hs_grp_cd();
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			return hs_grp_nm();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($hs_nm.equalsIgnoreCase(name)) {
			return hs_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			lcl_nm(value);
			return;
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			hs_grp_cd(value);
			return;
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			hs_grp_nm(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($hs_nm.equalsIgnoreCase(name)) {
			hs_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			lcl_nm(value);
			return;
		}
		if ($hs_grp_cd.equalsIgnoreCase(name)) {
			hs_grp_cd(value);
			return;
		}
		if ($hs_grp_nm.equalsIgnoreCase(name)) {
			hs_grp_nm(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($hs_nm.equalsIgnoreCase(name)) {
			hs_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

