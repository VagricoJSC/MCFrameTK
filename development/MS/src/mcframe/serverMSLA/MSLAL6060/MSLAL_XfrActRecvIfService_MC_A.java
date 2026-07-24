package mcframe.serverMSLA.MSLAL6060;

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
 * "MSLAL_XfrActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_XfrActRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL6060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd01 aXfrActRecvIf_Upd01;

	protected void initXfrActRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL6060_XfrActRecvIf_Upd01_INFO;
		this.aXfrActRecvIf_Upd01 = ((MSLAL_XfrActRecvIfService)this).new XfrActRecvIf_Upd01();
	}

	public static MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd01 crtXfrActRecvIf_Upd01() {
		MSLAL_XfrActRecvIfService lgc = new MSLAL_XfrActRecvIfService();
		lgc.initXfrActRecvIf_Upd01();
		return lgc.aXfrActRecvIf_Upd01;
	}

	protected void paramXfrActRecvIf_Upd01(MCParam p) {
		if (this.aXfrActRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrActRecvIf_Upd01.up0());
	}

	protected void doXfrActRecvIf_Upd01() {
		aXfrActRecvIf_Upd01.call();
	};

	/**
	 * XfrActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createXfrActRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * XfrActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createXfrActRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd02 aXfrActRecvIf_Upd02;

	protected void initXfrActRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL6060_XfrActRecvIf_Upd02_INFO;
		this.aXfrActRecvIf_Upd02 = ((MSLAL_XfrActRecvIfService)this).new XfrActRecvIf_Upd02();
	}

	public static MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd02 crtXfrActRecvIf_Upd02() {
		MSLAL_XfrActRecvIfService lgc = new MSLAL_XfrActRecvIfService();
		lgc.initXfrActRecvIf_Upd02();
		return lgc.aXfrActRecvIf_Upd02;
	}

	protected void paramXfrActRecvIf_Upd02(MCParam p) {
		if (this.aXfrActRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrActRecvIf_Upd02.up0());
		p.addUpBlock(aXfrActRecvIf_Upd02.up1());
		p.addDownBlock(aXfrActRecvIf_Upd02.down0());
	}

	protected void doXfrActRecvIf_Upd02() {
		aXfrActRecvIf_Upd02.call();
	};

	/**
	 * XfrActRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createXfrActRecvIf_Upd02_DtlR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * XfrActRecvIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createXfrActRecvIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * XfrActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createXfrActRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * XfrActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createXfrActRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd03 aXfrActRecvIf_Upd03;

	protected void initXfrActRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL6060_XfrActRecvIf_Upd03_INFO;
		this.aXfrActRecvIf_Upd03 = ((MSLAL_XfrActRecvIfService)this).new XfrActRecvIf_Upd03();
	}

	public static MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd03 crtXfrActRecvIf_Upd03() {
		MSLAL_XfrActRecvIfService lgc = new MSLAL_XfrActRecvIfService();
		lgc.initXfrActRecvIf_Upd03();
		return lgc.aXfrActRecvIf_Upd03;
	}

	protected void paramXfrActRecvIf_Upd03(MCParam p) {
		if (this.aXfrActRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrActRecvIf_Upd03.up0());
		p.addUpBlock(aXfrActRecvIf_Upd03.up1());
		p.addDownBlock(aXfrActRecvIf_Upd03.down0());
	}

	protected void doXfrActRecvIf_Upd03() {
		aXfrActRecvIf_Upd03.call();
	};

	/**
	 * XfrActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR createXfrActRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR.create();
	}

	/**
	 * XfrActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR> createXfrActRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR.class);
	}

	/**
	 * XfrActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createXfrActRecvIf_Upd03_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * XfrActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createXfrActRecvIf_Upd03_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd04 aXfrActRecvIf_Upd04;

	protected void initXfrActRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL6060_XfrActRecvIf_Upd04_INFO;
		this.aXfrActRecvIf_Upd04 = ((MSLAL_XfrActRecvIfService)this).new XfrActRecvIf_Upd04();
	}

	public static MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd04 crtXfrActRecvIf_Upd04() {
		MSLAL_XfrActRecvIfService lgc = new MSLAL_XfrActRecvIfService();
		lgc.initXfrActRecvIf_Upd04();
		return lgc.aXfrActRecvIf_Upd04;
	}

	protected void paramXfrActRecvIf_Upd04(MCParam p) {
		if (this.aXfrActRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrActRecvIf_Upd04.up0());
		p.addUpBlock(aXfrActRecvIf_Upd04.up1());
		p.addDownBlock(aXfrActRecvIf_Upd04.down0());
	}

	protected void doXfrActRecvIf_Upd04() {
		aXfrActRecvIf_Upd04.call();
	};

	/**
	 * XfrActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR createXfrActRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR.create();
	}

	/**
	 * XfrActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR> createXfrActRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR.class);
	}

	/**
	 * XfrActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createXfrActRecvIf_Upd04_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}
	protected MSLAL_XfrActRecvIfService.XfrActRecvIf_Chk01 aXfrActRecvIf_Chk01;

	protected void initXfrActRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL6060_XfrActRecvIf_Chk01_INFO;
		this.aXfrActRecvIf_Chk01 = ((MSLAL_XfrActRecvIfService)this).new XfrActRecvIf_Chk01();
	}

	public static MSLAL_XfrActRecvIfService.XfrActRecvIf_Chk01 crtXfrActRecvIf_Chk01() {
		MSLAL_XfrActRecvIfService lgc = new MSLAL_XfrActRecvIfService();
		lgc.initXfrActRecvIf_Chk01();
		return lgc.aXfrActRecvIf_Chk01;
	}

	protected void paramXfrActRecvIf_Chk01(MCParam p) {
		if (this.aXfrActRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrActRecvIf_Chk01.up0());
		p.addDownBlock(aXfrActRecvIf_Chk01.down0());
		p.addDownBlock(aXfrActRecvIf_Chk01.down1());
	}

	protected void doXfrActRecvIf_Chk01() {
		aXfrActRecvIf_Chk01.call();
	};

	/**
	 * XfrActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR createXfrActRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR.create();
	}

	/**
	 * XfrActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR> createXfrActRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR.class);
	}

	/**
	 * XfrActRecvIf_Chk01_HdrDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR createXfrActRecvIf_Chk01_HdrDtlR(){
		return mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR.create();
	}

	/**
	 * XfrActRecvIf_Chk01_HdrDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR> createXfrActRecvIf_Chk01_HdrDtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * XfrActRecvIf_Upd01オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class XfrActRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrActRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected XfrActRecvIf_Upd01() {
			
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
			invoke((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * XfrActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createXfrActRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * XfrActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createXfrActRecvIf_Upd01_DtlL(){
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * XfrActRecvIf_Upd02オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う。（ＩＦデータ確認、および移動実績受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class XfrActRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrActRecvIf_Upd02";

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
		protected XfrActRecvIf_Upd02() {
			
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
			invoke((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrActRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createXfrActRecvIf_Upd02_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * XfrActRecvIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createXfrActRecvIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * XfrActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createXfrActRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * XfrActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createXfrActRecvIf_Upd02_RsltR(){
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
			return ((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * XfrActRecvIf_Upd03オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class XfrActRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrActRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected XfrActRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR.class);
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
			invoke((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR createXfrActRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR.create();
		}

		/**
		 * XfrActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR> createXfrActRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR.class);
		}

		/**
		 * XfrActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createXfrActRecvIf_Upd03_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * XfrActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createXfrActRecvIf_Upd03_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>xa.data_no</td></tr>
		 * 	<tr><td><br></td><td>xa.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>xa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>xa.lg_grp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd03_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
			return ((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * XfrActRecvIf_Upd04オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う。（移動実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	abstract public class XfrActRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrActRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR> down0;
		
		
		// コンストラクタ
		protected XfrActRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR.class);

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
			invoke((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR createXfrActRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR.create();
		}

		/**
		 * XfrActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR> createXfrActRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR.class);
		}

		/**
		 * XfrActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createXfrActRecvIf_Upd04_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>xa.data_no</td></tr>
		 * 	<tr><td><br></td><td>xa.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>xa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>xa.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xa.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xa.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xa.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xa.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xa.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xa.sno1</td></tr>
		 * 	<tr><td><br></td><td>xa.sno2</td></tr>
		 * 	<tr><td><br></td><td>xa.sno3</td></tr>
		 * 	<tr><td><br></td><td>xa.sno4</td></tr>
		 * 	<tr><td><br></td><td>xa.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xa.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xa.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xa.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xa.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.intr_d_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
		 * 	<tr><td><br></td><td>xa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>xa.data_no</td></tr>
		 * 	<tr><td><br></td><td>xa.exe_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * XfrActRecvIf_Chk01オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class XfrActRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrActRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR> down1;
		
		
		// コンストラクタ
		protected XfrActRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR.class);
			down1 = MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR.class);

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
			invoke((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * XfrActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR createXfrActRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR.create();
		}

		/**
		 * XfrActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR> createXfrActRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR.class);
		}

		/**
		 * XfrActRecvIf_Chk01_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR createXfrActRecvIf_Chk01_HdrDtlR(){
			return mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR.create();
		}

		/**
		 * XfrActRecvIf_Chk01_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR> createXfrActRecvIf_Chk01_HdrDtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>xa.data_no</td></tr>
		 * 	<tr><td><br></td><td>xa.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>xa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>xa.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xa.ext_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xa.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xa.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xa.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xa.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xa.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xa.sno1</td></tr>
		 * 	<tr><td><br></td><td>xa.sno2</td></tr>
		 * 	<tr><td><br></td><td>xa.sno3</td></tr>
		 * 	<tr><td><br></td><td>xa.sno4</td></tr>
		 * 	<tr><td><br></td><td>xa.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xa.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xa.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xa.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>xa.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xa.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xa.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xa.intr_d_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sno1</td></tr>
		 * 	<tr><td><br></td><td>xad.sno2</td></tr>
		 * 	<tr><td><br></td><td>xad.sno3</td></tr>
		 * 	<tr><td><br></td><td>xad.sno4</td></tr>
		 * 	<tr><td><br></td><td>xad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xad.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_dtl_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_HdrDtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_XfrActRecvIfService)MSLAL_XfrActRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}