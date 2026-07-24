package mcframe.serverMSBG.MSBGL0200;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBGL_AdvRcvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_AdvRcvReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL0200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_AdvRcvReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBGL0200_Srch01_INFO;
		this.aSrch01 = ((MSBGL_AdvRcvReg)this).new Srch01();
	}

	public static MSBGL_AdvRcvReg.Srch01 crtSrch01() {
		MSBGL_AdvRcvReg lgc = new MSBGL_AdvRcvReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBG.MSBGL0200.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBG.MSBGL0200.Srch01_HdrR.create();
	}

	/**
	 * Srch01_RcvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Srch01_RcvR createSrch01_RcvR(){
		return mcframe.serverMSBG.MSBGL0200.Srch01_RcvR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBG.MSBGL0200.Srch01_DtlR.create();
	}

	/**
	 * Srch01_Hdr_RcvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Srch01_Hdr_RcvR createSrch01_Hdr_RcvR(){
		return mcframe.serverMSBG.MSBGL0200.Srch01_Hdr_RcvR.create();
	}
	protected MSBGL_AdvRcvReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBGL0200_Srch02_INFO;
		this.aSrch02 = ((MSBGL_AdvRcvReg)this).new Srch02();
	}

	public static MSBGL_AdvRcvReg.Srch02 crtSrch02() {
		MSBGL_AdvRcvReg lgc = new MSBGL_AdvRcvReg();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_RcvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Srch02_RcvR createSrch02_RcvR(){
		return mcframe.serverMSBG.MSBGL0200.Srch02_RcvR.create();
	}
	protected MSBGL_AdvRcvReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBGL0200_Chk01_INFO;
		this.aChk01 = ((MSBGL_AdvRcvReg)this).new Chk01();
	}

	public static MSBGL_AdvRcvReg.Chk01 crtChk01() {
		MSBGL_AdvRcvReg lgc = new MSBGL_AdvRcvReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addUpBlock(aChk01.up2());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.HdrR createHdrR(){
		return mcframe.serverMSBG.MSBGL0200.HdrR.create();
	}

	/**
	 * RcvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.RcvR createRcvR(){
		return mcframe.serverMSBG.MSBGL0200.RcvR.create();
	}

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.DtlR createDtlR(){
		return mcframe.serverMSBG.MSBGL0200.DtlR.create();
	}
	protected MSBGL_AdvRcvReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBGL0200_Chk02_INFO;
		this.aChk02 = ((MSBGL_AdvRcvReg)this).new Chk02();
	}

	public static MSBGL_AdvRcvReg.Chk02 crtChk02() {
		MSBGL_AdvRcvReg lgc = new MSBGL_AdvRcvReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addUpBlock(aChk02.up1());
		p.addDownBlock(aChk02.down0());
		p.addDownBlock(aChk02.down1());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBG.MSBGL0200.Chk02_HdrR.create();
	}

	/**
	 * Chk02_RcvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Chk02_RcvR createChk02_RcvR(){
		return mcframe.serverMSBG.MSBGL0200.Chk02_RcvR.create();
	}
	protected MSBGL_AdvRcvReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBGL0200_Ins01_INFO;
		this.aIns01 = ((MSBGL_AdvRcvReg)this).new Ins01();
	}

	public static MSBGL_AdvRcvReg.Ins01 crtIns01() {
		MSBGL_AdvRcvReg lgc = new MSBGL_AdvRcvReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addUpBlock(aIns01.up1());
		p.addUpBlock(aIns01.up2());
		p.addDownBlock(aIns01.down0());
		p.addDownBlock(aIns01.down1());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.HdrR createIns01_HdrR(){
		return mcframe.serverMSBG.MSBGL0200.HdrR.create();
	}

	/**
	 * Ins01_RcvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.RcvR createIns01_RcvR(){
		return mcframe.serverMSBG.MSBGL0200.RcvR.create();
	}

	/**
	 * Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.DtlR createIns01_DtlR(){
		return mcframe.serverMSBG.MSBGL0200.DtlR.create();
	}
	protected MSBGL_AdvRcvReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBGL0200_Upd01_INFO;
		this.aUpd01 = ((MSBGL_AdvRcvReg)this).new Upd01();
	}

	public static MSBGL_AdvRcvReg.Upd01 crtUpd01() {
		MSBGL_AdvRcvReg lgc = new MSBGL_AdvRcvReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.HdrR createUpd01_HdrR(){
		return mcframe.serverMSBG.MSBGL0200.HdrR.create();
	}

	/**
	 * Upd01_RcvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.RcvR createUpd01_RcvR(){
		return mcframe.serverMSBG.MSBGL0200.RcvR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.DtlR createUpd01_DtlR(){
		return mcframe.serverMSBG.MSBGL0200.DtlR.create();
	}
	protected MSBGL_AdvRcvReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBGL0200_Del01_INFO;
		this.aDel01 = ((MSBGL_AdvRcvReg)this).new Del01();
	}

	public static MSBGL_AdvRcvReg.Del01 crtDel01() {
		MSBGL_AdvRcvReg lgc = new MSBGL_AdvRcvReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addUpBlock(aDel01.up1());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Chk02_HdrR createDel01_HdrR(){
		return mcframe.serverMSBG.MSBGL0200.Chk02_HdrR.create();
	}

	/**
	 * Del01_RcvブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0200.Chk02_RcvR createDel01_RcvR(){
		return mcframe.serverMSBG.MSBGL0200.Chk02_RcvR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Srch01_RcvR down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Srch01_DtlR down2;
		/** [Srch01_Hdr_Rcv]ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Srch01_Hdr_RcvR aSrch01_Hdr_Rcv;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0200.Srch01_CndR.create();
			down0 = mcframe.serverMSBG.MSBGL0200.Srch01_HdrR.create();
			down1 = mcframe.serverMSBG.MSBGL0200.Srch01_RcvR.create();
			down2 = mcframe.serverMSBG.MSBGL0200.Srch01_DtlR.create();
			aSrch01_Hdr_Rcv = mcframe.serverMSBG.MSBGL0200.Srch01_Hdr_RcvR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBG.MSBGL0200.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBG.MSBGL0200.Srch01_HdrR.create();
		}

		/**
		 * Srch01_RcvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_RcvR createSrch01_RcvR(){
			return mcframe.serverMSBG.MSBGL0200.Srch01_RcvR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBG.MSBGL0200.Srch01_DtlR.create();
		}

		/**
		 * Srch01_Hdr_RcvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_Hdr_RcvR createSrch01_Hdr_RcvR(){
			return mcframe.serverMSBG.MSBGL0200.Srch01_Hdr_RcvR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Srch01_CndR
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_rev</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>def_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Srch01_HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>div_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal_w</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_nm1</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_purc_typ2</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>debtor_nm</td></tr>
		 * 	<tr><td><br></td><td>debt_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>debt_bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>old_rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>old_bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>old_bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_nm</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd3</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_nm3</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>creditor_nm</td></tr>
		 * 	<tr><td><br></td><td>cred_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Srch01_RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_RcvR down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>amt1</td></tr>
		 * 	<tr><td><br></td><td>amt2</td></tr>
		 * 	<tr><td><br></td><td>appl_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Srch01_DtlR
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_DtlR down2() {
			return down2;
		}


		/**
		 * [Srch01_Hdr_Rcv]ブロックのコンテナaSrch01_Hdr_RcvRを返します。
		 *
		 * @return Srch01_Hdr_RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch01_Hdr_RcvR Srch01_Hdr_Rcv() {
			return aSrch01_Hdr_Rcv;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 入金を検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Srch02_RcvR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Srch02_RcvR down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0200.Srch02_RcvR.create();
			down0 = mcframe.serverMSBG.MSBGL0200.Srch02_RcvR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_RcvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch02_RcvR createSrch02_RcvR(){
			return mcframe.serverMSBG.MSBGL0200.Srch02_RcvR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Srch02_RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch02_RcvR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>dat_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal_w</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_nm1</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_purc_typ2</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>debtor_nm</td></tr>
		 * 	<tr><td><br></td><td>old_rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>old_bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>old_bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_nm</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Srch02_RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.Srch02_RcvR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を登録・訂正する前のチェックを行う<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.RcvR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.DtlR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.RcvR down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.DtlR down2;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0200.HdrR.create();
			up1 = mcframe.serverMSBG.MSBGL0200.RcvR.create();
			up2 = mcframe.serverMSBG.MSBGL0200.DtlR.create();
			down0 = mcframe.serverMSBG.MSBGL0200.HdrR.create();
			down1 = mcframe.serverMSBG.MSBGL0200.RcvR.create();
			down2 = mcframe.serverMSBG.MSBGL0200.DtlR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR createHdrR(){
			return mcframe.serverMSBG.MSBGL0200.HdrR.create();
		}

		/**
		 * RcvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.RcvR createRcvR(){
			return mcframe.serverMSBG.MSBGL0200.RcvR.create();
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR createDtlR(){
			return mcframe.serverMSBG.MSBGL0200.DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd3</td></tr>
		 * 	<tr><td><br></td><td>tax_cd1</td></tr>
		 * 	<tr><td><br></td><td>tax_cd2</td></tr>
		 * 	<tr><td><br></td><td>tax_cd3</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>debtor_nm</td></tr>
		 * 	<tr><td><br></td><td>debt_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>creditor_nm</td></tr>
		 * 	<tr><td><br></td><td>cred_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.RcvR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>amt1</td></tr>
		 * 	<tr><td><br></td><td>amt2</td></tr>
		 * 	<tr><td><br></td><td>amt3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.DtlR
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_trd_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd3</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ3</td></tr>
		 * 	<tr><td><br></td><td>tax_cd1</td></tr>
		 * 	<tr><td><br></td><td>tax_rate1</td></tr>
		 * 	<tr><td><br></td><td>tax_typ1</td></tr>
		 * 	<tr><td><br></td><td>tax_cd2</td></tr>
		 * 	<tr><td><br></td><td>tax_rate2</td></tr>
		 * 	<tr><td><br></td><td>tax_typ2</td></tr>
		 * 	<tr><td><br></td><td>tax_cd3</td></tr>
		 * 	<tr><td><br></td><td>tax_rate3</td></tr>
		 * 	<tr><td><br></td><td>tax_typ3</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>debtor_nm</td></tr>
		 * 	<tr><td><br></td><td>debt_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>creditor_nm</td></tr>
		 * 	<tr><td><br></td><td>cred_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.RcvR down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>amt1</td></tr>
		 * 	<tr><td><br></td><td>amt2</td></tr>
		 * 	<tr><td><br></td><td>amt3</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.DtlR
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 前受仮受の入金実績を取り消す前のチェックを行う<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Chk02_RcvR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Chk02_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Chk02_RcvR down1;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0200.Chk02_HdrR.create();
			up1 = mcframe.serverMSBG.MSBGL0200.Chk02_RcvR.create();
			down0 = mcframe.serverMSBG.MSBGL0200.Chk02_HdrR.create();
			down1 = mcframe.serverMSBG.MSBGL0200.Chk02_RcvR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBG.MSBGL0200.Chk02_HdrR.create();
		}

		/**
		 * Chk02_RcvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_RcvR createChk02_RcvR(){
			return mcframe.serverMSBG.MSBGL0200.Chk02_RcvR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Chk02_HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Chk02_RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_RcvR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Chk02_HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Chk02_RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_RcvR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を登録する<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.RcvR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.DtlR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.DtlR down1;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0200.HdrR.create();
			up1 = mcframe.serverMSBG.MSBGL0200.RcvR.create();
			up2 = mcframe.serverMSBG.MSBGL0200.DtlR.create();
			down0 = mcframe.serverMSBG.MSBGL0200.HdrR.create();
			down1 = mcframe.serverMSBG.MSBGL0200.DtlR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR createIns01_HdrR(){
			return mcframe.serverMSBG.MSBGL0200.HdrR.create();
		}

		/**
		 * Ins01_RcvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.RcvR createIns01_RcvR(){
			return mcframe.serverMSBG.MSBGL0200.RcvR.create();
		}

		/**
		 * Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR createIns01_DtlR(){
			return mcframe.serverMSBG.MSBGL0200.DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd3</td></tr>
		 * 	<tr><td><br></td><td>tax_cd1</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>debtor_nm</td></tr>
		 * 	<tr><td><br></td><td>debt_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>creditor_nm</td></tr>
		 * 	<tr><td><br></td><td>cred_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.RcvR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>amt1</td></tr>
		 * 	<tr><td><br></td><td>amt2</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.DtlR
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.DtlR
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を訂正する<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.RcvR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.DtlR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.DtlR down1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0200.HdrR.create();
			up1 = mcframe.serverMSBG.MSBGL0200.RcvR.create();
			up2 = mcframe.serverMSBG.MSBGL0200.DtlR.create();
			down0 = mcframe.serverMSBG.MSBGL0200.HdrR.create();
			down1 = mcframe.serverMSBG.MSBGL0200.DtlR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR createUpd01_HdrR(){
			return mcframe.serverMSBG.MSBGL0200.HdrR.create();
		}

		/**
		 * Upd01_RcvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.RcvR createUpd01_RcvR(){
			return mcframe.serverMSBG.MSBGL0200.RcvR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR createUpd01_DtlR(){
			return mcframe.serverMSBG.MSBGL0200.DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd3</td></tr>
		 * 	<tr><td><br></td><td>tax_cd1</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>debtor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>debtor_nm</td></tr>
		 * 	<tr><td><br></td><td>debt_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_typ</td></tr>
		 * 	<tr><td><br></td><td>creditor_id_cd</td></tr>
		 * 	<tr><td><br></td><td>creditor_nm</td></tr>
		 * 	<tr><td><br></td><td>cred_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.RcvR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>amt1</td></tr>
		 * 	<tr><td><br></td><td>amt2</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.DtlR
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.DtlR
		 */
		public mcframe.serverMSBG.MSBGL0200.DtlR down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 前受仮受の入金実績を取り消す<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Chk02_RcvR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0200.Chk02_HdrR down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0200.Chk02_HdrR.create();
			up1 = mcframe.serverMSBG.MSBGL0200.Chk02_RcvR.create();
			down0 = mcframe.serverMSBG.MSBGL0200.Chk02_HdrR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_HdrR createDel01_HdrR(){
			return mcframe.serverMSBG.MSBGL0200.Chk02_HdrR.create();
		}

		/**
		 * Del01_RcvブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_RcvR createDel01_RcvR(){
			return mcframe.serverMSBG.MSBGL0200.Chk02_RcvR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Chk02_HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Chk02_RcvR
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_RcvR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0200.Chk02_HdrR
		 */
		public mcframe.serverMSBG.MSBGL0200.Chk02_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_AdvRcvReg)MSBGL_AdvRcvReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}