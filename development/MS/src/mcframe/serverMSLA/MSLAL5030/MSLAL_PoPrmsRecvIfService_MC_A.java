package mcframe.serverMSLA.MSLAL5030;

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
 * "MSLAL_PoPrmsRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_PoPrmsRecvIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Chk01 aPoPrmsRecvIf_Chk01;

	protected void initPoPrmsRecvIf_Chk01() {
		this.info = PDef.MS_MSLAL5030_PoPrmsRecvIf_Chk01_INFO;
		this.aPoPrmsRecvIf_Chk01 = ((MSLAL_PoPrmsRecvIfService)this).new PoPrmsRecvIf_Chk01();
	}

	public static MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Chk01 crtPoPrmsRecvIf_Chk01() {
		MSLAL_PoPrmsRecvIfService lgc = new MSLAL_PoPrmsRecvIfService();
		lgc.initPoPrmsRecvIf_Chk01();
		return lgc.aPoPrmsRecvIf_Chk01;
	}

	protected void paramPoPrmsRecvIf_Chk01(MCParam p) {
		if (this.aPoPrmsRecvIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoPrmsRecvIf_Chk01.up0());
		p.addDownBlock(aPoPrmsRecvIf_Chk01.down0());
		p.addDownBlock(aPoPrmsRecvIf_Chk01.down1());
		p.addDownBlock(aPoPrmsRecvIf_Chk01.down2());
	}

	protected void doPoPrmsRecvIf_Chk01() {
		aPoPrmsRecvIf_Chk01.call();
	};

	/**
	 * PoPrmsRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR createPoPrmsRecvIf_Chk01_DtlR(){
		return mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.create();
	}

	/**
	 * PoPrmsRecvIf_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> createPoPrmsRecvIf_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.class);
	}

	/**
	 * PrmsRecvIf_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk02_HdrR createPrmsRecvIf_Chk01_HdrR(){
		return mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.create();
	}

	/**
	 * PrmsRecvIf_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> createPrmsRecvIf_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
	}

	/**
	 * PrmsRecvIf_Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0120.Chk02_DtlR createPrmsRecvIf_Chk01_Dtl2R(){
		return mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.create();
	}

	/**
	 * PrmsRecvIf_Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> createPrmsRecvIf_Chk01_Dtl2L(){
		return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);
	}
	protected MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd01 aPoPrmsRecvIf_Upd01;

	protected void initPoPrmsRecvIf_Upd01() {
		this.info = PDef.MS_MSLAL5030_PoPrmsRecvIf_Upd01_INFO;
		this.aPoPrmsRecvIf_Upd01 = ((MSLAL_PoPrmsRecvIfService)this).new PoPrmsRecvIf_Upd01();
	}

	public static MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd01 crtPoPrmsRecvIf_Upd01() {
		MSLAL_PoPrmsRecvIfService lgc = new MSLAL_PoPrmsRecvIfService();
		lgc.initPoPrmsRecvIf_Upd01();
		return lgc.aPoPrmsRecvIf_Upd01;
	}

	protected void paramPoPrmsRecvIf_Upd01(MCParam p) {
		if (this.aPoPrmsRecvIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoPrmsRecvIf_Upd01.up0());
	}

	protected void doPoPrmsRecvIf_Upd01() {
		aPoPrmsRecvIf_Upd01.call();
	};

	/**
	 * PoPrmsRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createPoPrmsRecvIf_Upd01_DtlR(){
		return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
	}

	/**
	 * PoPrmsRecvIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createPoPrmsRecvIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.class);
	}
	protected MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd02 aPoPrmsRecvIf_Upd02;

	protected void initPoPrmsRecvIf_Upd02() {
		this.info = PDef.MS_MSLAL5030_PoPrmsRecvIf_Upd02_INFO;
		this.aPoPrmsRecvIf_Upd02 = ((MSLAL_PoPrmsRecvIfService)this).new PoPrmsRecvIf_Upd02();
	}

	public static MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd02 crtPoPrmsRecvIf_Upd02() {
		MSLAL_PoPrmsRecvIfService lgc = new MSLAL_PoPrmsRecvIfService();
		lgc.initPoPrmsRecvIf_Upd02();
		return lgc.aPoPrmsRecvIf_Upd02;
	}

	protected void paramPoPrmsRecvIf_Upd02(MCParam p) {
		if (this.aPoPrmsRecvIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoPrmsRecvIf_Upd02.up0());
		p.addUpBlock(aPoPrmsRecvIf_Upd02.up1());
		p.addDownBlock(aPoPrmsRecvIf_Upd02.down0());
	}

	protected void doPoPrmsRecvIf_Upd02() {
		aPoPrmsRecvIf_Upd02.call();
	};

	/**
	 * PoPrmsRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createPoPrmsRecvIf_Upd02_DtlR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
	}

	/**
	 * PoPrmsRecvIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createPoPrmsRecvIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
	}

	/**
	 * PoPrmsRecvIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createPoPrmsRecvIf_Upd02_CndR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
	}

	/**
	 * PoPrmsRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createPoPrmsRecvIf_Upd02_RsltR(){
		return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR.create();
	}
	protected MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03 aPoPrmsRecvIf_Upd03;

	protected void initPoPrmsRecvIf_Upd03() {
		this.info = PDef.MS_MSLAL5030_PoPrmsRecvIf_Upd03_INFO;
		this.aPoPrmsRecvIf_Upd03 = ((MSLAL_PoPrmsRecvIfService)this).new PoPrmsRecvIf_Upd03();
	}

	public static MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03 crtPoPrmsRecvIf_Upd03() {
		MSLAL_PoPrmsRecvIfService lgc = new MSLAL_PoPrmsRecvIfService();
		lgc.initPoPrmsRecvIf_Upd03();
		return lgc.aPoPrmsRecvIf_Upd03;
	}

	protected void paramPoPrmsRecvIf_Upd03(MCParam p) {
		if (this.aPoPrmsRecvIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoPrmsRecvIf_Upd03.up0());
		p.addDownBlock(aPoPrmsRecvIf_Upd03.down0());
	}

	protected void doPoPrmsRecvIf_Upd03() {
		aPoPrmsRecvIf_Upd03.call();
	};

	/**
	 * PoPrmsRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR createPoPrmsRecvIf_Upd03_DtlR(){
		return mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR.create();
	}

	/**
	 * PoPrmsRecvIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR> createPoPrmsRecvIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR.class);
	}

	/**
	 * PoPrmsRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_RsltR createPoPrmsRecvIf_Upd03_RsltR(){
		return mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_RsltR.create();
	}
	protected MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd04 aPoPrmsRecvIf_Upd04;

	protected void initPoPrmsRecvIf_Upd04() {
		this.info = PDef.MS_MSLAL5030_PoPrmsRecvIf_Upd04_INFO;
		this.aPoPrmsRecvIf_Upd04 = ((MSLAL_PoPrmsRecvIfService)this).new PoPrmsRecvIf_Upd04();
	}

	public static MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd04 crtPoPrmsRecvIf_Upd04() {
		MSLAL_PoPrmsRecvIfService lgc = new MSLAL_PoPrmsRecvIfService();
		lgc.initPoPrmsRecvIf_Upd04();
		return lgc.aPoPrmsRecvIf_Upd04;
	}

	protected void paramPoPrmsRecvIf_Upd04(MCParam p) {
		if (this.aPoPrmsRecvIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoPrmsRecvIf_Upd04.up0());
		p.addDownBlock(aPoPrmsRecvIf_Upd04.down0());
	}

	protected void doPoPrmsRecvIf_Upd04() {
		aPoPrmsRecvIf_Upd04.call();
	};

	/**
	 * PoPrmsRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR createPoPrmsRecvIf_Upd04_DtlR(){
		return mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.create();
	}

	/**
	 * PoPrmsRecvIf_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> createPoPrmsRecvIf_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PoPrmsRecvIf_Chk01オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う前のチェック処理<br>
	 */
	abstract public class PoPrmsRecvIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoPrmsRecvIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> down2;
		
		
		// コンストラクタ
		protected PoPrmsRecvIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);

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
			invoke((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * PoPrmsRecvIf_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR createPoPrmsRecvIf_Chk01_DtlR(){
			return mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.create();
		}

		/**
		 * PoPrmsRecvIf_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> createPoPrmsRecvIf_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.class);
		}

		/**
		 * PrmsRecvIf_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk02_HdrR createPrmsRecvIf_Chk01_HdrR(){
			return mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.create();
		}

		/**
		 * PrmsRecvIf_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> createPrmsRecvIf_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_HdrR.class);
		}

		/**
		 * PrmsRecvIf_Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0120.Chk02_DtlR createPrmsRecvIf_Chk01_Dtl2R(){
			return mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.create();
		}

		/**
		 * PrmsRecvIf_Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> createPrmsRecvIf_Chk01_Dtl2L(){
			return MCList.create(mcframe.serverMSBD.MSBDL0120.Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms.data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.data_no</td></tr>
		 * 	<tr><td><br></td><td>prms.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>prms.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>prms.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>prms.po_no</td></tr>
		 * 	<tr><td><br></td><td>prms.po_rev</td></tr>
		 * 	<tr><td><br></td><td>prms.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>prms.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>prms.prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>prms.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>prms.log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms.data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.data_no</td></tr>
		 * 	<tr><td><br></td><td>prms.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>prms.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>prms.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>prms.po_no</td></tr>
		 * 	<tr><td><br></td><td>prms.po_rev</td></tr>
		 * 	<tr><td><br></td><td>prms.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>prms.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>prms.prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>prms.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>prms.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> down0() {
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_HdrR> down1() {
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
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0120.Chk02_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * PoPrmsRecvIf_Upd01オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	abstract public class PoPrmsRecvIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverPFUD.PFUDL0040.IfPFUDL_ESBRecvIf_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoPrmsRecvIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected PoPrmsRecvIf_Upd01() {
			
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
			invoke((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PoPrmsRecvIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL0040.Upd01_DtlR createPoPrmsRecvIf_Upd01_DtlR(){
			return mcframe.serverPFUD.PFUDL0040.Upd01_DtlR.create();
		}

		/**
		 * PoPrmsRecvIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> createPoPrmsRecvIf_Upd01_DtlL(){
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
			return ((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * PoPrmsRecvIf_Upd02オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う。（ＩＦデータ確認、および納期回答受信ＩＦ取込バッチから呼び出される）<br>
	 */
	abstract public class PoPrmsRecvIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMBBE.MBBEL5010.IfMBBEL_IfDataImpService_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoPrmsRecvIf_Upd02";

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
		protected PoPrmsRecvIf_Upd02() {
			
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
			invoke((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoPrmsRecvIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR createPoPrmsRecvIf_Upd02_DtlR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.create();
		}

		/**
		 * PoPrmsRecvIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR> createPoPrmsRecvIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR.class);
		}

		/**
		 * PoPrmsRecvIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR createPoPrmsRecvIf_Upd02_CndR(){
			return mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_CndR.create();
		}

		/**
		 * PoPrmsRecvIf_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_RsltR createPoPrmsRecvIf_Upd02_RsltR(){
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
			return ((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * PoPrmsRecvIf_Upd03オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	abstract public class PoPrmsRecvIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoPrmsRecvIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_RsltR down0;
		
		
		// コンストラクタ
		protected PoPrmsRecvIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR.class);
			down0 = mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_RsltR.create();

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
			invoke((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoPrmsRecvIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR createPoPrmsRecvIf_Upd03_DtlR(){
			return mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR.create();
		}

		/**
		 * PoPrmsRecvIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR> createPoPrmsRecvIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR.class);
		}

		/**
		 * PoPrmsRecvIf_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_RsltR createPoPrmsRecvIf_Upd03_RsltR(){
			return mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms.data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.data_no</td></tr>
		 * 	<tr><td><br></td><td>prms.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>prms.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.po_no</td></tr>
		 * 	<tr><td><br></td><td>prms.po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_DtlR> up0() {
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
		 * @see mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_RsltR
		 */
		public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Upd03_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this).info;
		}


	}
	/**
	 * PoPrmsRecvIf_Upd04オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う。<br>
	 */
	abstract public class PoPrmsRecvIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoPrmsRecvIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected PoPrmsRecvIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.class);

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
			invoke((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PoPrmsRecvIf_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR createPoPrmsRecvIf_Upd04_DtlR(){
			return mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.create();
		}

		/**
		 * PoPrmsRecvIf_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> createPoPrmsRecvIf_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms.data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.data_no</td></tr>
		 * 	<tr><td><br></td><td>prms.ext_data_no</td></tr>
		 * 	<tr><td><br></td><td>prms.ext_data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>prms.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>prms.po_no</td></tr>
		 * 	<tr><td><br></td><td>prms.po_rev</td></tr>
		 * 	<tr><td><br></td><td>prms.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>prms.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>prms.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>prms.prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>prms.prms_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char11</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char12</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char13</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char14</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char15</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char16</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char17</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char18</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char19</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char20</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char21</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char22</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char23</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char24</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char25</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char26</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char27</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char28</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char29</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_char30</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_num5</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>prms.sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>prms.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>prms.log_sub_key2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prms.data_lno</td></tr>
		 * 	<tr><td><br></td><td>prms.exe_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>prms.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>prms.log_sub_key1</td></tr>
		 * 	<tr><td><br></td><td>prms.log_sub_key2</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5030.PoPrmsRecvIf_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_PoPrmsRecvIfService)MSLAL_PoPrmsRecvIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}