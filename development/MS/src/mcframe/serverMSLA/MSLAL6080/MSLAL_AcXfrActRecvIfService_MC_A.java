package mcframe.serverMSLA.MSLAL6080;

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
 * "MSLAL_AcXfrActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_AcXfrActRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL6080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd01 aAcXfrActRecvIf_Upd01;

	protected void initAcXfrActRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL6080_AcXfrActRecvIf_Upd01_INFO;
		this.aAcXfrActRecvIf_Upd01 = ((MSLAL_AcXfrActRecvIfService)this).new AcXfrActRecvIf_Upd01();
	}

	public static MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd01 crtAcXfrActRecvIf_Upd01() {
		MSLAL_AcXfrActRecvIfService lgc = new MSLAL_AcXfrActRecvIfService();
		lgc.initAcXfrActRecvIf_Upd01();
		return lgc.aAcXfrActRecvIf_Upd01;
	}

	protected void paramAcXfrActRecvIf_Upd01(MCParam p) {
		if (this.aAcXfrActRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcXfrActRecvIf_Upd01.up0());
	}

	protected void doAcXfrActRecvIf_Upd01() {
		aAcXfrActRecvIf_Upd01.call();
	};

	/**
	 * AcXfrActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createAcXfrActRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * AcXfrActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createAcXfrActRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd02 aAcXfrActRecvIf_Upd02;

	protected void initAcXfrActRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL6080_AcXfrActRecvIf_Upd02_INFO;
		this.aAcXfrActRecvIf_Upd02 = ((MSLAL_AcXfrActRecvIfService)this).new AcXfrActRecvIf_Upd02();
	}

	public static MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd02 crtAcXfrActRecvIf_Upd02() {
		MSLAL_AcXfrActRecvIfService lgc = new MSLAL_AcXfrActRecvIfService();
		lgc.initAcXfrActRecvIf_Upd02();
		return lgc.aAcXfrActRecvIf_Upd02;
	}

	protected void paramAcXfrActRecvIf_Upd02(MCParam p) {
		if (this.aAcXfrActRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcXfrActRecvIf_Upd02.up0());
		p.addUpBlock(aAcXfrActRecvIf_Upd02.up1());
		p.addDownBlock(aAcXfrActRecvIf_Upd02.down0());
	}

	protected void doAcXfrActRecvIf_Upd02() {
		aAcXfrActRecvIf_Upd02.call();
	};

	/**
	 * AcXfrActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createAcXfrActRecvIf_Upd01_DtlR_0(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * AcXfrActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createAcXfrActRecvIf_Upd01_DtlL_0(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * AcXfrActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAcXfrActRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * AcXfrActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createAcXfrActRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd03 aAcXfrActRecvIf_Upd03;

	protected void initAcXfrActRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL6080_AcXfrActRecvIf_Upd03_INFO;
		this.aAcXfrActRecvIf_Upd03 = ((MSLAL_AcXfrActRecvIfService)this).new AcXfrActRecvIf_Upd03();
	}

	public static MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd03 crtAcXfrActRecvIf_Upd03() {
		MSLAL_AcXfrActRecvIfService lgc = new MSLAL_AcXfrActRecvIfService();
		lgc.initAcXfrActRecvIf_Upd03();
		return lgc.aAcXfrActRecvIf_Upd03;
	}

	protected void paramAcXfrActRecvIf_Upd03(MCParam p) {
		if (this.aAcXfrActRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcXfrActRecvIf_Upd03.up0());
		p.addUpBlock(aAcXfrActRecvIf_Upd03.up1());
		p.addDownBlock(aAcXfrActRecvIf_Upd03.down0());
	}

	protected void doAcXfrActRecvIf_Upd03() {
		aAcXfrActRecvIf_Upd03.call();
	};

	/**
	 * AcXfrActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR createAcXfrActRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR.create();
	}

	/**
	 * AcXfrActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR> createAcXfrActRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR.class);
	}

	/**
	 * AcXfrActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAcXfrActRecvIf_Upd03_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * AcXfrActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createAcXfrActRecvIf_Upd03_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd04 aAcXfrActRecvIf_Upd04;

	protected void initAcXfrActRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL6080_AcXfrActRecvIf_Upd04_INFO;
		this.aAcXfrActRecvIf_Upd04 = ((MSLAL_AcXfrActRecvIfService)this).new AcXfrActRecvIf_Upd04();
	}

	public static MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd04 crtAcXfrActRecvIf_Upd04() {
		MSLAL_AcXfrActRecvIfService lgc = new MSLAL_AcXfrActRecvIfService();
		lgc.initAcXfrActRecvIf_Upd04();
		return lgc.aAcXfrActRecvIf_Upd04;
	}

	protected void paramAcXfrActRecvIf_Upd04(MCParam p) {
		if (this.aAcXfrActRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcXfrActRecvIf_Upd04.up0());
		p.addUpBlock(aAcXfrActRecvIf_Upd04.up1());
		p.addDownBlock(aAcXfrActRecvIf_Upd04.down0());
	}

	protected void doAcXfrActRecvIf_Upd04() {
		aAcXfrActRecvIf_Upd04.call();
	};

	/**
	 * AcXfrActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR createAcXfrActRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR.create();
	}

	/**
	 * AcXfrActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR> createAcXfrActRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR.class);
	}

	/**
	 * AcXfrActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAcXfrActRecvIf_Upd04_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}
	protected MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Chk01 aAcXfrActRecvIf_Chk01;

	protected void initAcXfrActRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL6080_AcXfrActRecvIf_Chk01_INFO;
		this.aAcXfrActRecvIf_Chk01 = ((MSLAL_AcXfrActRecvIfService)this).new AcXfrActRecvIf_Chk01();
	}

	public static MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Chk01 crtAcXfrActRecvIf_Chk01() {
		MSLAL_AcXfrActRecvIfService lgc = new MSLAL_AcXfrActRecvIfService();
		lgc.initAcXfrActRecvIf_Chk01();
		return lgc.aAcXfrActRecvIf_Chk01;
	}

	protected void paramAcXfrActRecvIf_Chk01(MCParam p) {
		if (this.aAcXfrActRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcXfrActRecvIf_Chk01.up0());
		p.addUpBlock(aAcXfrActRecvIf_Chk01.up1());
		p.addDownBlock(aAcXfrActRecvIf_Chk01.down0());
		p.addDownBlock(aAcXfrActRecvIf_Chk01.down1());
		p.addDownBlock(aAcXfrActRecvIf_Chk01.down2());
		p.addDownBlock(aAcXfrActRecvIf_Chk01.down3());
	}

	protected void doAcXfrActRecvIf_Chk01() {
		aAcXfrActRecvIf_Chk01.call();
	};

	/**
	 * AcXfrActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR createAcXfrActRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR.create();
	}

	/**
	 * AcXfrActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR> createAcXfrActRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR.class);
	}

	/**
	 * AcXfrActRecvIf_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAcXfrActRecvIf_Chk01_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * AcXfrActRecvIf_Chk01_Ctrl_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6410.AcXfrActIF_CtrlR createAcXfrActRecvIf_Chk01_Ctrl_RsltR(){
		return mcframe.serverMSBE.MSBEL6410.AcXfrActIF_CtrlR.create();
	}

	/**
	 * AcXfrActRecvIf_Chk01_Hdr_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR createAcXfrActRecvIf_Chk01_Hdr_RsltR(){
		return mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR.create();
	}

	/**
	 * AcXfrActRecvIf_Chk01_Hdr_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR> createAcXfrActRecvIf_Chk01_Hdr_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR.class);
	}

	/**
	 * AcXfrActRecvIf_Chk01_Dtl_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR createAcXfrActRecvIf_Chk01_Dtl_RsltR(){
		return mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR.create();
	}

	/**
	 * AcXfrActRecvIf_Chk01_Dtl_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR> createAcXfrActRecvIf_Chk01_Dtl_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AcXfrActRecvIf_Upd01オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class AcXfrActRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcXfrActRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected AcXfrActRecvIf_Upd01() {
			
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
			invoke((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AcXfrActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createAcXfrActRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * AcXfrActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createAcXfrActRecvIf_Upd01_DtlL(){
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
			return ((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * AcXfrActRecvIf_Upd02オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う。（ＩＦデータ確認、および他勘定振替実績受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class AcXfrActRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcXfrActRecvIf_Upd02";

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
		protected AcXfrActRecvIf_Upd02() {
			
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
			invoke((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AcXfrActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createAcXfrActRecvIf_Upd01_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * AcXfrActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createAcXfrActRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * AcXfrActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAcXfrActRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * AcXfrActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createAcXfrActRecvIf_Upd02_RsltR(){
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
			return ((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * AcXfrActRecvIf_Upd03オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class AcXfrActRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcXfrActRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected AcXfrActRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR.class);
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
			invoke((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AcXfrActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR createAcXfrActRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR.create();
		}

		/**
		 * AcXfrActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR> createAcXfrActRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR.class);
		}

		/**
		 * AcXfrActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAcXfrActRecvIf_Upd03_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * AcXfrActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createAcXfrActRecvIf_Upd03_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>axa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>axa.data_no</td></tr>
		 * 	<tr><td><br></td><td>axa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>axa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>axa.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.acxfr_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd03_DtlR> up0() {
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
			return ((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * AcXfrActRecvIf_Upd04オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う。（他勘定振替実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	abstract public class AcXfrActRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcXfrActRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR> down0;
		
		
		// コンストラクタ
		protected AcXfrActRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR.class);

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
			invoke((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * AcXfrActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR createAcXfrActRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR.create();
		}

		/**
		 * AcXfrActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR> createAcXfrActRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR.class);
		}

		/**
		 * AcXfrActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAcXfrActRecvIf_Upd04_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>axa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>axa.data_no</td></tr>
		 * 	<tr><td><br></td><td>axa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>axa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>axa.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.acxfr_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>axa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>axa.data_no</td></tr>
		 * 	<tr><td><br></td><td>axa.exe_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Upd04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * AcXfrActRecvIf_Chk01オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class AcXfrActRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcXfrActRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL6410.AcXfrActIF_CtrlR down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR> down3;
		
		
		// コンストラクタ
		protected AcXfrActRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR.class);
			down1 = mcframe.serverMSBE.MSBEL6410.AcXfrActIF_CtrlR.create();
			down2 = MCList.create(mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR.class);

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
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * AcXfrActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR createAcXfrActRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR.create();
		}

		/**
		 * AcXfrActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR> createAcXfrActRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR.class);
		}

		/**
		 * AcXfrActRecvIf_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createAcXfrActRecvIf_Chk01_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * AcXfrActRecvIf_Chk01_Ctrl_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6410.AcXfrActIF_CtrlR createAcXfrActRecvIf_Chk01_Ctrl_RsltR(){
			return mcframe.serverMSBE.MSBEL6410.AcXfrActIF_CtrlR.create();
		}

		/**
		 * AcXfrActRecvIf_Chk01_Hdr_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR createAcXfrActRecvIf_Chk01_Hdr_RsltR(){
			return mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR.create();
		}

		/**
		 * AcXfrActRecvIf_Chk01_Hdr_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR> createAcXfrActRecvIf_Chk01_Hdr_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR.class);
		}

		/**
		 * AcXfrActRecvIf_Chk01_Dtl_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR createAcXfrActRecvIf_Chk01_Dtl_RsltR(){
			return mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR.create();
		}

		/**
		 * AcXfrActRecvIf_Chk01_Dtl_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR> createAcXfrActRecvIf_Chk01_Dtl_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>axa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>axa.data_no</td></tr>
		 * 	<tr><td><br></td><td>axa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>axa.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>axa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>axa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>axa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>axa.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>axa.recv_dt</td></tr>
		 * 	<tr><td><br></td><td>axa.ext_acxfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>axa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>axa.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.site_co_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>axa.acxfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>axa.acxfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>axa.acxfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>axa.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>axa.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>axa.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>axa.lot_no</td></tr>
		 * 	<tr><td><br></td><td>axa.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>axa.sno1</td></tr>
		 * 	<tr><td><br></td><td>axa.sno2</td></tr>
		 * 	<tr><td><br></td><td>axa.sno3</td></tr>
		 * 	<tr><td><br></td><td>axa.sno4</td></tr>
		 * 	<tr><td><br></td><td>axa.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>axa.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>axa.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>axa.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>axa.fix_no</td></tr>
		 * 	<tr><td><br></td><td>axa.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>axa.bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>axa.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>axa.intr_d_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
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
		 * 	<tr><td><br></td><td>axa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6080.AcXfrActRecvIf_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL6410.AcXfrActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL6410.AcXfrActIF_CtrlR down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>acxfr_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6410.AcXfrActIF_HdrR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dspsl_no</td></tr>
		 * 	<tr><td><br></td><td>acxfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>acxfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>vmi_interim_flg</td></tr>
		 * 	<tr><td><br></td><td>vmi_upri</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6410.AcXfrActIF_DtlR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_AcXfrActRecvIfService)MSLAL_AcXfrActRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}