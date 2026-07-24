package mcframe.serverMSLA.MSLAL5140;

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
 * "MSLAL_DlvInstRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_DlvInstRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL5140";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd01 aDlvInstRecvIf_Upd01;

	protected void initDlvInstRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL5140_DlvInstRecvIf_Upd01_INFO;
		this.aDlvInstRecvIf_Upd01 = ((MSLAL_DlvInstRecvIfService)this).new DlvInstRecvIf_Upd01();
	}

	public static MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd01 crtDlvInstRecvIf_Upd01() {
		MSLAL_DlvInstRecvIfService lgc = new MSLAL_DlvInstRecvIfService();
		lgc.initDlvInstRecvIf_Upd01();
		return lgc.aDlvInstRecvIf_Upd01;
	}

	protected void paramDlvInstRecvIf_Upd01(MCParam p) {
		if (this.aDlvInstRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstRecvIf_Upd01.up0());
	}

	protected void doDlvInstRecvIf_Upd01() {
		aDlvInstRecvIf_Upd01.call();
	};

	/**
	 * DlvInstRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createDlvInstRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * DlvInstRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createDlvInstRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd02 aDlvInstRecvIf_Upd02;

	protected void initDlvInstRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL5140_DlvInstRecvIf_Upd02_INFO;
		this.aDlvInstRecvIf_Upd02 = ((MSLAL_DlvInstRecvIfService)this).new DlvInstRecvIf_Upd02();
	}

	public static MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd02 crtDlvInstRecvIf_Upd02() {
		MSLAL_DlvInstRecvIfService lgc = new MSLAL_DlvInstRecvIfService();
		lgc.initDlvInstRecvIf_Upd02();
		return lgc.aDlvInstRecvIf_Upd02;
	}

	protected void paramDlvInstRecvIf_Upd02(MCParam p) {
		if (this.aDlvInstRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstRecvIf_Upd02.up0());
		p.addUpBlock(aDlvInstRecvIf_Upd02.up1());
		p.addDownBlock(aDlvInstRecvIf_Upd02.down0());
	}

	protected void doDlvInstRecvIf_Upd02() {
		aDlvInstRecvIf_Upd02.call();
	};

	/**
	 * DlvInstRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createDlvInstRecvIf_Upd01_DtlR_0(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * DlvInstRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createDlvInstRecvIf_Upd01_DtlL_0(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * DlvInstRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createDlvInstRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * DlvInstRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createDlvInstRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03 aDlvInstRecvIf_Upd03;

	protected void initDlvInstRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL5140_DlvInstRecvIf_Upd03_INFO;
		this.aDlvInstRecvIf_Upd03 = ((MSLAL_DlvInstRecvIfService)this).new DlvInstRecvIf_Upd03();
	}

	public static MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03 crtDlvInstRecvIf_Upd03() {
		MSLAL_DlvInstRecvIfService lgc = new MSLAL_DlvInstRecvIfService();
		lgc.initDlvInstRecvIf_Upd03();
		return lgc.aDlvInstRecvIf_Upd03;
	}

	protected void paramDlvInstRecvIf_Upd03(MCParam p) {
		if (this.aDlvInstRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstRecvIf_Upd03.up0());
		p.addDownBlock(aDlvInstRecvIf_Upd03.down0());
	}

	protected void doDlvInstRecvIf_Upd03() {
		aDlvInstRecvIf_Upd03.call();
	};

	/**
	 * DlvInstRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR createDlvInstRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR.create();
	}

	/**
	 * DlvInstRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR> createDlvInstRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR.class);
	}

	/**
	 * DlvInstRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_RsltR createDlvInstRecvIf_Upd03_RsltR(){
		return mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_RsltR.create();
	}
	protected MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd04 aDlvInstRecvIf_Upd04;

	protected void initDlvInstRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL5140_DlvInstRecvIf_Upd04_INFO;
		this.aDlvInstRecvIf_Upd04 = ((MSLAL_DlvInstRecvIfService)this).new DlvInstRecvIf_Upd04();
	}

	public static MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd04 crtDlvInstRecvIf_Upd04() {
		MSLAL_DlvInstRecvIfService lgc = new MSLAL_DlvInstRecvIfService();
		lgc.initDlvInstRecvIf_Upd04();
		return lgc.aDlvInstRecvIf_Upd04;
	}

	protected void paramDlvInstRecvIf_Upd04(MCParam p) {
		if (this.aDlvInstRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstRecvIf_Upd04.up0());
		p.addDownBlock(aDlvInstRecvIf_Upd04.down0());
	}

	protected void doDlvInstRecvIf_Upd04() {
		aDlvInstRecvIf_Upd04.call();
	};

	/**
	 * DlvInstRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR createDlvInstRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR.create();
	}

	/**
	 * DlvInstRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR> createDlvInstRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR.class);
	}
	protected MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Chk01 aDlvInstRecvIf_Chk01;

	protected void initDlvInstRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL5140_DlvInstRecvIf_Chk01_INFO;
		this.aDlvInstRecvIf_Chk01 = ((MSLAL_DlvInstRecvIfService)this).new DlvInstRecvIf_Chk01();
	}

	public static MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Chk01 crtDlvInstRecvIf_Chk01() {
		MSLAL_DlvInstRecvIfService lgc = new MSLAL_DlvInstRecvIfService();
		lgc.initDlvInstRecvIf_Chk01();
		return lgc.aDlvInstRecvIf_Chk01;
	}

	protected void paramDlvInstRecvIf_Chk01(MCParam p) {
		if (this.aDlvInstRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstRecvIf_Chk01.up0());
		p.addDownBlock(aDlvInstRecvIf_Chk01.down0());
		p.addDownBlock(aDlvInstRecvIf_Chk01.down1());
	}

	protected void doDlvInstRecvIf_Chk01() {
		aDlvInstRecvIf_Chk01.call();
	};

	/**
	 * DlvInstRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR createDlvInstRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR.create();
	}

	/**
	 * DlvInstRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR> createDlvInstRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR.class);
	}

	/**
	 * DlvInstRecvIf_Chk01_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR createDlvInstRecvIf_Chk01_Upd01_DtlR(){
		return mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.create();
	}

	/**
	 * DlvInstRecvIf_Chk01_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> createDlvInstRecvIf_Chk01_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * DlvInstRecvIf_Upd01オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class DlvInstRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected DlvInstRecvIf_Upd01() {
			
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
			invoke((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DlvInstRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createDlvInstRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * DlvInstRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createDlvInstRecvIf_Upd01_DtlL(){
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
			return ((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * DlvInstRecvIf_Upd02オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う。（ＩＦデータ確認、および納入指示受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class DlvInstRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstRecvIf_Upd02";

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
		protected DlvInstRecvIf_Upd02() {
			
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
			invoke((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DlvInstRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createDlvInstRecvIf_Upd01_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * DlvInstRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createDlvInstRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * DlvInstRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createDlvInstRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * DlvInstRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createDlvInstRecvIf_Upd02_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
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
			return ((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * DlvInstRecvIf_Upd03オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class DlvInstRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_RsltR down0;
		
		
		// コンストラクタ
		protected DlvInstRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_RsltR.create();

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
			invoke((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DlvInstRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR createDlvInstRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR.create();
		}

		/**
		 * DlvInstRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR> createDlvInstRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR.class);
		}

		/**
		 * DlvInstRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_RsltR createDlvInstRecvIf_Upd03_RsltR(){
			return mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_DtlR> up0() {
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
		 * @see mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_RsltR
		 */
		public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd03_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * DlvInstRecvIf_Upd04オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う。（納入指示登録サービスを呼び出す本処理）<br>
	 */
	abstract public class DlvInstRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR> down0;
		
		
		// コンストラクタ
		protected DlvInstRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR.class);

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
			invoke((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DlvInstRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR createDlvInstRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR.create();
		}

		/**
		 * DlvInstRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR> createDlvInstRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.exe_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Upd04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * DlvInstRecvIf_Chk01オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class DlvInstRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> down1;
		
		
		// コンストラクタ
		protected DlvInstRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * DlvInstRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR createDlvInstRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR.create();
		}

		/**
		 * DlvInstRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR> createDlvInstRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR.class);
		}

		/**
		 * DlvInstRecvIf_Chk01_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR createDlvInstRecvIf_Chk01_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.create();
		}

		/**
		 * DlvInstRecvIf_Chk01_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> createDlvInstRecvIf_Chk01_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_lno</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.pri_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_dlv_inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.cst_dlv_inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>dlvInst.log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlvInst.data_lno</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5140.DlvInstRecvIf_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_DlvInstRecvIfService)MSLAL_DlvInstRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}