package mcframe.serverMSBF.MSBFL5330;

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
 * ブロック"InspRpt_Prnt03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspRpt_Prnt03_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Factory release approval No. 工場出荷承認ＮＯ.<p>
	 *
	 */
	public static final String $plnt_aprv_no = "plnt_aprv_no";
	/**
	 * Record sheet of factory release issued flg. 工場出荷記録書発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $plnt_aprv_prnt_flg = "plnt_aprv_prnt_flg";
	/**
	 * Record sheet of factory release issue date and time 工場出荷記録書発行日時.<p>
	 *
	 */
	public static final String $plnt_aprv_prnt_tm = "plnt_aprv_prnt_tm";
	/**
	 * Record sheet of factory release sequence number 工場出荷記録書連番.<p>
	 *
	 */
	public static final String $seq = "seq";
	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_no_META = createCommonMeta($plnt_aprv_no, mcframe.commonMA.meta.MA_META.PLNT_APRV_NO);
	public static final MCMeta plnt_aprv_prnt_flg_META = createCommonMeta($plnt_aprv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_prnt_tm_META = createCommonMeta($plnt_aprv_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);

	protected static final ConstMetaList<InspRpt_Prnt03_DtlR> constMetas = new ConstMetaList<InspRpt_Prnt03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			plnt_aprv_no_META,
			plnt_aprv_prnt_flg_META,
			plnt_aprv_prnt_tm_META,
			seq_META,
			aprv_usr_cd_META,
			aprv_dpt_cd_META,
			site_cd_META
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
	protected InspRpt_Prnt03_DtlR_MC_A(ConstMetaList<? extends InspRpt_Prnt03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRpt_Prnt03_DtlR clone() {
		return (InspRpt_Prnt03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRpt_Prnt03_DtlR createInstance() {
		return (InspRpt_Prnt03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRpt_Prnt03_DtlR getValues(String... names) {
		return (InspRpt_Prnt03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Factory release approval No. 工場出荷承認ＮＯ.<p>
	 *
	 */
	public String plnt_aprv_no() {
		return getConstString(offset + 2, $plnt_aprv_no);
	}

	/**
	 * Factory release approval No. 工場出荷承認ＮＯ.<p>
	 *
	 */
	public void plnt_aprv_no(String value) {
		setConstString(offset + 2, $plnt_aprv_no, value);
	}


	/**
	 * Record sheet of factory release issued flg. 工場出荷記録書発行済ＦＬＧ.<p>
	 *
	 */
	public boolean plnt_aprv_prnt_flg() {
		return getConstBoolean(offset + 3, $plnt_aprv_prnt_flg);
	}

	/**
	 * Record sheet of factory release issued flg. 工場出荷記録書発行済ＦＬＧ.<p>
	 *
	 */
	public void plnt_aprv_prnt_flg(boolean value) {
		setConstBoolean(offset + 3, $plnt_aprv_prnt_flg, value);
	}


	/**
	 * Record sheet of factory release issue date and time 工場出荷記録書発行日時.<p>
	 *
	 */
	public MCDate plnt_aprv_prnt_tm() {
		return getConstDate(offset + 4, $plnt_aprv_prnt_tm);
	}

	/**
	 * Record sheet of factory release issue date and time 工場出荷記録書発行日時.<p>
	 *
	 */
	public void plnt_aprv_prnt_tm(MCDate value) {
		setConstDate(offset + 4, $plnt_aprv_prnt_tm, value);
	}


	/**
	 * Record sheet of factory release sequence number 工場出荷記録書連番.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 5, $seq);
	}

	/**
	 * Record sheet of factory release sequence number 工場出荷記録書連番.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 5, $seq, value);
	}

	/**
	 * Record sheet of factory release sequence number 工場出荷記録書連番.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 5, $seq, value);
	}

	/**
	 * Record sheet of factory release sequence number 工場出荷記録書連番.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 5, $seq, value);
	}

	/**
	 * Record sheet of factory release sequence number 工場出荷記録書連番.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 5, $seq, value);
	}

	/**
	 * Record sheet of factory release sequence number 工場出荷記録書連番.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 5, $seq, value);
	}


	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 6, $aprv_usr_cd);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 6, $aprv_usr_cd, value);
	}


	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 7, $aprv_dpt_cd);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 7, $aprv_dpt_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 8, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 8, $site_cd, value);
	}


	public String getString(String name) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			return plnt_aprv_no();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($plnt_aprv_prnt_tm.equalsIgnoreCase(name)) {
			return plnt_aprv_prnt_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($plnt_aprv_prnt_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			return plnt_aprv_no();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($plnt_aprv_prnt_tm.equalsIgnoreCase(name)) {
			return plnt_aprv_prnt_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($plnt_aprv_prnt_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			plnt_aprv_no(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($plnt_aprv_prnt_tm.equalsIgnoreCase(name)) {
			plnt_aprv_prnt_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($plnt_aprv_prnt_flg.equalsIgnoreCase(name)) {
			plnt_aprv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			plnt_aprv_no(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($plnt_aprv_prnt_tm.equalsIgnoreCase(name)) {
			plnt_aprv_prnt_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($plnt_aprv_prnt_flg.equalsIgnoreCase(name)) {
			plnt_aprv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

