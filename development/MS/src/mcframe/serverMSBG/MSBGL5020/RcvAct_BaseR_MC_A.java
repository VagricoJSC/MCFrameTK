package mcframe.serverMSBG.MSBGL5020;

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
 * ブロック"RcvAct_Base"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvAct_BaseR_MC_A extends MCConstRow {

	/**
	 * Old payment received result sequence number 旧入金実績連番.<p>
	 *
	 */
	public static final String $old_rcv_act_seq = "old_rcv_act_seq";
	/**
	 * Old payment received result rev. number 旧入金実績改訂番号.<p>
	 *
	 */
	public static final String $old_rcv_act_rev = "old_rcv_act_rev";
	/**
	 * Old transaction cd. 旧取引ＣＤ.<p>
	 *
	 */
	public static final String $old_trd_cd = "old_trd_cd";
	/**
	 * Cancellation payment received result sequence number 取消入金実績連番.<p>
	 *
	 */
	public static final String $can_rcv_act_seq = "can_rcv_act_seq";
	/**
	 * Cancellation payment received result revision No. 取消入金実績改訂番号.<p>
	 *
	 */
	public static final String $can_rcv_act_rev = "can_rcv_act_rev";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Cancellation recording month 取消計上年月.<p>
	 *
	 */
	public static final String $can_ac_ym = "can_ac_ym";
	/**
	 * Cancelling transaction cd. 取消取引ＣＤ.<p>
	 *
	 */
	public static final String $can_trd_cd = "can_trd_cd";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";


	public static final MCMeta old_rcv_act_seq_META = createCommonMeta($old_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta old_rcv_act_rev_META = createCommonMeta($old_rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta old_trd_cd_META = createCommonMeta($old_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta can_rcv_act_seq_META = createCommonMeta($can_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta can_rcv_act_rev_META = createCommonMeta($can_rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_ym_META = createCommonMeta($can_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta can_trd_cd_META = createCommonMeta($can_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);

	protected static final ConstMetaList<RcvAct_BaseR> constMetas = new ConstMetaList<RcvAct_BaseR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			old_rcv_act_seq_META,
			old_rcv_act_rev_META,
			old_trd_cd_META,
			can_rcv_act_seq_META,
			can_rcv_act_rev_META,
			can_ac_dt_META,
			can_ac_ym_META,
			can_trd_cd_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			rcv_act_rev_META,
			trd_cd_META,
			ac_ym_META
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
	protected RcvAct_BaseR_MC_A(ConstMetaList<? extends RcvAct_BaseR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAct_BaseR clone() {
		return (RcvAct_BaseR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAct_BaseR createInstance() {
		return (RcvAct_BaseR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvAct_BaseR getValues(String... names) {
		return (RcvAct_BaseR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Old payment received result sequence number 旧入金実績連番.<p>
	 *
	 */
	public MCNumber old_rcv_act_seq() {
		return getConstNumber(offset + 0, $old_rcv_act_seq);
	}

	/**
	 * Old payment received result sequence number 旧入金実績連番.<p>
	 *
	 */
	public void old_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 0, $old_rcv_act_seq, value);
	}

	/**
	 * Old payment received result sequence number 旧入金実績連番.<p>
	 *
	 */
	public void old_rcv_act_seq(int value) {
		setConstNumber(offset + 0, $old_rcv_act_seq, value);
	}

	/**
	 * Old payment received result sequence number 旧入金実績連番.<p>
	 *
	 */
	public void old_rcv_act_seq(long value) {
		setConstNumber(offset + 0, $old_rcv_act_seq, value);
	}

	/**
	 * Old payment received result sequence number 旧入金実績連番.<p>
	 *
	 */
	public void old_rcv_act_seq(float value) {
		setConstNumber(offset + 0, $old_rcv_act_seq, value);
	}

	/**
	 * Old payment received result sequence number 旧入金実績連番.<p>
	 *
	 */
	public void old_rcv_act_seq(double value) {
		setConstNumber(offset + 0, $old_rcv_act_seq, value);
	}


	/**
	 * Old payment received result rev. number 旧入金実績改訂番号.<p>
	 *
	 */
	public MCNumber old_rcv_act_rev() {
		return getConstNumber(offset + 1, $old_rcv_act_rev);
	}

	/**
	 * Old payment received result rev. number 旧入金実績改訂番号.<p>
	 *
	 */
	public void old_rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 1, $old_rcv_act_rev, value);
	}

	/**
	 * Old payment received result rev. number 旧入金実績改訂番号.<p>
	 *
	 */
	public void old_rcv_act_rev(int value) {
		setConstNumber(offset + 1, $old_rcv_act_rev, value);
	}

	/**
	 * Old payment received result rev. number 旧入金実績改訂番号.<p>
	 *
	 */
	public void old_rcv_act_rev(long value) {
		setConstNumber(offset + 1, $old_rcv_act_rev, value);
	}

	/**
	 * Old payment received result rev. number 旧入金実績改訂番号.<p>
	 *
	 */
	public void old_rcv_act_rev(float value) {
		setConstNumber(offset + 1, $old_rcv_act_rev, value);
	}

	/**
	 * Old payment received result rev. number 旧入金実績改訂番号.<p>
	 *
	 */
	public void old_rcv_act_rev(double value) {
		setConstNumber(offset + 1, $old_rcv_act_rev, value);
	}


	/**
	 * Old transaction cd. 旧取引ＣＤ.<p>
	 *
	 */
	public String old_trd_cd() {
		return getConstString(offset + 2, $old_trd_cd);
	}

	/**
	 * Old transaction cd. 旧取引ＣＤ.<p>
	 *
	 */
	public void old_trd_cd(String value) {
		setConstString(offset + 2, $old_trd_cd, value);
	}


	/**
	 * Cancellation payment received result sequence number 取消入金実績連番.<p>
	 *
	 */
	public MCNumber can_rcv_act_seq() {
		return getConstNumber(offset + 3, $can_rcv_act_seq);
	}

	/**
	 * Cancellation payment received result sequence number 取消入金実績連番.<p>
	 *
	 */
	public void can_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 3, $can_rcv_act_seq, value);
	}

	/**
	 * Cancellation payment received result sequence number 取消入金実績連番.<p>
	 *
	 */
	public void can_rcv_act_seq(int value) {
		setConstNumber(offset + 3, $can_rcv_act_seq, value);
	}

	/**
	 * Cancellation payment received result sequence number 取消入金実績連番.<p>
	 *
	 */
	public void can_rcv_act_seq(long value) {
		setConstNumber(offset + 3, $can_rcv_act_seq, value);
	}

	/**
	 * Cancellation payment received result sequence number 取消入金実績連番.<p>
	 *
	 */
	public void can_rcv_act_seq(float value) {
		setConstNumber(offset + 3, $can_rcv_act_seq, value);
	}

	/**
	 * Cancellation payment received result sequence number 取消入金実績連番.<p>
	 *
	 */
	public void can_rcv_act_seq(double value) {
		setConstNumber(offset + 3, $can_rcv_act_seq, value);
	}


	/**
	 * Cancellation payment received result revision No. 取消入金実績改訂番号.<p>
	 *
	 */
	public MCNumber can_rcv_act_rev() {
		return getConstNumber(offset + 4, $can_rcv_act_rev);
	}

	/**
	 * Cancellation payment received result revision No. 取消入金実績改訂番号.<p>
	 *
	 */
	public void can_rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 4, $can_rcv_act_rev, value);
	}

	/**
	 * Cancellation payment received result revision No. 取消入金実績改訂番号.<p>
	 *
	 */
	public void can_rcv_act_rev(int value) {
		setConstNumber(offset + 4, $can_rcv_act_rev, value);
	}

	/**
	 * Cancellation payment received result revision No. 取消入金実績改訂番号.<p>
	 *
	 */
	public void can_rcv_act_rev(long value) {
		setConstNumber(offset + 4, $can_rcv_act_rev, value);
	}

	/**
	 * Cancellation payment received result revision No. 取消入金実績改訂番号.<p>
	 *
	 */
	public void can_rcv_act_rev(float value) {
		setConstNumber(offset + 4, $can_rcv_act_rev, value);
	}

	/**
	 * Cancellation payment received result revision No. 取消入金実績改訂番号.<p>
	 *
	 */
	public void can_rcv_act_rev(double value) {
		setConstNumber(offset + 4, $can_rcv_act_rev, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 5, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 5, $can_ac_dt, value);
	}


	/**
	 * Cancellation recording month 取消計上年月.<p>
	 *
	 */
	public MCDate can_ac_ym() {
		return getConstDate(offset + 6, $can_ac_ym);
	}

	/**
	 * Cancellation recording month 取消計上年月.<p>
	 *
	 */
	public void can_ac_ym(MCDate value) {
		setConstDate(offset + 6, $can_ac_ym, value);
	}


	/**
	 * Cancelling transaction cd. 取消取引ＣＤ.<p>
	 *
	 */
	public String can_trd_cd() {
		return getConstString(offset + 7, $can_trd_cd);
	}

	/**
	 * Cancelling transaction cd. 取消取引ＣＤ.<p>
	 *
	 */
	public void can_trd_cd(String value) {
		setConstString(offset + 7, $can_trd_cd, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 8, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 8, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 9, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 9, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 9, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 9, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 9, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 9, $rcv_act_seq, value);
	}


	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 10, $rcv_act_rev);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 10, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 10, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 10, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 10, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 10, $rcv_act_rev, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 11, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 11, $trd_cd, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 12, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 12, $ac_ym, value);
	}


	public String getString(String name) {
		if ($old_trd_cd.equalsIgnoreCase(name)) {
			return old_trd_cd();
		}
		if ($can_trd_cd.equalsIgnoreCase(name)) {
			return can_trd_cd();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			return old_rcv_act_seq();
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			return old_rcv_act_rev();
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			return can_rcv_act_seq();
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			return can_rcv_act_rev();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($can_ac_ym.equalsIgnoreCase(name)) {
			return can_ac_ym();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($old_trd_cd.equalsIgnoreCase(name)) {
			return old_trd_cd();
		}
		if ($can_trd_cd.equalsIgnoreCase(name)) {
			return can_trd_cd();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			return old_rcv_act_seq();
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			return old_rcv_act_rev();
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			return can_rcv_act_seq();
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			return can_rcv_act_rev();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($can_ac_ym.equalsIgnoreCase(name)) {
			return can_ac_ym();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($old_trd_cd.equalsIgnoreCase(name)) {
			old_trd_cd(value);
			return;
		}
		if ($can_trd_cd.equalsIgnoreCase(name)) {
			can_trd_cd(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($can_ac_ym.equalsIgnoreCase(name)) {
			can_ac_ym(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($old_trd_cd.equalsIgnoreCase(name)) {
			old_trd_cd(value);
			return;
		}
		if ($can_trd_cd.equalsIgnoreCase(name)) {
			can_trd_cd(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($old_rcv_act_seq.equalsIgnoreCase(name)) {
			old_rcv_act_seq(value);
			return;
		}
		if ($old_rcv_act_rev.equalsIgnoreCase(name)) {
			old_rcv_act_rev(value);
			return;
		}
		if ($can_rcv_act_seq.equalsIgnoreCase(name)) {
			can_rcv_act_seq(value);
			return;
		}
		if ($can_rcv_act_rev.equalsIgnoreCase(name)) {
			can_rcv_act_rev(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($can_ac_ym.equalsIgnoreCase(name)) {
			can_ac_ym(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

