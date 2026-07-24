package mcframe.clientMABS.MABSP0250;

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
 * ブロック"Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl2R_MC_A extends MCConstRow {

	/**
	 * Application date 申請日.<p>
	 *
	 */
	public static final String $apl_dt = "apl_dt";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public static final String $apl_no = "apl_no";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Application memo 申請メモ.<p>
	 *
	 */
	public static final String $mst_apl_memo = "mst_apl_memo";

	public static final String $apl_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $apl_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $apl_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $apl_dpt_nm = $usr_dpt_p + ".dpt_nm";

	public static final MCMeta apl_dt_META = createCommonMeta($apl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta apl_no_META = createCommonMeta($apl_no, mcframe.commonMA.meta.MA_META.APL_NO);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta mst_apl_memo_META = createCommonMeta($mst_apl_memo, mcframe.commonMA.meta.MA_META.MST_APL_MEMO);

	protected static final ConstMetaList<Dtl2R> constMetas = new ConstMetaList<Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			apl_dt_META,
			usr_dpt_p_META,
			apl_no_META,
			aprv_no_META,
			mst_apl_memo_META
		},
		new String[][]{
			{
				"apl_usr_cd",
				"apl_usr_nm",
				"apl_dpt_cd",
				"apl_dpt_nm"
			},
			{
				$apl_usr_cd,
				$apl_usr_nm,
				$apl_dpt_cd,
				$apl_dpt_nm
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "apl_dt;apl_usr_cd;MAC_DPT_IS_SRCH_TYP.COMM"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected Dtl2R_MC_A(ConstMetaList<? extends Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R clone() {
		return (Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R createInstance() {
		return (Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R getValues(String... names) {
		return (Dtl2R) super.getValues(names);
	}



	/**
	 * Application date 申請日.<p>
	 *
	 */
	public MCDate apl_dt() {
		return getConstDate(offset + 0, $apl_dt);
	}

	/**
	 * Application date 申請日.<p>
	 *
	 */
	public void apl_dt(MCDate value) {
		setConstDate(offset + 0, $apl_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 1, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 1, $usr_dpt_p, row);
	}


	/**
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public String apl_no() {
		return getConstString(offset + 2, $apl_no);
	}

	/**
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public void apl_no(String value) {
		setConstString(offset + 2, $apl_no, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 3, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 3, $aprv_no, value);
	}


	/**
	 * Application memo 申請メモ.<p>
	 *
	 */
	public String mst_apl_memo() {
		return getConstString(offset + 4, $mst_apl_memo);
	}

	/**
	 * Application memo 申請メモ.<p>
	 *
	 */
	public void mst_apl_memo(String value) {
		setConstString(offset + 4, $mst_apl_memo, value);
	}


	public String getString(String name) {
		if ($apl_no.equalsIgnoreCase(name)) {
			return apl_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($mst_apl_memo.equalsIgnoreCase(name)) {
			return mst_apl_memo();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($apl_dt.equalsIgnoreCase(name)) {
			return apl_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($apl_no.equalsIgnoreCase(name)) {
			return apl_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($mst_apl_memo.equalsIgnoreCase(name)) {
			return mst_apl_memo();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($apl_dt.equalsIgnoreCase(name)) {
			return apl_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($apl_no.equalsIgnoreCase(name)) {
			apl_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($mst_apl_memo.equalsIgnoreCase(name)) {
			mst_apl_memo(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($apl_dt.equalsIgnoreCase(name)) {
			apl_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($apl_no.equalsIgnoreCase(name)) {
			apl_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($mst_apl_memo.equalsIgnoreCase(name)) {
			mst_apl_memo(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($apl_dt.equalsIgnoreCase(name)) {
			apl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String apl_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void apl_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String apl_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void apl_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String apl_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void apl_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String apl_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void apl_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

}

