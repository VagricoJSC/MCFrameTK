package mcframe.serverMSLA.MSLAL6020;

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
 * "MSLAL_ShipActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_ShipActRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL6020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd01 aShipActRecvIf_Upd01;

	protected void initShipActRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL6020_ShipActRecvIf_Upd01_INFO;
		this.aShipActRecvIf_Upd01 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Upd01();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd01 crtShipActRecvIf_Upd01() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Upd01();
		return lgc.aShipActRecvIf_Upd01;
	}

	protected void paramShipActRecvIf_Upd01(MCParam p) {
		if (this.aShipActRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Upd01.up0());
	}

	protected void doShipActRecvIf_Upd01() {
		aShipActRecvIf_Upd01.call();
	};

	/**
	 * ShipActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createShipActRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * ShipActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createShipActRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd02 aShipActRecvIf_Upd02;

	protected void initShipActRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL6020_ShipActRecvIf_Upd02_INFO;
		this.aShipActRecvIf_Upd02 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Upd02();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd02 crtShipActRecvIf_Upd02() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Upd02();
		return lgc.aShipActRecvIf_Upd02;
	}

	protected void paramShipActRecvIf_Upd02(MCParam p) {
		if (this.aShipActRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Upd02.up0());
		p.addUpBlock(aShipActRecvIf_Upd02.up1());
		p.addDownBlock(aShipActRecvIf_Upd02.down0());
	}

	protected void doShipActRecvIf_Upd02() {
		aShipActRecvIf_Upd02.call();
	};

	/**
	 * ShipActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createShipActRecvIf_Upd01_DtlR_0(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * ShipActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createShipActRecvIf_Upd01_DtlL_0(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * ShipActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createShipActRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * ShipActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createShipActRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03 aShipActRecvIf_Upd03;

	protected void initShipActRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL6020_ShipActRecvIf_Upd03_INFO;
		this.aShipActRecvIf_Upd03 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Upd03();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03 crtShipActRecvIf_Upd03() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Upd03();
		return lgc.aShipActRecvIf_Upd03;
	}

	protected void paramShipActRecvIf_Upd03(MCParam p) {
		if (this.aShipActRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Upd03.up0());
		p.addUpBlock(aShipActRecvIf_Upd03.up1());
		p.addDownBlock(aShipActRecvIf_Upd03.down0());
	}

	protected void doShipActRecvIf_Upd03() {
		aShipActRecvIf_Upd03.call();
	};

	/**
	 * ShipActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR createShipActRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR.create();
	}

	/**
	 * ShipActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR> createShipActRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR.class);
	}

	/**
	 * ShipActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createShipActRecvIf_Upd03_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * ShipActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createShipActRecvIf_Upd03_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd04 aShipActRecvIf_Upd04;

	protected void initShipActRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL6020_ShipActRecvIf_Upd04_INFO;
		this.aShipActRecvIf_Upd04 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Upd04();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd04 crtShipActRecvIf_Upd04() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Upd04();
		return lgc.aShipActRecvIf_Upd04;
	}

	protected void paramShipActRecvIf_Upd04(MCParam p) {
		if (this.aShipActRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Upd04.up0());
		p.addUpBlock(aShipActRecvIf_Upd04.up1());
		p.addDownBlock(aShipActRecvIf_Upd04.down0());
	}

	protected void doShipActRecvIf_Upd04() {
		aShipActRecvIf_Upd04.call();
	};

	/**
	 * ShipActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR createShipActRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR.create();
	}

	/**
	 * ShipActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR> createShipActRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR.class);
	}

	/**
	 * ShipActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createShipActRecvIf_Upd04_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}
	protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Chk01 aShipActRecvIf_Chk01;

	protected void initShipActRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL6020_ShipActRecvIf_Chk01_INFO;
		this.aShipActRecvIf_Chk01 = ((MSLAL_ShipActRecvIfService)this).new ShipActRecvIf_Chk01();
	}

	public static MSLAL_ShipActRecvIfService.ShipActRecvIf_Chk01 crtShipActRecvIf_Chk01() {
		MSLAL_ShipActRecvIfService lgc = new MSLAL_ShipActRecvIfService();
		lgc.initShipActRecvIf_Chk01();
		return lgc.aShipActRecvIf_Chk01;
	}

	protected void paramShipActRecvIf_Chk01(MCParam p) {
		if (this.aShipActRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipActRecvIf_Chk01.up0());
		p.addUpBlock(aShipActRecvIf_Chk01.up1());
		p.addDownBlock(aShipActRecvIf_Chk01.down0());
		p.addDownBlock(aShipActRecvIf_Chk01.down1());
		p.addDownBlock(aShipActRecvIf_Chk01.down2());
		p.addDownBlock(aShipActRecvIf_Chk01.down3());
		p.addDownBlock(aShipActRecvIf_Chk01.down4());
	}

	protected void doShipActRecvIf_Chk01() {
		aShipActRecvIf_Chk01.call();
	};

	/**
	 * ShipActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR createShipActRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR.create();
	}

	/**
	 * ShipActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR> createShipActRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR.class);
	}

	/**
	 * ShipActRecvIf_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createShipActRecvIf_Chk01_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * ShipActRecvIf_Chk01_Ctrl_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR createShipActRecvIf_Chk01_Ctrl_RsltR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
	}

	/**
	 * ShipActRecvIf_Chk01_Hdr_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR createShipActRecvIf_Chk01_Hdr_RsltR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.create();
	}

	/**
	 * ShipActRecvIf_Chk01_Hdr_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> createShipActRecvIf_Chk01_Hdr_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
	}

	/**
	 * ShipActRecvIf_Chk01_Dtl_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR createShipActRecvIf_Chk01_Dtl_RsltR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.create();
	}

	/**
	 * ShipActRecvIf_Chk01_Dtl_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> createShipActRecvIf_Chk01_Dtl_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
	}

	/**
	 * ShipActRecvIf_Chk01_Cntr_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR createShipActRecvIf_Chk01_Cntr_RsltR(){
		return mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.create();
	}

	/**
	 * ShipActRecvIf_Chk01_Cntr_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> createShipActRecvIf_Chk01_Cntr_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipActRecvIf_Upd01オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class ShipActRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipActRecvIf_Upd01() {
			
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
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createShipActRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * ShipActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createShipActRecvIf_Upd01_DtlL(){
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
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ShipActRecvIf_Upd02オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（ＩＦデータ確認、および出荷実績受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class ShipActRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Upd02";

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
		protected ShipActRecvIf_Upd02() {
			
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
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipActRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createShipActRecvIf_Upd01_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * ShipActRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createShipActRecvIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * ShipActRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createShipActRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * ShipActRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createShipActRecvIf_Upd02_RsltR(){
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
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ShipActRecvIf_Upd03オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class ShipActRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR down0;
		
		
		// コンストラクタ
		protected ShipActRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR.class);
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
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipActRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR createShipActRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR.create();
		}

		/**
		 * ShipActRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR> createShipActRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR.class);
		}

		/**
		 * ShipActRecvIf_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createShipActRecvIf_Upd03_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * ShipActRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createShipActRecvIf_Upd03_RsltR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>sa.data_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>sa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd03_DtlR> up0() {
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
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ShipActRecvIf_Upd04オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（出荷実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	abstract public class ShipActRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipActRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR.class);

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
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipActRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR createShipActRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR.create();
		}

		/**
		 * ShipActRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR> createShipActRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR.class);
		}

		/**
		 * ShipActRecvIf_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createShipActRecvIf_Upd04_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>sa.data_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>sa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>sa.data_no</td></tr>
		 * 	<tr><td><br></td><td>sa.exe_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Upd04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * ShipActRecvIf_Chk01オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class ShipActRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipActRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> down4;
		
		
		// コンストラクタ
		protected ShipActRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR.class);
			up1 = mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR.class);
			down1 = mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
			down4 = MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);

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
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * ShipActRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR createShipActRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR.create();
		}

		/**
		 * ShipActRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR> createShipActRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR.class);
		}

		/**
		 * ShipActRecvIf_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createShipActRecvIf_Chk01_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * ShipActRecvIf_Chk01_Ctrl_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR createShipActRecvIf_Chk01_Ctrl_RsltR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR.create();
		}

		/**
		 * ShipActRecvIf_Chk01_Hdr_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR createShipActRecvIf_Chk01_Hdr_RsltR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.create();
		}

		/**
		 * ShipActRecvIf_Chk01_Hdr_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> createShipActRecvIf_Chk01_Hdr_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR.class);
		}

		/**
		 * ShipActRecvIf_Chk01_Dtl_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR createShipActRecvIf_Chk01_Dtl_RsltR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.create();
		}

		/**
		 * ShipActRecvIf_Chk01_Dtl_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> createShipActRecvIf_Chk01_Dtl_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR.class);
		}

		/**
		 * ShipActRecvIf_Chk01_Cntr_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR createShipActRecvIf_Chk01_Cntr_RsltR(){
			return mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.create();
		}

		/**
		 * ShipActRecvIf_Chk01_Cntr_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> createShipActRecvIf_Chk01_Cntr_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>sa.data_no</td></tr>
		 * 	<tr><td><br></td><td>sa.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>sa.data_make_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.imp_flg</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.site_co_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_tm</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>sa.pri_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sa.iv_no</td></tr>
		 * 	<tr><td><br></td><td>sa.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sa.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ext_ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>sa.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>sa.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sa.if_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sa.lot_no</td></tr>
		 * 	<tr><td><br></td><td>sa.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sa.sno1</td></tr>
		 * 	<tr><td><br></td><td>sa.sno2</td></tr>
		 * 	<tr><td><br></td><td>sa.sno3</td></tr>
		 * 	<tr><td><br></td><td>sa.sno4</td></tr>
		 * 	<tr><td><br></td><td>sa.ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sa.ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sa.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sa.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>sa.cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>sa.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sa.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>sa.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sa.intr_d_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>sa.data_lno</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL6020.ShipActRecvIf_Chk01_DtlR> down0() {
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
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5630.ShipActIF_CtrlR down1() {
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
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_HdrR> down2() {
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
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_DtlR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5630.ShipActIF_CntrR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_ShipActRecvIfService)MSLAL_ShipActRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}