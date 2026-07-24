package mcframe.serverMSLA.MSLAL9010;

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
 * "MSLAL_RcvRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_RcvRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL9010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_RcvRecvIfService.RcvRecvIf_Chk01 aRcvRecvIf_Chk01;

	protected void initRcvRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL9010_RcvRecvIf_Chk01_INFO;
		this.aRcvRecvIf_Chk01 = ((MSLAL_RcvRecvIfService)this).new RcvRecvIf_Chk01();
	}

	public static MSLAL_RcvRecvIfService.RcvRecvIf_Chk01 crtRcvRecvIf_Chk01() {
		MSLAL_RcvRecvIfService lgc = new MSLAL_RcvRecvIfService();
		lgc.initRcvRecvIf_Chk01();
		return lgc.aRcvRecvIf_Chk01;
	}

	protected void paramRcvRecvIf_Chk01(MCParam p) {
		if (this.aRcvRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvRecvIf_Chk01.up0());
		p.addDownBlock(aRcvRecvIf_Chk01.down0());
		p.addDownBlock(aRcvRecvIf_Chk01.down1());
		p.addDownBlock(aRcvRecvIf_Chk01.down2());
	}

	protected void doRcvRecvIf_Chk01() {
		aRcvRecvIf_Chk01.call();
	};

	/**
	 * RcvRecvIf_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR createRcvRecvIf_Chk01_CndR(){
		return mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.create();
	}

	/**
	 * RcvRecvIf_Chk01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> createRcvRecvIf_Chk01_CndL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.class);
	}

	/**
	 * RcvRecvIf_Chk01_Dtl01ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5180.Chk01_HdrR createRcvRecvIf_Chk01_Dtl01R(){
		return mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.create();
	}

	/**
	 * RcvRecvIf_Chk01_Dtl01ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> createRcvRecvIf_Chk01_Dtl01L(){
		return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
	}

	/**
	 * RcvRecvIf_Chk01_Dtl02ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5180.Chk02_HdrR createRcvRecvIf_Chk01_Dtl02R(){
		return mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.create();
	}

	/**
	 * RcvRecvIf_Chk01_Dtl02ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> createRcvRecvIf_Chk01_Dtl02L(){
		return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);
	}
	protected MSLAL_RcvRecvIfService.RcvRecvIf_Upd01 aRcvRecvIf_Upd01;

	protected void initRcvRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL9010_RcvRecvIf_Upd01_INFO;
		this.aRcvRecvIf_Upd01 = ((MSLAL_RcvRecvIfService)this).new RcvRecvIf_Upd01();
	}

	public static MSLAL_RcvRecvIfService.RcvRecvIf_Upd01 crtRcvRecvIf_Upd01() {
		MSLAL_RcvRecvIfService lgc = new MSLAL_RcvRecvIfService();
		lgc.initRcvRecvIf_Upd01();
		return lgc.aRcvRecvIf_Upd01;
	}

	protected void paramRcvRecvIf_Upd01(MCParam p) {
		if (this.aRcvRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvRecvIf_Upd01.up0());
	}

	protected void doRcvRecvIf_Upd01() {
		aRcvRecvIf_Upd01.call();
	};

	/**
	 * RcvRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createRcvRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * RcvRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createRcvRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_RcvRecvIfService.RcvRecvIf_Upd02 aRcvRecvIf_Upd02;

	protected void initRcvRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL9010_RcvRecvIf_Upd02_INFO;
		this.aRcvRecvIf_Upd02 = ((MSLAL_RcvRecvIfService)this).new RcvRecvIf_Upd02();
	}

	public static MSLAL_RcvRecvIfService.RcvRecvIf_Upd02 crtRcvRecvIf_Upd02() {
		MSLAL_RcvRecvIfService lgc = new MSLAL_RcvRecvIfService();
		lgc.initRcvRecvIf_Upd02();
		return lgc.aRcvRecvIf_Upd02;
	}

	protected void paramRcvRecvIf_Upd02(MCParam p) {
		if (this.aRcvRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvRecvIf_Upd02.up0());
		p.addUpBlock(aRcvRecvIf_Upd02.up1());
		p.addDownBlock(aRcvRecvIf_Upd02.down0());
	}

	protected void doRcvRecvIf_Upd02() {
		aRcvRecvIf_Upd02.call();
	};

	/**
	 * RcvRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createRcvRecvIf_Upd02_DtlR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * RcvRecvIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createRcvRecvIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * RcvRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createRcvRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * RcvRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createRcvRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_RcvRecvIfService.RcvRecvIf_Upd03 aRcvRecvIf_Upd03;

	protected void initRcvRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL9010_RcvRecvIf_Upd03_INFO;
		this.aRcvRecvIf_Upd03 = ((MSLAL_RcvRecvIfService)this).new RcvRecvIf_Upd03();
	}

	public static MSLAL_RcvRecvIfService.RcvRecvIf_Upd03 crtRcvRecvIf_Upd03() {
		MSLAL_RcvRecvIfService lgc = new MSLAL_RcvRecvIfService();
		lgc.initRcvRecvIf_Upd03();
		return lgc.aRcvRecvIf_Upd03;
	}

	protected void paramRcvRecvIf_Upd03(MCParam p) {
		if (this.aRcvRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvRecvIf_Upd03.up0());
		p.addDownBlock(aRcvRecvIf_Upd03.down0());
	}

	protected void doRcvRecvIf_Upd03() {
		aRcvRecvIf_Upd03.call();
	};

	/**
	 * RcvRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR createRcvRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR.create();
	}

	/**
	 * RcvRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR> createRcvRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR.class);
	}

	/**
	 * RcvRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_RsltR createRcvRecvIf_Upd03_RsltR(){
		return mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_RsltR.create();
	}
	protected MSLAL_RcvRecvIfService.RcvRecvIf_Upd04 aRcvRecvIf_Upd04;

	protected void initRcvRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL9010_RcvRecvIf_Upd04_INFO;
		this.aRcvRecvIf_Upd04 = ((MSLAL_RcvRecvIfService)this).new RcvRecvIf_Upd04();
	}

	public static MSLAL_RcvRecvIfService.RcvRecvIf_Upd04 crtRcvRecvIf_Upd04() {
		MSLAL_RcvRecvIfService lgc = new MSLAL_RcvRecvIfService();
		lgc.initRcvRecvIf_Upd04();
		return lgc.aRcvRecvIf_Upd04;
	}

	protected void paramRcvRecvIf_Upd04(MCParam p) {
		if (this.aRcvRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvRecvIf_Upd04.up0());
		p.addDownBlock(aRcvRecvIf_Upd04.down0());
	}

	protected void doRcvRecvIf_Upd04() {
		aRcvRecvIf_Upd04.call();
	};

	/**
	 * RcvRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR createRcvRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.create();
	}

	/**
	 * RcvRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> createRcvRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RcvRecvIf_Chk01オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う前のチェック処理。<br>
	 */
	abstract public class RcvRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> down2;
		
		
		// コンストラクタ
		protected RcvRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.class);
			down1 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
			down2 = MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);

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
			invoke((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * RcvRecvIf_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR createRcvRecvIf_Chk01_CndR(){
			return mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.create();
		}

		/**
		 * RcvRecvIf_Chk01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> createRcvRecvIf_Chk01_CndL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.class);
		}

		/**
		 * RcvRecvIf_Chk01_Dtl01ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5180.Chk01_HdrR createRcvRecvIf_Chk01_Dtl01R(){
			return mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.create();
		}

		/**
		 * RcvRecvIf_Chk01_Dtl01ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> createRcvRecvIf_Chk01_Dtl01L(){
			return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk01_HdrR.class);
		}

		/**
		 * RcvRecvIf_Chk01_Dtl02ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5180.Chk02_HdrR createRcvRecvIf_Chk01_Dtl02R(){
			return mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.create();
		}

		/**
		 * RcvRecvIf_Chk01_Dtl02ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> createRcvRecvIf_Chk01_Dtl02L(){
			return MCList.create(mcframe.serverMSBG.MSBGL5180.Chk02_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv.rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.ar_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv.bank_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv.com_paid</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv.note_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.note_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv.due_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv.endrsr</td></tr>
		 * 	<tr><td><br></td><td>rcv.accptr</td></tr>
		 * 	<tr><td><br></td><td>rcv.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>rcv.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_lno</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv.ext_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_basis_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv.rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_lno</td></tr>
		 * 	<tr><td><br></td><td>rcv.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_basis_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> down0() {
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
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>fb_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>dac_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>div_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk01_HdrR> down1() {
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
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>dac_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5180.Chk02_HdrR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * RcvRecvIf_Upd01オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う（リアルタイム取込から呼び出される）。<br>
	 */
	abstract public class RcvRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected RcvRecvIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RcvRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createRcvRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * RcvRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createRcvRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * RcvRecvIf_Upd02オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う（ＩＦデータ確認、および入金受信ＩＦ取込バッチから呼び出される）。<br>
	 */
	abstract public class RcvRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvRecvIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected RcvRecvIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();

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
			invoke((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcvRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createRcvRecvIf_Upd02_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * RcvRecvIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createRcvRecvIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * RcvRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createRcvRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * RcvRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createRcvRecvIf_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exe_unit_lump_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_actlumprecv_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * RcvRecvIf_Upd03オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う（マルチスレッド実行用）。<br>
	 */
	abstract public class RcvRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_RsltR down0;
		
		
		// コンストラクタ
		protected RcvRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_RsltR.create();

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
			invoke((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcvRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR createRcvRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR.create();
		}

		/**
		 * RcvRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR> createRcvRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR.class);
		}

		/**
		 * RcvRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_RsltR createRcvRecvIf_Upd03_RsltR(){
			return mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_num</td></tr>
		 * 	<tr><td><br></td><td>ok_num</td></tr>
		 * 	<tr><td><br></td><td>err_num</td></tr>
		 * 	<tr><td><br></td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_RsltR
		 */
		public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Upd03_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * RcvRecvIf_Upd04オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う（入金受信ＩＦサービスを呼び出す本処理）。<br>
	 */
	abstract public class RcvRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> down0;
		
		
		// コンストラクタ
		protected RcvRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.class);

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
			invoke((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcvRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR createRcvRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.create();
		}

		/**
		 * RcvRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> createRcvRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv.rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.xrate</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv.com_paid</td></tr>
		 * 	<tr><td><br></td><td>rcv.rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv.note_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.note_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv.due_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv.endrsr</td></tr>
		 * 	<tr><td><br></td><td>rcv.accptr</td></tr>
		 * 	<tr><td><br></td><td>rcv.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.batch_log_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>rcv.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_lno</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv.ext_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>rcv.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv.rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv.data_lno</td></tr>
		 * 	<tr><td><br></td><td>rcv.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9010.RcvRecvIf_Chk01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_RcvRecvIfService)MSLAL_RcvRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}