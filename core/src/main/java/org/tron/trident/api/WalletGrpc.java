package org.tron.trident.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.1)",
    comments = "Source: api/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "protocol.Wallet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction,
      org.tron.trident.proto.Response.TransactionReturn> getBroadcastTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastTransaction",
      requestType = org.tron.trident.proto.Chain.Transaction.class,
      responseType = org.tron.trident.proto.Response.TransactionReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction,
      org.tron.trident.proto.Response.TransactionReturn> getBroadcastTransactionMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction, org.tron.trident.proto.Response.TransactionReturn> getBroadcastTransactionMethod;
    if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getBroadcastTransactionMethod = WalletGrpc.getBroadcastTransactionMethod) == null) {
          WalletGrpc.getBroadcastTransactionMethod = getBroadcastTransactionMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Chain.Transaction, org.tron.trident.proto.Response.TransactionReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionReturn.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("BroadcastTransaction"))
              .build();
        }
      }
    }
    return getBroadcastTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.CreateSmartContract,
      org.tron.trident.proto.Response.TransactionExtention> getDeployContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployContract",
      requestType = org.tron.trident.proto.Contract.CreateSmartContract.class,
      responseType = org.tron.trident.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.CreateSmartContract,
      org.tron.trident.proto.Response.TransactionExtention> getDeployContractMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.CreateSmartContract, org.tron.trident.proto.Response.TransactionExtention> getDeployContractMethod;
    if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDeployContractMethod = WalletGrpc.getDeployContractMethod) == null) {
          WalletGrpc.getDeployContractMethod = getDeployContractMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Contract.CreateSmartContract, org.tron.trident.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Contract.CreateSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DeployContract"))
              .build();
        }
      }
    }
    return getDeployContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract,
      org.tron.trident.proto.Response.TransactionExtention> getTriggerContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerContract",
      requestType = org.tron.trident.proto.Contract.TriggerSmartContract.class,
      responseType = org.tron.trident.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract,
      org.tron.trident.proto.Response.TransactionExtention> getTriggerContractMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract, org.tron.trident.proto.Response.TransactionExtention> getTriggerContractMethod;
    if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerContractMethod = WalletGrpc.getTriggerContractMethod) == null) {
          WalletGrpc.getTriggerContractMethod = getTriggerContractMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Contract.TriggerSmartContract, org.tron.trident.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerContract"))
              .build();
        }
      }
    }
    return getTriggerContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract,
      org.tron.trident.proto.Response.TransactionExtention> getTriggerConstantContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerConstantContract",
      requestType = org.tron.trident.proto.Contract.TriggerSmartContract.class,
      responseType = org.tron.trident.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract,
      org.tron.trident.proto.Response.TransactionExtention> getTriggerConstantContractMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract, org.tron.trident.proto.Response.TransactionExtention> getTriggerConstantContractMethod;
    if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTriggerConstantContractMethod = WalletGrpc.getTriggerConstantContractMethod) == null) {
          WalletGrpc.getTriggerConstantContractMethod = getTriggerConstantContractMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Contract.TriggerSmartContract, org.tron.trident.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerConstantContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TriggerConstantContract"))
              .build();
        }
      }
    }
    return getTriggerConstantContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract,
      org.tron.trident.proto.Response.EstimateEnergyMessage> getEstimateEnergyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateEnergy",
      requestType = org.tron.trident.proto.Contract.TriggerSmartContract.class,
      responseType = org.tron.trident.proto.Response.EstimateEnergyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract,
      org.tron.trident.proto.Response.EstimateEnergyMessage> getEstimateEnergyMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.TriggerSmartContract, org.tron.trident.proto.Response.EstimateEnergyMessage> getEstimateEnergyMethod;
    if ((getEstimateEnergyMethod = WalletGrpc.getEstimateEnergyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEstimateEnergyMethod = WalletGrpc.getEstimateEnergyMethod) == null) {
          WalletGrpc.getEstimateEnergyMethod = getEstimateEnergyMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Contract.TriggerSmartContract, org.tron.trident.proto.Response.EstimateEnergyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateEnergy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Contract.TriggerSmartContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.EstimateEnergyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EstimateEnergy"))
              .build();
        }
      }
    }
    return getEstimateEnergyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.NodeInfo> getGetNodeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNodeInfo",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.NodeInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.NodeInfo> getGetNodeInfoMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.NodeInfo> getGetNodeInfoMethod;
    if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNodeInfoMethod = WalletGrpc.getGetNodeInfoMethod) == null) {
          WalletGrpc.getGetNodeInfoMethod = getGetNodeInfoMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.NodeInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.NodeInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNodeInfo"))
              .build();
        }
      }
    }
    return getGetNodeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.NodeList> getListNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNodes",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.NodeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.NodeList> getListNodesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.NodeList> getListNodesMethod;
    if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListNodesMethod = WalletGrpc.getListNodesMethod) == null) {
          WalletGrpc.getListNodesMethod = getListNodesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.NodeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.NodeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListNodes"))
              .build();
        }
      }
    }
    return getListNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.ChainParameters> getGetChainParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChainParameters",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.ChainParameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.ChainParameters> getGetChainParametersMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.ChainParameters> getGetChainParametersMethod;
    if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetChainParametersMethod = WalletGrpc.getGetChainParametersMethod) == null) {
          WalletGrpc.getGetChainParametersMethod = getGetChainParametersMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.ChainParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetChainParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.ChainParameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetChainParameters"))
              .build();
        }
      }
    }
    return getGetChainParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getTotalTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalTransaction",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getTotalTransactionMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage> getTotalTransactionMethod;
    if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getTotalTransactionMethod = WalletGrpc.getTotalTransactionMethod) == null) {
          WalletGrpc.getTotalTransactionMethod = getTotalTransactionMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("TotalTransaction"))
              .build();
        }
      }
    }
    return getTotalTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextMaintenanceTime",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage> getGetNextMaintenanceTimeMethod;
    if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNextMaintenanceTimeMethod = WalletGrpc.getGetNextMaintenanceTimeMethod) == null) {
          WalletGrpc.getGetNextMaintenanceTimeMethod = getGetNextMaintenanceTimeMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextMaintenanceTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNextMaintenanceTime"))
              .build();
        }
      }
    }
    return getGetNextMaintenanceTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction,
      org.tron.trident.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSignWeight",
      requestType = org.tron.trident.proto.Chain.Transaction.class,
      responseType = org.tron.trident.proto.Response.TransactionSignWeight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction,
      org.tron.trident.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction, org.tron.trident.proto.Response.TransactionSignWeight> getGetTransactionSignWeightMethod;
    if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignWeightMethod = WalletGrpc.getGetTransactionSignWeightMethod) == null) {
          WalletGrpc.getGetTransactionSignWeightMethod = getGetTransactionSignWeightMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Chain.Transaction, org.tron.trident.proto.Response.TransactionSignWeight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSignWeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionSignWeight.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSignWeight"))
              .build();
        }
      }
    }
    return getGetTransactionSignWeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction,
      org.tron.trident.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionApprovedList",
      requestType = org.tron.trident.proto.Chain.Transaction.class,
      responseType = org.tron.trident.proto.Response.TransactionApprovedList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction,
      org.tron.trident.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Chain.Transaction, org.tron.trident.proto.Response.TransactionApprovedList> getGetTransactionApprovedListMethod;
    if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionApprovedListMethod = WalletGrpc.getGetTransactionApprovedListMethod) == null) {
          WalletGrpc.getGetTransactionApprovedListMethod = getGetTransactionApprovedListMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Chain.Transaction, org.tron.trident.proto.Response.TransactionApprovedList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionApprovedList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionApprovedList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionApprovedList"))
              .build();
        }
      }
    }
    return getGetTransactionApprovedListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      org.tron.trident.proto.Response.Account> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = GrpcAPI.AccountAddressMessage.class,
      responseType = org.tron.trident.proto.Response.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      org.tron.trident.proto.Response.Account> getGetAccountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage, org.tron.trident.proto.Response.Account> getGetAccountMethod;
    if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountMethod = WalletGrpc.getGetAccountMethod) == null) {
          WalletGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountAddressMessage, org.tron.trident.proto.Response.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountIdMessage,
      org.tron.trident.proto.Response.Account> getGetAccountByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountById",
      requestType = GrpcAPI.AccountIdMessage.class,
      responseType = org.tron.trident.proto.Response.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountIdMessage,
      org.tron.trident.proto.Response.Account> getGetAccountByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountIdMessage, org.tron.trident.proto.Response.Account> getGetAccountByIdMethod;
    if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountByIdMethod = WalletGrpc.getGetAccountByIdMethod) == null) {
          WalletGrpc.getGetAccountByIdMethod = getGetAccountByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountIdMessage, org.tron.trident.proto.Response.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountIdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.Account.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountById"))
              .build();
        }
      }
    }
    return getGetAccountByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      org.tron.trident.proto.Response.AccountNetMessage> getGetAccountNetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountNet",
      requestType = GrpcAPI.AccountAddressMessage.class,
      responseType = org.tron.trident.proto.Response.AccountNetMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      org.tron.trident.proto.Response.AccountNetMessage> getGetAccountNetMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage, org.tron.trident.proto.Response.AccountNetMessage> getGetAccountNetMethod;
    if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountNetMethod = WalletGrpc.getGetAccountNetMethod) == null) {
          WalletGrpc.getGetAccountNetMethod = getGetAccountNetMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountAddressMessage, org.tron.trident.proto.Response.AccountNetMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountNet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.AccountNetMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountNet"))
              .build();
        }
      }
    }
    return getGetAccountNetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      org.tron.trident.proto.Response.AccountResourceMessage> getGetAccountResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountResource",
      requestType = GrpcAPI.AccountAddressMessage.class,
      responseType = org.tron.trident.proto.Response.AccountResourceMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      org.tron.trident.proto.Response.AccountResourceMessage> getGetAccountResourceMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage, org.tron.trident.proto.Response.AccountResourceMessage> getGetAccountResourceMethod;
    if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAccountResourceMethod = WalletGrpc.getGetAccountResourceMethod) == null) {
          WalletGrpc.getGetAccountResourceMethod = getGetAccountResourceMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountAddressMessage, org.tron.trident.proto.Response.AccountResourceMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.AccountResourceMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAccountResource"))
              .build();
        }
      }
    }
    return getGetAccountResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByAccount",
      requestType = GrpcAPI.AccountAddressMessage.class,
      responseType = org.tron.trident.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage,
      org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.AccountAddressMessage, org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueByAccountMethod;
    if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByAccountMethod = WalletGrpc.getGetAssetIssueByAccountMethod) == null) {
          WalletGrpc.getGetAssetIssueByAccountMethod = getGetAssetIssueByAccountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.AccountAddressMessage, org.tron.trident.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.AccountAddressMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByAccount"))
              .build();
        }
      }
    }
    return getGetAssetIssueByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueByName",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Contract.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Contract.AssetIssueContract> getGetAssetIssueByNameMethod;
    if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByNameMethod = WalletGrpc.getGetAssetIssueByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueByNameMethod = getGetAssetIssueByNameMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Contract.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueListByName",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueListByNameMethod;
    if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListByNameMethod = WalletGrpc.getGetAssetIssueListByNameMethod) == null) {
          WalletGrpc.getGetAssetIssueListByNameMethod = getGetAssetIssueListByNameMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueListByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueListByName"))
              .build();
        }
      }
    }
    return getGetAssetIssueListByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Contract.AssetIssueContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Contract.AssetIssueContract> getGetAssetIssueByIdMethod;
    if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueByIdMethod = WalletGrpc.getGetAssetIssueByIdMethod) == null) {
          WalletGrpc.getGetAssetIssueByIdMethod = getGetAssetIssueByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Contract.AssetIssueContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Contract.AssetIssueContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueById"))
              .build();
        }
      }
    }
    return getGetAssetIssueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetIssueList",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.AssetIssueList> getGetAssetIssueListMethod;
    if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAssetIssueListMethod = WalletGrpc.getGetAssetIssueListMethod) == null) {
          WalletGrpc.getGetAssetIssueListMethod = getGetAssetIssueListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAssetIssueList"))
              .build();
        }
      }
    }
    return getGetAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      org.tron.trident.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedAssetIssueList",
      requestType = GrpcAPI.PaginatedMessage.class,
      responseType = org.tron.trident.proto.Response.AssetIssueList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      org.tron.trident.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage, org.tron.trident.proto.Response.AssetIssueList> getGetPaginatedAssetIssueListMethod;
    if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedAssetIssueListMethod = WalletGrpc.getGetPaginatedAssetIssueListMethod) == null) {
          WalletGrpc.getGetPaginatedAssetIssueListMethod = getGetPaginatedAssetIssueListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PaginatedMessage, org.tron.trident.proto.Response.AssetIssueList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedAssetIssueList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.AssetIssueList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedAssetIssueList"))
              .build();
        }
      }
    }
    return getGetPaginatedAssetIssueListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Chain.Block> getGetNowBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Chain.Block> getGetNowBlockMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Chain.Block> getGetNowBlockMethod;
    if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlockMethod = WalletGrpc.getGetNowBlockMethod) == null) {
          WalletGrpc.getGetNowBlockMethod = getGetNowBlockMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock"))
              .build();
        }
      }
    }
    return getGetNowBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.BlockExtention> getGetNowBlock2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNowBlock2",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.BlockExtention> getGetNowBlock2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.BlockExtention> getGetNowBlock2Method;
    if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNowBlock2Method = WalletGrpc.getGetNowBlock2Method) == null) {
          WalletGrpc.getGetNowBlock2Method = getGetNowBlock2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNowBlock2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNowBlock2"))
              .build();
        }
      }
    }
    return getGetNowBlock2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Chain.Block> getGetBlockByNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = org.tron.trident.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Chain.Block> getGetBlockByNumMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, org.tron.trident.proto.Chain.Block> getGetBlockByNumMethod;
    if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNumMethod = WalletGrpc.getGetBlockByNumMethod) == null) {
          WalletGrpc.getGetBlockByNumMethod = getGetBlockByNumMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, org.tron.trident.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum"))
              .build();
        }
      }
    }
    return getGetBlockByNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Response.BlockExtention> getGetBlockByNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByNum2",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = org.tron.trident.proto.Response.BlockExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Response.BlockExtention> getGetBlockByNum2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, org.tron.trident.proto.Response.BlockExtention> getGetBlockByNum2Method;
    if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByNum2Method = WalletGrpc.getGetBlockByNum2Method) == null) {
          WalletGrpc.getGetBlockByNum2Method = getGetBlockByNum2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, org.tron.trident.proto.Response.BlockExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.BlockExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByNum2"))
              .build();
        }
      }
    }
    return getGetBlockByNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Chain.Block> getGetBlockByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Chain.Block.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Chain.Block> getGetBlockByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Chain.Block> getGetBlockByIdMethod;
    if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByIdMethod = WalletGrpc.getGetBlockByIdMethod) == null) {
          WalletGrpc.getGetBlockByIdMethod = getGetBlockByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Chain.Block>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Block.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockById"))
              .build();
        }
      }
    }
    return getGetBlockByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BlockLimit,
      org.tron.trident.proto.Response.BlockList> getGetBlockByLimitNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext",
      requestType = GrpcAPI.BlockLimit.class,
      responseType = org.tron.trident.proto.Response.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BlockLimit,
      org.tron.trident.proto.Response.BlockList> getGetBlockByLimitNextMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BlockLimit, org.tron.trident.proto.Response.BlockList> getGetBlockByLimitNextMethod;
    if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNextMethod = WalletGrpc.getGetBlockByLimitNextMethod) == null) {
          WalletGrpc.getGetBlockByLimitNextMethod = getGetBlockByLimitNextMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BlockLimit, org.tron.trident.proto.Response.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BlockLimit,
      org.tron.trident.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLimitNext2",
      requestType = GrpcAPI.BlockLimit.class,
      responseType = org.tron.trident.proto.Response.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BlockLimit,
      org.tron.trident.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.BlockLimit, org.tron.trident.proto.Response.BlockListExtention> getGetBlockByLimitNext2Method;
    if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLimitNext2Method = WalletGrpc.getGetBlockByLimitNext2Method) == null) {
          WalletGrpc.getGetBlockByLimitNext2Method = getGetBlockByLimitNext2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.BlockLimit, org.tron.trident.proto.Response.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLimitNext2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BlockLimit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLimitNext2"))
              .build();
        }
      }
    }
    return getGetBlockByLimitNext2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Response.BlockList> getGetBlockByLatestNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = org.tron.trident.proto.Response.BlockList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Response.BlockList> getGetBlockByLatestNumMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, org.tron.trident.proto.Response.BlockList> getGetBlockByLatestNumMethod;
    if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNumMethod = WalletGrpc.getGetBlockByLatestNumMethod) == null) {
          WalletGrpc.getGetBlockByLatestNumMethod = getGetBlockByLatestNumMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, org.tron.trident.proto.Response.BlockList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.BlockList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockByLatestNum2",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = org.tron.trident.proto.Response.BlockListExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, org.tron.trident.proto.Response.BlockListExtention> getGetBlockByLatestNum2Method;
    if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockByLatestNum2Method = WalletGrpc.getGetBlockByLatestNum2Method) == null) {
          WalletGrpc.getGetBlockByLatestNum2Method = getGetBlockByLatestNum2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, org.tron.trident.proto.Response.BlockListExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockByLatestNum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.BlockListExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockByLatestNum2"))
              .build();
        }
      }
    }
    return getGetBlockByLatestNum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionCountByBlockNum",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, GrpcAPI.NumberMessage> getGetTransactionCountByBlockNumMethod;
    if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionCountByBlockNumMethod = WalletGrpc.getGetTransactionCountByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionCountByBlockNumMethod = getGetTransactionCountByBlockNumMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionCountByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionCountByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionCountByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Chain.Transaction> getGetTransactionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Chain.Transaction> getGetTransactionByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Chain.Transaction> getGetTransactionByIdMethod;
    if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionByIdMethod = WalletGrpc.getGetTransactionByIdMethod) == null) {
          WalletGrpc.getGetTransactionByIdMethod = getGetTransactionByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionById"))
              .build();
        }
      }
    }
    return getGetTransactionByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.TransactionInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.TransactionInfo> getGetTransactionInfoByIdMethod;
    if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByIdMethod = WalletGrpc.getGetTransactionInfoByIdMethod) == null) {
          WalletGrpc.getGetTransactionInfoByIdMethod = getGetTransactionInfoByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.TransactionInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoById"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionInfoByBlockNum",
      requestType = GrpcAPI.NumberMessage.class,
      responseType = org.tron.trident.proto.Response.TransactionInfoList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NumberMessage,
      org.tron.trident.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NumberMessage, org.tron.trident.proto.Response.TransactionInfoList> getGetTransactionInfoByBlockNumMethod;
    if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionInfoByBlockNumMethod = WalletGrpc.getGetTransactionInfoByBlockNumMethod) == null) {
          WalletGrpc.getGetTransactionInfoByBlockNumMethod = getGetTransactionInfoByBlockNumMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NumberMessage, org.tron.trident.proto.Response.TransactionInfoList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionInfoByBlockNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionInfoList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionInfoByBlockNum"))
              .build();
        }
      }
    }
    return getGetTransactionInfoByBlockNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Common.SmartContract> getGetContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContract",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Common.SmartContract.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Common.SmartContract> getGetContractMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Common.SmartContract> getGetContractMethod;
    if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractMethod = WalletGrpc.getGetContractMethod) == null) {
          WalletGrpc.getGetContractMethod = getGetContractMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Common.SmartContract>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Common.SmartContract.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContract"))
              .build();
        }
      }
    }
    return getGetContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContractInfo",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.SmartContractDataWrapper.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.SmartContractDataWrapper> getGetContractInfoMethod;
    if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetContractInfoMethod = WalletGrpc.getGetContractInfoMethod) == null) {
          WalletGrpc.getGetContractInfoMethod = getGetContractInfoMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.SmartContractDataWrapper>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.SmartContractDataWrapper.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetContractInfo"))
              .build();
        }
      }
    }
    return getGetContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.WitnessList> getListWitnessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWitnesses",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.WitnessList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.WitnessList> getListWitnessesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.WitnessList> getListWitnessesMethod;
    if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListWitnessesMethod = WalletGrpc.getListWitnessesMethod) == null) {
          WalletGrpc.getListWitnessesMethod = getListWitnessesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.WitnessList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWitnesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.WitnessList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListWitnesses"))
              .build();
        }
      }
    }
    return getListWitnessesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBrokerageInfo",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.NumberMessage> getGetBrokerageInfoMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.NumberMessage> getGetBrokerageInfoMethod;
    if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBrokerageInfoMethod = WalletGrpc.getGetBrokerageInfoMethod) == null) {
          WalletGrpc.getGetBrokerageInfoMethod = getGetBrokerageInfoMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBrokerageInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBrokerageInfo"))
              .build();
        }
      }
    }
    return getGetBrokerageInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.NumberMessage> getGetRewardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRewardInfo",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.NumberMessage> getGetRewardInfoMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.NumberMessage> getGetRewardInfoMethod;
    if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRewardInfoMethod = WalletGrpc.getGetRewardInfoMethod) == null) {
          WalletGrpc.getGetRewardInfoMethod = getGetRewardInfoMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRewardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRewardInfo"))
              .build();
        }
      }
    }
    return getGetRewardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Response.DelegatedResourceMessage,
      org.tron.trident.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResource",
      requestType = org.tron.trident.proto.Response.DelegatedResourceMessage.class,
      responseType = org.tron.trident.proto.Response.DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Response.DelegatedResourceMessage,
      org.tron.trident.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Response.DelegatedResourceMessage, org.tron.trident.proto.Response.DelegatedResourceList> getGetDelegatedResourceMethod;
    if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceMethod = WalletGrpc.getGetDelegatedResourceMethod) == null) {
          WalletGrpc.getGetDelegatedResourceMethod = getGetDelegatedResourceMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Response.DelegatedResourceMessage, org.tron.trident.proto.Response.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResource"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndex",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexMethod;
    if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexMethod = WalletGrpc.getGetDelegatedResourceAccountIndexMethod) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexMethod = getGetDelegatedResourceAccountIndexMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndex"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceAccountIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.ProposalList> getListProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProposals",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.ProposalList> getListProposalsMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.ProposalList> getListProposalsMethod;
    if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListProposalsMethod = WalletGrpc.getListProposalsMethod) == null) {
          WalletGrpc.getListProposalsMethod = getListProposalsMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListProposals"))
              .build();
        }
      }
    }
    return getListProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.Proposal> getGetProposalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposalById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.Proposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.Proposal> getGetProposalByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.Proposal> getGetProposalByIdMethod;
    if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetProposalByIdMethod = WalletGrpc.getGetProposalByIdMethod) == null) {
          WalletGrpc.getGetProposalByIdMethod = getGetProposalByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.Proposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.Proposal.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetProposalById"))
              .build();
        }
      }
    }
    return getGetProposalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      org.tron.trident.proto.Response.ProposalList> getGetPaginatedProposalListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedProposalList",
      requestType = GrpcAPI.PaginatedMessage.class,
      responseType = org.tron.trident.proto.Response.ProposalList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      org.tron.trident.proto.Response.ProposalList> getGetPaginatedProposalListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage, org.tron.trident.proto.Response.ProposalList> getGetPaginatedProposalListMethod;
    if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedProposalListMethod = WalletGrpc.getGetPaginatedProposalListMethod) == null) {
          WalletGrpc.getGetPaginatedProposalListMethod = getGetPaginatedProposalListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PaginatedMessage, org.tron.trident.proto.Response.ProposalList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedProposalList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.ProposalList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedProposalList"))
              .build();
        }
      }
    }
    return getGetPaginatedProposalListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.ExchangeList> getListExchangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExchanges",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.ExchangeList> getListExchangesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.ExchangeList> getListExchangesMethod;
    if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListExchangesMethod = WalletGrpc.getListExchangesMethod) == null) {
          WalletGrpc.getListExchangesMethod = getListExchangesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExchanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListExchanges"))
              .build();
        }
      }
    }
    return getListExchangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.Exchange> getGetExchangeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExchangeById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.Exchange.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.Exchange> getGetExchangeByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.Exchange> getGetExchangeByIdMethod;
    if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExchangeByIdMethod = WalletGrpc.getGetExchangeByIdMethod) == null) {
          WalletGrpc.getGetExchangeByIdMethod = getGetExchangeByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.Exchange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExchangeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.Exchange.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExchangeById"))
              .build();
        }
      }
    }
    return getGetExchangeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      org.tron.trident.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPaginatedExchangeList",
      requestType = GrpcAPI.PaginatedMessage.class,
      responseType = org.tron.trident.proto.Response.ExchangeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage,
      org.tron.trident.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PaginatedMessage, org.tron.trident.proto.Response.ExchangeList> getGetPaginatedExchangeListMethod;
    if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPaginatedExchangeListMethod = WalletGrpc.getGetPaginatedExchangeListMethod) == null) {
          WalletGrpc.getGetPaginatedExchangeListMethod = getGetPaginatedExchangeListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PaginatedMessage, org.tron.trident.proto.Response.ExchangeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPaginatedExchangeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PaginatedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.ExchangeList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPaginatedExchangeList"))
              .build();
        }
      }
    }
    return getGetPaginatedExchangeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.IvkDecryptTRC20Parameters,
      org.tron.trident.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByIvk",
      requestType = GrpcAPI.IvkDecryptTRC20Parameters.class,
      responseType = org.tron.trident.proto.Response.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.IvkDecryptTRC20Parameters,
      org.tron.trident.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.IvkDecryptTRC20Parameters, org.tron.trident.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByIvkMethod;
    if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByIvkMethod = WalletGrpc.getScanShieldedTRC20NotesByIvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByIvkMethod = getScanShieldedTRC20NotesByIvkMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.IvkDecryptTRC20Parameters, org.tron.trident.proto.Response.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByIvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.IvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByIvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByIvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.OvkDecryptTRC20Parameters,
      org.tron.trident.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanShieldedTRC20NotesByOvk",
      requestType = GrpcAPI.OvkDecryptTRC20Parameters.class,
      responseType = org.tron.trident.proto.Response.DecryptNotesTRC20.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.OvkDecryptTRC20Parameters,
      org.tron.trident.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.OvkDecryptTRC20Parameters, org.tron.trident.proto.Response.DecryptNotesTRC20> getScanShieldedTRC20NotesByOvkMethod;
    if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getScanShieldedTRC20NotesByOvkMethod = WalletGrpc.getScanShieldedTRC20NotesByOvkMethod) == null) {
          WalletGrpc.getScanShieldedTRC20NotesByOvkMethod = getScanShieldedTRC20NotesByOvkMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.OvkDecryptTRC20Parameters, org.tron.trident.proto.Response.DecryptNotesTRC20>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanShieldedTRC20NotesByOvk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.OvkDecryptTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.DecryptNotesTRC20.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ScanShieldedTRC20NotesByOvk"))
              .build();
        }
      }
    }
    return getScanShieldedTRC20NotesByOvkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.NfTRC20Parameters,
      org.tron.trident.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsShieldedTRC20ContractNoteSpent",
      requestType = GrpcAPI.NfTRC20Parameters.class,
      responseType = org.tron.trident.proto.Response.NullifierResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.NfTRC20Parameters,
      org.tron.trident.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.NfTRC20Parameters, org.tron.trident.proto.Response.NullifierResult> getIsShieldedTRC20ContractNoteSpentMethod;
    if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIsShieldedTRC20ContractNoteSpentMethod = WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod) == null) {
          WalletGrpc.getIsShieldedTRC20ContractNoteSpentMethod = getIsShieldedTRC20ContractNoteSpentMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.NfTRC20Parameters, org.tron.trident.proto.Response.NullifierResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsShieldedTRC20ContractNoteSpent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NfTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.NullifierResult.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IsShieldedTRC20ContractNoteSpent"))
              .build();
        }
      }
    }
    return getIsShieldedTRC20ContractNoteSpentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderByAccount",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.MarketOrderList> getGetMarketOrderByAccountMethod;
    if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByAccountMethod = WalletGrpc.getGetMarketOrderByAccountMethod) == null) {
          WalletGrpc.getGetMarketOrderByAccountMethod = getGetMarketOrderByAccountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderByAccount"))
              .build();
        }
      }
    }
    return getGetMarketOrderByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.MarketOrder> getGetMarketOrderByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderById",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.MarketOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.MarketOrder> getGetMarketOrderByIdMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.MarketOrder> getGetMarketOrderByIdMethod;
    if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderByIdMethod = WalletGrpc.getGetMarketOrderByIdMethod) == null) {
          WalletGrpc.getGetMarketOrderByIdMethod = getGetMarketOrderByIdMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.MarketOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.MarketOrder.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderById"))
              .build();
        }
      }
    }
    return getGetMarketOrderByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Response.MarketOrderPair,
      org.tron.trident.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPriceByPair",
      requestType = org.tron.trident.proto.Response.MarketOrderPair.class,
      responseType = org.tron.trident.proto.Response.MarketPriceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Response.MarketOrderPair,
      org.tron.trident.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Response.MarketOrderPair, org.tron.trident.proto.Response.MarketPriceList> getGetMarketPriceByPairMethod;
    if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPriceByPairMethod = WalletGrpc.getGetMarketPriceByPairMethod) == null) {
          WalletGrpc.getGetMarketPriceByPairMethod = getGetMarketPriceByPairMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Response.MarketOrderPair, org.tron.trident.proto.Response.MarketPriceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPriceByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.MarketPriceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPriceByPair"))
              .build();
        }
      }
    }
    return getGetMarketPriceByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Response.MarketOrderPair,
      org.tron.trident.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketOrderListByPair",
      requestType = org.tron.trident.proto.Response.MarketOrderPair.class,
      responseType = org.tron.trident.proto.Response.MarketOrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Response.MarketOrderPair,
      org.tron.trident.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Response.MarketOrderPair, org.tron.trident.proto.Response.MarketOrderList> getGetMarketOrderListByPairMethod;
    if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketOrderListByPairMethod = WalletGrpc.getGetMarketOrderListByPairMethod) == null) {
          WalletGrpc.getGetMarketOrderListByPairMethod = getGetMarketOrderListByPairMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Response.MarketOrderPair, org.tron.trident.proto.Response.MarketOrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketOrderListByPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.MarketOrderPair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.MarketOrderList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketOrderListByPair"))
              .build();
        }
      }
    }
    return getGetMarketOrderListByPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.MarketOrderPairList> getGetMarketPairListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketPairList",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.MarketOrderPairList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.MarketOrderPairList> getGetMarketPairListMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.MarketOrderPairList> getGetMarketPairListMethod;
    if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMarketPairListMethod = WalletGrpc.getGetMarketPairListMethod) == null) {
          WalletGrpc.getGetMarketPairListMethod = getGetMarketPairListMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.MarketOrderPairList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketPairList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.MarketOrderPairList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMarketPairList"))
              .build();
        }
      }
    }
    return getGetMarketPairListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign,
      org.tron.trident.proto.Chain.Transaction> getGetTransactionSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign",
      requestType = org.tron.trident.proto.Response.TransactionSign.class,
      responseType = org.tron.trident.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign,
      org.tron.trident.proto.Chain.Transaction> getGetTransactionSignMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign, org.tron.trident.proto.Chain.Transaction> getGetTransactionSignMethod;
    if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSignMethod = WalletGrpc.getGetTransactionSignMethod) == null) {
          WalletGrpc.getGetTransactionSignMethod = getGetTransactionSignMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Response.TransactionSign, org.tron.trident.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign"))
              .build();
        }
      }
    }
    return getGetTransactionSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign,
      org.tron.trident.proto.Response.TransactionExtention> getGetTransactionSign2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionSign2",
      requestType = org.tron.trident.proto.Response.TransactionSign.class,
      responseType = org.tron.trident.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign,
      org.tron.trident.proto.Response.TransactionExtention> getGetTransactionSign2Method() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign, org.tron.trident.proto.Response.TransactionExtention> getGetTransactionSign2Method;
    if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionSign2Method = WalletGrpc.getGetTransactionSign2Method) == null) {
          WalletGrpc.getGetTransactionSign2Method = getGetTransactionSign2Method =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Response.TransactionSign, org.tron.trident.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionSign2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionSign2"))
              .build();
        }
      }
    }
    return getGetTransactionSign2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetMessage,
      org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAsset",
      requestType = GrpcAPI.EasyTransferAssetMessage.class,
      responseType = org.tron.trident.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetMessage,
      org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetMessage, org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferAssetMethod;
    if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetMethod = WalletGrpc.getEasyTransferAssetMethod) == null) {
          WalletGrpc.getEasyTransferAssetMethod = getEasyTransferAssetMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EasyTransferAssetMessage, org.tron.trident.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EasyTransferAssetMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAsset"))
              .build();
        }
      }
    }
    return getEasyTransferAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetByPrivateMessage,
      org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferAssetByPrivate",
      requestType = GrpcAPI.EasyTransferAssetByPrivateMessage.class,
      responseType = org.tron.trident.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetByPrivateMessage,
      org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EasyTransferAssetByPrivateMessage, org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferAssetByPrivateMethod;
    if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferAssetByPrivateMethod = WalletGrpc.getEasyTransferAssetByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferAssetByPrivateMethod = getEasyTransferAssetByPrivateMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EasyTransferAssetByPrivateMessage, org.tron.trident.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferAssetByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EasyTransferAssetByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferAssetByPrivate"))
              .build();
        }
      }
    }
    return getEasyTransferAssetByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EasyTransferMessage,
      org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransfer",
      requestType = GrpcAPI.EasyTransferMessage.class,
      responseType = org.tron.trident.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EasyTransferMessage,
      org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EasyTransferMessage, org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferMethod;
    if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferMethod = WalletGrpc.getEasyTransferMethod) == null) {
          WalletGrpc.getEasyTransferMethod = getEasyTransferMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EasyTransferMessage, org.tron.trident.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EasyTransferMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransfer"))
              .build();
        }
      }
    }
    return getEasyTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EasyTransferByPrivateMessage,
      org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EasyTransferByPrivate",
      requestType = GrpcAPI.EasyTransferByPrivateMessage.class,
      responseType = org.tron.trident.proto.Response.EasyTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EasyTransferByPrivateMessage,
      org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EasyTransferByPrivateMessage, org.tron.trident.proto.Response.EasyTransferResponse> getEasyTransferByPrivateMethod;
    if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getEasyTransferByPrivateMethod = WalletGrpc.getEasyTransferByPrivateMethod) == null) {
          WalletGrpc.getEasyTransferByPrivateMethod = getEasyTransferByPrivateMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EasyTransferByPrivateMessage, org.tron.trident.proto.Response.EasyTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EasyTransferByPrivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EasyTransferByPrivateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.EasyTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("EasyTransferByPrivate"))
              .build();
        }
      }
    }
    return getEasyTransferByPrivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getCreateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAddress",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getCreateAddressMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage> getCreateAddressMethod;
    if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateAddressMethod = WalletGrpc.getCreateAddressMethod) == null) {
          WalletGrpc.getCreateAddressMethod = getCreateAddressMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateAddress"))
              .build();
        }
      }
    }
    return getCreateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateAddress",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.AddressPrKeyPairMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.AddressPrKeyPairMessage> getGenerateAddressMethod;
    if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGenerateAddressMethod = WalletGrpc.getGenerateAddressMethod) == null) {
          WalletGrpc.getGenerateAddressMethod = getGenerateAddressMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.AddressPrKeyPairMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.AddressPrKeyPairMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GenerateAddress"))
              .build();
        }
      }
    }
    return getGenerateAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign,
      org.tron.trident.proto.Response.TransactionExtention> getAddSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSign",
      requestType = org.tron.trident.proto.Response.TransactionSign.class,
      responseType = org.tron.trident.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign,
      org.tron.trident.proto.Response.TransactionExtention> getAddSignMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Response.TransactionSign, org.tron.trident.proto.Response.TransactionExtention> getAddSignMethod;
    if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getAddSignMethod = WalletGrpc.getAddSignMethod) == null) {
          WalletGrpc.getAddSignMethod = getAddSignMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Response.TransactionSign, org.tron.trident.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionSign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("AddSign"))
              .build();
        }
      }
    }
    return getAddSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.BytesMessage> getGetSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpendingKey",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.BytesMessage> getGetSpendingKeyMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.BytesMessage> getGetSpendingKeyMethod;
    if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetSpendingKeyMethod = WalletGrpc.getGetSpendingKeyMethod) == null) {
          WalletGrpc.getGetSpendingKeyMethod = getGetSpendingKeyMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetSpendingKey"))
              .build();
        }
      }
    }
    return getGetSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExpandedSpendingKey",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.ExpandedSpendingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.ExpandedSpendingKeyMessage> getGetExpandedSpendingKeyMethod;
    if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetExpandedSpendingKeyMethod = WalletGrpc.getGetExpandedSpendingKeyMethod) == null) {
          WalletGrpc.getGetExpandedSpendingKeyMethod = getGetExpandedSpendingKeyMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.ExpandedSpendingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExpandedSpendingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ExpandedSpendingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetExpandedSpendingKey"))
              .build();
        }
      }
    }
    return getGetExpandedSpendingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getGetAkFromAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAkFromAsk",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getGetAkFromAskMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage> getGetAkFromAskMethod;
    if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAkFromAskMethod = WalletGrpc.getGetAkFromAskMethod) == null) {
          WalletGrpc.getGetAkFromAskMethod = getGetAkFromAskMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAkFromAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAkFromAsk"))
              .build();
        }
      }
    }
    return getGetAkFromAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getGetNkFromNskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNkFromNsk",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      GrpcAPI.BytesMessage> getGetNkFromNskMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage> getGetNkFromNskMethod;
    if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNkFromNskMethod = WalletGrpc.getGetNkFromNskMethod) == null) {
          WalletGrpc.getGetNkFromNskMethod = getGetNkFromNskMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNkFromNsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNkFromNsk"))
              .build();
        }
      }
    }
    return getGetNkFromNskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.ViewingKeyMessage,
      GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncomingViewingKey",
      requestType = GrpcAPI.ViewingKeyMessage.class,
      responseType = GrpcAPI.IncomingViewingKeyMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.ViewingKeyMessage,
      GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.ViewingKeyMessage, GrpcAPI.IncomingViewingKeyMessage> getGetIncomingViewingKeyMethod;
    if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetIncomingViewingKeyMethod = WalletGrpc.getGetIncomingViewingKeyMethod) == null) {
          WalletGrpc.getGetIncomingViewingKeyMethod = getGetIncomingViewingKeyMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.ViewingKeyMessage, GrpcAPI.IncomingViewingKeyMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIncomingViewingKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ViewingKeyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.IncomingViewingKeyMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetIncomingViewingKey"))
              .build();
        }
      }
    }
    return getGetIncomingViewingKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.DiversifierMessage> getGetDiversifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDiversifier",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.DiversifierMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.DiversifierMessage> getGetDiversifierMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.DiversifierMessage> getGetDiversifierMethod;
    if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDiversifierMethod = WalletGrpc.getGetDiversifierMethod) == null) {
          WalletGrpc.getGetDiversifierMethod = getGetDiversifierMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.DiversifierMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDiversifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.DiversifierMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDiversifier"))
              .build();
        }
      }
    }
    return getGetDiversifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.IncomingViewingKeyDiversifierMessage,
      GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZenPaymentAddress",
      requestType = GrpcAPI.IncomingViewingKeyDiversifierMessage.class,
      responseType = GrpcAPI.PaymentAddressMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.IncomingViewingKeyDiversifierMessage,
      GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.IncomingViewingKeyDiversifierMessage, GrpcAPI.PaymentAddressMessage> getGetZenPaymentAddressMethod;
    if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetZenPaymentAddressMethod = WalletGrpc.getGetZenPaymentAddressMethod) == null) {
          WalletGrpc.getGetZenPaymentAddressMethod = getGetZenPaymentAddressMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.IncomingViewingKeyDiversifierMessage, GrpcAPI.PaymentAddressMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZenPaymentAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.IncomingViewingKeyDiversifierMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PaymentAddressMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetZenPaymentAddress"))
              .build();
        }
      }
    }
    return getGetZenPaymentAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNewShieldedAddress",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.ShieldedAddressInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.ShieldedAddressInfo> getGetNewShieldedAddressMethod;
    if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetNewShieldedAddressMethod = WalletGrpc.getGetNewShieldedAddressMethod) == null) {
          WalletGrpc.getGetNewShieldedAddressMethod = getGetNewShieldedAddressMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.ShieldedAddressInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNewShieldedAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ShieldedAddressInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetNewShieldedAddress"))
              .build();
        }
      }
    }
    return getGetNewShieldedAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.BytesMessage> getGetRcmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRcm",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.BytesMessage> getGetRcmMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.BytesMessage> getGetRcmMethod;
    if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetRcmMethod = WalletGrpc.getGetRcmMethod) == null) {
          WalletGrpc.getGetRcmMethod = getGetRcmMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRcm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetRcm"))
              .build();
        }
      }
    }
    return getGetRcmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20Parameters,
      GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParameters",
      requestType = GrpcAPI.PrivateShieldedTRC20Parameters.class,
      responseType = GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20Parameters,
      GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20Parameters, GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersMethod;
    if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersMethod = WalletGrpc.getCreateShieldedContractParametersMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersMethod = getCreateShieldedContractParametersMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PrivateShieldedTRC20Parameters, GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PrivateShieldedTRC20Parameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParameters"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShieldedContractParametersWithoutAsk",
      requestType = GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.class,
      responseType = GrpcAPI.ShieldedTRC20Parameters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
      GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, GrpcAPI.ShieldedTRC20Parameters> getCreateShieldedContractParametersWithoutAskMethod;
    if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateShieldedContractParametersWithoutAskMethod = WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod) == null) {
          WalletGrpc.getCreateShieldedContractParametersWithoutAskMethod = getCreateShieldedContractParametersWithoutAskMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk, GrpcAPI.ShieldedTRC20Parameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShieldedContractParametersWithoutAsk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ShieldedTRC20Parameters.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateShieldedContractParametersWithoutAsk"))
              .build();
        }
      }
    }
    return getCreateShieldedContractParametersWithoutAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.ShieldedTRC20TriggerContractParameters,
      GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTriggerInputForShieldedTRC20Contract",
      requestType = GrpcAPI.ShieldedTRC20TriggerContractParameters.class,
      responseType = GrpcAPI.BytesMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.ShieldedTRC20TriggerContractParameters,
      GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.ShieldedTRC20TriggerContractParameters, GrpcAPI.BytesMessage> getGetTriggerInputForShieldedTRC20ContractMethod;
    if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTriggerInputForShieldedTRC20ContractMethod = WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod) == null) {
          WalletGrpc.getGetTriggerInputForShieldedTRC20ContractMethod = getGetTriggerInputForShieldedTRC20ContractMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.ShieldedTRC20TriggerContractParameters, GrpcAPI.BytesMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTriggerInputForShieldedTRC20Contract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.ShieldedTRC20TriggerContractParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTriggerInputForShieldedTRC20Contract"))
              .build();
        }
      }
    }
    return getGetTriggerInputForShieldedTRC20ContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
      GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableUnfreezeCount",
      requestType = GrpcAPI.GetAvailableUnfreezeCountRequestMessage.class,
      responseType = GrpcAPI.GetAvailableUnfreezeCountResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
      GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.GetAvailableUnfreezeCountRequestMessage, GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getGetAvailableUnfreezeCountMethod;
    if ((getGetAvailableUnfreezeCountMethod = WalletGrpc.getGetAvailableUnfreezeCountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetAvailableUnfreezeCountMethod = WalletGrpc.getGetAvailableUnfreezeCountMethod) == null) {
          WalletGrpc.getGetAvailableUnfreezeCountMethod = getGetAvailableUnfreezeCountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.GetAvailableUnfreezeCountRequestMessage, GrpcAPI.GetAvailableUnfreezeCountResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableUnfreezeCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.GetAvailableUnfreezeCountRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.GetAvailableUnfreezeCountResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetAvailableUnfreezeCount"))
              .build();
        }
      }
    }
    return getGetAvailableUnfreezeCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
      GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCanWithdrawUnfreezeAmount",
      requestType = GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage.class,
      responseType = GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
      GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage, GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getGetCanWithdrawUnfreezeAmountMethod;
    if ((getGetCanWithdrawUnfreezeAmountMethod = WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetCanWithdrawUnfreezeAmountMethod = WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod) == null) {
          WalletGrpc.getGetCanWithdrawUnfreezeAmountMethod = getGetCanWithdrawUnfreezeAmountMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage, GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanWithdrawUnfreezeAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetCanWithdrawUnfreezeAmount"))
              .build();
        }
      }
    }
    return getGetCanWithdrawUnfreezeAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.CanDelegatedMaxSizeRequestMessage,
      GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCanDelegatedMaxSize",
      requestType = GrpcAPI.CanDelegatedMaxSizeRequestMessage.class,
      responseType = GrpcAPI.CanDelegatedMaxSizeResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.CanDelegatedMaxSizeRequestMessage,
      GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.CanDelegatedMaxSizeRequestMessage, GrpcAPI.CanDelegatedMaxSizeResponseMessage> getGetCanDelegatedMaxSizeMethod;
    if ((getGetCanDelegatedMaxSizeMethod = WalletGrpc.getGetCanDelegatedMaxSizeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetCanDelegatedMaxSizeMethod = WalletGrpc.getGetCanDelegatedMaxSizeMethod) == null) {
          WalletGrpc.getGetCanDelegatedMaxSizeMethod = getGetCanDelegatedMaxSizeMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.CanDelegatedMaxSizeRequestMessage, GrpcAPI.CanDelegatedMaxSizeResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanDelegatedMaxSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.CanDelegatedMaxSizeRequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.CanDelegatedMaxSizeResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetCanDelegatedMaxSize"))
              .build();
        }
      }
    }
    return getGetCanDelegatedMaxSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Response.DelegatedResourceMessage,
      org.tron.trident.proto.Response.DelegatedResourceList> getGetDelegatedResourceV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceV2",
      requestType = org.tron.trident.proto.Response.DelegatedResourceMessage.class,
      responseType = org.tron.trident.proto.Response.DelegatedResourceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Response.DelegatedResourceMessage,
      org.tron.trident.proto.Response.DelegatedResourceList> getGetDelegatedResourceV2Method() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Response.DelegatedResourceMessage, org.tron.trident.proto.Response.DelegatedResourceList> getGetDelegatedResourceV2Method;
    if ((getGetDelegatedResourceV2Method = WalletGrpc.getGetDelegatedResourceV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceV2Method = WalletGrpc.getGetDelegatedResourceV2Method) == null) {
          WalletGrpc.getGetDelegatedResourceV2Method = getGetDelegatedResourceV2Method =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Response.DelegatedResourceMessage, org.tron.trident.proto.Response.DelegatedResourceList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.DelegatedResourceMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.DelegatedResourceList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceV2"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegatedResourceAccountIndexV2",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Response.DelegatedResourceAccountIndex.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.DelegatedResourceAccountIndex> getGetDelegatedResourceAccountIndexV2Method;
    if ((getGetDelegatedResourceAccountIndexV2Method = WalletGrpc.getGetDelegatedResourceAccountIndexV2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetDelegatedResourceAccountIndexV2Method = WalletGrpc.getGetDelegatedResourceAccountIndexV2Method) == null) {
          WalletGrpc.getGetDelegatedResourceAccountIndexV2Method = getGetDelegatedResourceAccountIndexV2Method =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Response.DelegatedResourceAccountIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegatedResourceAccountIndexV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.DelegatedResourceAccountIndex.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetDelegatedResourceAccountIndexV2"))
              .build();
        }
      }
    }
    return getGetDelegatedResourceAccountIndexV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetBurnTrxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBurnTrx",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetBurnTrxMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage> getGetBurnTrxMethod;
    if ((getGetBurnTrxMethod = WalletGrpc.getGetBurnTrxMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBurnTrxMethod = WalletGrpc.getGetBurnTrxMethod) == null) {
          WalletGrpc.getGetBurnTrxMethod = getGetBurnTrxMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBurnTrx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBurnTrx"))
              .build();
        }
      }
    }
    return getGetBurnTrxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Response.BlockIdentifier,
      org.tron.trident.proto.Response.BlockBalanceTrace> getGetBlockBalanceTraceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockBalanceTrace",
      requestType = org.tron.trident.proto.Response.BlockIdentifier.class,
      responseType = org.tron.trident.proto.Response.BlockBalanceTrace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Response.BlockIdentifier,
      org.tron.trident.proto.Response.BlockBalanceTrace> getGetBlockBalanceTraceMethod() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Response.BlockIdentifier, org.tron.trident.proto.Response.BlockBalanceTrace> getGetBlockBalanceTraceMethod;
    if ((getGetBlockBalanceTraceMethod = WalletGrpc.getGetBlockBalanceTraceMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBlockBalanceTraceMethod = WalletGrpc.getGetBlockBalanceTraceMethod) == null) {
          WalletGrpc.getGetBlockBalanceTraceMethod = getGetBlockBalanceTraceMethod =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Response.BlockIdentifier, org.tron.trident.proto.Response.BlockBalanceTrace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockBalanceTrace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.BlockIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.BlockBalanceTrace.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBlockBalanceTrace"))
              .build();
        }
      }
    }
    return getGetBlockBalanceTraceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.WitnessCreateContract,
      org.tron.trident.proto.Response.TransactionExtention> getCreateWitness2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWitness2",
      requestType = org.tron.trident.proto.Contract.WitnessCreateContract.class,
      responseType = org.tron.trident.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.WitnessCreateContract,
      org.tron.trident.proto.Response.TransactionExtention> getCreateWitness2Method() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.WitnessCreateContract, org.tron.trident.proto.Response.TransactionExtention> getCreateWitness2Method;
    if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getCreateWitness2Method = WalletGrpc.getCreateWitness2Method) == null) {
          WalletGrpc.getCreateWitness2Method = getCreateWitness2Method =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Contract.WitnessCreateContract, org.tron.trident.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWitness2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Contract.WitnessCreateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("CreateWitness2"))
              .build();
        }
      }
    }
    return getCreateWitness2Method;
  }

  private static volatile io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.WithdrawBalanceContract,
      org.tron.trident.proto.Response.TransactionExtention> getWithdrawBalance2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawBalance2",
      requestType = org.tron.trident.proto.Contract.WithdrawBalanceContract.class,
      responseType = org.tron.trident.proto.Response.TransactionExtention.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.WithdrawBalanceContract,
      org.tron.trident.proto.Response.TransactionExtention> getWithdrawBalance2Method() {
    io.grpc.MethodDescriptor<org.tron.trident.proto.Contract.WithdrawBalanceContract, org.tron.trident.proto.Response.TransactionExtention> getWithdrawBalance2Method;
    if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
      synchronized (WalletGrpc.class) {
        if ((getWithdrawBalance2Method = WalletGrpc.getWithdrawBalance2Method) == null) {
          WalletGrpc.getWithdrawBalance2Method = getWithdrawBalance2Method =
              io.grpc.MethodDescriptor.<org.tron.trident.proto.Contract.WithdrawBalanceContract, org.tron.trident.proto.Response.TransactionExtention>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawBalance2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Contract.WithdrawBalanceContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.TransactionExtention.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("WithdrawBalance2"))
              .build();
        }
      }
    }
    return getWithdrawBalance2Method;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionListFromPending",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.TransactionIdList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.TransactionIdList> getGetTransactionListFromPendingMethod;
    if ((getGetTransactionListFromPendingMethod = WalletGrpc.getGetTransactionListFromPendingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionListFromPendingMethod = WalletGrpc.getGetTransactionListFromPendingMethod) == null) {
          WalletGrpc.getGetTransactionListFromPendingMethod = getGetTransactionListFromPendingMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.TransactionIdList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionListFromPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.TransactionIdList.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionListFromPending"))
              .build();
        }
      }
    }
    return getGetTransactionListFromPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Chain.Transaction> getGetTransactionFromPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionFromPending",
      requestType = GrpcAPI.BytesMessage.class,
      responseType = org.tron.trident.proto.Chain.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.BytesMessage,
      org.tron.trident.proto.Chain.Transaction> getGetTransactionFromPendingMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.BytesMessage, org.tron.trident.proto.Chain.Transaction> getGetTransactionFromPendingMethod;
    if ((getGetTransactionFromPendingMethod = WalletGrpc.getGetTransactionFromPendingMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetTransactionFromPendingMethod = WalletGrpc.getGetTransactionFromPendingMethod) == null) {
          WalletGrpc.getGetTransactionFromPendingMethod = getGetTransactionFromPendingMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.BytesMessage, org.tron.trident.proto.Chain.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionFromPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.BytesMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Chain.Transaction.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetTransactionFromPending"))
              .build();
        }
      }
    }
    return getGetTransactionFromPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetPendingSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingSize",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = GrpcAPI.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      GrpcAPI.NumberMessage> getGetPendingSizeMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage> getGetPendingSizeMethod;
    if ((getGetPendingSizeMethod = WalletGrpc.getGetPendingSizeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetPendingSizeMethod = WalletGrpc.getGetPendingSizeMethod) == null) {
          WalletGrpc.getGetPendingSizeMethod = getGetPendingSizeMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, GrpcAPI.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetPendingSize"))
              .build();
        }
      }
    }
    return getGetPendingSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.PricesResponseMessage> getGetBandwidthPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBandwidthPrices",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.PricesResponseMessage> getGetBandwidthPricesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.PricesResponseMessage> getGetBandwidthPricesMethod;
    if ((getGetBandwidthPricesMethod = WalletGrpc.getGetBandwidthPricesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetBandwidthPricesMethod = WalletGrpc.getGetBandwidthPricesMethod) == null) {
          WalletGrpc.getGetBandwidthPricesMethod = getGetBandwidthPricesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBandwidthPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetBandwidthPrices"))
              .build();
        }
      }
    }
    return getGetBandwidthPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.PricesResponseMessage> getGetEnergyPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnergyPrices",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.PricesResponseMessage> getGetEnergyPricesMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.PricesResponseMessage> getGetEnergyPricesMethod;
    if ((getGetEnergyPricesMethod = WalletGrpc.getGetEnergyPricesMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetEnergyPricesMethod = WalletGrpc.getGetEnergyPricesMethod) == null) {
          WalletGrpc.getGetEnergyPricesMethod = getGetEnergyPricesMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnergyPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetEnergyPrices"))
              .build();
        }
      }
    }
    return getGetEnergyPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.PricesResponseMessage> getGetMemoFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMemoFee",
      requestType = GrpcAPI.EmptyMessage.class,
      responseType = org.tron.trident.proto.Response.PricesResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage,
      org.tron.trident.proto.Response.PricesResponseMessage> getGetMemoFeeMethod() {
    io.grpc.MethodDescriptor<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.PricesResponseMessage> getGetMemoFeeMethod;
    if ((getGetMemoFeeMethod = WalletGrpc.getGetMemoFeeMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getGetMemoFeeMethod = WalletGrpc.getGetMemoFeeMethod) == null) {
          WalletGrpc.getGetMemoFeeMethod = getGetMemoFeeMethod =
              io.grpc.MethodDescriptor.<GrpcAPI.EmptyMessage, org.tron.trident.proto.Response.PricesResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMemoFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcAPI.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.tron.trident.proto.Response.PricesResponseMessage.getDefaultInstance()))
              .setSchemaDescriptor(new WalletMethodDescriptorSupplier("GetMemoFee"))
              .build();
        }
      }
    }
    return getGetMemoFeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletStub>() {
        @Override
        public WalletStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletStub(channel, callOptions);
        }
      };
    return WalletStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletBlockingStub>() {
        @Override
        public WalletBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletBlockingStub(channel, callOptions);
        }
      };
    return WalletBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WalletFutureStub>() {
        @Override
        public WalletFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WalletFutureStub(channel, callOptions);
        }
      };
    return WalletFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    default void broadcastTransaction(org.tron.trident.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBroadcastTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *  rpc CreateCommonTransaction(Transaction) returns (TransactionExtention) {}
     *  rpc CreateAccount(AccountCreateContract) returns (Transaction) {}
     *  rpc CreateAccount2(AccountCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateAccount(AccountUpdateContract) returns (Transaction) {}
     *  rpc UpdateAccount2(AccountUpdateContract) returns (TransactionExtention) {}
     *  rpc SetAccountId(SetAccountIdContract) returns (Transaction) {}
     *  rpc AccountPermissionUpdate(AccountPermissionUpdateContract) returns (TransactionExtention) {}
     *  rpc CreateTransaction(TransferContract) returns (Transaction) {}
     *  rpc CreateTransaction2(TransferContract) returns (TransactionExtention) {}
     *  rpc CreateAssetIssue(AssetIssueContract) returns (Transaction) {}
     *  rpc CreateAssetIssue2(AssetIssueContract) returns (TransactionExtention) {}
     *  rpc UpdateAsset(UpdateAssetContract) returns (Transaction) {}
     *  rpc UpdateAsset2(UpdateAssetContract) returns (TransactionExtention) {}
     *  rpc TransferAsset(TransferAssetContract) returns (Transaction) {}
     *  rpc TransferAsset2(TransferAssetContract) returns (TransactionExtention) {}
     *  rpc ParticipateAssetIssue(ParticipateAssetIssueContract) returns (Transaction) {}
     *  rpc ParticipateAssetIssue2(ParticipateAssetIssueContract) returns (TransactionExtention) {}
     *  rpc UnfreezeAsset(UnfreezeAssetContract) returns (Transaction) {}
     *  rpc UnfreezeAsset2(UnfreezeAssetContract) returns (TransactionExtention) {}
     *  rpc CreateWitness(WitnessCreateContract) returns (Transaction) {}
     *  rpc CreateWitness2(WitnessCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateWitness(WitnessUpdateContract) returns (Transaction) {}
     *  rpc UpdateWitness2(WitnessUpdateContract) returns (TransactionExtention) {}
     *  rpc UpdateBrokerage(UpdateBrokerageContract) returns (TransactionExtention) {}
     *  rpc VoteWitnessAccount(VoteWitnessContract) returns (Transaction) {}
     *  rpc VoteWitnessAccount2(VoteWitnessContract) returns (TransactionExtention) {}
     *  rpc FreezeBalance(FreezeBalanceContract) returns (Transaction) {}
     *  rpc FreezeBalance2(FreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc UnfreezeBalance(UnfreezeBalanceContract) returns (Transaction) {}
     *  rpc UnfreezeBalance2(UnfreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc WithdrawBalance(WithdrawBalanceContract) returns (Transaction) {}
     *  rpc WithdrawBalance2(WithdrawBalanceContract) returns (TransactionExtention) {}
     *  rpc ProposalCreate(ProposalCreateContract) returns (TransactionExtention) {}
     *  rpc ProposalApprove(ProposalApproveContract) returns (TransactionExtention) {}
     *  rpc ProposalDelete(ProposalDeleteContract) returns (TransactionExtention) {}
     * </pre>
     */
    default void deployContract(org.tron.trident.proto.Contract.CreateSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployContractMethod(), responseObserver);
    }

    /**
     * <pre>
     *  rpc UpdateSetting(UpdateSettingContract) returns (TransactionExtention) {}          // consume_user_resource_percent
     *  rpc UpdateEnergyLimit(UpdateEnergyLimitContract) returns (TransactionExtention) {}  // origin_energy_limit
     *  rpc ClearContractABI(ClearABIContract) returns (TransactionExtention) {}
     * </pre>
     */
    default void triggerContract(org.tron.trident.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerContractMethod(), responseObserver);
    }

    /**
     */
    default void triggerConstantContract(org.tron.trident.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerConstantContractMethod(), responseObserver);
    }

    /**
     */
    default void estimateEnergy(org.tron.trident.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EstimateEnergyMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateEnergyMethod(), responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    default void getNodeInfo(GrpcAPI.EmptyMessage request,
                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NodeInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNodeInfoMethod(), responseObserver);
    }

    /**
     */
    default void listNodes(GrpcAPI.EmptyMessage request,
                           io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NodeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNodesMethod(), responseObserver);
    }

    /**
     */
    default void getChainParameters(GrpcAPI.EmptyMessage request,
                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ChainParameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetChainParametersMethod(), responseObserver);
    }

    /**
     */
    default void totalTransaction(GrpcAPI.EmptyMessage request,
                                  io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalTransactionMethod(), responseObserver);
    }

    /**
     */
    default void getNextMaintenanceTime(GrpcAPI.EmptyMessage request,
                                        io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNextMaintenanceTimeMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionSignWeight(org.tron.trident.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionSignWeight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionSignWeightMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionApprovedList(org.tron.trident.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionApprovedList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionApprovedListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    default void getAccount(GrpcAPI.AccountAddressMessage request,
                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Account> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    default void getAccountById(GrpcAPI.AccountIdMessage request,
                                io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Account> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountByIdMethod(), responseObserver);
    }

    /**
     */
    default void getAccountNet(GrpcAPI.AccountAddressMessage request,
                               io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AccountNetMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountNetMethod(), responseObserver);
    }

    /**
     */
    default void getAccountResource(GrpcAPI.AccountAddressMessage request,
                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AccountResourceMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountResourceMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueByAccount(GrpcAPI.AccountAddressMessage request,
                                        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByAccountMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueByName(GrpcAPI.BytesMessage request,
                                     io.grpc.stub.StreamObserver<org.tron.trident.proto.Contract.AssetIssueContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByNameMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueListByName(GrpcAPI.BytesMessage request,
                                         io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueListByNameMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueById(GrpcAPI.BytesMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Contract.AssetIssueContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueByIdMethod(), responseObserver);
    }

    /**
     */
    default void getAssetIssueList(GrpcAPI.EmptyMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    default void getPaginatedAssetIssueList(GrpcAPI.PaginatedMessage request,
                                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedAssetIssueListMethod(), responseObserver);
    }

    /**
     */
    default void getNowBlock(GrpcAPI.EmptyMessage request,
                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNowBlockMethod(), responseObserver);
    }

    /**
     */
    default void getNowBlock2(GrpcAPI.EmptyMessage request,
                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNowBlock2Method(), responseObserver);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    default void getBlockByNum(GrpcAPI.NumberMessage request,
                               io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByNumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    default void getBlockByNum2(GrpcAPI.NumberMessage request,
                                io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByNum2Method(), responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    default void getBlockById(GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByIdMethod(), responseObserver);
    }

    /**
     */
    default void getBlockByLimitNext(GrpcAPI.BlockLimit request,
                                     io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLimitNextMethod(), responseObserver);
    }

    /**
     */
    default void getBlockByLimitNext2(GrpcAPI.BlockLimit request,
                                      io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockListExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLimitNext2Method(), responseObserver);
    }

    /**
     */
    default void getBlockByLatestNum(GrpcAPI.NumberMessage request,
                                     io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLatestNumMethod(), responseObserver);
    }

    /**
     */
    default void getBlockByLatestNum2(GrpcAPI.NumberMessage request,
                                      io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockListExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockByLatestNum2Method(), responseObserver);
    }

    /**
     */
    default void getTransactionCountByBlockNum(GrpcAPI.NumberMessage request,
                                               io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionCountByBlockNumMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionById(GrpcAPI.BytesMessage request,
                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionByIdMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionInfoById(GrpcAPI.BytesMessage request,
                                        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionInfoByIdMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionInfoByBlockNum(GrpcAPI.NumberMessage request,
                                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionInfoList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionInfoByBlockNumMethod(), responseObserver);
    }

    /**
     */
    default void getContract(GrpcAPI.BytesMessage request,
                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Common.SmartContract> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    default void getContractInfo(GrpcAPI.BytesMessage request,
                                 io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.SmartContractDataWrapper> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContractInfoMethod(), responseObserver);
    }

    /**
     */
    default void listWitnesses(GrpcAPI.EmptyMessage request,
                               io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.WitnessList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWitnessesMethod(), responseObserver);
    }

    /**
     */
    default void getBrokerageInfo(GrpcAPI.BytesMessage request,
                                  io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBrokerageInfoMethod(), responseObserver);
    }

    /**
     */
    default void getRewardInfo(GrpcAPI.BytesMessage request,
                               io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRewardInfoMethod(), responseObserver);
    }

    /**
     */
    default void getDelegatedResource(org.tron.trident.proto.Response.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceMethod(), responseObserver);
    }

    /**
     */
    default void getDelegatedResourceAccountIndex(GrpcAPI.BytesMessage request,
                                                  io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexMethod(), responseObserver);
    }

    /**
     */
    default void listProposals(GrpcAPI.EmptyMessage request,
                               io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ProposalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProposalsMethod(), responseObserver);
    }

    /**
     */
    default void getProposalById(GrpcAPI.BytesMessage request,
                                 io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Proposal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProposalByIdMethod(), responseObserver);
    }

    /**
     */
    default void getPaginatedProposalList(GrpcAPI.PaginatedMessage request,
                                          io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ProposalList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedProposalListMethod(), responseObserver);
    }

    /**
     */
    default void listExchanges(GrpcAPI.EmptyMessage request,
                               io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ExchangeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExchangesMethod(), responseObserver);
    }

    /**
     */
    default void getExchangeById(GrpcAPI.BytesMessage request,
                                 io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Exchange> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExchangeByIdMethod(), responseObserver);
    }

    /**
     */
    default void getPaginatedExchangeList(GrpcAPI.PaginatedMessage request,
                                          io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ExchangeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPaginatedExchangeListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    default void scanShieldedTRC20NotesByIvk(GrpcAPI.IvkDecryptTRC20Parameters request,
                                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByIvkMethod(), responseObserver);
    }

    /**
     */
    default void scanShieldedTRC20NotesByOvk(GrpcAPI.OvkDecryptTRC20Parameters request,
                                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanShieldedTRC20NotesByOvkMethod(), responseObserver);
    }

    /**
     */
    default void isShieldedTRC20ContractNoteSpent(GrpcAPI.NfTRC20Parameters request,
                                                  io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NullifierResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsShieldedTRC20ContractNoteSpentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    default void getMarketOrderByAccount(GrpcAPI.BytesMessage request,
                                         io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderByAccountMethod(), responseObserver);
    }

    /**
     */
    default void getMarketOrderById(GrpcAPI.BytesMessage request,
                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrder> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderByIdMethod(), responseObserver);
    }

    /**
     */
    default void getMarketPriceByPair(org.tron.trident.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketPriceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketPriceByPairMethod(), responseObserver);
    }

    /**
     */
    default void getMarketOrderListByPair(org.tron.trident.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketOrderListByPairMethod(), responseObserver);
    }

    /**
     */
    default void getMarketPairList(GrpcAPI.EmptyMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderPairList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketPairListMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    default void getTransactionSign(org.tron.trident.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionSignMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionSign2(org.tron.trident.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionSign2Method(), responseObserver);
    }

    /**
     */
    default void easyTransferAsset(GrpcAPI.EasyTransferAssetMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEasyTransferAssetMethod(), responseObserver);
    }

    /**
     */
    default void easyTransferAssetByPrivate(GrpcAPI.EasyTransferAssetByPrivateMessage request,
                                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEasyTransferAssetByPrivateMethod(), responseObserver);
    }

    /**
     */
    default void easyTransfer(GrpcAPI.EasyTransferMessage request,
                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEasyTransferMethod(), responseObserver);
    }

    /**
     */
    default void easyTransferByPrivate(GrpcAPI.EasyTransferByPrivateMessage request,
                                       io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEasyTransferByPrivateMethod(), responseObserver);
    }

    /**
     */
    default void createAddress(GrpcAPI.BytesMessage request,
                               io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAddressMethod(), responseObserver);
    }

    /**
     */
    default void generateAddress(GrpcAPI.EmptyMessage request,
                                 io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AddressPrKeyPairMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateAddressMethod(), responseObserver);
    }

    /**
     */
    default void addSign(org.tron.trident.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSignMethod(), responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    default void getSpendingKey(GrpcAPI.EmptyMessage request,
                                io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    default void getExpandedSpendingKey(GrpcAPI.BytesMessage request,
                                        io.grpc.stub.StreamObserver<GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExpandedSpendingKeyMethod(), responseObserver);
    }

    /**
     */
    default void getAkFromAsk(GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAkFromAskMethod(), responseObserver);
    }

    /**
     */
    default void getNkFromNsk(GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNkFromNskMethod(), responseObserver);
    }

    /**
     */
    default void getIncomingViewingKey(GrpcAPI.ViewingKeyMessage request,
                                       io.grpc.stub.StreamObserver<GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIncomingViewingKeyMethod(), responseObserver);
    }

    /**
     */
    default void getDiversifier(GrpcAPI.EmptyMessage request,
                                io.grpc.stub.StreamObserver<GrpcAPI.DiversifierMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDiversifierMethod(), responseObserver);
    }

    /**
     */
    default void getZenPaymentAddress(GrpcAPI.IncomingViewingKeyDiversifierMessage request,
                                      io.grpc.stub.StreamObserver<GrpcAPI.PaymentAddressMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZenPaymentAddressMethod(), responseObserver);
    }

    /**
     */
    default void getNewShieldedAddress(GrpcAPI.EmptyMessage request,
                                       io.grpc.stub.StreamObserver<GrpcAPI.ShieldedAddressInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNewShieldedAddressMethod(), responseObserver);
    }

    /**
     */
    default void getRcm(GrpcAPI.EmptyMessage request,
                        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRcmMethod(), responseObserver);
    }

    /**
     */
    default void createShieldedContractParameters(GrpcAPI.PrivateShieldedTRC20Parameters request,
                                                  io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldedContractParametersMethod(), responseObserver);
    }

    /**
     */
    default void createShieldedContractParametersWithoutAsk(GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
                                                            io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShieldedContractParametersWithoutAskMethod(), responseObserver);
    }

    /**
     */
    default void getTriggerInputForShieldedTRC20Contract(GrpcAPI.ShieldedTRC20TriggerContractParameters request,
                                                         io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTriggerInputForShieldedTRC20ContractMethod(), responseObserver);
    }

    /**
     */
    default void getAvailableUnfreezeCount(GrpcAPI.GetAvailableUnfreezeCountRequestMessage request,
                                           io.grpc.stub.StreamObserver<GrpcAPI.GetAvailableUnfreezeCountResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableUnfreezeCountMethod(), responseObserver);
    }

    /**
     */
    default void getCanWithdrawUnfreezeAmount(GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request,
                                              io.grpc.stub.StreamObserver<GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCanWithdrawUnfreezeAmountMethod(), responseObserver);
    }

    /**
     */
    default void getCanDelegatedMaxSize(GrpcAPI.CanDelegatedMaxSizeRequestMessage request,
                                        io.grpc.stub.StreamObserver<GrpcAPI.CanDelegatedMaxSizeResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCanDelegatedMaxSizeMethod(), responseObserver);
    }

    /**
     */
    default void getDelegatedResourceV2(org.tron.trident.proto.Response.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceV2Method(), responseObserver);
    }

    /**
     */
    default void getDelegatedResourceAccountIndexV2(GrpcAPI.BytesMessage request,
                                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegatedResourceAccountIndexV2Method(), responseObserver);
    }

    /**
     * <pre>
     *query the network
     * </pre>
     */
    default void getBurnTrx(GrpcAPI.EmptyMessage request,
                            io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBurnTrxMethod(), responseObserver);
    }

    /**
     */
    default void getBlockBalanceTrace(org.tron.trident.proto.Response.BlockIdentifier request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockBalanceTrace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockBalanceTraceMethod(), responseObserver);
    }

    /**
     * <pre>
     *voting&amp;SRs
     * </pre>
     */
    default void createWitness2(org.tron.trident.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWitness2Method(), responseObserver);
    }

    /**
     */
    default void withdrawBalance2(org.tron.trident.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawBalance2Method(), responseObserver);
    }

    /**
     * <pre>
     *pending pool
     * </pre>
     */
    default void getTransactionListFromPending(GrpcAPI.EmptyMessage request,
                                               io.grpc.stub.StreamObserver<GrpcAPI.TransactionIdList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionListFromPendingMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionFromPending(GrpcAPI.BytesMessage request,
                                           io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionFromPendingMethod(), responseObserver);
    }

    /**
     */
    default void getPendingSize(GrpcAPI.EmptyMessage request,
                                io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPendingSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     *query resource price
     * </pre>
     */
    default void getBandwidthPrices(GrpcAPI.EmptyMessage request,
                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBandwidthPricesMethod(), responseObserver);
    }

    /**
     */
    default void getEnergyPrices(GrpcAPI.EmptyMessage request,
                                 io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnergyPricesMethod(), responseObserver);
    }

    /**
     */
    default void getMemoFee(GrpcAPI.EmptyMessage request,
                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMemoFeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Wallet.
   */
  public static abstract class WalletImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return WalletGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Wallet.
   */
  public static final class WalletStub
      extends io.grpc.stub.AbstractAsyncStub<WalletStub> {
    private WalletStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WalletStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public void broadcastTransaction(org.tron.trident.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  rpc CreateCommonTransaction(Transaction) returns (TransactionExtention) {}
     *  rpc CreateAccount(AccountCreateContract) returns (Transaction) {}
     *  rpc CreateAccount2(AccountCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateAccount(AccountUpdateContract) returns (Transaction) {}
     *  rpc UpdateAccount2(AccountUpdateContract) returns (TransactionExtention) {}
     *  rpc SetAccountId(SetAccountIdContract) returns (Transaction) {}
     *  rpc AccountPermissionUpdate(AccountPermissionUpdateContract) returns (TransactionExtention) {}
     *  rpc CreateTransaction(TransferContract) returns (Transaction) {}
     *  rpc CreateTransaction2(TransferContract) returns (TransactionExtention) {}
     *  rpc CreateAssetIssue(AssetIssueContract) returns (Transaction) {}
     *  rpc CreateAssetIssue2(AssetIssueContract) returns (TransactionExtention) {}
     *  rpc UpdateAsset(UpdateAssetContract) returns (Transaction) {}
     *  rpc UpdateAsset2(UpdateAssetContract) returns (TransactionExtention) {}
     *  rpc TransferAsset(TransferAssetContract) returns (Transaction) {}
     *  rpc TransferAsset2(TransferAssetContract) returns (TransactionExtention) {}
     *  rpc ParticipateAssetIssue(ParticipateAssetIssueContract) returns (Transaction) {}
     *  rpc ParticipateAssetIssue2(ParticipateAssetIssueContract) returns (TransactionExtention) {}
     *  rpc UnfreezeAsset(UnfreezeAssetContract) returns (Transaction) {}
     *  rpc UnfreezeAsset2(UnfreezeAssetContract) returns (TransactionExtention) {}
     *  rpc CreateWitness(WitnessCreateContract) returns (Transaction) {}
     *  rpc CreateWitness2(WitnessCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateWitness(WitnessUpdateContract) returns (Transaction) {}
     *  rpc UpdateWitness2(WitnessUpdateContract) returns (TransactionExtention) {}
     *  rpc UpdateBrokerage(UpdateBrokerageContract) returns (TransactionExtention) {}
     *  rpc VoteWitnessAccount(VoteWitnessContract) returns (Transaction) {}
     *  rpc VoteWitnessAccount2(VoteWitnessContract) returns (TransactionExtention) {}
     *  rpc FreezeBalance(FreezeBalanceContract) returns (Transaction) {}
     *  rpc FreezeBalance2(FreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc UnfreezeBalance(UnfreezeBalanceContract) returns (Transaction) {}
     *  rpc UnfreezeBalance2(UnfreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc WithdrawBalance(WithdrawBalanceContract) returns (Transaction) {}
     *  rpc WithdrawBalance2(WithdrawBalanceContract) returns (TransactionExtention) {}
     *  rpc ProposalCreate(ProposalCreateContract) returns (TransactionExtention) {}
     *  rpc ProposalApprove(ProposalApproveContract) returns (TransactionExtention) {}
     *  rpc ProposalDelete(ProposalDeleteContract) returns (TransactionExtention) {}
     * </pre>
     */
    public void deployContract(org.tron.trident.proto.Contract.CreateSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  rpc UpdateSetting(UpdateSettingContract) returns (TransactionExtention) {}          // consume_user_resource_percent
     *  rpc UpdateEnergyLimit(UpdateEnergyLimitContract) returns (TransactionExtention) {}  // origin_energy_limit
     *  rpc ClearContractABI(ClearABIContract) returns (TransactionExtention) {}
     * </pre>
     */
    public void triggerContract(org.tron.trident.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerConstantContract(org.tron.trident.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void estimateEnergy(org.tron.trident.proto.Contract.TriggerSmartContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EstimateEnergyMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateEnergyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public void getNodeInfo(GrpcAPI.EmptyMessage request,
                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NodeInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNodes(GrpcAPI.EmptyMessage request,
                          io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NodeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChainParameters(GrpcAPI.EmptyMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ChainParameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalTransaction(GrpcAPI.EmptyMessage request,
                                 io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextMaintenanceTime(GrpcAPI.EmptyMessage request,
                                       io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSignWeight(org.tron.trident.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionSignWeight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionApprovedList(org.tron.trident.proto.Chain.Transaction request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionApprovedList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public void getAccount(GrpcAPI.AccountAddressMessage request,
                           io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Account> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountById(GrpcAPI.AccountIdMessage request,
                               io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Account> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountNet(GrpcAPI.AccountAddressMessage request,
                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AccountNetMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountResource(GrpcAPI.AccountAddressMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AccountResourceMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByAccount(GrpcAPI.AccountAddressMessage request,
                                       io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueByName(GrpcAPI.BytesMessage request,
                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Contract.AssetIssueContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueListByName(GrpcAPI.BytesMessage request,
                                        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueById(GrpcAPI.BytesMessage request,
                                  io.grpc.stub.StreamObserver<org.tron.trident.proto.Contract.AssetIssueContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetIssueList(GrpcAPI.EmptyMessage request,
                                  io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedAssetIssueList(GrpcAPI.PaginatedMessage request,
                                           io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock(GrpcAPI.EmptyMessage request,
                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNowBlock2(GrpcAPI.EmptyMessage request,
                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public void getBlockByNum(GrpcAPI.NumberMessage request,
                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public void getBlockByNum2(GrpcAPI.NumberMessage request,
                               io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public void getBlockById(GrpcAPI.BytesMessage request,
                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext(GrpcAPI.BlockLimit request,
                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLimitNext2(GrpcAPI.BlockLimit request,
                                     io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockListExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum(GrpcAPI.NumberMessage request,
                                    io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByLatestNum2(GrpcAPI.NumberMessage request,
                                     io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockListExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionCountByBlockNum(GrpcAPI.NumberMessage request,
                                              io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionById(GrpcAPI.BytesMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoById(GrpcAPI.BytesMessage request,
                                       io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionInfoByBlockNum(GrpcAPI.NumberMessage request,
                                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionInfoList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContract(GrpcAPI.BytesMessage request,
                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Common.SmartContract> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public void getContractInfo(GrpcAPI.BytesMessage request,
                                io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.SmartContractDataWrapper> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWitnesses(GrpcAPI.EmptyMessage request,
                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.WitnessList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrokerageInfo(GrpcAPI.BytesMessage request,
                                 io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRewardInfo(GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResource(org.tron.trident.proto.Response.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndex(GrpcAPI.BytesMessage request,
                                                 io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProposals(GrpcAPI.EmptyMessage request,
                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ProposalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProposalById(GrpcAPI.BytesMessage request,
                                io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Proposal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedProposalList(GrpcAPI.PaginatedMessage request,
                                         io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ProposalList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listExchanges(GrpcAPI.EmptyMessage request,
                              io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ExchangeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExchangeById(GrpcAPI.BytesMessage request,
                                io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Exchange> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaginatedExchangeList(GrpcAPI.PaginatedMessage request,
                                         io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ExchangeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public void scanShieldedTRC20NotesByIvk(GrpcAPI.IvkDecryptTRC20Parameters request,
                                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanShieldedTRC20NotesByOvk(GrpcAPI.OvkDecryptTRC20Parameters request,
                                            io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DecryptNotesTRC20> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isShieldedTRC20ContractNoteSpent(GrpcAPI.NfTRC20Parameters request,
                                                 io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NullifierResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public void getMarketOrderByAccount(GrpcAPI.BytesMessage request,
                                        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderById(GrpcAPI.BytesMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrder> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPriceByPair(org.tron.trident.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketPriceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketOrderListByPair(org.tron.trident.proto.Response.MarketOrderPair request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketPairList(GrpcAPI.EmptyMessage request,
                                  io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderPairList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public void getTransactionSign(org.tron.trident.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionSign2(org.tron.trident.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAsset(GrpcAPI.EasyTransferAssetMessage request,
                                  io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferAssetByPrivate(GrpcAPI.EasyTransferAssetByPrivateMessage request,
                                           io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransfer(GrpcAPI.EasyTransferMessage request,
                             io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void easyTransferByPrivate(GrpcAPI.EasyTransferByPrivateMessage request,
                                      io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAddress(GrpcAPI.BytesMessage request,
                              io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateAddress(GrpcAPI.EmptyMessage request,
                                io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AddressPrKeyPairMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSign(org.tron.trident.proto.Response.TransactionSign request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public void getSpendingKey(GrpcAPI.EmptyMessage request,
                               io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExpandedSpendingKey(GrpcAPI.BytesMessage request,
                                       io.grpc.stub.StreamObserver<GrpcAPI.ExpandedSpendingKeyMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAkFromAsk(GrpcAPI.BytesMessage request,
                             io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNkFromNsk(GrpcAPI.BytesMessage request,
                             io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncomingViewingKey(GrpcAPI.ViewingKeyMessage request,
                                      io.grpc.stub.StreamObserver<GrpcAPI.IncomingViewingKeyMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDiversifier(GrpcAPI.EmptyMessage request,
                               io.grpc.stub.StreamObserver<GrpcAPI.DiversifierMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZenPaymentAddress(GrpcAPI.IncomingViewingKeyDiversifierMessage request,
                                     io.grpc.stub.StreamObserver<GrpcAPI.PaymentAddressMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNewShieldedAddress(GrpcAPI.EmptyMessage request,
                                      io.grpc.stub.StreamObserver<GrpcAPI.ShieldedAddressInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRcm(GrpcAPI.EmptyMessage request,
                       io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParameters(GrpcAPI.PrivateShieldedTRC20Parameters request,
                                                 io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createShieldedContractParametersWithoutAsk(GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request,
                                                           io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTriggerInputForShieldedTRC20Contract(GrpcAPI.ShieldedTRC20TriggerContractParameters request,
                                                        io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailableUnfreezeCount(GrpcAPI.GetAvailableUnfreezeCountRequestMessage request,
                                          io.grpc.stub.StreamObserver<GrpcAPI.GetAvailableUnfreezeCountResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableUnfreezeCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCanWithdrawUnfreezeAmount(GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request,
                                             io.grpc.stub.StreamObserver<GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCanDelegatedMaxSize(GrpcAPI.CanDelegatedMaxSizeRequestMessage request,
                                       io.grpc.stub.StreamObserver<GrpcAPI.CanDelegatedMaxSizeResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCanDelegatedMaxSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceV2(org.tron.trident.proto.Response.DelegatedResourceMessage request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegatedResourceAccountIndexV2(GrpcAPI.BytesMessage request,
                                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceAccountIndex> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *query the network
     * </pre>
     */
    public void getBurnTrx(GrpcAPI.EmptyMessage request,
                           io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockBalanceTrace(org.tron.trident.proto.Response.BlockIdentifier request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockBalanceTrace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockBalanceTraceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *voting&amp;SRs
     * </pre>
     */
    public void createWitness2(org.tron.trident.proto.Contract.WitnessCreateContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawBalance2(org.tron.trident.proto.Contract.WithdrawBalanceContract request,
        io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *pending pool
     * </pre>
     */
    public void getTransactionListFromPending(GrpcAPI.EmptyMessage request,
                                              io.grpc.stub.StreamObserver<GrpcAPI.TransactionIdList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionListFromPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionFromPending(GrpcAPI.BytesMessage request,
                                          io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionFromPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPendingSize(GrpcAPI.EmptyMessage request,
                               io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPendingSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *query resource price
     * </pre>
     */
    public void getBandwidthPrices(GrpcAPI.EmptyMessage request,
                                   io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBandwidthPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEnergyPrices(GrpcAPI.EmptyMessage request,
                                io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnergyPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMemoFee(GrpcAPI.EmptyMessage request,
                           io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMemoFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Wallet.
   */
  public static final class WalletBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WalletBlockingStub> {
    private WalletBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WalletBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public org.tron.trident.proto.Response.TransactionReturn broadcastTransaction(org.tron.trident.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBroadcastTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  rpc CreateCommonTransaction(Transaction) returns (TransactionExtention) {}
     *  rpc CreateAccount(AccountCreateContract) returns (Transaction) {}
     *  rpc CreateAccount2(AccountCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateAccount(AccountUpdateContract) returns (Transaction) {}
     *  rpc UpdateAccount2(AccountUpdateContract) returns (TransactionExtention) {}
     *  rpc SetAccountId(SetAccountIdContract) returns (Transaction) {}
     *  rpc AccountPermissionUpdate(AccountPermissionUpdateContract) returns (TransactionExtention) {}
     *  rpc CreateTransaction(TransferContract) returns (Transaction) {}
     *  rpc CreateTransaction2(TransferContract) returns (TransactionExtention) {}
     *  rpc CreateAssetIssue(AssetIssueContract) returns (Transaction) {}
     *  rpc CreateAssetIssue2(AssetIssueContract) returns (TransactionExtention) {}
     *  rpc UpdateAsset(UpdateAssetContract) returns (Transaction) {}
     *  rpc UpdateAsset2(UpdateAssetContract) returns (TransactionExtention) {}
     *  rpc TransferAsset(TransferAssetContract) returns (Transaction) {}
     *  rpc TransferAsset2(TransferAssetContract) returns (TransactionExtention) {}
     *  rpc ParticipateAssetIssue(ParticipateAssetIssueContract) returns (Transaction) {}
     *  rpc ParticipateAssetIssue2(ParticipateAssetIssueContract) returns (TransactionExtention) {}
     *  rpc UnfreezeAsset(UnfreezeAssetContract) returns (Transaction) {}
     *  rpc UnfreezeAsset2(UnfreezeAssetContract) returns (TransactionExtention) {}
     *  rpc CreateWitness(WitnessCreateContract) returns (Transaction) {}
     *  rpc CreateWitness2(WitnessCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateWitness(WitnessUpdateContract) returns (Transaction) {}
     *  rpc UpdateWitness2(WitnessUpdateContract) returns (TransactionExtention) {}
     *  rpc UpdateBrokerage(UpdateBrokerageContract) returns (TransactionExtention) {}
     *  rpc VoteWitnessAccount(VoteWitnessContract) returns (Transaction) {}
     *  rpc VoteWitnessAccount2(VoteWitnessContract) returns (TransactionExtention) {}
     *  rpc FreezeBalance(FreezeBalanceContract) returns (Transaction) {}
     *  rpc FreezeBalance2(FreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc UnfreezeBalance(UnfreezeBalanceContract) returns (Transaction) {}
     *  rpc UnfreezeBalance2(UnfreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc WithdrawBalance(WithdrawBalanceContract) returns (Transaction) {}
     *  rpc WithdrawBalance2(WithdrawBalanceContract) returns (TransactionExtention) {}
     *  rpc ProposalCreate(ProposalCreateContract) returns (TransactionExtention) {}
     *  rpc ProposalApprove(ProposalApproveContract) returns (TransactionExtention) {}
     *  rpc ProposalDelete(ProposalDeleteContract) returns (TransactionExtention) {}
     * </pre>
     */
    public org.tron.trident.proto.Response.TransactionExtention deployContract(org.tron.trident.proto.Contract.CreateSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  rpc UpdateSetting(UpdateSettingContract) returns (TransactionExtention) {}          // consume_user_resource_percent
     *  rpc UpdateEnergyLimit(UpdateEnergyLimitContract) returns (TransactionExtention) {}  // origin_energy_limit
     *  rpc ClearContractABI(ClearABIContract) returns (TransactionExtention) {}
     * </pre>
     */
    public org.tron.trident.proto.Response.TransactionExtention triggerContract(org.tron.trident.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.TransactionExtention triggerConstantContract(org.tron.trident.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerConstantContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.EstimateEnergyMessage estimateEnergy(org.tron.trident.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateEnergyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public org.tron.trident.proto.Response.NodeInfo getNodeInfo(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNodeInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.NodeList listNodes(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.ChainParameters getChainParameters(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetChainParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage totalTransaction(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getNextMaintenanceTime(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNextMaintenanceTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.TransactionSignWeight getTransactionSignWeight(org.tron.trident.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionSignWeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.TransactionApprovedList getTransactionApprovedList(org.tron.trident.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionApprovedListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public org.tron.trident.proto.Response.Account getAccount(GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.Account getAccountById(GrpcAPI.AccountIdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.AccountNetMessage getAccountNet(GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountNetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.AccountResourceMessage getAccountResource(GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.AssetIssueList getAssetIssueByAccount(GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Contract.AssetIssueContract getAssetIssueByName(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.AssetIssueList getAssetIssueListByName(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueListByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Contract.AssetIssueContract getAssetIssueById(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.AssetIssueList getAssetIssueList(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.AssetIssueList getPaginatedAssetIssueList(GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedAssetIssueListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Chain.Block getNowBlock(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNowBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.BlockExtention getNowBlock2(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNowBlock2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public org.tron.trident.proto.Chain.Block getBlockByNum(GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByNumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public org.tron.trident.proto.Response.BlockExtention getBlockByNum2(GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByNum2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public org.tron.trident.proto.Chain.Block getBlockById(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.BlockList getBlockByLimitNext(GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLimitNextMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.BlockListExtention getBlockByLimitNext2(GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLimitNext2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.BlockList getBlockByLatestNum(GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLatestNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.BlockListExtention getBlockByLatestNum2(GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockByLatestNum2Method(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getTransactionCountByBlockNum(GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionCountByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Chain.Transaction getTransactionById(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.TransactionInfo getTransactionInfoById(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionInfoByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.TransactionInfoList getTransactionInfoByBlockNum(GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionInfoByBlockNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Common.SmartContract getContract(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public org.tron.trident.proto.Response.SmartContractDataWrapper getContractInfo(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContractInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.WitnessList listWitnesses(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWitnessesMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getBrokerageInfo(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBrokerageInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getRewardInfo(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRewardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.DelegatedResourceList getDelegatedResource(org.tron.trident.proto.Response.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.DelegatedResourceAccountIndex getDelegatedResourceAccountIndex(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.ProposalList listProposals(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProposalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.Proposal getProposalById(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProposalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.ProposalList getPaginatedProposalList(GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedProposalListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.ExchangeList listExchanges(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExchangesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.Exchange getExchangeById(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExchangeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.ExchangeList getPaginatedExchangeList(GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPaginatedExchangeListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public org.tron.trident.proto.Response.DecryptNotesTRC20 scanShieldedTRC20NotesByIvk(GrpcAPI.IvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByIvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.DecryptNotesTRC20 scanShieldedTRC20NotesByOvk(GrpcAPI.OvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanShieldedTRC20NotesByOvkMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.NullifierResult isShieldedTRC20ContractNoteSpent(GrpcAPI.NfTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public org.tron.trident.proto.Response.MarketOrderList getMarketOrderByAccount(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderByAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.MarketOrder getMarketOrderById(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.MarketPriceList getMarketPriceByPair(org.tron.trident.proto.Response.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketPriceByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.MarketOrderList getMarketOrderListByPair(org.tron.trident.proto.Response.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketOrderListByPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.MarketOrderPairList getMarketPairList(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketPairListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public org.tron.trident.proto.Chain.Transaction getTransactionSign(org.tron.trident.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionSignMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.TransactionExtention getTransactionSign2(org.tron.trident.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionSign2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.EasyTransferResponse easyTransferAsset(GrpcAPI.EasyTransferAssetMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEasyTransferAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.EasyTransferResponse easyTransferAssetByPrivate(GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEasyTransferAssetByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.EasyTransferResponse easyTransfer(GrpcAPI.EasyTransferMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEasyTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.EasyTransferResponse easyTransferByPrivate(GrpcAPI.EasyTransferByPrivateMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEasyTransferByPrivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage createAddress(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.AddressPrKeyPairMessage generateAddress(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.TransactionExtention addSign(org.tron.trident.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public GrpcAPI.BytesMessage getSpendingKey(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.ExpandedSpendingKeyMessage getExpandedSpendingKey(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExpandedSpendingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage getAkFromAsk(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAkFromAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage getNkFromNsk(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNkFromNskMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.IncomingViewingKeyMessage getIncomingViewingKey(GrpcAPI.ViewingKeyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIncomingViewingKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.DiversifierMessage getDiversifier(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDiversifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.PaymentAddressMessage getZenPaymentAddress(GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZenPaymentAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.ShieldedAddressInfo getNewShieldedAddress(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNewShieldedAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage getRcm(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRcmMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.ShieldedTRC20Parameters createShieldedContractParameters(GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.ShieldedTRC20Parameters createShieldedContractParametersWithoutAsk(GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.BytesMessage getTriggerInputForShieldedTRC20Contract(GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.GetAvailableUnfreezeCountResponseMessage getAvailableUnfreezeCount(GrpcAPI.GetAvailableUnfreezeCountRequestMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableUnfreezeCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage getCanWithdrawUnfreezeAmount(GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.CanDelegatedMaxSizeResponseMessage getCanDelegatedMaxSize(GrpcAPI.CanDelegatedMaxSizeRequestMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCanDelegatedMaxSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.DelegatedResourceList getDelegatedResourceV2(org.tron.trident.proto.Response.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceV2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.DelegatedResourceAccountIndex getDelegatedResourceAccountIndexV2(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegatedResourceAccountIndexV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *query the network
     * </pre>
     */
    public GrpcAPI.NumberMessage getBurnTrx(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBurnTrxMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.BlockBalanceTrace getBlockBalanceTrace(org.tron.trident.proto.Response.BlockIdentifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockBalanceTraceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *voting&amp;SRs
     * </pre>
     */
    public org.tron.trident.proto.Response.TransactionExtention createWitness2(org.tron.trident.proto.Contract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWitness2Method(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.TransactionExtention withdrawBalance2(org.tron.trident.proto.Contract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawBalance2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *pending pool
     * </pre>
     */
    public GrpcAPI.TransactionIdList getTransactionListFromPending(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionListFromPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Chain.Transaction getTransactionFromPending(GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionFromPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcAPI.NumberMessage getPendingSize(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPendingSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *query resource price
     * </pre>
     */
    public org.tron.trident.proto.Response.PricesResponseMessage getBandwidthPrices(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBandwidthPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.PricesResponseMessage getEnergyPrices(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnergyPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.tron.trident.proto.Response.PricesResponseMessage getMemoFee(GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMemoFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Wallet.
   */
  public static final class WalletFutureStub
      extends io.grpc.stub.AbstractFutureStub<WalletFutureStub> {
    private WalletFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected WalletFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Transactions:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionReturn> broadcastTransaction(
        org.tron.trident.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBroadcastTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  rpc CreateCommonTransaction(Transaction) returns (TransactionExtention) {}
     *  rpc CreateAccount(AccountCreateContract) returns (Transaction) {}
     *  rpc CreateAccount2(AccountCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateAccount(AccountUpdateContract) returns (Transaction) {}
     *  rpc UpdateAccount2(AccountUpdateContract) returns (TransactionExtention) {}
     *  rpc SetAccountId(SetAccountIdContract) returns (Transaction) {}
     *  rpc AccountPermissionUpdate(AccountPermissionUpdateContract) returns (TransactionExtention) {}
     *  rpc CreateTransaction(TransferContract) returns (Transaction) {}
     *  rpc CreateTransaction2(TransferContract) returns (TransactionExtention) {}
     *  rpc CreateAssetIssue(AssetIssueContract) returns (Transaction) {}
     *  rpc CreateAssetIssue2(AssetIssueContract) returns (TransactionExtention) {}
     *  rpc UpdateAsset(UpdateAssetContract) returns (Transaction) {}
     *  rpc UpdateAsset2(UpdateAssetContract) returns (TransactionExtention) {}
     *  rpc TransferAsset(TransferAssetContract) returns (Transaction) {}
     *  rpc TransferAsset2(TransferAssetContract) returns (TransactionExtention) {}
     *  rpc ParticipateAssetIssue(ParticipateAssetIssueContract) returns (Transaction) {}
     *  rpc ParticipateAssetIssue2(ParticipateAssetIssueContract) returns (TransactionExtention) {}
     *  rpc UnfreezeAsset(UnfreezeAssetContract) returns (Transaction) {}
     *  rpc UnfreezeAsset2(UnfreezeAssetContract) returns (TransactionExtention) {}
     *  rpc CreateWitness(WitnessCreateContract) returns (Transaction) {}
     *  rpc CreateWitness2(WitnessCreateContract) returns (TransactionExtention) {}
     *  rpc UpdateWitness(WitnessUpdateContract) returns (Transaction) {}
     *  rpc UpdateWitness2(WitnessUpdateContract) returns (TransactionExtention) {}
     *  rpc UpdateBrokerage(UpdateBrokerageContract) returns (TransactionExtention) {}
     *  rpc VoteWitnessAccount(VoteWitnessContract) returns (Transaction) {}
     *  rpc VoteWitnessAccount2(VoteWitnessContract) returns (TransactionExtention) {}
     *  rpc FreezeBalance(FreezeBalanceContract) returns (Transaction) {}
     *  rpc FreezeBalance2(FreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc UnfreezeBalance(UnfreezeBalanceContract) returns (Transaction) {}
     *  rpc UnfreezeBalance2(UnfreezeBalanceContract) returns (TransactionExtention) {}
     *  rpc WithdrawBalance(WithdrawBalanceContract) returns (Transaction) {}
     *  rpc WithdrawBalance2(WithdrawBalanceContract) returns (TransactionExtention) {}
     *  rpc ProposalCreate(ProposalCreateContract) returns (TransactionExtention) {}
     *  rpc ProposalApprove(ProposalApproveContract) returns (TransactionExtention) {}
     *  rpc ProposalDelete(ProposalDeleteContract) returns (TransactionExtention) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionExtention> deployContract(
        org.tron.trident.proto.Contract.CreateSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  rpc UpdateSetting(UpdateSettingContract) returns (TransactionExtention) {}          // consume_user_resource_percent
     *  rpc UpdateEnergyLimit(UpdateEnergyLimitContract) returns (TransactionExtention) {}  // origin_energy_limit
     *  rpc ClearContractABI(ClearABIContract) returns (TransactionExtention) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionExtention> triggerContract(
        org.tron.trident.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionExtention> triggerConstantContract(
        org.tron.trident.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerConstantContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.EstimateEnergyMessage> estimateEnergy(
        org.tron.trident.proto.Contract.TriggerSmartContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateEnergyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * The real APIs:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.NodeInfo> getNodeInfo(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNodeInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.NodeList> listNodes(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.ChainParameters> getChainParameters(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetChainParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> totalTransaction(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getNextMaintenanceTime(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNextMaintenanceTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionSignWeight> getTransactionSignWeight(
        org.tron.trident.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionSignWeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionApprovedList> getTransactionApprovedList(
        org.tron.trident.proto.Chain.Transaction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionApprovedListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Although the parameters' type is changed, it is still bad API design.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.Account> getAccount(
        GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.Account> getAccountById(
        GrpcAPI.AccountIdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.AccountNetMessage> getAccountNet(
        GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountNetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.AccountResourceMessage> getAccountResource(
        GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.AssetIssueList> getAssetIssueByAccount(
        GrpcAPI.AccountAddressMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Contract.AssetIssueContract> getAssetIssueByName(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.AssetIssueList> getAssetIssueListByName(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Contract.AssetIssueContract> getAssetIssueById(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.AssetIssueList> getAssetIssueList(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.AssetIssueList> getPaginatedAssetIssueList(
        GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedAssetIssueListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Chain.Block> getNowBlock(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNowBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.BlockExtention> getNowBlock2(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNowBlock2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *deprecated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Chain.Block> getBlockByNum(
        GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByNumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Use this function instead of GetBlockByNum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.BlockExtention> getBlockByNum2(
        GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByNum2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NOTE: `GetBlockById2` is missing. The closest is `GetBlockByLatestNum2`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Chain.Block> getBlockById(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.BlockList> getBlockByLimitNext(
        GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.BlockListExtention> getBlockByLimitNext2(
        GrpcAPI.BlockLimit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLimitNext2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.BlockList> getBlockByLatestNum(
        GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.BlockListExtention> getBlockByLatestNum2(
        GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockByLatestNum2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getTransactionCountByBlockNum(
        GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionCountByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Chain.Transaction> getTransactionById(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionInfo> getTransactionInfoById(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionInfoList> getTransactionInfoByBlockNum(
        GrpcAPI.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionInfoByBlockNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Common.SmartContract> getContract(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Abusing of `info`. Should be a `GetContractCode`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.SmartContractDataWrapper> getContractInfo(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContractInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.WitnessList> listWitnesses(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWitnessesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getBrokerageInfo(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBrokerageInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getRewardInfo(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRewardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.DelegatedResourceList> getDelegatedResource(
        org.tron.trident.proto.Response.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.DelegatedResourceAccountIndex> getDelegatedResourceAccountIndex(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.ProposalList> listProposals(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProposalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.Proposal> getProposalById(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProposalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.ProposalList> getPaginatedProposalList(
        GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedProposalListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.ExchangeList> listExchanges(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExchangesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.Exchange> getExchangeById(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExchangeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.ExchangeList> getPaginatedExchangeList(
        GrpcAPI.PaginatedMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPaginatedExchangeListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Shielded helpers:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.DecryptNotesTRC20> scanShieldedTRC20NotesByIvk(
        GrpcAPI.IvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByIvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.DecryptNotesTRC20> scanShieldedTRC20NotesByOvk(
        GrpcAPI.OvkDecryptTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanShieldedTRC20NotesByOvkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.NullifierResult> isShieldedTRC20ContractNoteSpent(
        GrpcAPI.NfTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsShieldedTRC20ContractNoteSpentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Market API:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.MarketOrderList> getMarketOrderByAccount(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.MarketOrder> getMarketOrderById(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.MarketPriceList> getMarketPriceByPair(
        org.tron.trident.proto.Response.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketPriceByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.MarketOrderList> getMarketOrderListByPair(
        org.tron.trident.proto.Response.MarketOrderPair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketOrderListByPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.MarketOrderPairList> getMarketPairList(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketPairListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe junk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Chain.Transaction> getTransactionSign(
        org.tron.trident.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionSignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionExtention> getTransactionSign2(
        org.tron.trident.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionSign2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.EasyTransferResponse> easyTransferAsset(
        GrpcAPI.EasyTransferAssetMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.EasyTransferResponse> easyTransferAssetByPrivate(
        GrpcAPI.EasyTransferAssetByPrivateMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEasyTransferAssetByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.EasyTransferResponse> easyTransfer(
        GrpcAPI.EasyTransferMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEasyTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.EasyTransferResponse> easyTransferByPrivate(
        GrpcAPI.EasyTransferByPrivateMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEasyTransferByPrivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> createAddress(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.AddressPrKeyPairMessage> generateAddress(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionExtention> addSign(
        org.tron.trident.proto.Response.TransactionSign request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FLAW: Unsafe shielded junk(should be implemented offline).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getSpendingKey(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.ExpandedSpendingKeyMessage> getExpandedSpendingKey(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExpandedSpendingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getAkFromAsk(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAkFromAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getNkFromNsk(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNkFromNskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.IncomingViewingKeyMessage> getIncomingViewingKey(
        GrpcAPI.ViewingKeyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIncomingViewingKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.DiversifierMessage> getDiversifier(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDiversifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.PaymentAddressMessage> getZenPaymentAddress(
        GrpcAPI.IncomingViewingKeyDiversifierMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZenPaymentAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.ShieldedAddressInfo> getNewShieldedAddress(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNewShieldedAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getRcm(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRcmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParameters(
        GrpcAPI.PrivateShieldedTRC20Parameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.ShieldedTRC20Parameters> createShieldedContractParametersWithoutAsk(
        GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShieldedContractParametersWithoutAskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.BytesMessage> getTriggerInputForShieldedTRC20Contract(
        GrpcAPI.ShieldedTRC20TriggerContractParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTriggerInputForShieldedTRC20ContractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.GetAvailableUnfreezeCountResponseMessage> getAvailableUnfreezeCount(
        GrpcAPI.GetAvailableUnfreezeCountRequestMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableUnfreezeCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage> getCanWithdrawUnfreezeAmount(
        GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCanWithdrawUnfreezeAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.CanDelegatedMaxSizeResponseMessage> getCanDelegatedMaxSize(
        GrpcAPI.CanDelegatedMaxSizeRequestMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCanDelegatedMaxSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.DelegatedResourceList> getDelegatedResourceV2(
        org.tron.trident.proto.Response.DelegatedResourceMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.DelegatedResourceAccountIndex> getDelegatedResourceAccountIndexV2(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegatedResourceAccountIndexV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *query the network
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getBurnTrx(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBurnTrxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.BlockBalanceTrace> getBlockBalanceTrace(
        org.tron.trident.proto.Response.BlockIdentifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockBalanceTraceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *voting&amp;SRs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionExtention> createWitness2(
        org.tron.trident.proto.Contract.WitnessCreateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWitness2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.TransactionExtention> withdrawBalance2(
        org.tron.trident.proto.Contract.WithdrawBalanceContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawBalance2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *pending pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.TransactionIdList> getTransactionListFromPending(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionListFromPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Chain.Transaction> getTransactionFromPending(
        GrpcAPI.BytesMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionFromPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcAPI.NumberMessage> getPendingSize(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPendingSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *query resource price
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.PricesResponseMessage> getBandwidthPrices(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBandwidthPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.PricesResponseMessage> getEnergyPrices(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnergyPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.tron.trident.proto.Response.PricesResponseMessage> getMemoFee(
        GrpcAPI.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMemoFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BROADCAST_TRANSACTION = 0;
  private static final int METHODID_DEPLOY_CONTRACT = 1;
  private static final int METHODID_TRIGGER_CONTRACT = 2;
  private static final int METHODID_TRIGGER_CONSTANT_CONTRACT = 3;
  private static final int METHODID_ESTIMATE_ENERGY = 4;
  private static final int METHODID_GET_NODE_INFO = 5;
  private static final int METHODID_LIST_NODES = 6;
  private static final int METHODID_GET_CHAIN_PARAMETERS = 7;
  private static final int METHODID_TOTAL_TRANSACTION = 8;
  private static final int METHODID_GET_NEXT_MAINTENANCE_TIME = 9;
  private static final int METHODID_GET_TRANSACTION_SIGN_WEIGHT = 10;
  private static final int METHODID_GET_TRANSACTION_APPROVED_LIST = 11;
  private static final int METHODID_GET_ACCOUNT = 12;
  private static final int METHODID_GET_ACCOUNT_BY_ID = 13;
  private static final int METHODID_GET_ACCOUNT_NET = 14;
  private static final int METHODID_GET_ACCOUNT_RESOURCE = 15;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ACCOUNT = 16;
  private static final int METHODID_GET_ASSET_ISSUE_BY_NAME = 17;
  private static final int METHODID_GET_ASSET_ISSUE_LIST_BY_NAME = 18;
  private static final int METHODID_GET_ASSET_ISSUE_BY_ID = 19;
  private static final int METHODID_GET_ASSET_ISSUE_LIST = 20;
  private static final int METHODID_GET_PAGINATED_ASSET_ISSUE_LIST = 21;
  private static final int METHODID_GET_NOW_BLOCK = 22;
  private static final int METHODID_GET_NOW_BLOCK2 = 23;
  private static final int METHODID_GET_BLOCK_BY_NUM = 24;
  private static final int METHODID_GET_BLOCK_BY_NUM2 = 25;
  private static final int METHODID_GET_BLOCK_BY_ID = 26;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT = 27;
  private static final int METHODID_GET_BLOCK_BY_LIMIT_NEXT2 = 28;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM = 29;
  private static final int METHODID_GET_BLOCK_BY_LATEST_NUM2 = 30;
  private static final int METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM = 31;
  private static final int METHODID_GET_TRANSACTION_BY_ID = 32;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_ID = 33;
  private static final int METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM = 34;
  private static final int METHODID_GET_CONTRACT = 35;
  private static final int METHODID_GET_CONTRACT_INFO = 36;
  private static final int METHODID_LIST_WITNESSES = 37;
  private static final int METHODID_GET_BROKERAGE_INFO = 38;
  private static final int METHODID_GET_REWARD_INFO = 39;
  private static final int METHODID_GET_DELEGATED_RESOURCE = 40;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX = 41;
  private static final int METHODID_LIST_PROPOSALS = 42;
  private static final int METHODID_GET_PROPOSAL_BY_ID = 43;
  private static final int METHODID_GET_PAGINATED_PROPOSAL_LIST = 44;
  private static final int METHODID_LIST_EXCHANGES = 45;
  private static final int METHODID_GET_EXCHANGE_BY_ID = 46;
  private static final int METHODID_GET_PAGINATED_EXCHANGE_LIST = 47;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK = 48;
  private static final int METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK = 49;
  private static final int METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT = 50;
  private static final int METHODID_GET_MARKET_ORDER_BY_ACCOUNT = 51;
  private static final int METHODID_GET_MARKET_ORDER_BY_ID = 52;
  private static final int METHODID_GET_MARKET_PRICE_BY_PAIR = 53;
  private static final int METHODID_GET_MARKET_ORDER_LIST_BY_PAIR = 54;
  private static final int METHODID_GET_MARKET_PAIR_LIST = 55;
  private static final int METHODID_GET_TRANSACTION_SIGN = 56;
  private static final int METHODID_GET_TRANSACTION_SIGN2 = 57;
  private static final int METHODID_EASY_TRANSFER_ASSET = 58;
  private static final int METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE = 59;
  private static final int METHODID_EASY_TRANSFER = 60;
  private static final int METHODID_EASY_TRANSFER_BY_PRIVATE = 61;
  private static final int METHODID_CREATE_ADDRESS = 62;
  private static final int METHODID_GENERATE_ADDRESS = 63;
  private static final int METHODID_ADD_SIGN = 64;
  private static final int METHODID_GET_SPENDING_KEY = 65;
  private static final int METHODID_GET_EXPANDED_SPENDING_KEY = 66;
  private static final int METHODID_GET_AK_FROM_ASK = 67;
  private static final int METHODID_GET_NK_FROM_NSK = 68;
  private static final int METHODID_GET_INCOMING_VIEWING_KEY = 69;
  private static final int METHODID_GET_DIVERSIFIER = 70;
  private static final int METHODID_GET_ZEN_PAYMENT_ADDRESS = 71;
  private static final int METHODID_GET_NEW_SHIELDED_ADDRESS = 72;
  private static final int METHODID_GET_RCM = 73;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS = 74;
  private static final int METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK = 75;
  private static final int METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT = 76;
  private static final int METHODID_GET_AVAILABLE_UNFREEZE_COUNT = 77;
  private static final int METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT = 78;
  private static final int METHODID_GET_CAN_DELEGATED_MAX_SIZE = 79;
  private static final int METHODID_GET_DELEGATED_RESOURCE_V2 = 80;
  private static final int METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2 = 81;
  private static final int METHODID_GET_BURN_TRX = 82;
  private static final int METHODID_GET_BLOCK_BALANCE_TRACE = 83;
  private static final int METHODID_CREATE_WITNESS2 = 84;
  private static final int METHODID_WITHDRAW_BALANCE2 = 85;
  private static final int METHODID_GET_TRANSACTION_LIST_FROM_PENDING = 86;
  private static final int METHODID_GET_TRANSACTION_FROM_PENDING = 87;
  private static final int METHODID_GET_PENDING_SIZE = 88;
  private static final int METHODID_GET_BANDWIDTH_PRICES = 89;
  private static final int METHODID_GET_ENERGY_PRICES = 90;
  private static final int METHODID_GET_MEMO_FEE = 91;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BROADCAST_TRANSACTION:
          serviceImpl.broadcastTransaction((org.tron.trident.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionReturn>) responseObserver);
          break;
        case METHODID_DEPLOY_CONTRACT:
          serviceImpl.deployContract((org.tron.trident.proto.Contract.CreateSmartContract) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONTRACT:
          serviceImpl.triggerContract((org.tron.trident.proto.Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_TRIGGER_CONSTANT_CONTRACT:
          serviceImpl.triggerConstantContract((org.tron.trident.proto.Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_ESTIMATE_ENERGY:
          serviceImpl.estimateEnergy((org.tron.trident.proto.Contract.TriggerSmartContract) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EstimateEnergyMessage>) responseObserver);
          break;
        case METHODID_GET_NODE_INFO:
          serviceImpl.getNodeInfo((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NodeInfo>) responseObserver);
          break;
        case METHODID_LIST_NODES:
          serviceImpl.listNodes((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NodeList>) responseObserver);
          break;
        case METHODID_GET_CHAIN_PARAMETERS:
          serviceImpl.getChainParameters((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ChainParameters>) responseObserver);
          break;
        case METHODID_TOTAL_TRANSACTION:
          serviceImpl.totalTransaction((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_NEXT_MAINTENANCE_TIME:
          serviceImpl.getNextMaintenanceTime((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN_WEIGHT:
          serviceImpl.getTransactionSignWeight((org.tron.trident.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionSignWeight>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_APPROVED_LIST:
          serviceImpl.getTransactionApprovedList((org.tron.trident.proto.Chain.Transaction) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionApprovedList>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_ID:
          serviceImpl.getAccountById((GrpcAPI.AccountIdMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Account>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_NET:
          serviceImpl.getAccountNet((GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AccountNetMessage>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_RESOURCE:
          serviceImpl.getAccountResource((GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AccountResourceMessage>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ACCOUNT:
          serviceImpl.getAssetIssueByAccount((GrpcAPI.AccountAddressMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_NAME:
          serviceImpl.getAssetIssueByName((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST_BY_NAME:
          serviceImpl.getAssetIssueListByName((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_BY_ID:
          serviceImpl.getAssetIssueById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Contract.AssetIssueContract>) responseObserver);
          break;
        case METHODID_GET_ASSET_ISSUE_LIST:
          serviceImpl.getAssetIssueList((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_ASSET_ISSUE_LIST:
          serviceImpl.getPaginatedAssetIssueList((GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AssetIssueList>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK:
          serviceImpl.getNowBlock((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_NOW_BLOCK2:
          serviceImpl.getNowBlock2((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM:
          serviceImpl.getBlockByNum((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUM2:
          serviceImpl.getBlockByNum2((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_ID:
          serviceImpl.getBlockById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Block>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT:
          serviceImpl.getBlockByLimitNext((GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LIMIT_NEXT2:
          serviceImpl.getBlockByLimitNext2((GrpcAPI.BlockLimit) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM:
          serviceImpl.getBlockByLatestNum((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockList>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_LATEST_NUM2:
          serviceImpl.getBlockByLatestNum2((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockListExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM:
          serviceImpl.getTransactionCountByBlockNum((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_BY_ID:
          serviceImpl.getTransactionById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_ID:
          serviceImpl.getTransactionInfoById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionInfo>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM:
          serviceImpl.getTransactionInfoByBlockNum((GrpcAPI.NumberMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionInfoList>) responseObserver);
          break;
        case METHODID_GET_CONTRACT:
          serviceImpl.getContract((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Common.SmartContract>) responseObserver);
          break;
        case METHODID_GET_CONTRACT_INFO:
          serviceImpl.getContractInfo((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.SmartContractDataWrapper>) responseObserver);
          break;
        case METHODID_LIST_WITNESSES:
          serviceImpl.listWitnesses((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.WitnessList>) responseObserver);
          break;
        case METHODID_GET_BROKERAGE_INFO:
          serviceImpl.getBrokerageInfo((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_REWARD_INFO:
          serviceImpl.getRewardInfo((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE:
          serviceImpl.getDelegatedResource((org.tron.trident.proto.Response.DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX:
          serviceImpl.getDelegatedResourceAccountIndex((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_LIST_PROPOSALS:
          serviceImpl.listProposals((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ProposalList>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_BY_ID:
          serviceImpl.getProposalById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Proposal>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_PROPOSAL_LIST:
          serviceImpl.getPaginatedProposalList((GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ProposalList>) responseObserver);
          break;
        case METHODID_LIST_EXCHANGES:
          serviceImpl.listExchanges((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ExchangeList>) responseObserver);
          break;
        case METHODID_GET_EXCHANGE_BY_ID:
          serviceImpl.getExchangeById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.Exchange>) responseObserver);
          break;
        case METHODID_GET_PAGINATED_EXCHANGE_LIST:
          serviceImpl.getPaginatedExchangeList((GrpcAPI.PaginatedMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.ExchangeList>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK:
          serviceImpl.scanShieldedTRC20NotesByIvk((GrpcAPI.IvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK:
          serviceImpl.scanShieldedTRC20NotesByOvk((GrpcAPI.OvkDecryptTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DecryptNotesTRC20>) responseObserver);
          break;
        case METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT:
          serviceImpl.isShieldedTRC20ContractNoteSpent((GrpcAPI.NfTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.NullifierResult>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ACCOUNT:
          serviceImpl.getMarketOrderByAccount((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_BY_ID:
          serviceImpl.getMarketOrderById((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrder>) responseObserver);
          break;
        case METHODID_GET_MARKET_PRICE_BY_PAIR:
          serviceImpl.getMarketPriceByPair((org.tron.trident.proto.Response.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketPriceList>) responseObserver);
          break;
        case METHODID_GET_MARKET_ORDER_LIST_BY_PAIR:
          serviceImpl.getMarketOrderListByPair((org.tron.trident.proto.Response.MarketOrderPair) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderList>) responseObserver);
          break;
        case METHODID_GET_MARKET_PAIR_LIST:
          serviceImpl.getMarketPairList((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.MarketOrderPairList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN:
          serviceImpl.getTransactionSign((org.tron.trident.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_SIGN2:
          serviceImpl.getTransactionSign2((org.tron.trident.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET:
          serviceImpl.easyTransferAsset((GrpcAPI.EasyTransferAssetMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE:
          serviceImpl.easyTransferAssetByPrivate((GrpcAPI.EasyTransferAssetByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER:
          serviceImpl.easyTransfer((GrpcAPI.EasyTransferMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_EASY_TRANSFER_BY_PRIVATE:
          serviceImpl.easyTransferByPrivate((GrpcAPI.EasyTransferByPrivateMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.EasyTransferResponse>) responseObserver);
          break;
        case METHODID_CREATE_ADDRESS:
          serviceImpl.createAddress((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GENERATE_ADDRESS:
          serviceImpl.generateAddress((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.AddressPrKeyPairMessage>) responseObserver);
          break;
        case METHODID_ADD_SIGN:
          serviceImpl.addSign((org.tron.trident.proto.Response.TransactionSign) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_SPENDING_KEY:
          serviceImpl.getSpendingKey((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_EXPANDED_SPENDING_KEY:
          serviceImpl.getExpandedSpendingKey((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.ExpandedSpendingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_AK_FROM_ASK:
          serviceImpl.getAkFromAsk((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_NK_FROM_NSK:
          serviceImpl.getNkFromNsk((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_INCOMING_VIEWING_KEY:
          serviceImpl.getIncomingViewingKey((GrpcAPI.ViewingKeyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.IncomingViewingKeyMessage>) responseObserver);
          break;
        case METHODID_GET_DIVERSIFIER:
          serviceImpl.getDiversifier((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.DiversifierMessage>) responseObserver);
          break;
        case METHODID_GET_ZEN_PAYMENT_ADDRESS:
          serviceImpl.getZenPaymentAddress((GrpcAPI.IncomingViewingKeyDiversifierMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.PaymentAddressMessage>) responseObserver);
          break;
        case METHODID_GET_NEW_SHIELDED_ADDRESS:
          serviceImpl.getNewShieldedAddress((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.ShieldedAddressInfo>) responseObserver);
          break;
        case METHODID_GET_RCM:
          serviceImpl.getRcm((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS:
          serviceImpl.createShieldedContractParameters((GrpcAPI.PrivateShieldedTRC20Parameters) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK:
          serviceImpl.createShieldedContractParametersWithoutAsk((GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.ShieldedTRC20Parameters>) responseObserver);
          break;
        case METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT:
          serviceImpl.getTriggerInputForShieldedTRC20Contract((GrpcAPI.ShieldedTRC20TriggerContractParameters) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.BytesMessage>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_UNFREEZE_COUNT:
          serviceImpl.getAvailableUnfreezeCount((GrpcAPI.GetAvailableUnfreezeCountRequestMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.GetAvailableUnfreezeCountResponseMessage>) responseObserver);
          break;
        case METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT:
          serviceImpl.getCanWithdrawUnfreezeAmount((GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>) responseObserver);
          break;
        case METHODID_GET_CAN_DELEGATED_MAX_SIZE:
          serviceImpl.getCanDelegatedMaxSize((GrpcAPI.CanDelegatedMaxSizeRequestMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.CanDelegatedMaxSizeResponseMessage>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_V2:
          serviceImpl.getDelegatedResourceV2((org.tron.trident.proto.Response.DelegatedResourceMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceList>) responseObserver);
          break;
        case METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2:
          serviceImpl.getDelegatedResourceAccountIndexV2((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.DelegatedResourceAccountIndex>) responseObserver);
          break;
        case METHODID_GET_BURN_TRX:
          serviceImpl.getBurnTrx((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BALANCE_TRACE:
          serviceImpl.getBlockBalanceTrace((org.tron.trident.proto.Response.BlockIdentifier) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.BlockBalanceTrace>) responseObserver);
          break;
        case METHODID_CREATE_WITNESS2:
          serviceImpl.createWitness2((org.tron.trident.proto.Contract.WitnessCreateContract) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_WITHDRAW_BALANCE2:
          serviceImpl.withdrawBalance2((org.tron.trident.proto.Contract.WithdrawBalanceContract) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.TransactionExtention>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_LIST_FROM_PENDING:
          serviceImpl.getTransactionListFromPending((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.TransactionIdList>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_FROM_PENDING:
          serviceImpl.getTransactionFromPending((GrpcAPI.BytesMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Chain.Transaction>) responseObserver);
          break;
        case METHODID_GET_PENDING_SIZE:
          serviceImpl.getPendingSize((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<GrpcAPI.NumberMessage>) responseObserver);
          break;
        case METHODID_GET_BANDWIDTH_PRICES:
          serviceImpl.getBandwidthPrices((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage>) responseObserver);
          break;
        case METHODID_GET_ENERGY_PRICES:
          serviceImpl.getEnergyPrices((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage>) responseObserver);
          break;
        case METHODID_GET_MEMO_FEE:
          serviceImpl.getMemoFee((GrpcAPI.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<org.tron.trident.proto.Response.PricesResponseMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getBroadcastTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Chain.Transaction,
              org.tron.trident.proto.Response.TransactionReturn>(
                service, METHODID_BROADCAST_TRANSACTION)))
        .addMethod(
          getDeployContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Contract.CreateSmartContract,
              org.tron.trident.proto.Response.TransactionExtention>(
                service, METHODID_DEPLOY_CONTRACT)))
        .addMethod(
          getTriggerContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Contract.TriggerSmartContract,
              org.tron.trident.proto.Response.TransactionExtention>(
                service, METHODID_TRIGGER_CONTRACT)))
        .addMethod(
          getTriggerConstantContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Contract.TriggerSmartContract,
              org.tron.trident.proto.Response.TransactionExtention>(
                service, METHODID_TRIGGER_CONSTANT_CONTRACT)))
        .addMethod(
          getEstimateEnergyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Contract.TriggerSmartContract,
              org.tron.trident.proto.Response.EstimateEnergyMessage>(
                service, METHODID_ESTIMATE_ENERGY)))
        .addMethod(
          getGetNodeInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.NodeInfo>(
                service, METHODID_GET_NODE_INFO)))
        .addMethod(
          getListNodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.NodeList>(
                service, METHODID_LIST_NODES)))
        .addMethod(
          getGetChainParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.ChainParameters>(
                service, METHODID_GET_CHAIN_PARAMETERS)))
        .addMethod(
          getTotalTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.NumberMessage>(
                service, METHODID_TOTAL_TRANSACTION)))
        .addMethod(
          getGetNextMaintenanceTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.NumberMessage>(
                service, METHODID_GET_NEXT_MAINTENANCE_TIME)))
        .addMethod(
          getGetTransactionSignWeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Chain.Transaction,
              org.tron.trident.proto.Response.TransactionSignWeight>(
                service, METHODID_GET_TRANSACTION_SIGN_WEIGHT)))
        .addMethod(
          getGetTransactionApprovedListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Chain.Transaction,
              org.tron.trident.proto.Response.TransactionApprovedList>(
                service, METHODID_GET_TRANSACTION_APPROVED_LIST)))
        .addMethod(
          getGetAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.AccountAddressMessage,
              org.tron.trident.proto.Response.Account>(
                service, METHODID_GET_ACCOUNT)))
        .addMethod(
          getGetAccountByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.AccountIdMessage,
              org.tron.trident.proto.Response.Account>(
                service, METHODID_GET_ACCOUNT_BY_ID)))
        .addMethod(
          getGetAccountNetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.AccountAddressMessage,
              org.tron.trident.proto.Response.AccountNetMessage>(
                service, METHODID_GET_ACCOUNT_NET)))
        .addMethod(
          getGetAccountResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.AccountAddressMessage,
              org.tron.trident.proto.Response.AccountResourceMessage>(
                service, METHODID_GET_ACCOUNT_RESOURCE)))
        .addMethod(
          getGetAssetIssueByAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.AccountAddressMessage,
              org.tron.trident.proto.Response.AssetIssueList>(
                service, METHODID_GET_ASSET_ISSUE_BY_ACCOUNT)))
        .addMethod(
          getGetAssetIssueByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Contract.AssetIssueContract>(
                service, METHODID_GET_ASSET_ISSUE_BY_NAME)))
        .addMethod(
          getGetAssetIssueListByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.AssetIssueList>(
                service, METHODID_GET_ASSET_ISSUE_LIST_BY_NAME)))
        .addMethod(
          getGetAssetIssueByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Contract.AssetIssueContract>(
                service, METHODID_GET_ASSET_ISSUE_BY_ID)))
        .addMethod(
          getGetAssetIssueListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.AssetIssueList>(
                service, METHODID_GET_ASSET_ISSUE_LIST)))
        .addMethod(
          getGetPaginatedAssetIssueListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.PaginatedMessage,
              org.tron.trident.proto.Response.AssetIssueList>(
                service, METHODID_GET_PAGINATED_ASSET_ISSUE_LIST)))
        .addMethod(
          getGetNowBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Chain.Block>(
                service, METHODID_GET_NOW_BLOCK)))
        .addMethod(
          getGetNowBlock2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.BlockExtention>(
                service, METHODID_GET_NOW_BLOCK2)))
        .addMethod(
          getGetBlockByNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.NumberMessage,
              org.tron.trident.proto.Chain.Block>(
                service, METHODID_GET_BLOCK_BY_NUM)))
        .addMethod(
          getGetBlockByNum2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.NumberMessage,
              org.tron.trident.proto.Response.BlockExtention>(
                service, METHODID_GET_BLOCK_BY_NUM2)))
        .addMethod(
          getGetBlockByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Chain.Block>(
                service, METHODID_GET_BLOCK_BY_ID)))
        .addMethod(
          getGetBlockByLimitNextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BlockLimit,
              org.tron.trident.proto.Response.BlockList>(
                service, METHODID_GET_BLOCK_BY_LIMIT_NEXT)))
        .addMethod(
          getGetBlockByLimitNext2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BlockLimit,
              org.tron.trident.proto.Response.BlockListExtention>(
                service, METHODID_GET_BLOCK_BY_LIMIT_NEXT2)))
        .addMethod(
          getGetBlockByLatestNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.NumberMessage,
              org.tron.trident.proto.Response.BlockList>(
                service, METHODID_GET_BLOCK_BY_LATEST_NUM)))
        .addMethod(
          getGetBlockByLatestNum2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.NumberMessage,
              org.tron.trident.proto.Response.BlockListExtention>(
                service, METHODID_GET_BLOCK_BY_LATEST_NUM2)))
        .addMethod(
          getGetTransactionCountByBlockNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.NumberMessage,
              GrpcAPI.NumberMessage>(
                service, METHODID_GET_TRANSACTION_COUNT_BY_BLOCK_NUM)))
        .addMethod(
          getGetTransactionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Chain.Transaction>(
                service, METHODID_GET_TRANSACTION_BY_ID)))
        .addMethod(
          getGetTransactionInfoByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.TransactionInfo>(
                service, METHODID_GET_TRANSACTION_INFO_BY_ID)))
        .addMethod(
          getGetTransactionInfoByBlockNumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.NumberMessage,
              org.tron.trident.proto.Response.TransactionInfoList>(
                service, METHODID_GET_TRANSACTION_INFO_BY_BLOCK_NUM)))
        .addMethod(
          getGetContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Common.SmartContract>(
                service, METHODID_GET_CONTRACT)))
        .addMethod(
          getGetContractInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.SmartContractDataWrapper>(
                service, METHODID_GET_CONTRACT_INFO)))
        .addMethod(
          getListWitnessesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.WitnessList>(
                service, METHODID_LIST_WITNESSES)))
        .addMethod(
          getGetBrokerageInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              GrpcAPI.NumberMessage>(
                service, METHODID_GET_BROKERAGE_INFO)))
        .addMethod(
          getGetRewardInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              GrpcAPI.NumberMessage>(
                service, METHODID_GET_REWARD_INFO)))
        .addMethod(
          getGetDelegatedResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Response.DelegatedResourceMessage,
              org.tron.trident.proto.Response.DelegatedResourceList>(
                service, METHODID_GET_DELEGATED_RESOURCE)))
        .addMethod(
          getGetDelegatedResourceAccountIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.DelegatedResourceAccountIndex>(
                service, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX)))
        .addMethod(
          getListProposalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.ProposalList>(
                service, METHODID_LIST_PROPOSALS)))
        .addMethod(
          getGetProposalByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.Proposal>(
                service, METHODID_GET_PROPOSAL_BY_ID)))
        .addMethod(
          getGetPaginatedProposalListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.PaginatedMessage,
              org.tron.trident.proto.Response.ProposalList>(
                service, METHODID_GET_PAGINATED_PROPOSAL_LIST)))
        .addMethod(
          getListExchangesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.ExchangeList>(
                service, METHODID_LIST_EXCHANGES)))
        .addMethod(
          getGetExchangeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.Exchange>(
                service, METHODID_GET_EXCHANGE_BY_ID)))
        .addMethod(
          getGetPaginatedExchangeListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.PaginatedMessage,
              org.tron.trident.proto.Response.ExchangeList>(
                service, METHODID_GET_PAGINATED_EXCHANGE_LIST)))
        .addMethod(
          getScanShieldedTRC20NotesByIvkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.IvkDecryptTRC20Parameters,
              org.tron.trident.proto.Response.DecryptNotesTRC20>(
                service, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_IVK)))
        .addMethod(
          getScanShieldedTRC20NotesByOvkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.OvkDecryptTRC20Parameters,
              org.tron.trident.proto.Response.DecryptNotesTRC20>(
                service, METHODID_SCAN_SHIELDED_TRC20NOTES_BY_OVK)))
        .addMethod(
          getIsShieldedTRC20ContractNoteSpentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.NfTRC20Parameters,
              org.tron.trident.proto.Response.NullifierResult>(
                service, METHODID_IS_SHIELDED_TRC20CONTRACT_NOTE_SPENT)))
        .addMethod(
          getGetMarketOrderByAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.MarketOrderList>(
                service, METHODID_GET_MARKET_ORDER_BY_ACCOUNT)))
        .addMethod(
          getGetMarketOrderByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.MarketOrder>(
                service, METHODID_GET_MARKET_ORDER_BY_ID)))
        .addMethod(
          getGetMarketPriceByPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Response.MarketOrderPair,
              org.tron.trident.proto.Response.MarketPriceList>(
                service, METHODID_GET_MARKET_PRICE_BY_PAIR)))
        .addMethod(
          getGetMarketOrderListByPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Response.MarketOrderPair,
              org.tron.trident.proto.Response.MarketOrderList>(
                service, METHODID_GET_MARKET_ORDER_LIST_BY_PAIR)))
        .addMethod(
          getGetMarketPairListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.MarketOrderPairList>(
                service, METHODID_GET_MARKET_PAIR_LIST)))
        .addMethod(
          getGetTransactionSignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Response.TransactionSign,
              org.tron.trident.proto.Chain.Transaction>(
                service, METHODID_GET_TRANSACTION_SIGN)))
        .addMethod(
          getGetTransactionSign2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Response.TransactionSign,
              org.tron.trident.proto.Response.TransactionExtention>(
                service, METHODID_GET_TRANSACTION_SIGN2)))
        .addMethod(
          getEasyTransferAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EasyTransferAssetMessage,
              org.tron.trident.proto.Response.EasyTransferResponse>(
                service, METHODID_EASY_TRANSFER_ASSET)))
        .addMethod(
          getEasyTransferAssetByPrivateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EasyTransferAssetByPrivateMessage,
              org.tron.trident.proto.Response.EasyTransferResponse>(
                service, METHODID_EASY_TRANSFER_ASSET_BY_PRIVATE)))
        .addMethod(
          getEasyTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EasyTransferMessage,
              org.tron.trident.proto.Response.EasyTransferResponse>(
                service, METHODID_EASY_TRANSFER)))
        .addMethod(
          getEasyTransferByPrivateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EasyTransferByPrivateMessage,
              org.tron.trident.proto.Response.EasyTransferResponse>(
                service, METHODID_EASY_TRANSFER_BY_PRIVATE)))
        .addMethod(
          getCreateAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              GrpcAPI.BytesMessage>(
                service, METHODID_CREATE_ADDRESS)))
        .addMethod(
          getGenerateAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.AddressPrKeyPairMessage>(
                service, METHODID_GENERATE_ADDRESS)))
        .addMethod(
          getAddSignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Response.TransactionSign,
              org.tron.trident.proto.Response.TransactionExtention>(
                service, METHODID_ADD_SIGN)))
        .addMethod(
          getGetSpendingKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.BytesMessage>(
                service, METHODID_GET_SPENDING_KEY)))
        .addMethod(
          getGetExpandedSpendingKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              GrpcAPI.ExpandedSpendingKeyMessage>(
                service, METHODID_GET_EXPANDED_SPENDING_KEY)))
        .addMethod(
          getGetAkFromAskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              GrpcAPI.BytesMessage>(
                service, METHODID_GET_AK_FROM_ASK)))
        .addMethod(
          getGetNkFromNskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              GrpcAPI.BytesMessage>(
                service, METHODID_GET_NK_FROM_NSK)))
        .addMethod(
          getGetIncomingViewingKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.ViewingKeyMessage,
              GrpcAPI.IncomingViewingKeyMessage>(
                service, METHODID_GET_INCOMING_VIEWING_KEY)))
        .addMethod(
          getGetDiversifierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.DiversifierMessage>(
                service, METHODID_GET_DIVERSIFIER)))
        .addMethod(
          getGetZenPaymentAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.IncomingViewingKeyDiversifierMessage,
              GrpcAPI.PaymentAddressMessage>(
                service, METHODID_GET_ZEN_PAYMENT_ADDRESS)))
        .addMethod(
          getGetNewShieldedAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.ShieldedAddressInfo>(
                service, METHODID_GET_NEW_SHIELDED_ADDRESS)))
        .addMethod(
          getGetRcmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.BytesMessage>(
                service, METHODID_GET_RCM)))
        .addMethod(
          getCreateShieldedContractParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.PrivateShieldedTRC20Parameters,
              GrpcAPI.ShieldedTRC20Parameters>(
                service, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS)))
        .addMethod(
          getCreateShieldedContractParametersWithoutAskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.PrivateShieldedTRC20ParametersWithoutAsk,
              GrpcAPI.ShieldedTRC20Parameters>(
                service, METHODID_CREATE_SHIELDED_CONTRACT_PARAMETERS_WITHOUT_ASK)))
        .addMethod(
          getGetTriggerInputForShieldedTRC20ContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.ShieldedTRC20TriggerContractParameters,
              GrpcAPI.BytesMessage>(
                service, METHODID_GET_TRIGGER_INPUT_FOR_SHIELDED_TRC20CONTRACT)))
        .addMethod(
          getGetAvailableUnfreezeCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.GetAvailableUnfreezeCountRequestMessage,
              GrpcAPI.GetAvailableUnfreezeCountResponseMessage>(
                service, METHODID_GET_AVAILABLE_UNFREEZE_COUNT)))
        .addMethod(
          getGetCanWithdrawUnfreezeAmountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.CanWithdrawUnfreezeAmountRequestMessage,
              GrpcAPI.CanWithdrawUnfreezeAmountResponseMessage>(
                service, METHODID_GET_CAN_WITHDRAW_UNFREEZE_AMOUNT)))
        .addMethod(
          getGetCanDelegatedMaxSizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.CanDelegatedMaxSizeRequestMessage,
              GrpcAPI.CanDelegatedMaxSizeResponseMessage>(
                service, METHODID_GET_CAN_DELEGATED_MAX_SIZE)))
        .addMethod(
          getGetDelegatedResourceV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Response.DelegatedResourceMessage,
              org.tron.trident.proto.Response.DelegatedResourceList>(
                service, METHODID_GET_DELEGATED_RESOURCE_V2)))
        .addMethod(
          getGetDelegatedResourceAccountIndexV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Response.DelegatedResourceAccountIndex>(
                service, METHODID_GET_DELEGATED_RESOURCE_ACCOUNT_INDEX_V2)))
        .addMethod(
          getGetBurnTrxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.NumberMessage>(
                service, METHODID_GET_BURN_TRX)))
        .addMethod(
          getGetBlockBalanceTraceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Response.BlockIdentifier,
              org.tron.trident.proto.Response.BlockBalanceTrace>(
                service, METHODID_GET_BLOCK_BALANCE_TRACE)))
        .addMethod(
          getCreateWitness2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Contract.WitnessCreateContract,
              org.tron.trident.proto.Response.TransactionExtention>(
                service, METHODID_CREATE_WITNESS2)))
        .addMethod(
          getWithdrawBalance2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.tron.trident.proto.Contract.WithdrawBalanceContract,
              org.tron.trident.proto.Response.TransactionExtention>(
                service, METHODID_WITHDRAW_BALANCE2)))
        .addMethod(
          getGetTransactionListFromPendingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.TransactionIdList>(
                service, METHODID_GET_TRANSACTION_LIST_FROM_PENDING)))
        .addMethod(
          getGetTransactionFromPendingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.BytesMessage,
              org.tron.trident.proto.Chain.Transaction>(
                service, METHODID_GET_TRANSACTION_FROM_PENDING)))
        .addMethod(
          getGetPendingSizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              GrpcAPI.NumberMessage>(
                service, METHODID_GET_PENDING_SIZE)))
        .addMethod(
          getGetBandwidthPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.PricesResponseMessage>(
                service, METHODID_GET_BANDWIDTH_PRICES)))
        .addMethod(
          getGetEnergyPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.PricesResponseMessage>(
                service, METHODID_GET_ENERGY_PRICES)))
        .addMethod(
          getGetMemoFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcAPI.EmptyMessage,
              org.tron.trident.proto.Response.PricesResponseMessage>(
                service, METHODID_GET_MEMO_FEE)))
        .build();
  }

  private static abstract class WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcAPI.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
      extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
      extends WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletFileDescriptorSupplier())
              .addMethod(getBroadcastTransactionMethod())
              .addMethod(getDeployContractMethod())
              .addMethod(getTriggerContractMethod())
              .addMethod(getTriggerConstantContractMethod())
              .addMethod(getEstimateEnergyMethod())
              .addMethod(getGetNodeInfoMethod())
              .addMethod(getListNodesMethod())
              .addMethod(getGetChainParametersMethod())
              .addMethod(getTotalTransactionMethod())
              .addMethod(getGetNextMaintenanceTimeMethod())
              .addMethod(getGetTransactionSignWeightMethod())
              .addMethod(getGetTransactionApprovedListMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountByIdMethod())
              .addMethod(getGetAccountNetMethod())
              .addMethod(getGetAccountResourceMethod())
              .addMethod(getGetAssetIssueByAccountMethod())
              .addMethod(getGetAssetIssueByNameMethod())
              .addMethod(getGetAssetIssueListByNameMethod())
              .addMethod(getGetAssetIssueByIdMethod())
              .addMethod(getGetAssetIssueListMethod())
              .addMethod(getGetPaginatedAssetIssueListMethod())
              .addMethod(getGetNowBlockMethod())
              .addMethod(getGetNowBlock2Method())
              .addMethod(getGetBlockByNumMethod())
              .addMethod(getGetBlockByNum2Method())
              .addMethod(getGetBlockByIdMethod())
              .addMethod(getGetBlockByLimitNextMethod())
              .addMethod(getGetBlockByLimitNext2Method())
              .addMethod(getGetBlockByLatestNumMethod())
              .addMethod(getGetBlockByLatestNum2Method())
              .addMethod(getGetTransactionCountByBlockNumMethod())
              .addMethod(getGetTransactionByIdMethod())
              .addMethod(getGetTransactionInfoByIdMethod())
              .addMethod(getGetTransactionInfoByBlockNumMethod())
              .addMethod(getGetContractMethod())
              .addMethod(getGetContractInfoMethod())
              .addMethod(getListWitnessesMethod())
              .addMethod(getGetBrokerageInfoMethod())
              .addMethod(getGetRewardInfoMethod())
              .addMethod(getGetDelegatedResourceMethod())
              .addMethod(getGetDelegatedResourceAccountIndexMethod())
              .addMethod(getListProposalsMethod())
              .addMethod(getGetProposalByIdMethod())
              .addMethod(getGetPaginatedProposalListMethod())
              .addMethod(getListExchangesMethod())
              .addMethod(getGetExchangeByIdMethod())
              .addMethod(getGetPaginatedExchangeListMethod())
              .addMethod(getScanShieldedTRC20NotesByIvkMethod())
              .addMethod(getScanShieldedTRC20NotesByOvkMethod())
              .addMethod(getIsShieldedTRC20ContractNoteSpentMethod())
              .addMethod(getGetMarketOrderByAccountMethod())
              .addMethod(getGetMarketOrderByIdMethod())
              .addMethod(getGetMarketPriceByPairMethod())
              .addMethod(getGetMarketOrderListByPairMethod())
              .addMethod(getGetMarketPairListMethod())
              .addMethod(getGetTransactionSignMethod())
              .addMethod(getGetTransactionSign2Method())
              .addMethod(getEasyTransferAssetMethod())
              .addMethod(getEasyTransferAssetByPrivateMethod())
              .addMethod(getEasyTransferMethod())
              .addMethod(getEasyTransferByPrivateMethod())
              .addMethod(getCreateAddressMethod())
              .addMethod(getGenerateAddressMethod())
              .addMethod(getAddSignMethod())
              .addMethod(getGetSpendingKeyMethod())
              .addMethod(getGetExpandedSpendingKeyMethod())
              .addMethod(getGetAkFromAskMethod())
              .addMethod(getGetNkFromNskMethod())
              .addMethod(getGetIncomingViewingKeyMethod())
              .addMethod(getGetDiversifierMethod())
              .addMethod(getGetZenPaymentAddressMethod())
              .addMethod(getGetNewShieldedAddressMethod())
              .addMethod(getGetRcmMethod())
              .addMethod(getCreateShieldedContractParametersMethod())
              .addMethod(getCreateShieldedContractParametersWithoutAskMethod())
              .addMethod(getGetTriggerInputForShieldedTRC20ContractMethod())
              .addMethod(getGetAvailableUnfreezeCountMethod())
              .addMethod(getGetCanWithdrawUnfreezeAmountMethod())
              .addMethod(getGetCanDelegatedMaxSizeMethod())
              .addMethod(getGetDelegatedResourceV2Method())
              .addMethod(getGetDelegatedResourceAccountIndexV2Method())
              .addMethod(getGetBurnTrxMethod())
              .addMethod(getGetBlockBalanceTraceMethod())
              .addMethod(getCreateWitness2Method())
              .addMethod(getWithdrawBalance2Method())
              .addMethod(getGetTransactionListFromPendingMethod())
              .addMethod(getGetTransactionFromPendingMethod())
              .addMethod(getGetPendingSizeMethod())
              .addMethod(getGetBandwidthPricesMethod())
              .addMethod(getGetEnergyPricesMethod())
              .addMethod(getGetMemoFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
