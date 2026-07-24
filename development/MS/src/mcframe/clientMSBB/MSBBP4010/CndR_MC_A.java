package mcframe.clientMSBB.MSBBP4010;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Create/Modify,0;DEL,Delete,1 UPD,登録・訂正する,0;DEL,削除する,1.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Sales project management type 案件管理区分.<p>
	 *
	 */
	public static final String $wrk_mng_typ = "wrk_mng_typ";
	/**
	 * Sales project management type name 案件管理区分名.<p>
	 *
	 */
	public static final String $wrk_mng_typ_nm = "wrk_mng_typ_nm";
	/**
	 * Sales project management cd. 案件管理ＣＤ.<p>
	 *
	 */
	public static final String $wrk_mng_cd = "wrk_mng_cd";
	/**
	 * Sales project management name 案件管理名.<p>
	 *
	 */
	public static final String $wrk_mng_nm = "wrk_mng_nm";
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";
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


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta wrk_mng_typ_META = createCommonMeta($wrk_mng_typ, mcframe.commonMS.meta.MS_META.WRK_MNG_TYP);
	public static final MCMeta wrk_mng_typ_nm_META = createCommonMeta($wrk_mng_typ_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_TYP_NM);
	public static final MCMeta wrk_mng_cd_META = createCommonMeta($wrk_mng_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta wrk_mng_nm_META = createCommonMeta($wrk_mng_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			wrk_mng_typ_META,
			wrk_mng_typ_nm_META,
			wrk_mng_cd_META,
			wrk_mng_nm_META,
			off_del_flg_META,
			on_del_flg_META,
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wrk_mng_cd, "wrk_mng_typ"}	// wrk_mng_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wrk_mng_cd, "wrk_mng_typ"}	// wrk_mng_cd
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * UPD,Create/Modify,0;DEL,Delete,1 UPD,登録・訂正する,0;DEL,削除する,1.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete,1 UPD,登録・訂正する,0;DEL,削除する,1.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Sales project management type 案件管理区分.<p>
	 *
	 */
	public String wrk_mng_typ() {
		return getConstString(offset + 1, $wrk_mng_typ);
	}

	/**
	 * Sales project management type 案件管理区分.<p>
	 *
	 */
	public void wrk_mng_typ(String value) {
		setConstString(offset + 1, $wrk_mng_typ, value);
	}


	/**
	 * Sales project management type name 案件管理区分名.<p>
	 *
	 */
	public String wrk_mng_typ_nm() {
		return getConstString(offset + 2, $wrk_mng_typ_nm);
	}

	/**
	 * Sales project management type name 案件管理区分名.<p>
	 *
	 */
	public void wrk_mng_typ_nm(String value) {
		setConstString(offset + 2, $wrk_mng_typ_nm, value);
	}


	/**
	 * Sales project management cd. 案件管理ＣＤ.<p>
	 *
	 */
	public String wrk_mng_cd() {
		return getConstString(offset + 3, $wrk_mng_cd);
	}

	/**
	 * Sales project management cd. 案件管理ＣＤ.<p>
	 *
	 */
	public void wrk_mng_cd(String value) {
		setConstString(offset + 3, $wrk_mng_cd, value);
	}


	/**
	 * Sales project management name 案件管理名.<p>
	 *
	 */
	public String wrk_mng_nm() {
		return getConstString(offset + 4, $wrk_mng_nm);
	}

	/**
	 * Sales project management name 案件管理名.<p>
	 *
	 */
	public void wrk_mng_nm(String value) {
		setConstString(offset + 4, $wrk_mng_nm, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 5, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 5, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 6, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 6, $on_del_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 7, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 7, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 8, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 8, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 9, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 9, $memo3, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			return wrk_mng_typ();
		}
		if ($wrk_mng_typ_nm.equalsIgnoreCase(name)) {
			return wrk_mng_typ_nm();
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			return wrk_mng_cd();
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			return wrk_mng_nm();
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
	public boolean getBoolean(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			return wrk_mng_typ();
		}
		if ($wrk_mng_typ_nm.equalsIgnoreCase(name)) {
			return wrk_mng_typ_nm();
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			return wrk_mng_cd();
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			return wrk_mng_nm();
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
	public boolean getBooleanNE(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			wrk_mng_typ(value);
			return;
		}
		if ($wrk_mng_typ_nm.equalsIgnoreCase(name)) {
			wrk_mng_typ_nm(value);
			return;
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			wrk_mng_cd(value);
			return;
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			wrk_mng_nm(value);
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
	public void setBoolean(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			wrk_mng_typ(value);
			return;
		}
		if ($wrk_mng_typ_nm.equalsIgnoreCase(name)) {
			wrk_mng_typ_nm(value);
			return;
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			wrk_mng_cd(value);
			return;
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			wrk_mng_nm(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

