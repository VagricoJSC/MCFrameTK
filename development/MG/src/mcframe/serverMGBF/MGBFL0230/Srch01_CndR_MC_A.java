package mcframe.serverMGBF.MGBFL0230;

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
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public static final String $rpt_ptn_cd = "rpt_ptn_cd";
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public static final String $rpt_ptn_nm = "rpt_ptn_nm";
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public static final String $rpt_key_cd = "rpt_key_cd";
	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public static final String $rpt_key_nm = "rpt_key_nm";
	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public static final String $rpt_key_typ = "rpt_key_typ";
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
	/**
	 * Not created 未作成.<p>
	 *
	 */
	public static final String $unmake_flg = "unmake_flg";
	/**
	 * Created 作成済.<p>
	 *
	 */
	public static final String $made_flg = "made_flg";


	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta rpt_ptn_cd_META = createCommonMeta($rpt_ptn_cd, mcframe.commonMA.meta.MA_META.RPT_PTN_CD);
	public static final MCMeta rpt_ptn_nm_META = createCommonMeta($rpt_ptn_nm, mcframe.commonMA.meta.MA_META.RPT_PTN_NM);
	public static final MCMeta rpt_key_cd_META = createCommonMeta($rpt_key_cd, mcframe.commonMA.meta.MA_META.RPT_KEY_CD);
	public static final MCMeta rpt_key_nm_META = createCommonMeta($rpt_key_nm, mcframe.commonMA.meta.MA_META.RPT_KEY_NM);
	public static final MCMeta rpt_key_typ_META = createCommonMeta($rpt_key_typ, mcframe.commonMA.meta.MA_META.RPT_KEY_TYP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta unmake_flg_META = createCommonMeta($unmake_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta made_flg_META = createCommonMeta($made_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_no_META,
			rpt_ptn_cd_META,
			rpt_ptn_nm_META,
			rpt_key_cd_META,
			rpt_key_nm_META,
			rpt_key_typ_META,
			memo1_META,
			memo2_META,
			memo3_META,
			unmake_flg_META,
			made_flg_META
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
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 1, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 1, $calc_no, value);
	}


	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public String rpt_ptn_cd() {
		return getConstString(offset + 2, $rpt_ptn_cd);
	}

	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public void rpt_ptn_cd(String value) {
		setConstString(offset + 2, $rpt_ptn_cd, value);
	}


	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public String rpt_ptn_nm() {
		return getConstString(offset + 3, $rpt_ptn_nm);
	}

	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public void rpt_ptn_nm(String value) {
		setConstString(offset + 3, $rpt_ptn_nm, value);
	}


	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public String rpt_key_cd() {
		return getConstString(offset + 4, $rpt_key_cd);
	}

	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public void rpt_key_cd(String value) {
		setConstString(offset + 4, $rpt_key_cd, value);
	}


	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public String rpt_key_nm() {
		return getConstString(offset + 5, $rpt_key_nm);
	}

	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public void rpt_key_nm(String value) {
		setConstString(offset + 5, $rpt_key_nm, value);
	}


	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public String rpt_key_typ() {
		return getConstString(offset + 6, $rpt_key_typ);
	}

	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public void rpt_key_typ(String value) {
		setConstString(offset + 6, $rpt_key_typ, value);
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


	/**
	 * Not created 未作成.<p>
	 *
	 */
	public boolean unmake_flg() {
		return getConstBoolean(offset + 10, $unmake_flg);
	}

	/**
	 * Not created 未作成.<p>
	 *
	 */
	public void unmake_flg(boolean value) {
		setConstBoolean(offset + 10, $unmake_flg, value);
	}


	/**
	 * Created 作成済.<p>
	 *
	 */
	public boolean made_flg() {
		return getConstBoolean(offset + 11, $made_flg);
	}

	/**
	 * Created 作成済.<p>
	 *
	 */
	public void made_flg(boolean value) {
		setConstBoolean(offset + 11, $made_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			return rpt_key_cd();
		}
		if ($rpt_key_nm.equalsIgnoreCase(name)) {
			return rpt_key_nm();
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			return rpt_key_typ();
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
		if ($unmake_flg.equalsIgnoreCase(name)) {
			return unmake_flg();
		}
		if ($made_flg.equalsIgnoreCase(name)) {
			return made_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			return rpt_key_cd();
		}
		if ($rpt_key_nm.equalsIgnoreCase(name)) {
			return rpt_key_nm();
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			return rpt_key_typ();
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
		if ($unmake_flg.equalsIgnoreCase(name)) {
			return unmake_flg();
		}
		if ($made_flg.equalsIgnoreCase(name)) {
			return made_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			rpt_key_cd(value);
			return;
		}
		if ($rpt_key_nm.equalsIgnoreCase(name)) {
			rpt_key_nm(value);
			return;
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			rpt_key_typ(value);
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
		if ($unmake_flg.equalsIgnoreCase(name)) {
			unmake_flg(value);
			return;
		}
		if ($made_flg.equalsIgnoreCase(name)) {
			made_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			rpt_key_cd(value);
			return;
		}
		if ($rpt_key_nm.equalsIgnoreCase(name)) {
			rpt_key_nm(value);
			return;
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			rpt_key_typ(value);
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
		if ($unmake_flg.equalsIgnoreCase(name)) {
			unmake_flg(value);
			return;
		}
		if ($made_flg.equalsIgnoreCase(name)) {
			made_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

