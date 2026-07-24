package mcframe.serverMSLA.MSLAL5120;

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
 * "MSLAL_SloRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_SloRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL5120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_SloRecvIfService.SloRecvIf_Upd01 aSloRecvIf_Upd01;

	protected void initSloRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL5120_SloRecvIf_Upd01_INFO;
		this.aSloRecvIf_Upd01 = ((MSLAL_SloRecvIfService)this).new SloRecvIf_Upd01();
	}

	public static MSLAL_SloRecvIfService.SloRecvIf_Upd01 crtSloRecvIf_Upd01() {
		MSLAL_SloRecvIfService lgc = new MSLAL_SloRecvIfService();
		lgc.initSloRecvIf_Upd01();
		return lgc.aSloRecvIf_Upd01;
	}

	protected void paramSloRecvIf_Upd01(MCParam p) {
		if (this.aSloRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloRecvIf_Upd01.up0());
	}

	protected void doSloRecvIf_Upd01() {
		aSloRecvIf_Upd01.call();
	};

	/**
	 * SloRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createSloRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * SloRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createSloRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_SloRecvIfService.SloRecvIf_Upd02 aSloRecvIf_Upd02;

	protected void initSloRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL5120_SloRecvIf_Upd02_INFO;
		this.aSloRecvIf_Upd02 = ((MSLAL_SloRecvIfService)this).new SloRecvIf_Upd02();
	}

	public static MSLAL_SloRecvIfService.SloRecvIf_Upd02 crtSloRecvIf_Upd02() {
		MSLAL_SloRecvIfService lgc = new MSLAL_SloRecvIfService();
		lgc.initSloRecvIf_Upd02();
		return lgc.aSloRecvIf_Upd02;
	}

	protected void paramSloRecvIf_Upd02(MCParam p) {
		if (this.aSloRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloRecvIf_Upd02.up0());
		p.addUpBlock(aSloRecvIf_Upd02.up1());
		p.addDownBlock(aSloRecvIf_Upd02.down0());
	}

	protected void doSloRecvIf_Upd02() {
		aSloRecvIf_Upd02.call();
	};

	/**
	 * SloRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createSloRecvIf_Upd01_DtlR_0(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * SloRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createSloRecvIf_Upd01_DtlL_0(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * SloRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createSloRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * SloRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createSloRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_SloRecvIfService.SloRecvIf_Upd03 aSloRecvIf_Upd03;

	protected void initSloRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL5120_SloRecvIf_Upd03_INFO;
		this.aSloRecvIf_Upd03 = ((MSLAL_SloRecvIfService)this).new SloRecvIf_Upd03();
	}

	public static MSLAL_SloRecvIfService.SloRecvIf_Upd03 crtSloRecvIf_Upd03() {
		MSLAL_SloRecvIfService lgc = new MSLAL_SloRecvIfService();
		lgc.initSloRecvIf_Upd03();
		return lgc.aSloRecvIf_Upd03;
	}

	protected void paramSloRecvIf_Upd03(MCParam p) {
		if (this.aSloRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloRecvIf_Upd03.up0());
		p.addDownBlock(aSloRecvIf_Upd03.down0());
	}

	protected void doSloRecvIf_Upd03() {
		aSloRecvIf_Upd03.call();
	};

	/**
	 * SloRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR createSloRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR.create();
	}

	/**
	 * SloRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR> createSloRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR.class);
	}

	/**
	 * SloRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_RsltR createSloRecvIf_Upd03_RsltR(){
		return mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_RsltR.create();
	}
	protected MSLAL_SloRecvIfService.SloRecvIf_Upd04 aSloRecvIf_Upd04;

	protected void initSloRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL5120_SloRecvIf_Upd04_INFO;
		this.aSloRecvIf_Upd04 = ((MSLAL_SloRecvIfService)this).new SloRecvIf_Upd04();
	}

	public static MSLAL_SloRecvIfService.SloRecvIf_Upd04 crtSloRecvIf_Upd04() {
		MSLAL_SloRecvIfService lgc = new MSLAL_SloRecvIfService();
		lgc.initSloRecvIf_Upd04();
		return lgc.aSloRecvIf_Upd04;
	}

	protected void paramSloRecvIf_Upd04(MCParam p) {
		if (this.aSloRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloRecvIf_Upd04.up0());
		p.addDownBlock(aSloRecvIf_Upd04.down0());
	}

	protected void doSloRecvIf_Upd04() {
		aSloRecvIf_Upd04.call();
	};

	/**
	 * SloRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR createSloRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR.create();
	}

	/**
	 * SloRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR> createSloRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR.class);
	}
	protected MSLAL_SloRecvIfService.SloRecvIf_Chk01 aSloRecvIf_Chk01;

	protected void initSloRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL5120_SloRecvIf_Chk01_INFO;
		this.aSloRecvIf_Chk01 = ((MSLAL_SloRecvIfService)this).new SloRecvIf_Chk01();
	}

	public static MSLAL_SloRecvIfService.SloRecvIf_Chk01 crtSloRecvIf_Chk01() {
		MSLAL_SloRecvIfService lgc = new MSLAL_SloRecvIfService();
		lgc.initSloRecvIf_Chk01();
		return lgc.aSloRecvIf_Chk01;
	}

	protected void paramSloRecvIf_Chk01(MCParam p) {
		if (this.aSloRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloRecvIf_Chk01.up0());
		p.addUpBlock(aSloRecvIf_Chk01.up1());
		p.addUpBlock(aSloRecvIf_Chk01.up2());
		p.addDownBlock(aSloRecvIf_Chk01.down0());
		p.addDownBlock(aSloRecvIf_Chk01.down1());
		p.addDownBlock(aSloRecvIf_Chk01.down2());
		p.addDownBlock(aSloRecvIf_Chk01.down3());
		p.addDownBlock(aSloRecvIf_Chk01.down4());
	}

	protected void doSloRecvIf_Chk01() {
		aSloRecvIf_Chk01.call();
	};

	/**
	 * SloRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR createSloRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR.create();
	}

	/**
	 * SloRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR> createSloRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR.class);
	}

	/**
	 * SloRecvIf_Chk01_Slo_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR createSloRecvIf_Chk01_Slo_Upd01_HdrR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.create();
	}

	/**
	 * SloRecvIf_Chk01_Slo_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> createSloRecvIf_Chk01_Slo_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
	}

	/**
	 * SloRecvIf_Chk01_Slo_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR createSloRecvIf_Chk01_Slo_Upd01_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.create();
	}

	/**
	 * SloRecvIf_Chk01_Slo_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> createSloRecvIf_Chk01_Slo_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
	}

	/**
	 * SloRecvIf_Chk01_Slo_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR createSloRecvIf_Chk01_Slo_Del01_HdrR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.create();
	}

	/**
	 * SloRecvIf_Chk01_Slo_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR> createSloRecvIf_Chk01_Slo_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.class);
	}

	/**
	 * SloRecvIf_Chk01_Slo_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR createSloRecvIf_Chk01_Slo_Del01_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.create();
	}

	/**
	 * SloRecvIf_Chk01_Slo_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> createSloRecvIf_Chk01_Slo_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SloRecvIf_Upd01オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class SloRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected SloRecvIf_Upd01() {
			
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
			invoke((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SloRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createSloRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * SloRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createSloRecvIf_Upd01_DtlL(){
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
			return ((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * SloRecvIf_Upd02オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う。（ＩＦデータ確認、および受注受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class SloRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloRecvIf_Upd02";

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
		protected SloRecvIf_Upd02() {
			
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
			invoke((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SloRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createSloRecvIf_Upd01_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * SloRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createSloRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * SloRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createSloRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * SloRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createSloRecvIf_Upd02_RsltR(){
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
			return ((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * SloRecvIf_Upd03オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class SloRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_RsltR down0;
		
		
		// コンストラクタ
		protected SloRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_RsltR.create();

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
			invoke((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SloRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR createSloRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR.create();
		}

		/**
		 * SloRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR> createSloRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR.class);
		}

		/**
		 * SloRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_RsltR createSloRecvIf_Upd03_RsltR(){
			return mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo.data_lno</td></tr>
		 * 	<tr><td><br></td><td>slo.data_no</td></tr>
		 * 	<tr><td><br></td><td>slo.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>slo.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_DtlR> up0() {
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
		 * @see mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_RsltR
		 */
		public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd03_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * SloRecvIf_Upd04オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う。（受注登録サービスを呼び出す本処理）<br>
	 */
	abstract public class SloRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR> down0;
		
		
		// コンストラクタ
		protected SloRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR.class);

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
			invoke((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SloRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR createSloRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR.create();
		}

		/**
		 * SloRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR> createSloRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo.data_lno</td></tr>
		 * 	<tr><td><br></td><td>slo.data_no</td></tr>
		 * 	<tr><td><br></td><td>slo.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>slo.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo.data_lno</td></tr>
		 * 	<tr><td><br></td><td>slo.data_no</td></tr>
		 * 	<tr><td><br></td><td>slo.exe_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * SloRecvIf_Chk01オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class SloRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> down4;
		
		
		// コンストラクタ
		protected SloRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
			down3 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.class);
			down4 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);

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
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * SloRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR createSloRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR.create();
		}

		/**
		 * SloRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR> createSloRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR.class);
		}

		/**
		 * SloRecvIf_Chk01_Slo_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR createSloRecvIf_Chk01_Slo_Upd01_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.create();
		}

		/**
		 * SloRecvIf_Chk01_Slo_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> createSloRecvIf_Chk01_Slo_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
		}

		/**
		 * SloRecvIf_Chk01_Slo_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR createSloRecvIf_Chk01_Slo_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.create();
		}

		/**
		 * SloRecvIf_Chk01_Slo_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> createSloRecvIf_Chk01_Slo_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
		}

		/**
		 * SloRecvIf_Chk01_Slo_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR createSloRecvIf_Chk01_Slo_Del01_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.create();
		}

		/**
		 * SloRecvIf_Chk01_Slo_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR> createSloRecvIf_Chk01_Slo_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.class);
		}

		/**
		 * SloRecvIf_Chk01_Slo_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR createSloRecvIf_Chk01_Slo_Del01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.create();
		}

		/**
		 * SloRecvIf_Chk01_Slo_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> createSloRecvIf_Chk01_Slo_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo.data_lno</td></tr>
		 * 	<tr><td><br></td><td>slo.data_no</td></tr>
		 * 	<tr><td><br></td><td>slo.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slo.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>slo.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>slo.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>slo.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>slo.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>slo.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>slo.po_dt</td></tr>
		 * 	<tr><td><br></td><td>slo.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>slo.sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.slo_typ</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>slo.tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>slo.pri_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>slo.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>slo.tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>slo.tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>slo.tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>slo.tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>slo.tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>slo.tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>slo.trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>slo.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>slo.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>slo.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo.cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.sno1</td></tr>
		 * 	<tr><td><br></td><td>slo.sno2</td></tr>
		 * 	<tr><td><br></td><td>slo.sno3</td></tr>
		 * 	<tr><td><br></td><td>slo.sno4</td></tr>
		 * 	<tr><td><br></td><td>slo.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>slo.inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>slo.tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.tax_rate</td></tr>
		 * 	<tr><td><br></td><td>slo.tax_typ</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>slo.dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.ship_wh_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>slo.ver_no</td></tr>
		 * 	<tr><td><br></td><td>slo.lot_no</td></tr>
		 * 	<tr><td><br></td><td>slo.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>slo.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>slo.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>slo.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo.cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo.upri_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.amt_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.tax_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>slo.edi_sub_d_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo.data_lno</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5120.SloRecvIf_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_back_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_num_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno_num_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_d_can_rmkrs</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>org_ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_SloRecvIfService)MSLAL_SloRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}