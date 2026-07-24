package mcframe.serverMSLA.MSLAL6040;

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
 * "MSLAL_ArrActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_ArrActRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL6040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd01 aArrActRecvIf_Upd01;

	protected void initArrActRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL6040_ArrActRecvIf_Upd01_INFO;
		this.aArrActRecvIf_Upd01 = ((MSLAL_ArrActRecvIfService)this).new ArrActRecvIf_Upd01();
	}

	public static MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd01 crtArrActRecvIf_Upd01() {
		MSLAL_ArrActRecvIfService lgc = new MSLAL_ArrActRecvIfService();
		lgc.initArrActRecvIf_Upd01();
		return lgc.aArrActRecvIf_Upd01;
	}

	protected void paramArrActRecvIf_Upd01(MCParam p) {
		if (this.aArrActRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrActRecvIf_Upd01.up0());
	}

	protected void doArrActRecvIf_Upd01() {
		aArrActRecvIf_Upd01.call();
	};

	/**
	 * ArrActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createArrActRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * ArrActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createArrActRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd02 aArrActRecvIf_Upd02;

	protected void initArrActRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL6040_ArrActRecvIf_Upd02_INFO;
		this.aArrActRecvIf_Upd02 = ((MSLAL_ArrActRecvIfService)this).new ArrActRecvIf_Upd02();
	}

	public static MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd02 crtArrActRecvIf_Upd02() {
		MSLAL_ArrActRecvIfService lgc = new MSLAL_ArrActRecvIfService();
		lgc.initArrActRecvIf_Upd02();
		return lgc.aArrActRecvIf_Upd02;
	}

	protected void paramArrActRecvIf_Upd02(MCParam p) {
		if (this.aArrActRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrActRecvIf_Upd02.up0());
		p.addUpBlock(aArrActRecvIf_Upd02.up1());
		p.addDownBlock(aArrActRecvIf_Upd02.down0());
	}

	protected void doArrActRecvIf_Upd02() {
		aArrActRecvIf_Upd02.call();
	};

	/**
	 * ArrActRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createArrActRecvIf_Upd02_DtlR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * ArrActRecvIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createArrActRecvIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * ArrActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createArrActRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * ArrActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createArrActRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 aArrActRecvIf_Upd03;

	protected void initArrActRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL6040_ArrActRecvIf_Upd03_INFO;
		this.aArrActRecvIf_Upd03 = ((MSLAL_ArrActRecvIfService)this).new ArrActRecvIf_Upd03();
	}

	public static MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 crtArrActRecvIf_Upd03() {
		MSLAL_ArrActRecvIfService lgc = new MSLAL_ArrActRecvIfService();
		lgc.initArrActRecvIf_Upd03();
		return lgc.aArrActRecvIf_Upd03;
	}

	protected void paramArrActRecvIf_Upd03(MCParam p) {
		if (this.aArrActRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrActRecvIf_Upd03.up0());
		p.addUpBlock(aArrActRecvIf_Upd03.up1());
		p.addDownBlock(aArrActRecvIf_Upd03.down0());
	}

	protected void doArrActRecvIf_Upd03() {
		aArrActRecvIf_Upd03.call();
	};

	/**
	 * ArrActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR createArrActRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR.create();
	}

	/**
	 * ArrActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR> createArrActRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR.class);
	}

	/**
	 * ArrActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createArrActRecvIf_Upd03_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * ArrActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createArrActRecvIf_Upd03_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd04 aArrActRecvIf_Upd04;

	protected void initArrActRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL6040_ArrActRecvIf_Upd04_INFO;
		this.aArrActRecvIf_Upd04 = ((MSLAL_ArrActRecvIfService)this).new ArrActRecvIf_Upd04();
	}

	public static MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd04 crtArrActRecvIf_Upd04() {
		MSLAL_ArrActRecvIfService lgc = new MSLAL_ArrActRecvIfService();
		lgc.initArrActRecvIf_Upd04();
		return lgc.aArrActRecvIf_Upd04;
	}

	protected void paramArrActRecvIf_Upd04(MCParam p) {
		if (this.aArrActRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrActRecvIf_Upd04.up0());
		p.addUpBlock(aArrActRecvIf_Upd04.up1());
		p.addDownBlock(aArrActRecvIf_Upd04.down0());
	}

	protected void doArrActRecvIf_Upd04() {
		aArrActRecvIf_Upd04.call();
	};

	/**
	 * ArrActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR createArrActRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR.create();
	}

	/**
	 * ArrActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR> createArrActRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR.class);
	}

	/**
	 * ArrActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createArrActRecvIf_Upd04_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}
	protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Chk01 aArrActRecvIf_Chk01;

	protected void initArrActRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL6040_ArrActRecvIf_Chk01_INFO;
		this.aArrActRecvIf_Chk01 = ((MSLAL_ArrActRecvIfService)this).new ArrActRecvIf_Chk01();
	}

	public static MSLAL_ArrActRecvIfService.ArrActRecvIf_Chk01 crtArrActRecvIf_Chk01() {
		MSLAL_ArrActRecvIfService lgc = new MSLAL_ArrActRecvIfService();
		lgc.initArrActRecvIf_Chk01();
		return lgc.aArrActRecvIf_Chk01;
	}

	protected void paramArrActRecvIf_Chk01(MCParam p) {
		if (this.aArrActRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrActRecvIf_Chk01.up0());
		p.addDownBlock(aArrActRecvIf_Chk01.down0());
		p.addDownBlock(aArrActRecvIf_Chk01.down1());
	}

	protected void doArrActRecvIf_Chk01() {
		aArrActRecvIf_Chk01.call();
	};

	/**
	 * ArrActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR createArrActRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR.create();
	}

	/**
	 * ArrActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR> createArrActRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR.class);
	}

	/**
	 * ArrActRecvIf_Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R createArrActRecvIf_Chk01_Dtl2R(){
		return mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R.create();
	}

	/**
	 * ArrActRecvIf_Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R> createArrActRecvIf_Chk01_Dtl2L(){
		return MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ArrActRecvIf_Upd01オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class ArrActRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrActRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected ArrActRecvIf_Upd01() {
			
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
			invoke((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ArrActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createArrActRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * ArrActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createArrActRecvIf_Upd01_DtlL(){
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
			return ((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ArrActRecvIf_Upd02オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う。（ＩＦデータ確認、および入荷実績受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class ArrActRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrActRecvIf_Upd02";

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
		protected ArrActRecvIf_Upd02() {
			
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
			invoke((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrActRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createArrActRecvIf_Upd02_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * ArrActRecvIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createArrActRecvIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * ArrActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createArrActRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * ArrActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createArrActRecvIf_Upd02_RsltR(){
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
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>total_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>ok_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>err_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ArrActRecvIf_Upd03オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class ArrActRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrActRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected ArrActRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR.class);
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
			invoke((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR createArrActRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR.create();
		}

		/**
		 * ArrActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR> createArrActRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR.class);
		}

		/**
		 * ArrActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createArrActRecvIf_Upd03_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * ArrActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createArrActRecvIf_Upd03_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>aa.data_no</td></tr>
		 * 	<tr><td><br></td><td>aa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aa.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>aa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>aa.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>aa.po_no</td></tr>
		 * 	<tr><td><br></td><td>aa.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>aa.lot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ver_no</td></tr>
		 * 	<tr><td><br></td><td>aa.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>aa.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd03_DtlR> up0() {
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
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>total_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>ok_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>err_num</td></tr>
		 * 	<tr bgcolor="#ffccff"><td>*</td><td>skip_num</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ArrActRecvIf_Upd04オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う。（入荷実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	abstract public class ArrActRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrActRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrActRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR.class);

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
			invoke((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR createArrActRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR.create();
		}

		/**
		 * ArrActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR> createArrActRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR.class);
		}

		/**
		 * ArrActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createArrActRecvIf_Upd04_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>aa.data_no</td></tr>
		 * 	<tr><td><br></td><td>aa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aa.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>aa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>aa.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>aa.po_no</td></tr>
		 * 	<tr><td><br></td><td>aa.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>aa.lot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ver_no</td></tr>
		 * 	<tr><td><br></td><td>aa.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>aa.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>aa.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>aa.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>aa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>aa.data_no</td></tr>
		 * 	<tr><td><br></td><td>aa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aa.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>aa.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>push_alert_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>push_alert_usr_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Upd04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ArrActRecvIf_Chk01オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class ArrActRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrActRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R> down1;
		
		
		// コンストラクタ
		protected ArrActRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR.class);
			down1 = MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R.class);

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
			invoke((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ArrActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR createArrActRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR.create();
		}

		/**
		 * ArrActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR> createArrActRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR.class);
		}

		/**
		 * ArrActRecvIf_Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R createArrActRecvIf_Chk01_Dtl2R(){
			return mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R.create();
		}

		/**
		 * ArrActRecvIf_Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R> createArrActRecvIf_Chk01_Dtl2L(){
			return MCList.create(mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>aa.data_no</td></tr>
		 * 	<tr><td><br></td><td>aa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aa.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>aa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>aa.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>aa.po_no</td></tr>
		 * 	<tr><td><br></td><td>aa.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>aa.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>aa.lot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ver_no</td></tr>
		 * 	<tr><td><br></td><td>aa.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>aa.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>aa.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>aa.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>aa.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>aa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aa.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>aa.sub_dt5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>push_alert_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>push_alert_usr_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>aaIf.peg_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>aaIf.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>aaIf.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>aaIf.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>aaIf.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>aaIf.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>aaIf.rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sno1</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sno2</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sno3</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sno4</td></tr>
		 * 	<tr><td><br></td><td>aaIf.lot_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.ver_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>aaIf.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>aaIf.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>aaIf.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>aaIf.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>aaIf.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aaIf.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aaIf.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aaIf.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>aaIf.can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.iv_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>aaIf.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>aaIf.pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sno1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sno2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sno3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sno4_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sublot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.ver_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_arrv_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.gd_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.quality_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_insp_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_id_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.stk_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sppl_itm_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sppl_itm_nm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.maker_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.bp_lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.bp_dlv_slip_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.bp_dlv_slip_d_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.ship_fr_valid_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.purc_cont_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.insp_cnt_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.arr_pr_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aaIf.iv_no_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6040.ArrActRecvIf_Chk01_Dtl2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ArrActRecvIfService)MSLAL_ArrActRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}